package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterEcsContainerImageSpecification {
    @JsonIgnore
    private Set<String>  isSet;
    private List<String> approvedImages;

    private ClusterEcsContainerImageSpecification() {
        isSet = new HashSet<>();
    }


    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }


    public List<String> getApprovedImages() {
        return approvedImages;
    }

    public void setApprovedImages(List<String> approvedImages) {
        isSet.add("approvedImages");
        this.approvedImages = approvedImages;
    }

    public static class Builder {
        private ClusterEcsContainerImageSpecification imageSpecification;

        private Builder() {
            this.imageSpecification = new ClusterEcsContainerImageSpecification();
        }

        public static ClusterEcsContainerImageSpecification.Builder get() {
            ClusterEcsContainerImageSpecification.Builder builder = new ClusterEcsContainerImageSpecification.Builder();
            return builder;
        }

        public Builder setApprovedImages(final List<String> approvedImages) {
            imageSpecification.setApprovedImages(approvedImages);
            return this;
        }

        public ClusterEcsContainerImageSpecification build() {
            return imageSpecification;
        }
    }

    @JsonIgnore
    public boolean isApprovedImagesSet() {
        return isSet.contains("approvedImages");
    }
}
