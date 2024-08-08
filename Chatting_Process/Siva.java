package AWT_Swing_Projects.Chatting_Processes;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Siva extends Frame implements ActionListener,Runnable
{
    TextField textField;
    TextArea textArea;
    Button send;

    ServerSocket serverSocket;
    Socket socket;

    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;

    Thread chat;

    public Siva()
    {
        textField = new TextField();
        textArea = new TextArea();

        textField.setSize(200,50);

        send = new Button("Send");

        send.addActionListener(this);

        try{
            serverSocket = new ServerSocket(12000);
            socket = serverSocket.accept();

            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

        }
        catch(Exception E)
        {

        }

        add(textArea);
        add(textField);
        add(send);

        this.add(textField);
        this.add(textArea);
        this.add(send);

       chat = new Thread(this);
       chat.setDaemon(true);
       chat.start();

        this.setSize(600,600);
        this.setTitle("Siva");
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        new Siva();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String msg = textField.getText();
        textArea.append("Siva : "+msg+"\n");
        textField.setText("");

        try{
            dataOutputStream.writeUTF(msg);
            dataOutputStream.flush();
        }
        catch(IOException ex)
        {

        }

    }

    @Override
    public void run() {
        while(true)
        {
            try
            {
                String msg = dataInputStream.readUTF();
                textArea.append("Gomi : "+msg+"\n");
            }
            catch(IOException Ex)
            {

            }
        }
    }
}

