/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checker;

import javax.swing.*;

/**
 *
 * @author macbook
 */
public class checker extends Thread{
    private JTextField tf1, tf2, tf3;
    private JLabel jl1;
    public boolean check;
    private void check()
    {
        if(check)
        {
            if(tf2.getText().equals(tf1.getText()) && tf2.getText().equals(tf3.getText()))
            {
                jl1.setText("Jackpot");
            }
            else
            {
                jl1.setText("");
            }
            check = false;
        }
    }
    public void setj(JTextField tf1, JTextField tf2, JTextField tf3, JLabel jl1) {
        this.tf1 = tf1;
        this.tf2 = tf2;
        this.tf3 = tf3;
        this.jl1 = jl1;
        check = false;
    }
    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                check();
                Thread.sleep(1);
            }
        }
        catch(InterruptedException e)
        {
            
        }
    }
}
