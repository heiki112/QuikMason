package com.quikmason.offer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.quikmason.common.jdbc.ArgPreparedStatementSetter;



@Service
public class OfferServiceJdbcImpl implements OfferService {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Offer> getListData() {
		List<Offer> offers = getOffers();
		return offers;
	}

	private List<Offer> getOffers() {
	    String sql = "select o.id, o.start_date, o.end_date, o.company_name, o.phone_nr, o.mail, o.address, o.offer_name, o.wage, o.content from OFFER o";

	    List<Offer> offers = jdbcTemplate.query(sql, new RowMapper<Offer>() {

	      @Override
	      public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Offer record = new Offer();
	        record.setId(rs.getLong("id"));
	        record.setStartDate(rs.getDate("start_date"));
	        record.setEndDate(rs.getDate("end_date"));
	        record.setCompanyName(rs.getString("company_name"));
	        record.setPhonenr(rs.getString("phone_nr"));
	        record.setMail(rs.getString("mail"));
	        record.setAddress(rs.getString("address"));
	        record.setOfferName(rs.getString("offer_name"));
	        record.setWage(rs.getDouble("wage"));
	        record.setContent(rs.getString("content"));

	        return record;
	      }
	    });
	    return offers;
	  }
	
	private Long insertRecord(final Offer offer) {
		KeyHolder keyHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

				Object[] args = new Object[] { offer.getCompanyName(), offer.getPhonenr(), offer.getMail(),offer.getStartDate(), offer.getEndDate(), offer.getAddress(), offer.getOfferName(), offer.getContent(), offer.getWage() };
				String sql = "insert into offer (company_name, phone_nr, mail, start_date, end_date, address, offer_name, content, wage) values (?,?,?,?,?,?,?,?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(sql, new String[] { "ID" });
				ArgPreparedStatementSetter.setValues(preparedStatement, args, 1);
				return preparedStatement;
			}
		}, keyHolder);

		return keyHolder.getKey().longValue();
	}
	@Override
	public void save(Offer offer) {
		Long recordId;

		if (offer.getId() == null) {
			recordId = insertRecord(offer);
		} else {
			recordId = offer.getId();

			String sql = "update offer set company_name=?, phone_nr=?, mail=?, start_date=?, end_date=?, address=?, offer_name=?, content=?, wage=? where id= ?";
			Object[] args = new Object[] {offer.getCompanyName(), offer.getPhonenr(), offer.getMail(),offer.getStartDate(), offer.getEndDate(), offer.getAddress(), offer.getOfferName(), offer.getContent(), offer.getWage(), recordId };
			jdbcTemplate.update(sql, args);
		}

		}

		@Override
		public void delete(Long id) {
			String recordSql = "delete from offer where id=?";
		    jdbcTemplate.update(recordSql, id);
		}

	}
