package in.rajatsurana.journalApp.service;

import in.rajatsurana.journalApp.entity.JournalEntry;
import in.rajatsurana.journalApp.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepo journalEntryRepo;


    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepo.save(journalEntry);
    }
}
