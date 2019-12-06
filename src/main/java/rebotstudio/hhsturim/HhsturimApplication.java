package rebotstudio.hhsturim;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("rebotstudio.hhsturim.mapper")
public class HhsturimApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhsturimApplication.class, args);
    }

}


