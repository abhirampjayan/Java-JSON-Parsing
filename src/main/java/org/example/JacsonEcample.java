package org.example;

import com.fasterxml.jackson.databind.JsonNode;


import static org.example.Json.*;

public class JacsonEcample {
    public static void main(String[] args) throws Exception {
        /*ObjectMapper objectMapper=new ObjectMapper();
        byte[] jsonData= Files.readAllBytes(Paths.get("employee.json"));
        Employee employee=objectMapper.readValue(jsonData,Employee.class);
        System.out.println(employee);*/
        Employee employee= readFile();
        System.out.println(employee);

        /*Employee employee1=Employee.createEmployee();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT,true);

        StringWriter stringEmp = new StringWriter();
        objectMapper.writeValue(stringEmp,employee1);
        System.out.println(stringEmp);*/
        Json.writeFile(employee);
        JsonNode jsonNode=createJsonNode();
        String s=jsonToString(jsonNode);
        System.out.println(jsonNode.get("name").asText());
        System.out.println(s);
        JsonNode jsonNode1=objectToJson(employee);
        System.out.println(jsonNode1);
    }
}
