package org.oz.oz_admin.common.Entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Getter

//부모 클래스 속성(baseEntity)를 자식 클래스가 공유 할 수 있게 해줌. 주로 여러 엔티티에서 반복되는 공통 속성을 한곳에 정의하고 재사용 하기 위해 사용되는 어노테이션.
@MappedSuperclass

@ToString
public abstract class BaseEntity {

    @CreatedDate
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modDate;

}