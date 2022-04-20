package br.edu.ifpb.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Arquivo {

    private final Path file;
    public Arquivo(Path file) {
        this.file = file;
    }
    public List<String> emTexto(){
        try {
            return Files.readAllLines(
                    file
            );
        } catch (IOException e) {
            return Collections.EMPTY_LIST;
        }
    }
    public List<String> decodificar(){
       return  emTexto()
                .stream()
                .map((String linha)->{return new String(
                Base64.getDecoder().decode(
                        linha.getBytes()
                )
        );}).collect(Collectors.toList());
    }
}
