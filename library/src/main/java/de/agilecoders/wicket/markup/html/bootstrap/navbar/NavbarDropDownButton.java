package de.agilecoders.wicket.markup.html.bootstrap.navbar;

import de.agilecoders.wicket.markup.html.bootstrap.behavior.CssClassNameAppender;
import de.agilecoders.wicket.markup.html.bootstrap.button.ButtonSize;
import de.agilecoders.wicket.markup.html.bootstrap.button.ButtonType;
import de.agilecoders.wicket.markup.html.bootstrap.button.dropdown.DropDownButton;
import org.apache.wicket.model.IModel;

/**
 * Special {@link DropDownButton} for a {@link Navbar}.
 *
 * @author miha
 * @version 1.0
 */
public class NavbarDropDownButton extends DropDownButton {

    public NavbarDropDownButton(IModel<String> model) {
        super(Navbar.COMPONENT_ID, model);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();

        this.setRenderBodyOnly(true);
        this.getParent().add(new CssClassNameAppender("dropdown"));
    }

    @Override
    protected void addButtonBehavior(final IModel<ButtonType> buttonType, final IModel<ButtonSize> buttonSize) {
        // do nothing, because navbar dropdown button inherits its styles from navbar.
    }

}
