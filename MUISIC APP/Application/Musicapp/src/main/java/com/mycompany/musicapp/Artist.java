/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

/**
 *
 * @author PC
 */

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    //private List<Album> albums;

    public Artist(String name) {
        this.name = name;
       // this.albums = new ArrayList<>();
    }

    //public void addAlbum(Album album) {
     //   albums.add(album);
    //}

   // public List<Album> getAlbums() {
    //    return albums;
   // }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Artist [name=" + name  + "]";
    }
}

    


    

