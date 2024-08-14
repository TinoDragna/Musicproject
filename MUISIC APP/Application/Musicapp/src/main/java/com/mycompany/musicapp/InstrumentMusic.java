/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

/**
 *
 * @author PC
 */

    public class InstrumentMusic extends Song {
        private String instrument;
        private String artist;

        public InstrumentMusic(String title, String filePath, int year, String author, String instrument,String artist) {
            super(title, filePath, year, author);
            this.instrument = instrument;
            this.artist = artist;
        }

        public String getInstrument() {
            return instrument;
        }

        public void setInstrument(String instrument) {
            this.instrument = instrument;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }
        

        

        


    }


       
    
