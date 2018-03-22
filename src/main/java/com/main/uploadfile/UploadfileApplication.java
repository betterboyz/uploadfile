package com.main.uploadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.main.uploadfile")
public class UploadfileApplication {
	public static void main(String[] args) {
		SpringApplication.run(UploadfileApplication.class, args);
		System.out.println("ヾ(◍°∇°◍)ﾉﾞ    uploadfile启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
			" _    _      _ _        __          __        _     _ \n" +
			"| |  | |    | | |       \\ \\        / /       | |   | |\n" +
			"| |__| | ___| | | ___    \\ \\  /\\  / /__  _ __| | __| |\n" +
			"|  __  |/ _ \\ | |/ _ \\    \\ \\/  \\/ / _ \\| '__| |/ _` |\n" +
			"| |  | |  __/ | | (_) |    \\  /\\  / (_) | |  | | (_| |\n" +
			"|_|  |_|\\___|_|_|\\___/      \\/  \\/ \\___/|_|  |_|\\__,_|");
	}
}
