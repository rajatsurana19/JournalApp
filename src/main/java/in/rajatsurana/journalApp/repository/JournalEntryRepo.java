package in.rajatsurana.journalApp.repository;

import in.rajatsurana.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntry,String> {

}
