package spark.vaadin.example.app;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "dashboard", layout = MainView.class)
public class DashboardView extends Div {

  private static final long serialVersionUID = 3035041497023877880L;

  public DashboardView() {
    add(new Span("Dashboard view content"));
  }
}