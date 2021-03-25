package com.app.swansonlyzer.gui;

import com.app.swansonlyzer.controller.RonSwansonController;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "home")
@PageTitle("Swansonalyzer")
@Theme(value = Lumo.class, variant = Lumo.DARK)
public class RonGUI extends VerticalLayout {
    @Autowired
    RonSwansonController ronSwansonController;

    public RonGUI() {
        Image image = new Image("https://uproxx.com/wp-content/uploads/2018/04/ron-swanson-grid-uproxx.jpg", "AwesomeImage");
        add(image);
        Button button = new Button("LETS RON THIS APP");
        button.addThemeVariants(ButtonVariant.LUMO_LARGE,
                ButtonVariant.LUMO_LARGE);
        add(button);
        Anchor anchor = new Anchor("http://ron-swanson-quotes.herokuapp.com/v2/quotes", "Doing it right with...");
        add(anchor);

    }
}
