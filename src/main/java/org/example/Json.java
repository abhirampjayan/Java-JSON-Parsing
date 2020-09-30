package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Json {
    private static ObjectMapper objectMapper=createMapper();
    private static ObjectMapper createMapper(){
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT,true);
        return objectMapper;
    }
//    ObjectMapper objectMapper=new ObjectMapper();

    public static Employee readFile() throws Exception {
        ObjectMapper objectMapper=createMapper();
        return objectMapper.readValue(new File("employee.json"),Employee.class);
    }
    public static void writeFile(Employee employee) throws IOException {
        createMapper().writerWithDefaultPrettyPrinter().writeValue(new File("outputEmployee.json"),employee);
    }
    public static JsonNode createJsonNode() throws Exception {
        byte[] bytes= Files.readAllBytes(Paths.get("employee.json"));
        return objectMapper.readTree(bytes);
    }
    public static String jsonToString(JsonNode node) throws JsonProcessingException {
        ObjectWriter writer=objectMapper.writer();
        writer=writer.with(SerializationFeature.INDENT_OUTPUT);
        return writer.writeValueAsString(node);
    }
}
