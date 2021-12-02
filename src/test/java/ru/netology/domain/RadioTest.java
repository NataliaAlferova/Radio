package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {

    @Test
    public void makeNextChannelLess9 () {
        Radio radio = new Radio ();
        assertEquals(1, radio.makeNextChannel() );
    }

    @Test
    public void makeNextChannelFrom9 () {
        Radio radio = new Radio ();
        radio.setCurrentChannel(9);
        assertEquals(0, radio.makeNextChannel() );
    }

    @Test
    public void makeNextChannelMore9 () {
        Radio radio = new Radio ();
        radio.setCurrentChannel(10);
        assertEquals(0, radio.makeNextChannel() );
    }

    @Test
    public void makePrevChannelFrom0 () {
        Radio radio = new Radio();
        assertEquals(9, radio.makePrevChannel());
    }

    @Test
    public void makePrevChannelMore0 () {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        assertEquals(4, radio.makePrevChannel());
    }

    @Test
    public void makePrevChannelLess0 () {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        assertEquals(0, radio.makePrevChannel());
    }

    @Test
    public void makeUpVolumeLess10 () {
        Radio radio = new Radio();
        assertEquals(1, radio.makeUpVolume());
    }

    @Test
    public void makeUpVolumeFrom10AndMore () {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(0, radio.makeUpVolume());
    }

    @Test
    public void makeDownVolumeMore0 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        assertEquals(5, radio.makeDownVolume());
    }

    @Test
    public void makeDownVolumeFrom0AndLess () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.makeDownVolume());
    }

}