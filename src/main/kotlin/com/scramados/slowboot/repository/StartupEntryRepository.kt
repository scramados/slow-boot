package com.scramados.slowboot.repository

import com.scramados.slowboot.data.StartupEntry
import org.springframework.data.repository.CrudRepository

interface StartupEntryRepository : CrudRepository<StartupEntry, Long> {
    fun findAllByOrderByAddedAtDesc(): Iterable<StartupEntry>
}
