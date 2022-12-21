package com.emendes.offer.service.impl;

import com.emendes.offer.dto.request.OfferRequest;
import com.emendes.offer.dto.response.OfferResponse;
import com.emendes.offer.mapper.OfferMapper;
import com.emendes.offer.model.entity.Offer;
import com.emendes.offer.repository.OfferRepository;
import com.emendes.offer.service.OfferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Slf4j
@Transactional
@Service
public class OfferServiceImpl implements OfferService {

  private final OfferRepository offerRepository;
  private final OfferMapper mapper;

  @Override
  public OfferResponse save(OfferRequest offerRequest) {
    Offer offer = mapper.toOffer(offerRequest);
    offerRepository.save(offer);
    log.info("offer with id {} was saved", offer.getId());

    return mapper.toOfferResponse(offer);
  }

}