package Button;

import Algorithm.KruskalAlgorithm;
import ControlState.AlgorithmType;
import ControlState.AnimationState;
import Gui.DrawingPanel;
import Gui.MainGui;

public class ButtonEvent{

    private static DrawingPanel drawingPanel;
    private static int animationDelay;

    public ButtonEvent(DrawingPanel drawingPanel, int animationDelay){
        this.drawingPanel = drawingPanel;
        this.animationDelay = animationDelay;

    }

    public static void startBFSAlgorithm() {
        if((MainGui.getAnimationState() == AnimationState.IDLE && !drawingPanel.getVertices().isEmpty())){
            MainGui.setAnimationState(AnimationState.WAITING);
            MainGui.setAlgorithmType(AlgorithmType.BFS);
            MainGui.textArea.setText("");
            MainGui.textArea.setText(MainGui.textArea.getText() + "Select a vertex to start BFSAlgorithm.");
        }
    }

    public static void startDFSAlgorithm() {
        if(MainGui.getAnimationState() == AnimationState.IDLE && !drawingPanel.getVertices().isEmpty()){
            MainGui.setAnimationState(AnimationState.WAITING);
            MainGui.setAlgorithmType(AlgorithmType.DFS);
            MainGui.textArea.setText("");
            MainGui.textArea.setText(MainGui.textArea.getText() + "Select a vertex to start DFSAlgorithm.");
        }
        
    }

    public static void handleKruskalButtonClick() {
        if(MainGui.getAnimationState() == AnimationState.IDLE && !drawingPanel.getVertices().isEmpty()){
        MainGui.sideTextArea.setText("");
        MainGui.sideTextArea.append("Kruskal's Algorithm started.");
        MainGui.setAnimationState(AnimationState.RUNNING);
        KruskalAlgorithm kAlgorithm = new KruskalAlgorithm(drawingPanel, animationDelay);
        kAlgorithm.findMSTWithAnimation();
        }
    }

    public static void handlePrimButtonClick() {
        if(MainGui.getAnimationState() == AnimationState.IDLE && !drawingPanel.getVertices().isEmpty()){
            MainGui.setAnimationState(AnimationState.WAITING);
            MainGui.setAlgorithmType(AlgorithmType.PRIM);
            MainGui.textArea.setText("");
            MainGui.textArea.setText(MainGui.textArea.getText() + "Select a vertex to start Prim's Algorithm.");
        }
        
    }

    public static void handleDijkstraButtonClick() {
        if(MainGui.getAnimationState() == AnimationState.IDLE && !drawingPanel.getVertices().isEmpty()){
            MainGui.setAnimationState(AnimationState.WAITING);
            MainGui.setAlgorithmType(AlgorithmType.DIJKSTRA);
            MainGui.textArea.setText("");
            MainGui.textArea.setText(MainGui.textArea.getText() + "Select a vertex to start Dijkstra's Algorithm.");
        }
    }

}
