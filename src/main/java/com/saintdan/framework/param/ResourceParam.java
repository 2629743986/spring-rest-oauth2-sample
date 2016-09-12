package com.saintdan.framework.param;

import com.saintdan.framework.annotation.NotNullField;
import com.saintdan.framework.annotation.SignField;
import com.saintdan.framework.enums.OperationType;

/**
 * Param bean for {@link com.saintdan.framework.domain.ResourceDomain}
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 10/16/15
 * @since JDK1.8
 */
public class ResourceParam extends BaseParam {

  private static final long serialVersionUID = 8542867394907970893L;

  @SignField
  @NotNullField(value = {OperationType.UPDATE, OperationType.DELETE}, message = "id cannot be null.")
  private Long id; // role's ID.

  @SignField
  @NotNullField(value = OperationType.CREATE, message = "name cannot be null.")
  private String name; // role's name

  @SignField
  @NotNullField(value = OperationType.CREATE, message = "path cannot be null.")
  private String path;

  @SignField
  @NotNullField(value = OperationType.CREATE, message = "priority cannot be null.")
  private Integer priority;

  @SignField private String description;

  @SignField private String groupIds; // role ids string

  public ResourceParam() {}

  public ResourceParam(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(String groupIds) {
    this.groupIds = groupIds;
  }
}
