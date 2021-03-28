package com.app.swansonlyzer.gui;

import com.app.swansonlyzer.controller.RonSwansonController;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "")
@PageTitle("Swansonalyzer")
@Theme(value = Lumo.class, variant = Lumo.DARK)
public class MainView extends VerticalLayout {
    @Autowired
    private RonSwansonController ronSwansonController;

    public MainView(RonSwansonController ronSwansonController) {
        Button buttonRonThisApp = new Button("LETS RON THIS APP");
        buttonRonThisApp.addThemeVariants(ButtonVariant.LUMO_LARGE,
                ButtonVariant.LUMO_LARGE);
        String string = "\uD83D\uDE31";
        Text textQuotesDisplay = new Text(string);
        Text textNextLine = new Text("\n" + " ");
        Image ronGif = new Image("https://media.giphy.com/media/TXahyfxK8iorC/giphy.gif", "Ron");
        ronGif.setVisible(false);
        buttonRonThisApp.addClickListener(event -> {
            try {
                textQuotesDisplay.setText(String.join("   \uD83C\uDF3C   ", ronSwansonController.analyzeRon()));
                ronGif.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }

        });


        setAlignItems(Alignment.CENTER);
        add(textNextLine, textNextLine, textNextLine, textNextLine, textNextLine, textNextLine, textNextLine, textNextLine, ronGif, textNextLine, textQuotesDisplay, textNextLine, buttonRonThisApp);

    }
}
