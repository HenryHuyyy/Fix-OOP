package GUI;
// Source: https://youtu.be/Layeo3Jrkks

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


/*public class AudioPlayer {
    Long currentFrame;
    Clip clip;

    String status;
    AudioInputStream audioInputStream;
    static String BGM;

    public AudioPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

        clip = AudioSystem.getClip();

        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void playGameOver() {
        try {
            BGM = "./Tetris-OOP/src/resources/music/background_music.wav";
            AudioPlayer audioPlayer = new AudioPlayer();
            audioPlayer.play();
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Background Music: ON");
                System.out.println("Background Music: OFF");

            }
        } catch (Exception ex) {
            System.out.println();
            ex.printStackTrace();
        }
    }
    public void play() {
        clip.start();
    }
}
    /* private String soundsFolder = "music" + File.separator;
    private String clearLinePath = soundsFolder + "clear.wav"; // Declare a clear line sound game from "music" folder
    private String gameoverPath = soundsFolder + "GameOverSound.wav"; // Declare a game over sound from the "music" folder


    private Clip clearLineSound, gameoverSound;

    public AudioPlayer() {
        try {
            clearLineSound = getClip();
            gameoverSound = getClip();

            clearLineSound.open(getAudioInputStream(new File(clearLinePath).getAbsoluteFile()));

            gameoverSound.open(getAudioInputStream(new File(gameoverPath).getAbsoluteFile()));

        } catch (LineUnavailableException ex) {
            Logger.getLogger(AudioPlayer.class.getName()).log(Level .SEVERE,null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE,null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE,null, ex);
        }
    } */

    /* public void playClearLine() {
        clearLineSound.setFramePosition(0);
        clearLineSound.start();
    }

    public void playGameOver() {
        gameoverSound.setFramePosition(0);
        gameoverSound.start();
    }
} */
