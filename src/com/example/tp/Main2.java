package com.example.tp;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("=== Génération du fichier de log ===");
        LogManager logger = new LogManager("application.log");
        logger.log("INFO",  "Démarrage de l’application");
        logger.log("DEBUG", "Chargement de la configuration");
        logger.log("ERROR", "Échec de connexion à la base");
        System.out.println("Fichier application.log généré.\n");


        System.out.println("=== Génération du CSV ===");

        List<String> header = Arrays.asList("id", "nom", "score");
        List<String[]> rows = List.of(
                new String[]{"1", "Alice", "85"},
                new String[]{"2", "Bob",   "92"},
                new String[]{"3", "Carol", "78"}
        );

        CsvWriter.writeCsv("report.csv", header, rows);
        System.out.println("Fichier report.csv généré.\n");


        System.out.println("=== Génération du fichier HTML ===");

        HtmlGenerator.writeHtml(
                "index.html",
                "Ma première page",
                "Bienvenue sur ma page générée par PrintWriter !"
        );

        System.out.println("Fichier index.html généré.\n");
    }
}
