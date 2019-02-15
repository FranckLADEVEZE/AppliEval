package me.kirkhorn.knut.android_sudoku.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
@Entity
public class User {
        @PrimaryKey

        private String mUsername;
        private String mEmail;
        private String mPassword;

        public User(String mUsername, String mEmail, String mPassword) {

            this.mEmail = mEmail;
            this.mUsername = mUsername;
            this.mPassword = mPassword;
        }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public CharSequence getLogin() {
        return null;
    }
}


