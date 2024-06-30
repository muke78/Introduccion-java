
import java.text.DateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M U K E
 */
public class FechaEnTiempoReal {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 365);
        System.out.println("Fecha original: " + formatearCalendar(c));
    }

    public static String formatearCalendar(Calendar c) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        return df.format(c.getTime());
    }
}
