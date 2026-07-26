package in.rajatsurana.journalApp.repository;

import in.rajatsurana.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId> {

    void deleteById(Long id);
}
