import  java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
 
 
public class AudioPlay{
     
     
    AudioInputStream audioInputStream = null;
    SourceDataLine line;
    String musique;
    BufferedReader buff;
    
    public AudioPlay(BufferedReader test) throws IOException{
        buff = test;
        Thread t;
        t = new Thread(){
            public void run(){
                try {
                    while ((musique=buff.readLine())!=null){
                        Play(musique);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(AudioPlay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        t.start();
    }
     
    public void Play( String musique){   
            File fichier = new File("C:/Users/N. Desmarais/Desktop/ProjetAgile/Musique/"+musique);

            try {
                audioInputStream = AudioSystem.getAudioInputStream(fichier);
            }
            catch (UnsupportedAudioFileException | IOException e) {
                e.printStackTrace();
            }

            AudioFormat audioFormat = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class,audioFormat);

            try {
                line = (SourceDataLine) AudioSystem.getLine(info);

            } catch (LineUnavailableException e) {
                e.printStackTrace();
                return;
            }

            try {
                line.open(audioFormat);
            } catch (LineUnavailableException e) {
                e.printStackTrace();
                return;
            }
            line.start();
            //    Fenetre.begin=true;
            try {
                byte bytes[] = new byte[1024];
                int bytesRead=0;
                while ((bytesRead = audioInputStream.read(bytes, 0, bytes.length)) != -1) {
                    line.write(bytes, 0, bytesRead);
                }
                return;
            } catch (IOException io) {
                io.printStackTrace();
                return;
            }
        }
    }

