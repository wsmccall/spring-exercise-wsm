package spring.exercise.william;

//Author: William McCall
//Import necessary objects from springframework
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


//Reads the CSV file and creates an object from the data supplied
public class InstrumentFieldSetMapper implements FieldSetMapper<Instrument>{
	
	//Creates a fieldSet with links to each column of the CSV file, and writes it to object "product"
	    public Instrument mapFieldSet(FieldSet fieldSet) throws BindException {
	        Instrument product = new Instrument();
	        product.setInstType( fieldSet.readString("instrument_type") );
	        product.setName( fieldSet.readString("name") );
	        product.setQuantity( fieldSet.readInt("quantity") );
	        product.setBuyPrice( fieldSet.readFloat("buy_price") );
	        product.setSellPrice( fieldSet.readFloat("sell_price") );
	        product.setCoupon( fieldSet.readFloat("coupon") );
	        return product;
	    }
	}

