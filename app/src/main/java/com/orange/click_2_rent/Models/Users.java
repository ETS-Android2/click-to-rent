package com.orange.click_2_rent.Models;
/***********************************************************************
 * Author:  Team click-2-rent
 * Purpose: Defines the Class Users
 ***********************************************************************/

import java.util.*;

public class Users {

    private String idUser;
    private String nom;
    private Number telphone;
    private String email;
    private Photo photoClient;
    private ArrayList<Service> mesServices;
    private ArrayList<Service> servicesDemande;
    private ArrayList<Commentaire> mesCommentaires;
    private String motDePasse;
    public ArrayList<Service> demande;
    private int photoProfil;

    public Users() {
    }



    public ArrayList<Service> getMesServices() {
        if (mesServices == null);
            mesServices = new ArrayList<Service>();
        return mesServices;
    }

    public void newServices(Service service) {
        this.mesServices.add(service);
    }

    public ArrayList<Service> getServicesDemande() {
        if (servicesDemande == null);
            servicesDemande=new ArrayList<Service>();
        return servicesDemande;
    }

    public void newServiceRequest(Service service) {
        this.servicesDemande.add(service);
    }

    public ArrayList<Commentaire> getMesCommentaires() {
        if (mesCommentaires == null);
            mesCommentaires=new ArrayList<Commentaire>();
        return mesCommentaires;
    }

    public void newCommentaires(Commentaire comment) {
        this.mesCommentaires.add(comment);
    }

    public String getIdUser() {
        return idUser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Number getTelphone() {
        return telphone;
    }

    public void setTelphone(Number telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public int getPhotoProfil() {
        return photoProfil;
    }

    public void setPhotoProfil(int photoProfil) {
        this.photoProfil = photoProfil;
    }

    public Photo getPhotoClient() {
        return photoClient;
    }

    public void setPhotoClient(Photo photoClient) {
        this.photoClient = photoClient;
    }


    public ArrayList<Service> getDemande() {
        if (demande == null)
            demande = new ArrayList<Service>();
        return demande;
    }

    public Iterator getIteratorDemande() {
        if (demande == null)
            demande = new ArrayList<Service>();
        return demande.iterator();
    }

    @Override
    public String toString() {
        return "Users{" +
                "idUsers=" + idUser +
                ", nom='" + nom + '\'' +
                ", telphone=" + telphone +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", photoProfil=" + photoProfil +
                ", photoClient=" + photoClient +
                ", demande=" + demande.toString() +
                '}';
    }
}