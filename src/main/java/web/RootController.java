package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.TtcService;

/**
 * Created by 37264 on 6/25/16.
 */
public class RootController {

    @Autowired
    private TtcService ttcService;
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public ModelAndView handleHomeGetRequest() throws Exception {
        //logger.debug( "Called" );

        ttcService.executeGet("http://webservices.nextbus.com/service/publicXMLFeed?command=vehicleLocations&a=ttc&r=53&t=0");

        return null;
    }
}
