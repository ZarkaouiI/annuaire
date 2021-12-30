package dao;

import domain.Address;
import domain.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Facade {
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/annuaire";
    private String username = "root";
    private String password = "Gift2099";


    public void addPerson(String nom, String prenom){
        connectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into personnes(nom, prenom) values(?, ?);");
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, prenom);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void addAddress(String rue, String ville){

    }

    public Collection<Person> listPerson(){
        List<Person> personnes = new ArrayList<>();
        connectDB();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select nom, prenom from personnes;");
            while(result.next()){
                String nom = result.getString("nom");
                String prenom = result.getString("prenom");
                Person person = new Person(nom, prenom);
                System.out.println(person.getPrenom() + " " + person.getNom());
                personnes.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personnes;
    }

    public Collection<Address> listAddress(){
        return null;
    }

    public void associate(int personId, int addressId){

    }

    public void connectDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

