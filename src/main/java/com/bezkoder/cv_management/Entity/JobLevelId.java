package com.bezkoder.cv_management.Entity;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobLevelId implements Serializable {

    private int jobEntity;
    private int levelEntity;
}
