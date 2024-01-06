package ie.atu.healthprojectyr3_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {
    private final MedicalRecordsRepository medicalRecordsRepository;

    @Autowired
    public DataLoader(MedicalRecordsRepository medicalRecordsRepository) {
        this.medicalRecordsRepository = medicalRecordsRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        MedicalRecords testdata = new MedicalRecords(1L, "12345", "", "", "None", "5");
        MedicalRecords testdata2 = new MedicalRecords(2L, "21345", "", "", "", "All");
        MedicalRecords testdata3 = new MedicalRecords(3L, "312345", "", "", "", "All");
    }



}
