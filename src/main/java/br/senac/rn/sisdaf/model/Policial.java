package br.senac.rn.sisdaf.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_policiais")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Policial {

    @Id
    @Column(name = "pol_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pol_opm_id")
    private Opm opm;

    @NotNull
    @Column(name = "pol_nome", length = 50)
    private String nome;

    @NotNull
    @Column(name = "pol_matricula")
    private String matricula;

    @NotNull
    @Column(name = "pol_cpf", length = 11)
    private String cpf;

    @NotNull
    @Column(name = "pol_cargo", length = 20)
    private String cargo;

}
