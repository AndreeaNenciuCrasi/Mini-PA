package com.company;

public class Comment extends Entry {
    private  boolean moderated = false;

    public Comment(String message) {
        super(message);
    }

    public boolean toggleModeration(){
        if (this.moderated){
            this.moderated = false;
            return false;
        }
            this.moderated = true;
            return true;
    }

    public boolean isModerated() {
        return moderated;
    }


    public void setModerated(boolean moderated) {
        this.moderated = moderated;
    }


}
