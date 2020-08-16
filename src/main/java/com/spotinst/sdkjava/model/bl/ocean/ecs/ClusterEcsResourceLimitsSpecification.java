package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

public class ClusterEcsResourceLimitsSpecification {

    @JsonIgnore
    private Set<String> isSet;
    private Integer     maxMemoryGib;
    private Integer     maxVCpu;


    private ClusterEcsResourceLimitsSpecification() {
        isSet = new HashSet<>();
    }


    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }


    public Integer getMaxMemoryGib() {
        return maxMemoryGib;
    }

    public void setMaxMemoryGib(Integer maxMemoryGib) {
        isSet.add("maxMemoryGib");
        this.maxMemoryGib = maxMemoryGib;
    }

    public Integer getMaxVCpu() {
        return maxVCpu;
    }

    public void setMaxVCpu(Integer maxVCpu) {
        isSet.add("maxCPU");
        this.maxVCpu = maxVCpu;
    }

    public static class Builder {
        private ClusterEcsResourceLimitsSpecification resourceLimits;

        private Builder() {
            this.resourceLimits = new ClusterEcsResourceLimitsSpecification();
        }

        public static ClusterEcsResourceLimitsSpecification.Builder get() {
            ClusterEcsResourceLimitsSpecification.Builder builder = new ClusterEcsResourceLimitsSpecification.Builder();
            return builder;
        }

        public ClusterEcsResourceLimitsSpecification.Builder setMaxMemoryGib(final Integer maxMemoryGib) {
            resourceLimits.setMaxMemoryGib(maxMemoryGib);
            return this;
        }

        public ClusterEcsResourceLimitsSpecification.Builder setMaxVCpu(final Integer maxVCpu) {
            resourceLimits.setMaxVCpu(maxVCpu);
            return this;
        }

        public ClusterEcsResourceLimitsSpecification build() {
            return resourceLimits;
        }
    }

    @JsonIgnore
    public boolean isMaxMemoryGibSet() {
        return isSet.contains("maxMemoryGib");
    }

    @JsonIgnore
    public boolean isMaxVCpuSet() {
        return isSet.contains("maxVCpu");
    }

}
