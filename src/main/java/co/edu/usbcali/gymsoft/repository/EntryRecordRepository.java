package co.edu.usbcali.gymsoft.repository;

import co.edu.usbcali.gymsoft.domain.EntryRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRecordRepository extends JpaRepository<EntryRecord, Integer> {
}
