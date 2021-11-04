package com.scramados.slowboot.data

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class StartupEntry(
    var hostname: String,
    var addedAt: LocalDateTime = LocalDateTime.now(),
    var completed: Boolean = false,
    @Id @GeneratedValue var id: Long? = null)