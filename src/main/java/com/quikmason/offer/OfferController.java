package com.quikmason.offer;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller that manages Record entries.
 */
@Controller
@RequestMapping(value = "/offer")
public class OfferController {

  @Resource
  private OfferService offerService;

  @RequestMapping(method = RequestMethod.GET)
  public String getView() {
    return "postoffer";
  }


  @RequestMapping(value = "data", produces = { "application/json" }, method = RequestMethod.GET)
  @ResponseBody
  public List<Offer> getData(Model model) {
    return offerService.getListData();
  }

  @RequestMapping(value = "save", method = RequestMethod.POST)
  public void save(@RequestBody final Offer offer) {
    offerService.save(offer);
  }

  @RequestMapping(value = "delete", method = RequestMethod.POST)
  public void delete(@RequestBody final Offer record) {
    offerService.delete(record.getId());
  }

}
