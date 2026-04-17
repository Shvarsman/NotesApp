package com.shvarsman.notes.domain

class AddNoteUseCase(
    private val repository: NotesRepository
) {

    fun addNote(note: Note) {
        repository.addNote(note)
    }
}