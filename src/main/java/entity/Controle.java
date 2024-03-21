package entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Controle {

    private boolean ligado;

    @NotNull
    @Max(100)
    private Integer volume;

    private boolean tocando;

    public void aumentarVolume(){

        int volumeAfterIncrement = getVolume() + 1;
        setVolume(volumeAfterIncrement);

    }

    public void diminuirVolume(){

        int volumeAfterDecrement = getVolume() - 1;
        setVolume(volumeAfterDecrement);
    }

    public void play(){

        setLigado(true);
        setTocando(true);

    }

    public void pause(){
        setTocando(false);
    }

    public void mudo(){
        setVolume(0);
    }

}
