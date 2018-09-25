package kz.phobos.tm.core.controller;


import kz.phobos.tm.core.model.*;
import kz.phobos.tm.core.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/general")
public class GeneralController {

    @Autowired
    private IGeneralService service;

    @GetMapping("/event")
    public List<Event> getAllEvent() {
        return service.getAllEvent();
    }

    @GetMapping("/event/{id}")
    Event getEventById(@PathVariable(value = "id") Integer id) {
        return service.getEventById(id);
    }


    @GetMapping("/eventStatus")
    public List<EventStatus> getAllEventStatus() {
        return service.getAllEventStatus();
    }
    @GetMapping("/eventStatus/{id}")
    EventStatus getEventStatusById(@PathVariable(value = "id") Integer id) {
        return service.getEventStatusById(id);
    }

    @GetMapping("/eventUserMap")
    public List<EventUserMap> getAllEventUserMap() {
        return service.getAllEventUserMap();
    }

    @GetMapping("/eventUserMap/{id}")
    EventUserMap getEventUserMapById(@PathVariable(value = "id") Integer id) {
        return service.getEventUserMapById(id);
    }
    @GetMapping("/eventUserRate")
    public List<EventUserRate> getAllEventUserRate() {
        return service.getAllEventUserRate();
    }

    @GetMapping("/eventUserRate/{id}")
    EventUserRate getEventUserRateById(@PathVariable(value = "id") Integer id) {
        return service.getEventUserRateById(id);
    }

    @GetMapping("/rateValue")
    public List<RateValue> getAllRateValue() {
        return service.getAllRateValue();
    }

    @GetMapping("/rateValue/{id}")
    RateValue getRateValueById(@PathVariable(value = "id") Integer id) {
        return service.getRateValueById(id);
    }

    @GetMapping("/route")
    public List<Route> getAllRoute(){
        return service.getAllRoute();
    }
    @GetMapping("/route/{id}")
    Route getRouteById(@PathVariable(value = "id") Integer id) {
        return service.getRouteById(id);
    }
    @GetMapping("/routeLevel")
    public List<RouteLevel> getAllRouteLevel(){
        return service.getAllRouteLevel();
    }
    @GetMapping("/routeLevel/{id}")
    RouteLevel getRouteLevelById(@PathVariable(value = "id") Integer id) {
        return service.getRouteLevelById(id);
    }
    @GetMapping("/routeStatus")
    public List<RouteStatus> getAllRouteStatus(){
        return service.getAllRouteStatus();
    }
    @GetMapping("/routeStatus/{id}")
    RouteStatus getRouteStatusById(@PathVariable(value = "id") Integer id) {
        return service.getRouteStatusById(id);
    }

    @GetMapping("/user")
    public List<User> getAllUser() {
        return  service.getAllUser();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable(value = "id") Integer id) {
        return service.getUserById(id);
    }



















}
