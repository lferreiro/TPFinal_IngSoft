package Crimson.Crimson_core.RestApp;

import Crimson.Crimson_core.Funcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.text.SimpleDateFormat;

public class EmailSender {

    @Autowired
    private JavaMailSender javasMailSender;

    public void sendEmail(String email, int dniUsuario, Funcion funcion, String nombrePelicula){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(email);

        msg.setSubject("Crimson reserva");

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh:mm:ss");
        String stringDate = sdf.format(funcion.getDate());

        msg.setText("Hola, gracias por confiar en nosotros. Su reserva para el dia y hora: " + stringDate + " para la pelicula " + nombrePelicula + " en la sala numero " + funcion.getNumeroSala() + " y la reserva esta vinculada al DNI: " + dniUsuario);

        javasMailSender.send(msg);

    }
}
