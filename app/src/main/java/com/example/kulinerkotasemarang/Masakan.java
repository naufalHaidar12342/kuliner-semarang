package com.example.kulinerkotasemarang;

public class Masakan {
    private String namaMasakan,descMasakan,hargaMasakan;
    private int idPhoto;

    //konstruktor untuk class Masakan
    public Masakan(String namaMasakan, String descMasakan, String hargaMasakan, int idPhoto) {
        this.namaMasakan = namaMasakan;
        this.descMasakan = descMasakan;
        this.hargaMasakan = hargaMasakan;
        this.idPhoto = idPhoto;
    }

    public String getNamaMasakan() {
        return namaMasakan;
    }

    public void setNamaMasakan(String namaMasakan) {
        this.namaMasakan = namaMasakan;
    }

    public String getDescMasakan() {
        return descMasakan;
    }

    public void setDescMasakan(String descMasakan) {
        this.descMasakan = descMasakan;
    }

    public String getHargaMasakan() {
        return hargaMasakan;
    }

    public void setHargaMasakan(String hargaMasakan) {
        this.hargaMasakan = hargaMasakan;
    }

    public int getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(int idPhoto) {
        this.idPhoto = idPhoto;
    }
}
