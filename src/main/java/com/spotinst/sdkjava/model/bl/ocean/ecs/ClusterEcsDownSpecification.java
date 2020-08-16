package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

public class ClusterEcsDownSpecification {

    @JsonIgnore
    private Set<String> isSet;
    private Integer     maxScaleDownPercentage;


    private ClusterEcsDownSpecification() {
        isSet = new HashSet<>();
    }


    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }


    public Integer getMaxScaleDownPercentage() {
        return maxScaleDownPercentage;
    }

    public void setMaxScaleDownPercentage(Integer maxScaleDownPercentage) {
        isSet.add("maxScaleDownPercentage");
        this.maxScaleDownPercentage = maxScaleDownPercentage;
    }

    public static class Builder {
        private ClusterEcsDownSpecification down;

        private Builder() {
            this.down = new ClusterEcsDownSpecification();
        }

        public static ClusterEcsDownSpecification.Builder get() {
            ClusterEcsDownSpecification.Builder builder = new ClusterEcsDownSpecification.Builder();
            return builder;
        }

        public ClusterEcsDownSpecification.Builder setMaxScaleDownPercentage(final Integer maxScaleDownPercentage) {
            down.setMaxScaleDownPercentage(maxScaleDownPercentage);
            return this;
        }

        public ClusterEcsDownSpecification build() {
            return down;
        }
    }

    @JsonIgnore
    public boolean isMaxScaleDownPercentageSet() {
        return isSet.contains("maxScaleDownPercentage");
    }
}
