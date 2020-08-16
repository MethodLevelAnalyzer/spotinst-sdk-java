package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

public class ClusterEcsHeadroomSpecification {

    @JsonIgnore
    private Set<String> isSet;
    private Integer     cpuPerUnit;
    private Integer     memoryPerUnit;
    private Integer     gpuPerUnit;
    private Integer     numOfUnits;

    private ClusterEcsHeadroomSpecification() {
        isSet = new HashSet<>();
    }

    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }

    public Integer getCpuPerUnit() {
        return cpuPerUnit;
    }

    public void setCpuPerUnit(Integer cpuPerUnit) {
        isSet.add("cpuPerUnit");
        this.cpuPerUnit = cpuPerUnit;
    }

    public Integer getMemoryPerUnit() {
        return memoryPerUnit;
    }

    public void setMemoryPerUnit(Integer memoryPerUnit) {
        isSet.add("memoryPerUnit");
        this.memoryPerUnit = memoryPerUnit;
    }

    public Integer getGpuPerUnit() {
        return gpuPerUnit;
    }

    public void setGpuPerUnit(Integer gpuPerUnit) {
        isSet.add("gpuPerUnit");
        this.gpuPerUnit = gpuPerUnit;
    }

    public Integer getNumOfUnits() {
        return numOfUnits;
    }

    public void setNumOfUnits(Integer numOfUnits) {
        isSet.add("numOfUnits");
        this.numOfUnits = numOfUnits;
    }

    public static class Builder {
        private ClusterEcsHeadroomSpecification headroom;

        private Builder() {
            this.headroom = new ClusterEcsHeadroomSpecification();
        }

        public static ClusterEcsHeadroomSpecification.Builder get() {
            ClusterEcsHeadroomSpecification.Builder builder = new ClusterEcsHeadroomSpecification.Builder();
            return builder;
        }

        public ClusterEcsHeadroomSpecification.Builder setCpuPerUnit(final Integer cpuPerUnit) {
            headroom.setCpuPerUnit(cpuPerUnit);
            return this;
        }

        public ClusterEcsHeadroomSpecification.Builder setMemoryPerUnit(final Integer memoryPerUnit) {
            headroom.setMemoryPerUnit(memoryPerUnit);
            return this;
        }

        public ClusterEcsHeadroomSpecification.Builder setGpuPerUnit(final Integer gpuPerUnit) {
            headroom.setMemoryPerUnit(gpuPerUnit);
            return this;
        }

        public ClusterEcsHeadroomSpecification.Builder setNumOfUnits(final Integer numOfUnits) {
            headroom.setNumOfUnits(numOfUnits);
            return this;
        }

        public ClusterEcsHeadroomSpecification build() {
            return headroom;
        }
    }

    @JsonIgnore
    public boolean isCpuPerUnitSet() {return isSet.contains("cpuPerUnit");}

    @JsonIgnore
    public boolean isMemoryPerUnitSet() {return isSet.contains("memoryPerUnit");}

    @JsonIgnore
    public boolean isGpuPerUnitSet() {return isSet.contains("gpuPerUnit");}

    @JsonIgnore
    public boolean isNumOfUnitsSet() {return isSet.contains("numOfUnits");}

}
