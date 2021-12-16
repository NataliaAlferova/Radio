package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {
    Radio radio = new Radio ();

    @Test
    public void makeNextChannelWhenLess9 () {
        radio.setCurrentChannel (radio.makeNextChannel());
        assertEquals(1, radio.getCurrentChannel() );
    }

    @Test
    public void makeNextChannelWhen9 () {
        radio.setCurrentChannel(9);
        radio.setCurrentChannel (radio.makeNextChannel ());
        assertEquals(0, radio.getCurrentChannel () );
    }

    @Test
    public void makeNextChannelWhenMore9 () {
        radio.setCurrentChannel(10);
        assertEquals(0,radio.getCurrentChannel() );
    }

    @Test
    public void makePrevChannelWhen0 () {
        radio.makePrevChannel();
        assertEquals(9,radio.getCurrentChannel() );
    }

    @Test
    public void makePrevChannelWhenMore0 () {
        radio.setCurrentChannel(5);
        radio.makePrevChannel();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void makePrevChannelWhenLess0 () {
        radio.setCurrentChannel(-1);
        assertEquals(0,radio.getCurrentChannel() );
    }

    @Test
    public void makeVolumeUpWhenLess100 () {
        radio.makeVolumeUp();
        assertEquals(1, radio.getCurrentVolume() );
    }

    @Test
    public void makeVolumeUpWhen100 () {
        radio.setCurrentVolume(100);
        radio.makeVolumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeDownWhenMore0 () {
        radio.setCurrentVolume(6);
        radio.makeVolumeDown();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeDownWhen0 () {
        radio.makeVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeDownWhenLess0 () {
        radio.setCurrentVolume(-1);
        radio.makeVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void makeVolumeUpWhenMore100 () {
        radio.setCurrentVolume(101);
        radio.makeVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}