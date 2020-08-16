package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterEcsSecurityConfiguration {
    @JsonIgnore
    private Set<String>                           isSet;
    private ClusterEcsContainerImageSpecification containerImage;


    private ClusterEcsSecurityConfiguration() {
        isSet = new HashSet<>();
    }

    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }

    public ClusterEcsContainerImageSpecification getContainerImage() {
        return containerImage;
    }

    public void setContainerImage(ClusterEcsContainerImageSpecification containerImage) {
        isSet.add("containerImage");
        this.containerImage = containerImage;
    }

    public static class Builder {
        private ClusterEcsSecurityConfiguration security;

        private Builder() {
            this.security = new ClusterEcsSecurityConfiguration();
        }

        public static Builder get() {
            Builder builder = new Builder();
            return builder;
        }

        public Builder setContainerImage(final ClusterEcsContainerImageSpecification containerImage) {
            security.setContainerImage(containerImage);
            return this;
        }

        public ClusterEcsSecurityConfiguration build() {
            return security;
        }
    }

    @JsonIgnore
    public boolean isContainerimageSet() {
        return isSet.contains("containerImage");
    }

}
