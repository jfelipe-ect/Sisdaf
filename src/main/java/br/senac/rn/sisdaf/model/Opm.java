package br.senac.rn.sisdaf.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_opms")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Opm {

    @Id
    @Column(name = "opm_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "opm_nome", length = 50)
    private String nome;

    @NotNull
    @Column(name = "opm_sigla", length = 3)
    private String sigla;

}
