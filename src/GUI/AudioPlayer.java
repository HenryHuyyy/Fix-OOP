package GUI;
// Source: https://youtu.be/Layeo3Jrkks

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.sound.sampled.AudioSystem.*;

public class AudioPlayer {
    /private String soundsFolder = "music" + File.separator;
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
    }

    public void playClearLine() {
        clearLineSound.setFramePosition(0);
        clearLineSound.start();
    }

    public void playGameOver() {
        gameoverSound.setFramePosition(0);
        gameoverSound.start();
    }
}
