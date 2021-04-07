package com.spotinst.sdkjava.model.bl.ocean.aks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spotinst.sdkjava.client.rest.IPartialUpdateEntity;

import java.util.HashSet;
import java.util.Set;

public class ClusterTagAks {
    @JsonIgnore
    private Set<String>               isSet;
    private String                    tagKey;


    private ClusterTagAks() {
        isSet = new HashSet<>();
    }

    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }

    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        isSet.add("tagKey");
        this.tagKey = tagKey;
    }

    @JsonIgnore
    public boolean isTagKeySet() {
        return isSet.contains("tagKey");
    }

    public static class Builder {

        private ClusterTagAks clusterTagAks;

        private Builder() {
            this.clusterTagAks = new ClusterTagAks();
        }

        public static Builder get() {
            Builder builder = new Builder();
            return builder;
        }

        public Builder setTagKey(final String tagKey) {
            clusterTagAks.setTagKey(tagKey);
            return this;
        }

        public ClusterTagAks build() {
            return clusterTagAks;
        }
    }
}
