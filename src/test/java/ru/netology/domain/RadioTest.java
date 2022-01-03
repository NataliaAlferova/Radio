package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {
    int amountChannel = 20;
    int maxChannel = amountChannel -1;
    int minChannel = 0;
    int maxVolume = 100;
    int minVolume = 0;

    Radio radio = new Radio(amountChannel);
    Radio defaultRadio = new Radio();

    @Test
    public void makeNextChannel () {
        radio.makeNextChannel();
        assertEquals(minChannel + 1, radio.getCurrentChannel() );
    }

    @Test
    public void makeNextChannelWhenMax () {
        radio.setCurrentChannel(maxChannel);
        radio.makeNextChannel ();
        assertEquals(minChannel, radio.getCurrentChannel () );
    }

    @Test
    public void makePrevChannelWhenMin () {
        radio.makePrevChannel();
        assertEquals(maxChannel,radio.getCurrentChannel() );
    }

    @Test
    public void makePrevChannelWhenMax () {
        radio.setCurrentChannel(maxChannel);
        radio.makePrevChannel();
        assertEquals(maxChannel - 1, radio.getCurrentChannel());
    }

    @Test
    public void setCurrentChannelLessMin () {
        radio.setCurrentChannel(minChannel - 1);
        assertEquals(0, radio.getCurrentChannel() );
    }

    @Test
    public void setCurrentChannelMoreMax () {
        radio.setCurrentChannel(maxChannel + 1);
        assertEquals(0,radio.getCurrentChannel() );
    }

    @Test
    public void makeVolumeUp () {
        radio.makeVolumeUp();
        assertEquals(minVolume + 1, radio.getCurrentVolume() );
    }

    @Test
    public void makeVolumeUpWhenMax () {
        radio.setCurrentVolume(maxVolume);
        radio.makeVolumeUp();
        assertEquals(maxVolume, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeDown () {
        radio.setCurrentVolume(maxVolume -1);
        radio.makeVolumeDown();
        assertEquals(maxVolume - 2, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeDownWhenMin () {
        radio.makeVolumeDown();
        assertEquals(minVolume, radio.getCurrentVolume());
    }

    @Test
    public void setVolumeMoreMax () {
        radio.setCurrentVolume(maxVolume + 1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setVolumeLessMin () {
        radio.setCurrentVolume(minVolume - 1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void makeNextChannelForDefault () {
        defaultRadio.makeNextChannel();
        assertEquals(minChannel + 1, defaultRadio.getCurrentChannel() );
    }

}