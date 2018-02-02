/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp.ejemplosocketdatagramcliente;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author pedro argibay
 */
public class PSPEjemploSocketDatagramCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Creando DatagramClient");

            DatagramSocket datagramSocket = new DatagramSocket();

            System.out.println("Enviando mensaje");

            String mensaje = "Hola, soy el cliente 1";

            InetAddress addr = InetAddress.getByName("localhost");
            DatagramPacket datagrama
                    = new DatagramPacket(mensaje.getBytes(),
                            mensaje.getBytes().length,
                            addr, 5555);
            datagramSocket.send(datagrama);

            System.out.println("Mensaje enviado");

            System.out.println("Cerrando DatagramClient");

            datagramSocket.close();

            System.out.println("Terminado con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
