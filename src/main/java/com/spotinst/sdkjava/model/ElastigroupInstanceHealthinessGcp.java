package com.spotinst.sdkjava.model;

import com.spotinst.sdkjava.enums.GcpInstanceLifecycleEnum;
import com.spotinst.sdkjava.enums.InstanceHealthStatusEnum;
import com.spotinst.sdkjava.enums.InstanceHealthStatusGcpEnum;

public class ElastigroupInstanceHealthinessGcp {
    //region Members
    private String                      instanceName;
    private String                      zone;
    private String                      groupId;
    private String                      machineType;
    private String                      privateIpAddress;
    private String                      createdAt;
    private String                      updatedAt;
    private GcpInstanceLifecycleEnum    lifeCycle;
    private InstanceHealthStatusGcpEnum statusName;
    //endregion

    //region Getters & Setters
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String spotRequestId) {
        this.zone = spotRequestId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIp) {
        this.privateIpAddress = privateIp;
    }

    public String getMachineType() { return machineType; }

    public void setMachineType(String availabilityZone) { this.machineType = machineType; }

    public GcpInstanceLifecycleEnum getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(GcpInstanceLifecycleEnum lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public InstanceHealthStatusGcpEnum getStatusName() {
        return statusName;
    }

    public void setStatusName(InstanceHealthStatusGcpEnum statusName) {
        this.statusName = statusName;
    }

    public String getCreatedAt() { return createdAt; }

    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public String getUpdatedAt() { return updatedAt; }

    public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }
    //endregion
}
