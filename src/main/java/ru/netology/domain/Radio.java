package ru.netology.domain;

public class Radio {

    private int currentChannel;
    private int currentVolume;

    public int makeNextChannel() {
        if (currentChannel < 9) {
            currentChannel++;
        }
        else {
            currentChannel = 0;
        }
        return currentChannel;
    }

    public int makePrevChannel() {
        if (currentChannel > 0) {
            currentChannel--;
        }
        else {
            currentChannel = 9;
        }
        return currentChannel;
    }

    public int makeVolumeUp() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public int makeVolumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0 || currentChannel > 9) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
