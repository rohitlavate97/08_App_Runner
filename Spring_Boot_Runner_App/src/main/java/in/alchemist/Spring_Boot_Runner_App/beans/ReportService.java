package in.alchemist.Spring_Boot_Runner_App.beans;

import in.alchemist.Spring_Boot_Runner_App.dao.ReportDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    ReportDAO reportDAO;
    public ReportService(){
        System.out.println("ReportService : Constructor");
    }
}
