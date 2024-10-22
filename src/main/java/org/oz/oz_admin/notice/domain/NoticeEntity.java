package org.oz.oz_admin.notice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name="tbl_admin_notice")
public class NoticeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noticeNum;

    private String noticeTitle;

    private String noticeWriter;

    private String noticeContent;

    private Boolean noticeDel_flag;

    private LocalDateTime regDate;

    private LocalDateTime modDate;

    @ElementCollection
    @Builder.Default
    @CollectionTable(name = "tbl_admin_notice_file")
    private Set<NoticeFile> attachFile = new HashSet<>();

    public void addFile(String noticeFileName) {
        attachFile.add(new NoticeFile(attachFile.size(), noticeFileName));
    }
    //???
    public void clearFile() {
        attachFile.clear();
    }

}
