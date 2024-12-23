/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thepetproject.main;

/**
 *
 * @author lilac
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.mycompany.thepetproject.main.Pet;
import com.mycompany.thepetproject.utils.csv.Csv;

public class PetList {
    private static final String FILE_NAME = "data/pets.csv";
    private static List<Pet> pets = new ArrayList<>();
    
    // Method to add pet to list
    public static void addPet(Pet pet) {
        loadPets();
        pets.add(pet);
        savePets();
    }
    
    public static void setPetStatus(UUID id, PetStatus status) {
        for (Pet pet : pets) {
            if (pet.getId().equals(id)) {
                pet.setStatus(status);
            }
        }
        savePets();
    }
    
    // Get pet methods
    public static Pet getPet(UUID id) {
        for (Pet pet : pets) {
            if (pet.getId().equals(id)) {
                return pet;
            }
        }
        return null;
    }
    public static Pet getPet(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
    }
    
    public static List<Pet> getPets() {
        loadPets();
        return pets;
    }
    
    public static List<Pet> filterPets(PetStatus status) {
        List<Pet> filteredPets = new ArrayList<>();
        loadPets();
        for (Pet pet : pets) {
            if (pet.getStatus().equals(status)) {
                filteredPets.add(pet);
            }
        }
        return filteredPets;
    }
    
    // Method to check if a UUID already exists in the list
    public static boolean isPetInList(UUID id) {
        for (Pet pet : pets) {
            if (pet.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    public static void savePets() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.append("id,type,name,age,sex,status,description\n");
            for (Pet pet : pets) {
                writer.append(pet.getId().toString()).append(",");
                writer.append(pet.getType().toString()).append(",");
                writer.append(pet.getName()).append(",");
                writer.append(String.valueOf(pet.getAge())).append(",");
                writer.append(pet.getSex().toString()).append(",");
                writer.append(pet.getStatus().toString()).append(",");
                writer.append(pet.getDescription()).append(",");
                writer.append("\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to " + FILE_NAME + " : " + e.getMessage());
        }
    }
    
    public static void loadPets() {
        // Reset list
        pets = new ArrayList<>();
        
        Csv csv = new Csv(FILE_NAME);
        for (int i = 1; i < csv.getNumberOfRows(); i++) {
            String[] row = csv.getRow(i);
            PetType type = null;
            if (row[1].equals("Cat")) {
                type = PetType.Cat;
            } else if (row[1].equals("Dog")) {
                type = PetType.Dog;
            }
            String name = row[2];
            int age = Integer.parseInt(row[3]);
            PetSex sex = null;
            if (row[4].equals("MALE")) {
                sex = PetSex.MALE;
            } else if (row[4].equals("FEMALE")) {
                sex = PetSex.FEMALE;
            }
            PetStatus status = null;
            if (row[5].equals("PENDING")) {
                status = PetStatus.PENDING;
            } else if (row[5].equals("ADOPTED")) {
                status = PetStatus.ADOPTED;
            } else if (row[5].equals("FOR_ADOPTION")) {
                status = PetStatus.FOR_ADOPTION;
            }
            String description = row[6];
            
            Pet pet = new Pet(type, name, age, sex, status, description);
            pet.setId(UUID.fromString(row[0]));
            pets.add(pet);
        }
    }
    
    // Get the file name used by the class to serialize and deserialize
    public static String getFilePath() {
        return FILE_NAME;
    }
    
    // Method to print the list of admins
    public static void printPets() {
        StringBuilder compiledPetStrings = new StringBuilder();
        compiledPetStrings.append("PetList [");
        for (Pet pet : pets) {
            String petString = "\n{" +
                "\n\t" + "id: " + pet.getId() + "," +
                "\n\t" + "name: " + pet.getName() + "," +
                "\n\t" + "type: " + pet.getType().toString() + "," +
                "\n\t" + "sex: " + pet.getSex().toString() + "," +
                "\n\t" + "age: " + pet.getAge() + "," +
                "\n\t" + "description: " + pet.getDescription() + "," +
                "\n},";
            compiledPetStrings.append(petString);
        }
        compiledPetStrings.append("\n]");
        System.out.println(compiledPetStrings);
    }
}
