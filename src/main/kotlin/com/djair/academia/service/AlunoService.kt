package com.djair.academia.service

import com.djair.academia.repository.AlunoRepository
import com.djair.academia.repository.model.Aluno
import org.springframework.stereotype.Service

@Service
class AlunoService(private val alunoRepository: AlunoRepository) {

    fun getAll(): List<Aluno> = alunoRepository.findAll()

    fun create(aluno: Aluno): Aluno = alunoRepository.save(aluno)
}