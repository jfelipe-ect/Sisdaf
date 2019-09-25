package br.senac.rn.sisdaf.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_armas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Arma {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "arm_opm_id")
    private Opm opm;

    @Id
    @Column(name = "arm_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "arm_serial", length = 20)
    private Long serial;

    @NotNull
    @Column(name = "arm_tombamento", length = 15)
    private String tombamento;

}
