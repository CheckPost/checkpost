package graphi;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class GraphiResponse {

  private Object data;
  private List<Object> errors = new ArrayList<>();

}
