/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

/**
 *
 * @author PC
 */
public class SongLyric extends Song {
    private String singer;

    public SongLyric(String title, String filePath, int year, String author, String singer) {
        super(title, filePath, year, author);
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    
    
    
    
    

}
