package com.djair.academia.repository.model

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "aluno")
data class Aluno(
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long?,
  @Column(unique = true)
  val cpf: String,
  val nome: String,
  val bairro: String,
  val dataDeNascimento: LocalDate
)