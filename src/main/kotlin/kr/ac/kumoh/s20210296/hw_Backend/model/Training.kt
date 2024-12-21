package kr.ac.kumoh.s20210296.hw_Backend.model

import kr.ac.kumoh.s20210296.hw_Backend.model.AdditionalContent
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "training")
data class Training(
    @Id val id: String? = null,
    val aurl: String,
    val date: String,
    val name: String,
    val additionalContent: AdditionalContent? = null
)