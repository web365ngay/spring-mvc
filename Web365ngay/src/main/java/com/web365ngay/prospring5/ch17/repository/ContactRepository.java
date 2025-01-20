/**
 * Created on Dec 21, 2011
 */
package com.web365ngay.prospring5.ch17.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.web365ngay.prospring5.ch17.domain.Contact;

/**
 * @author Clarence
 *
 */
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {

}
