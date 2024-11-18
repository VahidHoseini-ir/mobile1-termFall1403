package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class profileData implements Parcelable {


    private String name;
    private String family;
    private String age;
    private String nummber;
    private String address;
    private String gender;
    private String postal_code;
    private String mail;
    private String country;
    private String city;
    private String date;
    private String time;
    private String major;
    private String univercityName;
    private String proffetional;
    private String ocupation;

    protected profileData(Parcel in) {
        name = in.readString();
        family = in.readString();
        age = in.readString();
        nummber = in.readString();
        address = in.readString();
        gender = in.readString();
        postal_code = in.readString();
        mail = in.readString();
        country = in.readString();
        city = in.readString();
        date = in.readString();
        time = in.readString();
        major = in.readString();
        univercityName = in.readString();
        proffetional = in.readString();
        ocupation = in.readString();
    }

    public profileData() {

    }

    public profileData(String name, String family, String age, String nummber, String address, String gender, String postal_code, String mail, String country, String city, String date, String time, String major, String univercityName, String proffetional, String ocupation) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.nummber = nummber;
        this.address = address;
        this.gender = gender;
        this.postal_code = postal_code;
        this.mail = mail;
        this.country = country;
        this.city = city;
        this.date = date;
        this.time = time;
        this.major = major;
        this.univercityName = univercityName;
        this.proffetional = proffetional;
        this.ocupation = ocupation;
    }

    public static final Creator<profileData> CREATOR = new Creator<profileData>() {
        @Override
        public profileData createFromParcel(Parcel in) {
            return new profileData(in);
        }

        @Override
        public profileData[] newArray(int size) {
            return new profileData[size];
        }
    };

    @Override
    public String toString() {
        return "profileData{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age='" + age + '\'' +
                ", nummber='" + nummber + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", mail='" + mail + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", major='" + major + '\'' +
                ", univercityName='" + univercityName + '\'' +
                ", proffetional='" + proffetional + '\'' +
                ", ocupation='" + ocupation + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNummber() {
        return nummber;
    }

    public void setNummber(String nummber) {
        this.nummber = nummber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUnivercityName() {
        return univercityName;
    }

    public void setUnivercityName(String univercityName) {
        this.univercityName = univercityName;
    }

    public String getProffetional() {
        return proffetional;
    }

    public void setProffetional(String proffetional) {
        this.proffetional = proffetional;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(family);
        parcel.writeString(age);
        parcel.writeString(nummber);
        parcel.writeString(address);
        parcel.writeString(gender);
        parcel.writeString(postal_code);
        parcel.writeString(mail);
        parcel.writeString(country);
        parcel.writeString(city);
        parcel.writeString(date);
        parcel.writeString(time);
        parcel.writeString(major);
        parcel.writeString(univercityName);
        parcel.writeString(proffetional);
        parcel.writeString(ocupation);
    }
}
