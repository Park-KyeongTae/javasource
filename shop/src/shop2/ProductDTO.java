package shop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor @NoArgsConstructor
//@Data //getter, setter, equals, canEqual, hashcode, toString, 기본생성자


@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString


public class ProductDTO {
 private int productId;
 private String pname;
 private int price;
 private String content;
}
