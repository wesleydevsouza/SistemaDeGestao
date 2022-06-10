package br.com.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//classe splash extendida da JFrame
public class Splash extends JFrame{
    
    private static JLabel lbSplash; //label responsável por conter a imagem
    private ImageIcon imSplash;     //imagem que será mostrada na lavel
    
    //função principal que será carregada
    public static void main(String args[]) {
        //Criando a janela de splash
        Splash s = new Splash();
        
        //definindo o tipo de fechamento, o tamanho tirando a barra de titulos, deixando no centro, definindo um icone e mostrando a janela
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        s.setSize(700, 300);
        s.setUndecorated(true);
        s.setLocationRelativeTo(null);
        s.setVisible(true);
        
        //forçando a espera de 1500 milissegundos (1,5s)
        try{
            Thread.sleep(1500);
        } catch (InterruptedException ex){
        }
        
        //fechando a janela 
        s.dispose();
        login L = new login();
        L.show();
    }
   //função responsável por carregar os dados da janela (latout e imagem)
    public Splash(){
        //definindo o latouy como nulo
        setLayout(null);
        
        //setando a imagem de splash 
        imSplash = new ImageIcon ("src/br/com/imagens/Splash.png");
        
        //adicionando a imagem no label e mudando o tamanho 
        lbSplash = new JLabel (imSplash);
        lbSplash.setBounds(0, 0, 700, 300);
        
        //adicionando componentes na janela
        add(lbSplash);       
    }
}

