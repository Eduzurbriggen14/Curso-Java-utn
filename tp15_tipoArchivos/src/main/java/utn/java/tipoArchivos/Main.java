package utn.java.tipoArchivos;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // creo un objeto esquema en donde defino la estructura
		
        CsvSchema esquema = CsvSchema.builder()
                .addColumn("nombre")
                .addColumn("peso")
                .addColumn("peso_unidad")
                .addColumn("precio")
                .addColumn("descuento_tipo")
                .addColumn("descuento_cantidad")
                .addColumn("descuento_tope")
                .addColumn("fechaDesde")
                .addColumn("fechaHasta")
                .build()
                .withHeader();

        // Creo un objeto CsvMapper para leer el archivo CSV
        
        CsvMapper mapper = new CsvMapper();

        try {
            // Leer el archivo CSV y lo convierto en una lista de mapas
        	
            List<Object> objects = mapper.readerFor(Map.class).with(esquema).readValues(new File("C:\\Users\\luisz\\Documents\\A.JAVA UTN\\oferta.cvs")).readAll();

            // ObjectMapper para convertir la lista de mapas en un objeto JSON
            
            ObjectMapper objectMapper = new ObjectMapper();
            
            String json = objectMapper.writeValueAsString(objects);

            
            System.out.println("Producto:" +json);
            
        } catch (IOException e) {
        	
            e.printStackTrace();
        }
    }
}




