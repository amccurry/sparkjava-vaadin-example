package spark.vaadin.example.app;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainView.class)
public class DefaultView extends Div {

  private static final long serialVersionUID = -7153574517068005582L;

  public DefaultView() {
    add(new Span("Default view content"));
  }
}