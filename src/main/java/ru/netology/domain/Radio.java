package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {

    private int currentChannel;
    private int currentVolume;
    private int amountChannel = 10;

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

}
