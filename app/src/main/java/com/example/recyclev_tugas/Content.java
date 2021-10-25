package com.example.recyclev_tugas;

public class Content {
    private String nama;
    private String status;
    private int photo;

    public Content(String nama, String status, int photo){
        this.status = status;
        this.nama = nama;
        this.photo = photo;
    }

    public int getPhoto(){
        return photo;
    }
    public void setPhoto(int photo){
        this.photo=photo;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
