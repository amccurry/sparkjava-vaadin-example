package spark.vaadin.example.app;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "admin", layout = MainView.class)
public class AdminView extends Div {

  private static final long serialVersionUID = -768010119320393063L;

  public AdminView() {
    add(new Span("Admin view content"));
  }

}