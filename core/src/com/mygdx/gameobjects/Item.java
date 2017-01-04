/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.gameobjects;

/**
 *
 * @author Alexis Clément, Hugo Da Roit, Benjamin Lévèque, Alexis Montagne
 */
public enum Item {
    TNT("tnt", "TNT", "Permet de faire exploser des blocs aux alentours !", 0),
    ECHELLE("echelle", "Echelle", "Afin de pouvoir remonter à la surface.", 0),
    PILIER("pilier", "Pilier", "Pour éviter que les blocs de pierre vous tombent sur la tete ;)", 0),
    MAGASIN("magasin", "Magasin", "Afin d'acheter de nouveaux objets.", 0),
    PIOCHE_BOIS("pioche_bois", "Pioche en bois", "Cette pioche va vous permettre de casser des blocs.", 1),
    PIOCHE_PIERRE("pioche_pierre", "Pioche en pierre", "Cette pioche va vous permettre de casser des blocs.", 1.5f),
    PIOCHE_FER("pioche_fer", "Pioche en fer", "Cette pioche va vous permettre de casser des blocs.", 2),
    PIOCHE_OR("pioche_or", "Pioche en or", "Cette pioche va vous permettre de casser des blocs.", 3),
    PIOCHE_DIAMANT("pioche_diamant", "Pioche en diamant", "Cette pioche va vous permettre de casser des blocs.", 5);

    public static Item getItemFromTextureName(String nom) {
        if (nom.toLowerCase().equals("pioche_bois")) return Item.PIOCHE_BOIS;
        else if (nom.toLowerCase().equals("pioche_pierre")) return Item.PIOCHE_PIERRE;
        else if (nom.toLowerCase().equals("pioche_fer")) return Item.PIOCHE_FER;
        else if (nom.toLowerCase().equals("pioce_or")) return Item.PIOCHE_OR;
        else if (nom.toLowerCase().equals("pioche_diamant")) return Item.PIOCHE_DIAMANT;
        else if(nom.toLowerCase().equals("tnt")) return Item.TNT;
        else if (nom.toLowerCase().equals("echelle")) return Item.ECHELLE;
        else if (nom.toLowerCase().equals("pilier")) return Item.PILIER;
        else if (nom.toLowerCase().equals("magasin")) return Item.MAGASIN;
        else return null;
    }

    private String textureRegion, nom, description;
    private float param;

    private Item(String textureRegion, String nom, String description, float param) {
        this.textureRegion = textureRegion;
        this.nom = nom;
        this.description = description;
        this.param = param;
    }
    
    public float getParam() {
        return param;
    }
    
    public String getTextureRegion() {
        return textureRegion;
    }
    
    public void setTextureRegion(String str) {
        textureRegion = str;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getDescription() {
        return description;
    }
}
