/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guillermoespinal_lab8;

/*import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class hilollamada extends Thread {
    private boolean vive;
    private boolean avanzar;
    private JLabel ss;
    private JLabel mins;
    private JLabel hora;
    private Date tiempo; 
    private  int seconds =00;
    private int minutes =00;
    private int horas=00;

    public hilollamada() {
    }
    

    public hilollamada(JLabel labels,JLabel labelm, JLabel labelh ) {
        ss=labels;
        mins= labelm;
        hora=labelh;
        vive =true;
        avanzar = true;
        seconds =00;
        minutes =00;
        horas=00;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JLabel getSs() {
        return ss;
    }

    public void setSs(JLabel ss) {
        this.ss = ss;
    }

    public JLabel getMins() {
        return mins;
    }

    public void setMins(JLabel mins) {
        this.mins = mins;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    
    public void run(){
        while (vive) {
            if (avanzar) {
                /*  Date h = new Date();
                Date same = new Date();
                long h_same = h.getTime()-same.getTime();
                Dateti news = newsh_same;
                DateFormat f = new SimpleDateFormat("hh:mm:ss");*/
               
                seconds++;
                System.out.println(seconds);
                ss.setText(Integer.toString(seconds));
                mins.setText(Integer.toString(minutes));
                hora.setText(Integer.toString(horas));
                if (seconds/60==1) {
                    seconds =00;
                    minutes++;
                     ss.setText(Integer.toString(seconds));
                mins.setText(Integer.toString(minutes));
                hora.setText(Integer.toString(horas));
                }
                if (minutes/60==1){
                    horas++;
                     ss.setText(Integer.toString(seconds));
                mins.setText(Integer.toString(minutes));
                hora.setText(Integer.toString(horas));
                    
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null,"me mame");
                }
                
            }
            
        }
    }
    
    
    
}
