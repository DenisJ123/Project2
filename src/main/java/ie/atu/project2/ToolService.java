package ie.atu.project2;

import java.util.ArrayList;
import java.util.List;

public class ToolService {
    public Tool addTool(Tool tool) {

        return tool;
    }

    public Tool updateTool(String id, Tool updatedTool) {
        return updatedTool;
    }

    public List<Tool> getAllTools() {
        List<Tool> tools = new ArrayList<Tool>();
        return tools;
    }

    public void recordToolUsage(ToolUsage usage) {

    }

    public List<ToolUsage> getToolHistory(String toolId) {
        return null;
    }
}

