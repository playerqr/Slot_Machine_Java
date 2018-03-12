/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot;

import javax.swing.JTextField;

/**
 *
 * @author macbook
 */
public class slot extends Thread{
    JTextField textfield;
    private int number = 0;
    public boolean stopped = false;
    private void process()
    {
        if(!stopped)
        {
            number = (int) (Math.random() * 10);
            textfield.setText(String.valueOf(number));
            
        }
    }
    public JTextField getTextfield() {
        return textfield;
    }
    public void setTextfield(JTextField textfield) {
        this.textfield = textfield;
    }
    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                process();
                Thread.sleep(1);
            }
        }
        catch(InterruptedException e)
        {
            
        }
    }
}
