package com.shvarsman.notes.data

import com.shvarsman.notes.domain.Note

fun Note.toDbModel(): NoteDbModel {
    return NoteDbModel(
        id = id,
        title = title,
        content = content,
        updatedAt = updatedAt,
        isPinned = isPinned
    )
}

fun NoteDbModel.toEntity(): Note {
    return Note(
        id = id,
        title = title,
        content = content,
        updatedAt = updatedAt,
        isPinned = isPinned
    )
}

fun List<NoteDbModel>.toEntities(): List<Note> {
    return map {
        it.toEntity()
    }
}