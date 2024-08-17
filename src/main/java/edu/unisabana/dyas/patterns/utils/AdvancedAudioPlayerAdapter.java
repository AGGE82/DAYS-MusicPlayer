package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer{

    public final AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer){
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType=="mp4"){
        advancedAudioPlayer.playMp4(fileName);
        }
        else if(audioType=="vlc") {
        advancedAudioPlayer.playVlc(fileName);
        }
        else System.out.println("tipo de archivo incorrecto");
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
    
}
