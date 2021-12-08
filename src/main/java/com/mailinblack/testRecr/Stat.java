package com.mailinblack.testRecr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Stat {

    String day;
    Long countGrey = 0L;
    Long countVirus = 0L;
    Long countWhite = 0L;
    Long countBlack = 0L;



    public void incrementGrey(Long count){
        this.countGrey = this.countGrey+count;
    }

    public void incrementVirus(Long count){
        this.countVirus = this.countVirus+count;
    }

    public void incrementWhite(Long count){
        this.countWhite = this.countWhite+count;
    }

    public void incrementBlack(Long count){
        this.countBlack = this.countBlack+count;
    }

    public String toString(){
        return day + " " + countGrey + " " + countVirus + " " + countWhite + " "+ countBlack;
    }
}
