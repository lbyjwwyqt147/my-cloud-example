package com.cloud.example.resource.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/***
 *  资源 dto
 */
@Data
@NoArgsConstructor
public class ResourceDto implements Serializable {
    private static final long serialVersionUID = 5077257876059135845L;
    private String id;
    private String resourceName;
    private String url;
    private String userId;

}
