package com.mphasis.stormreaper.dao;

import java.util.List;

import com.mphasis.stormreaper.entities.Route;
import com.mphasis.stormreaper.exceptions.BusinessException;

public interface RouteDao {
	public List<Route> getAllRoutes  throws BusinessException();
	public void addRoute(Route r);
	public void deleteRoute(int routeid);
	public void editRoute(Route r);
	public Route getRoutebyId(int routeid);
	}
