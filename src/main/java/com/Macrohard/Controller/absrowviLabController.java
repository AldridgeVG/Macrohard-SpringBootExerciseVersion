package com.Macrohard.Controller;

import com.Macrohard.dao.AbsrOvwiLabDao;
import com.Macrohard.entities.AbsRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class absrowviLabController {

    @GetMapping("/absrs")
    public String absRsIndex(Model model){

        List<AbsRecord> mAbsrs = new AbsrOvwiLabDao().getAllAbsRecords();
        model.addAttribute("Absrs",mAbsrs);

        return "recordlab/queryAbsr_listAll";
    }
}
