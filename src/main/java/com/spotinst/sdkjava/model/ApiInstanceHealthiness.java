package com.spotinst.sdkjava.model;

/**
 * Created by yossi.elman on 13/04/2020.
 */

public class ApiInstanceHealthiness {
    //region Members
    private String instanceId;
    private String spotRequestId;
    private String groupId;
    private String availabilityZone;
    private String lifeCycle;
    private String healthStatus;
    //endregion

    //region Getters & Setters
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getSpotRequestId() {
        return spotRequestId;
    }

    public void setSpotRequestId(String spotRequestId) {
        this.spotRequestId = spotRequestId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    //endregion
}