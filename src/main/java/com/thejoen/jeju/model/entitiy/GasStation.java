package com.thejoen.jeju.model.entitiy;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class GasStation {
    @Id
    private String id;

    private String name;

    private String addr;

    private String tel;

    private Character lpgYN;

    private Double lat;

    private Double lon;

    private Long gasoline;

    private Long diesel;

    private Long lpg;
}
