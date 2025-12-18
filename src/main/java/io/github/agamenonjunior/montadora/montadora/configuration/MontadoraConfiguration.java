package io.github.agamenonjunior.montadora.montadora.configuration;

import io.github.agamenonjunior.montadora.montadora.Motor;
import io.github.agamenonjunior.montadora.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-00");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    @Primary
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("THO-40");
        motor.setLitragem(1.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(220);
        motor.setCilindros(6);
        motor.setModelo("AP-0070");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}
