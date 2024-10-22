package org.oz.oz_admin.notice.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class NoticeFile {

    private int fileOrd;
    private String noticeFileName;

}
