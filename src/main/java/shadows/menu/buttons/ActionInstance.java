package shadows.menu.buttons;

import javax.annotation.Nullable;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Button.OnPress;

public class ActionInstance implements OnPress {

	protected Button source;
	protected ButtonAction action;
	protected Object data;

	public ActionInstance(ButtonAction action, Object data) {
		this.action = action;
		this.data = data;
	}

	@Override
	public void onPress(Button button) {
		action.onPress(this);
	}

	@Nullable
	public Object getData() {
		return data;
	}

	public Button getSource() {
		return source;
	}

	public void setSource(Button button) {
		this.source = button;
	}

}
