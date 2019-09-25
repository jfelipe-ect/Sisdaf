package br.senac.rn.sisdaf.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "tb_ocorrencias")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Ocorrencia {

    @Id
    @Column(name = "oco_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "oco_arm_id")
    @JoinColumn(name = "oco_pol_id")
    @JoinColumn(name = "oco_opm_id")
    private Opm opm;

    @NotNull
    @Column(name = "oco_quantidade")
    private Integer quantidade;

    @NotNull
    @Column(name = "oco_data")
    private Date data;

    @NotNull
    @Column(name = "oco_hora")
    private Time hora;

}
