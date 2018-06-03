package kr.ac.ks.boardreplay;

import kr.ac.ks.board.WebBoard;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/replies/*")
public class WebBoardReplyController {

    @GetMapping("/{bno}")
    public ResponseEntity<List<WebBoardReply>> getReplies(@PathVariable("bno") Long bno) {
        // get Reply
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @PostMapping("/{bno}")
    public ResponseEntity<List<WebBoardReply>> addReply(@PathVariable("bno") Long bno, @RequestBody WebBoardReply reply) {
        // save Reply
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Transactional
    @DeleteMapping("/{bno}/{rno}")
    public ResponseEntity<List<WebBoardReply>> remove(@PathVariable("bno") Long bno, @PathVariable("rno") Long rno) {
        // delete Reply
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @PutMapping("/{bno}")
    public ResponseEntity<List<WebBoardReply>> modify(@PathVariable("bno") Long bno, @RequestBody WebBoardReply reply) {
        // edit Reply
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    private List<WebBoardReply> getListByBoard(WebBoard board) throws RuntimeException {}
}
