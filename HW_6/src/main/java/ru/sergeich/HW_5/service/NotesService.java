package ru.sergeich.HW_5.service;

import ru.sergeich.HW_5.domain.Note;

import java.util.List;

public interface NotesService {
    List<Note> getAllNotes();
    Note createNote(Note note);
    Note getNoteById(Long id);
    Note updateNote(Long id, String head, String text);
    void deleteById(Long id);
}
