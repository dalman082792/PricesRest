package com.price.service;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest("SpringBootTest.WebEnvironment.MOCK,classes = PriceRestApplication.class")
@AutoConfigureMockMvc
@TestPropertySource(
  locations = "classpath:application.properties")
public class PriceTestUnit {

    @Autowired
    private MockMvc mvc;
    
   @Test
    public void price200() throws Exception{
	   

	    List<ParameterTest> lista =  new ArrayList<ParameterTest>();
	    lista.add(new ParameterTest("2020-06-14 10:00:00",35.5,1,"2020-06-14 00:00:00","2020-12-31 23:59:59",1,35455));
	    lista.add(new ParameterTest("2020-06-14 16:00:00",25.45,1,"2020-06-14 15:00:00","2020-06-14 18:30:00",2,35455));
	    lista.add(new ParameterTest("2020-06-14 21:00:00",35.5,1,"2020-06-14 00:00:00","2020-12-31 23:59:59",1,35455));
	    lista.add(new ParameterTest("2020-06-15 10:00:00",30.5,1,"2020-06-15 00:00:00","2020-06-15 11:00:00",3,35455));
	    lista.add(new ParameterTest("2020-06-16 21:00:00",38.95,1,"2020-06-15 16:00:00","2020-12-31 23:59:59",4,35455));
	    	 
	    for(int i=0;i<lista.size();i++) {
        mvc.perform(get("/api/pvp/price?")
        	.param("fecha_aplicacion",lista.get(i).getFecha_aplicacion())
        	.param("grupo_id", lista.get(i).getBrand_id().toString())
        	.param("producto_id", lista.get(i).getProduct_id().toString())
          .contentType(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content()
          .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
          .andExpect(jsonPath("$.price", is(lista.get(i).getPrice())))
          .andExpect(jsonPath("$.brand_ID", is(lista.get(i).getBrand_id())))
          .andExpect(jsonPath("$.end_DATE", is(lista.get(i).getEnd_date())))
          .andExpect(jsonPath("$.start_DATE", is(lista.get(i).getStart_date())))
          .andExpect(jsonPath("$.price_LIST", is(lista.get(i).getPrice_list())))
          .andExpect(jsonPath("$.product_ID", is(lista.get(i).getProduct_id())));
	    }
    }
}
