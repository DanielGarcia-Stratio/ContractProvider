package com.example.provider;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProviderController {

    @GetMapping("/visits")
    public ResponseEntity<String> giveVisitByCode(@RequestParam("code") Integer code){
        if(code==1234){
            return ResponseEntity.status(HttpStatus.OK).body("{\n" +
                    "  \"patientInfo\":{\n" +
                    "    \"name\": \"Pepe\",\n" +
                    "    \"firstSurname\":\"Florez\",\n" +
                    "    \"secondSurname\":\"Garcia\",\n" +
                    "    \"gender\": \"male\",\n" +
                    "    \"medicalHistory\":\"XDSSI\",\n" +
                    "    \"VIP\": false\n" +
                    "  },\n" +
                    "  \"visitStatus\": \"scheduled\",\n" +
                    "  \"scheduledTime\": \"2010-06-15T00:00:00\",\n" +
                    "  \"arrivalTime\": \"2010-06-15T02:00:00\",\n" +
                    "  \"agenda\": \"XDD\",\n" +
                    "  \"center\": \"Moraleja\",\n" +
                    "  \"resource\": \"EF Maria Gimenez Navarro\",\n" +
                    "  \"service\": \"enfermeria\",\n" +
                    "  \"visitType\": \"revision\",\n" +
                    "  \"comments\": \"Ha sufrido anteriormente de neumonia\",\n" +
                    "  \"insurance\": \"Sanitas SA\",\n" +
                    "  \"visitChannel\": \"videollamada\",\n" +
                    "  \"overload\": false\n" +
                    "}");
        }
        return ResponseEntity.status(404).body("No hay cita con ese codigo");
    }
}
