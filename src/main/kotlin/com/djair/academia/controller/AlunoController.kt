package com.djair.academia.controller

import com.djair.academia.repository.model.Aluno
import com.djair.academia.service.AlunoService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/aluno")
class AlunoController(private val alunoService: AlunoService) {

    @GetMapping
    fun getAll(): List<Aluno> = alunoService.getAll()

    @PostMapping
    fun create(@RequestBody payload: Aluno): Aluno = alunoService.create(payload)
}