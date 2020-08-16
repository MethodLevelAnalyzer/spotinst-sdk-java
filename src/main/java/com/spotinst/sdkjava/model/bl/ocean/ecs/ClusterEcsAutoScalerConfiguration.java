package com.spotinst.sdkjava.model.bl.ocean.ecs;


import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonFilter("PartialUpdateEntityFilter")
public class ClusterEcsAutoScalerConfiguration {
    @JsonIgnore
    private Set<String>                           isSet;
    private Boolean                               isEnabled;
    private Integer                               cooldown;
    private ClusterEcsResourceLimitsSpecification resourceLimits;
    private ClusterEcsDownSpecification           down;
    private ClusterEcsHeadroomSpecification       headroom;
    private Boolean                               isAutoConfig;
    private Integer                               autoHeadroomPrecentage;

    public ClusterEcsAutoScalerConfiguration() {
        isSet = new HashSet<>();
    }

    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        isSet.add("isEnabled");
        this.isEnabled = isEnabled;
    }

    public Integer getCooldown() {
        return cooldown;
    }

    public void setCooldown(Integer cooldown) {
        isSet.add("cooldown");
        this.cooldown = cooldown;
    }

    public ClusterEcsResourceLimitsSpecification getResourceLimits() {
        return resourceLimits;
    }

    public void setResourceLimits(ClusterEcsResourceLimitsSpecification resourceLimits) {
        isSet.add("resourceLimits");
        this.resourceLimits = resourceLimits;
    }

    public ClusterEcsDownSpecification getDown() {
        return down;
    }

    public void setDown(ClusterEcsDownSpecification down) {
        isSet.add("down");
        this.down = down;
    }

    public ClusterEcsHeadroomSpecification getHeadroom() {
        return headroom;
    }

    public void setHeadroom(ClusterEcsHeadroomSpecification headroom) {
        isSet.add("headroom");
        this.headroom = headroom;
    }

    public Boolean getIsAutoConfig() {
        return isAutoConfig;
    }

    public void setIsAutoConfig(Boolean isAutoConfig) {
        isSet.add("isAutoConfig");
        this.isAutoConfig = isAutoConfig;
    }

    public Integer getAutoHeadroomPrecentage() {
        return autoHeadroomPrecentage;
    }

    public void setAutoHeadroomPrecentage(Integer autoHeadroomPrecentage) {
        isSet.add("autoHeadroomPrecentage");
        this.autoHeadroomPrecentage = autoHeadroomPrecentage;
    }


    public static class Builder {
        private ClusterEcsAutoScalerConfiguration autoScale;

        private Builder() {
            this.autoScale = new ClusterEcsAutoScalerConfiguration();
        }

        public static ClusterEcsAutoScalerConfiguration.Builder get() {
            ClusterEcsAutoScalerConfiguration.Builder builder = new ClusterEcsAutoScalerConfiguration.Builder();
            return builder;
        }

        public Builder setIsEnabled(final Boolean isEnabled) {
            autoScale.setIsEnabled(isEnabled);
            return this;
        }

        public Builder setCooldown(final Integer cooldown) {
            autoScale.setCooldown(cooldown);
            return this;
        }

        public Builder setResourceLimits(final ClusterEcsResourceLimitsSpecification resourceLimits) {
            autoScale.setResourceLimits(resourceLimits);
            return this;
        }

        public Builder setDown(final ClusterEcsDownSpecification Down) {
            autoScale.setDown(Down);
            return this;
        }

        public Builder setHeadroom(final ClusterEcsHeadroomSpecification headroom) {
            autoScale.setHeadroom(headroom);
            return this;
        }

        public Builder setIsAutoConfig(final Boolean isAutoConfig) {
            autoScale.setIsAutoConfig(isAutoConfig);
            return this;
        }

        public Builder setAutoHeadroomPercentage(final Integer autoHeadroomPercentage) {
            autoScale.setAutoHeadroomPrecentage(autoHeadroomPercentage);
            return this;
        }

        public ClusterEcsAutoScalerConfiguration build() {
            return autoScale;
        }
    }

    @JsonIgnore
    public boolean isIsEnabledSet() {
        return isSet.contains("isEnabled");
    }

    @JsonIgnore
    public boolean isCooldownSet() {
        return isSet.contains("cooldown");
    }

    @JsonIgnore
    public boolean isResourceLimits() {
        return isSet.contains("resourceLimits");
    }

    @JsonIgnore
    public boolean isDownSet() {
        return isSet.contains("down");
    }

    @JsonIgnore
    public boolean isHeadroomSet() {
        return isSet.contains("headroom");
    }

    @JsonIgnore
    public boolean isIsAutoConfigSet() {
        return isSet.contains("isAutoConfig");
    }

    @JsonIgnore
    public boolean isAutoHeadroomPercentageSet() {
        return isSet.contains("autoHeadroomPercentage");
    }





}
