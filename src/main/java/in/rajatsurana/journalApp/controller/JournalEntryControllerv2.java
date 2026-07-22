package in.rajatsurana.journalApp.controller;

import in.rajatsurana.journalApp.entity.JournalEntry;
import in.rajatsurana.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JournalEntryControllerv2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping("get")
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry journalEntry) {
        journalEntryService.saveEntry(journalEntry);
        return true;
    }

    @GetMapping("/id/{gid}")
    public JournalEntry getById(@PathVariable Long gid) {
        return null;
    }

    @DeleteMapping("/id/{id}")
    public JournalEntry deleteById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/id/{id}")
    public JournalEntry update(@PathVariable Long id, @RequestBody JournalEntry journalEntry) {
        return null;
    }


}
