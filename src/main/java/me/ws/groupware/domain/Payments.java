package me.ws.groupware.domain;

import lombok.Getter;
import org.hibernate.annotations.Tables;

import javax.persistence.*;

@Entity
@Table(name="payments")
@Getter
public class Payments {

    @Id @GeneratedValue
    private Long id;

    private String title; //결제할 문서 제목
}
