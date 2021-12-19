package ru.netology.domain;

public class Radio {

    private int currentChannel;
    private int currentVolume;
    private int amountChannel;

    public Radio(int amountChannel) {
        this.amountChannel = 10;
    }

    public Radio() {
    }

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
        if (currentVolume < 100) {
            currentVolume++;
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
        if (currentVolume < 0 || currentVolume > 100) {
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

    public int getAmountChannel() {
        return amountChannel;
    }

    public void setAmountChannel(int amountChannel) {
        this.amountChannel = amountChannel;
    }

}
