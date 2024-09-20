package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyApp extends JFrame {

    private JTextArea messageArea;
    private JTextField filePathField;

    public MyApp() {
        setTitle("My App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Upload Tab
        JPanel uploadPanel = new JPanel(new BorderLayout());
        JButton uploadButton = new JButton("Upload File");
        filePathField = new JTextField();
        uploadButton.addActionListener(new UploadButtonListener());
        uploadPanel.add(filePathField, BorderLayout.CENTER);
        uploadPanel.add(uploadButton, BorderLayout.EAST);
        tabbedPane.addTab("Upload File", uploadPanel);

        // Send Message Tab
        JPanel sendMessagePanel = new JPanel(new BorderLayout());
        JButton sendMessageButton = new JButton("Send Message");
        messageArea = new JTextArea();
        sendMessageButton.addActionListener(new SendMessageButtonListener());
        sendMessagePanel.add(new JScrollPane(messageArea), BorderLayout.CENTER);
        sendMessagePanel.add(sendMessageButton, BorderLayout.SOUTH);
        tabbedPane.addTab("Send Message", sendMessagePanel);

        // Pause Message Tab
        JPanel pauseMessagePanel = new JPanel(new BorderLayout());
        JButton pauseMessageButton = new JButton("Pause Message");
        pauseMessageButton.addActionListener(new PauseMessageButtonListener());
        pauseMessagePanel.add(pauseMessageButton, BorderLayout.CENTER);
        tabbedPane.addTab("Pause Message", pauseMessagePanel);

        add(tabbedPane);
    }

    private class UploadButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                filePathField.setText(file.getAbsolutePath());
                // Implement file upload logic here
            }
        }
    }

    private class SendMessageButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = messageArea.getText();
            // Implement send message logic here
        }
    }

    private class PauseMessageButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Implement pause message logic here
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyApp().setVisible(true);
        });
    }
}
