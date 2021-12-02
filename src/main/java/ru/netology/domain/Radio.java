package ru.netology.domain;

public class Radio {

    private int currentChannel;
    private int currentVolume;

    public int makeNextChannel() {
        if (currentChannel <= 9) {
            if (currentChannel < 9) {
                currentChannel++;
            } else {
                currentChannel = 0;
            }
        }
        else {
            currentChannel = 0;
        }
        return currentChannel;
    }

    public int makePrevChannel() {
        if (currentChannel >= 0) {
            if (currentChannel > 0) {
                currentChannel--;
            } else {
                currentChannel = 9;
            }
        }
        else {
            currentChannel = 0;
        }
        return currentChannel;
    }

    public int makeUpVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
        else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public int makeDownVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }
        else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
