package ie.atu.project2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tools")
public class ToolController {
    @PostMapping
    public ResponseEntity<Tool> addTool(@RequestBody Tool tool) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tool> updateTool(@PathVariable String id, @RequestBody Tool tool) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Tool>> getAllTools() {
        return null;
    }
}
