package com.quikmason.offer;

import java.util.List;

public interface OfferService {

	List<Offer> getListData();

	void save(Offer offer);

	void delete(Long id);
}
