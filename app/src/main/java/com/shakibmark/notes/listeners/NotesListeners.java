package com.shakibmark.notes.listeners;

import com.shakibmark.notes.entities.Note;

public interface  NotesListeners {
    void onNoteClicked(Note note, int position);

}
