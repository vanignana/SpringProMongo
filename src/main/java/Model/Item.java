package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collections;

@Getter
@Setter
@ToString

@Document(collection = "Item")

public class Item {

    private int id;


    private String name;


    private int price;

}
