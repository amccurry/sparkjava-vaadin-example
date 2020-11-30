package spark.vaadin.example.app;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.RouterLink;

public class MainView extends AppLayout implements BeforeEnterObserver {

  private static final long serialVersionUID = -4562472390042266677L;
  private final Tabs tabs = new Tabs();
  private final Map<Class<? extends Component>, Tab> navigationTargetToTab = new ConcurrentHashMap<>();

  public MainView() {
    addMenuTab("Main", DefaultView.class);
    addMenuTab("Admin", AdminView.class);
    addMenuTab("Dashboard", DashboardView.class);
    tabs.setOrientation(Tabs.Orientation.VERTICAL);
    addToDrawer(tabs);
    addToNavbar(new DrawerToggle());
  }

  private void addMenuTab(String label, Class<? extends Component> target) {
    Tab tab = new Tab(new RouterLink(label, target));
    navigationTargetToTab.put(target, tab);
    tabs.add(tab);
  }

  @Override
  public void beforeEnter(BeforeEnterEvent event) {
    tabs.setSelectedTab(navigationTargetToTab.get(event.getNavigationTarget()));
  }
}
