package org.oz.oz_admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Spring Data JPA에서 엔티티의 변경 이력을 자동으로 추적하기 위해 JPA Auditing 기능을 활성화하는 어노테이션. 이 어노테이션을 사용하면 엔티티의 생성시간,
// 수정 시간등을 자동으로 관리, 이를 통해 데이터 변경 이력을 기록 할 수 있음.
@EnableJpaAuditing
@SpringBootApplication
public class OzAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(OzAdminApplication.class, args);
	}

}
