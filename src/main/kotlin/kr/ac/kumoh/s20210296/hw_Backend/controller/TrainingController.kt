package kr.ac.kumoh.s20210296.hw_Backend.controller

import kr.ac.kumoh.s20210296.hw_Backend.model.Training
import kr.ac.kumoh.s20210296.hw_Backend.service.TrainingService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/Training")
@CrossOrigin(origins = ["http://localhost:3001/"])
class TrainingController(private val service: TrainingService) {
    @PostMapping
    fun addTraining(@RequestBody training: Training): Training = service.addTraining(training)

    @GetMapping
    fun getAllTrainings(): List<Training> = service.getAllTrainings()

    @GetMapping("/{id}")
    fun getTrainingById(@PathVariable id: String): Training? = service.getTrainingById(id)

    @GetMapping("date/{date}")
    fun getTrainingByDate(@PathVariable date: String): List<Training> = service.getTrainingByDate(date)

    @PutMapping("/{id}")
    fun updateTraining(@PathVariable id: String, @RequestBody training: Training): Training? = service.updateTraining(id, training)

    @DeleteMapping("/{id}")
    fun deleteTraining(@PathVariable id: String): Map<String, String> {
        return if (service.deleteTraining(id))
            mapOf("status" to "deleted")
        else
            mapOf("status" to "not found")
    }
}
