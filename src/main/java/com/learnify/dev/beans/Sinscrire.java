package com.learnify.dev.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sinscrire {
    private Long idCour;
    private Long idParticipant;

    public Long getIdCour() {
        return idCour;
    }

    public void setIdCour(Long idCour) {
        this.idCour = idCour;
    }

    public Long getidParticipant() {
        return idParticipant;
    }

    public void setidParticipant(Long idParticipant) {
        this.idParticipant = idParticipant;
    }
}
