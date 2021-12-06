package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {


    @Test
    public void makeNextChannelLess9 () {
        Radio radio = new Radio ();
        radio.setCurrentChannel (radio.makeNextChannel());
        assertEquals(1, radio.getCurrentChannel() );
    }

    @Test
    public void makeNextChannelFrom9 () {
        Radio radio = new Radio ();
        radio.setCurrentChannel(9);
        radio.setCurrentChannel (radio.makeNextChannel ());
        assertEquals(0, radio.getCurrentChannel () );
    }

    @Test
    public void makeNextChannelMore9 () {
        Radio radio = new Radio ();
        radio.setCurrentChannel(10);
        assertEquals(0,radio.getCurrentChannel() );
    }

    @Test
    public void makePrevChannelFrom0 () {
        Radio radio = new Radio();
        radio.makePrevChannel();
        assertEquals(9,radio.getCurrentChannel() );
    }

    @Test
    public void makePrevChannelMore0 () {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.makePrevChannel();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void makePrevChannelLess0 () {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        assertEquals(0,radio.getCurrentChannel() );
    }

    @Test
    public void makeVolumeUpLess10 () {
        Radio radio = new Radio();
        radio.makeVolumeUp();
        assertEquals(1, radio.getCurrentVolume() );
    }

    @Test
    public void makeVolumeUpFrom10 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.makeVolumeUp();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeDownMore0 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.makeVolumeDown();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeDownFrom0 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.makeVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeDownLess0 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.makeVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeUpMore10 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.makeVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}