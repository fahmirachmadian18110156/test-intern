package com.tabeldata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fahmi_rachmadian")
public class Data {

    @Id
    private String nip;
    private String nama_lengkap;
    private String tanggal_lahir;
    private String tempat_lahir;

    public Data(){

    }


    public Data(String nip, String nama_lengkap, String tanggal_lahir, String tempat_lahir) {
        this.nip = nip;
        this.nama_lengkap = nama_lengkap;
        this.tanggal_lahir = tanggal_lahir;
        this.tempat_lahir = tempat_lahir;
    }


    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama_lengkap() {
        return this.nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getTanggal_lahir() {
        return this.tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getTempat_lahir() {
        return this.tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

}
