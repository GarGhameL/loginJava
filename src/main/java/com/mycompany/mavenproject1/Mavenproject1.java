/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Mavenproject1 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("usuario", "contrasena");

        System.out.print("Ingrese su nombre de usuario: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + user.getUsername() + "!");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos. Inténtelo de nuevo.");
        }
    }
}
