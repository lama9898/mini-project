package io.github.lama9898.mini_project;

import org.springframework.boot.SpringApplication;

public class TestMiniProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(MiniProjectApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
