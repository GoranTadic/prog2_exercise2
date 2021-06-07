import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.TrafficLightGui;

import static org.junit.jupiter.api.Assertions.*;

class MCPTest {

    @Test
    @DisplayName("Testing singleton pattern")
    public void checkSingleton(){
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();

        TrafficLightCtrl control2 = TrafficLightCtrl.getInstance();


        assertEquals(control, control2);
    }

    @Test
    @DisplayName("Testing init Color")
    public void checkInitColor(){
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();

        assertEquals("green", control.getState().getColor());
    }

    @Test
    @DisplayName("Testing second Color")
    public void checkSecondColor(){
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();
        control.nextState();

        assertEquals("yellow", control.getState().getColor());
    }

    @Test
    @DisplayName("Testing third Color")
    public void checkThirdColor(){
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();

        control.nextState();
        control.nextState();

        assertEquals("red", control.getState().getColor());
    }

    @Test
    @DisplayName("Testing fourth Color")
    public void checkFourthColor(){
        TrafficLightCtrl control = TrafficLightCtrl.getInstance();
        control.resetState();

        control.nextState();
        control.nextState();
        control.nextState();

        assertEquals("yellow", control.getState().getColor());
    }
}