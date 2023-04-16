package building;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.function.Consumer;

public class BuildingControlGUI {
  private final FacadeImpl facade;
  private JTextArea textArea;

  public BuildingControlGUI(FacadeImpl facade) {
    this.facade = facade;
    createAndShowGUI();
  }

  private void createAndShowGUI() {
    JFrame frame = new JFrame("Building Control");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    textArea = new JTextArea(20, 50);
    textArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(textArea);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
    frame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);

    addAction(buttonPanel, "Turn On All Lights", e -> textArea.append(facade.turnOnAllLights()));
    addAction(buttonPanel, "Turn On All ACs", e -> textArea.append(facade.turnOnAllAirConditioners()));
    addAction(buttonPanel, "Turn Off All Printers", e -> textArea.append(facade.turnOffAllPrinters()));
    addAction(buttonPanel, "Turn On Floor 1", e -> textArea.append(facade.turnOnFloor(1)));
    addAction(buttonPanel, "Turn On All Appliances", e -> textArea.append(facade.turnOnAllBuilding()));
    addAction(buttonPanel, "Turn On Floor 2", e -> textArea.append(facade.turnOnFloor(2)));
    addAction(buttonPanel, "Turn On Floor 3", e -> textArea.append(facade.turnOnFloor(3)));
    addAction(buttonPanel, "Turn On Floor 4", e -> textArea.append(facade.turnOnFloor(4)));
    addAction(buttonPanel, "Turn Off Floor 1", e -> textArea.append(facade.turnOffFloor(1)));
    addAction(buttonPanel, "Turn Off Floor 2", e -> textArea.append(facade.turnOffFloor(2)));
    addAction(buttonPanel, "Turn Off Floor 3", e -> textArea.append(facade.turnOffFloor(3)));
    addAction(buttonPanel, "Turn Off Floor 4", e -> textArea.append(facade.turnOffFloor(4)));

    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  private void addAction(JPanel panel, String title, Consumer<Void> action) {
    JButton button = new JButton(title);
    button.addActionListener(e -> {
      try {
        action.accept(null);
      } catch (IllegalStateException ex) {
        textArea.append("Error: " + ex.getMessage() + "\n");
      }
    });
    panel.add(button);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new BuildingControlGUI(new FacadeImpl()));
  }
}
