package aula1710;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class PersistenciaJson implements Igravacao {

	@Override
	public boolean gravar(List<Pessoa> list) {
		listaPessoa l = new listaPessoa();
		l.setPessoas(list);
		FileWriter writer = null;
		try {
			GsonBuilder builder = new GsonBuilder();

			Gson gson = builder.create();

			writer = new FileWriter("src/aula1710/agenda.json");

			writer.write(gson.toJson(l,listaPessoa.class));

			writer.close();
		} catch (IOException ex) {

		} finally {
			try {
				writer.close();
			} catch (IOException ex) {

			}
		}
		return true;

	}

	@Override
	public List<Pessoa> ler() {
		Gson gson = new Gson();
		JSONObject jsonObject;
		String caminho="src/aula1710/agenda.json";
        JSONParser parser = new JSONParser();
        JSONArray jArray;
        listaPessoa obj = new listaPessoa();
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(caminho));
			obj = gson.fromJson(br, listaPessoa.class);
			
		}
			
			catch (Exception e) {
	            e.printStackTrace();
			}
		return obj.getPessoas();
	}
}
