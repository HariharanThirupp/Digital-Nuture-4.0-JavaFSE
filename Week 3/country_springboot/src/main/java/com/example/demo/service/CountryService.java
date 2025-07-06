
package com.example.demo.service;

import com.example.demo.entity.Country;
import java.util.List;

public interface CountryService {
    List<Country> getAllCountries();
    Country getCountryById(Long id);
    Country createCountry(Country country);
    Country updateCountry(Long id, Country country);
    void deleteCountry(Long id);
}
