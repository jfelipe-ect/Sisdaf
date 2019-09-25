package br.senac.rn.sisdaf.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_modelos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Modelo {

    @Id
    @Column(name = "mod_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mod_arm_id")
    private Opm opm;

    @NotNull
    @Column(name = "mod_fabricante", length = 50)
    private String fabricante;

    @NotNull
    @Column(name = "mod_tipo", length = 20)
    private String tipo;

    @NotNull
    @Column(name = "mod_calibre", length = 4)
    private String calibre;

    @NotNull
    @Column(name = "mod_nome", length = 50)
    private String nome;

}
