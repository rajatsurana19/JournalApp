package in.rajatsurana.journalApp.controller;

import in.rajatsurana.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JournalEntryController {
    private final Map<ObjectId, JournalEntry> journalEntryMap = new HashMap<>();

    @GetMapping("get")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntryMap.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry journalEntry){
        journalEntryMap.put(journalEntry.getId(),journalEntry);
        return true;
    }

    @GetMapping("/id/{gid}")
    public JournalEntry getById(@PathVariable Long gid){
        return journalEntryMap.get(gid);
    }

    @DeleteMapping("/id/{id}")
    public JournalEntry deleteById(@PathVariable Long id){
        return journalEntryMap.remove(id);
    }

    @PutMapping("/id/{id}")
    public JournalEntry update(@PathVariable ObjectId id, @RequestBody JournalEntry journalEntry){
        return journalEntryMap.put(id,journalEntry);
    }
}
