package czm.library;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("czm.library.mapper") // 扫描指定接口与映射配置文件的包名
public class LibraryApplication {



    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

}
