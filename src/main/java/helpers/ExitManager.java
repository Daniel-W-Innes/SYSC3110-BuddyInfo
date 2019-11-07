package helpers;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class ExitManager extends WindowAdapter {
    private final List<Object> objects;

    ExitManager() {
        this.objects = new ArrayList<>();
    }

    void addObject(Object o) {
        objects.add(o);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (objects.size() <= 1) {
            System.exit(0);
        } else {
            objects.remove(e.getSource());
        }
    }
}
