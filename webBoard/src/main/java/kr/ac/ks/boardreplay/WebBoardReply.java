package kr.ac.ks.boardreplay;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kr.ac.ks.board.WebBoard;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tbl_webboardreplies")
public class WebBoardReply {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rno;

    private String replyText;

    private String replyer;

    @CreationTimestamp
    private Timestamp regdate;

    @UpdateTimestamp
    private Timestamp updatedate;
}
