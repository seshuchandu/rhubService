package com.portal.rhub.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Facility {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String facilityTitle;
  private boolean isEnable;
}