package com.example.smittetryk.config;

import com.example.smittetryk.model.County;
import com.example.smittetryk.repository.CountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    CountyRepository countyRepository;

    @Override
    public void run(String... args) throws Exception {
        County region = new County();
        region.setName("Roskilde");
        region.setCountyCode("0265");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0265");
        countyRepository.save(region);

        region.setName("Køge");
        region.setCountyCode("0259");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0259");
        countyRepository.save(region);

        region.setName("Glostrup");
        region.setCountyCode("0161");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0161");
        countyRepository.save(region);

        region.setName("Gladsaxe");
        region.setCountyCode("0159");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0159");
        countyRepository.save(region);

        region.setName("København");
        region.setCountyCode("0101");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0101");
        countyRepository.save(region);

        region.setName("Frederiksberg");
        region.setCountyCode("0147");
        region.setHref("https://api.dataforsyningen.dk/kommuner/0147");
        countyRepository.save(region);

        region.setName("Ballerup");
        region.setCountyCode("0151");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0151");
        countyRepository.save(region);

        region.setName("Brøndby");
        region.setCountyCode("0153");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0153");
        countyRepository.save(region);

        region.setName("Dragør");
        region.setCountyCode("0155");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0155");
        countyRepository.save(region);

        region.setName("Gentofte");
        region.setCountyCode("0157");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0157");
        countyRepository.save(region);

        region.setName("Herlev");
        region.setCountyCode("0151");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0163");
        countyRepository.save(region);

        region.setName("Albertslund");
        region.setCountyCode("0151");
        region.setHref("http://api.dataforsyningen.dk/kommuner/0165");
        countyRepository.save(region);


    }
}


