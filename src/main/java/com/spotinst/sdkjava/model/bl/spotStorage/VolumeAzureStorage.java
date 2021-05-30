package com.spotinst.sdkjava.model.bl.spotStorage;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class VolumeAzureStorage {
    //region Members
    @JsonIgnore
    private Set<String>                        isSet;
    private String                             id;
    private String                             name;
    private String                             region;
    private VolumeSpecNetwork                  capacity;
    private VolumeThroughput                   throughput;
    private VolumeSpecNetwork                  volumeSpec;
    private VolumeAutoResizeResizePolicyAction autoResize;
    private String                             state;
    private Date                               createdAt;
    private Date                               updatedAt;
    //endregion

    //region Constructor
    private VolumeAzureStorage() {
        isSet = new HashSet<>();
    }
    //endregion

    //region Getters & Setters
    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        isSet.add("id");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        isSet.add("name");
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        isSet.add("region");
        this.region = region;
    }

    public VolumeSpecNetwork getCapacity() {
        return capacity;
    }

    public void setCapacity(VolumeSpecNetwork capacity) {
        isSet.add("capacity");
        this.capacity = capacity;
    }

    public VolumeThroughput getThroughput() {
        return throughput;
    }

    public void setThroughput(VolumeThroughput throughput) {
        isSet.add("throughput");
        this.throughput = throughput;
    }

    public VolumeSpecNetwork getVolumeSpec() {
        return volumeSpec;
    }

    public void setVolumeSpec(VolumeSpecNetwork volumeSpec) {
        isSet.add("volumeSpec");
        this.volumeSpec = volumeSpec;
    }

    public VolumeAutoResizeResizePolicyAction getAutoResize() {
        return autoResize;
    }

    public void setAutoResize(VolumeAutoResizeResizePolicyAction autoResize) {
        isSet.add("autoResize");
        this.autoResize = autoResize;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        isSet.add("state");
        this.state = state;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        isSet.add("createdAt");
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        isSet.add("updatedAt");
        this.updatedAt = updatedAt;
    }

    //endregion

    //region Builder class
    public static class Builder {
        //region Members
        private VolumeAutoResizeResizePolicyAction volumeAzureStorage;
        //endregion


        private Builder() {
            this.volumeAzureStorage = new VolumeAutoResizeResizePolicyAction();
        }

        public static Builder get() {
            Builder builder = new Builder();
            return builder;
        }

        //region Build methods
        protected Builder setId(final String volumeId) {
            volumeAzureStorage.setId(volumeId);
            return this;
        }

        public Builder setName(final String name) {
            volumeAzureStorage.setName(name);
            return this;
        }

        public Builder setRegion(final String region) {
            volumeAzureStorage.setRegion(region);
            return this;
        }

        public Builder setCapacity(final VolumeSpecNetwork capacity) {
            volumeAzureStorage.setCapacity(capacity);
            return this;
        }

        public Builder setThroughput(final VolumeThroughput throughput) {
            volumeAzureStorage.setThroughput(throughput);
            return this;
        }

        public Builder setVolumeSpec(final com.spotinst.sdkjava.model.bl.spotStorage.volumeSpec volumeSpec) {
            volumeAzureStorage.setVolumeSpec(volumeSpec);
            return this;
        }

        public Builder setAutoResize(final VolumeAutoResizeResizePolicyAction autoResize) {
            volumeAzureStorage.setAutoResize(autoResize);
            return this;
        }

        public Builder setState(final String state) {
            volumeAzureStorage.setState(state);
            return this;
        }

        public VolumeAutoResizeResizePolicyAction build() {
            // Validations
            return volumeAzureStorage;
        }
        //endregion
    }
    //endregion

    //region isSet methods
    // Is id Set boolean method
    @JsonIgnore
    public boolean isIdSet() {
        return isSet.contains("id");
    }

    // Is name Set boolean method
    @JsonIgnore
    public boolean isNameSet() {
        return isSet.contains("name");
    }

    // Is description Set boolean method
    @JsonIgnore
    public boolean isRegionSet() {
        return isSet.contains("region");
    }

    // Is capacity Set boolean method
    @JsonIgnore
    public boolean isCapacitySet() {
        return isSet.contains("capacity");
    }

    // Is throughput Set boolean method
    @JsonIgnore
    public boolean isThroughputSet() {
        return isSet.contains("throughput");
    }

    // Is volumeSpec Set boolean method
    @JsonIgnore
    public boolean isVolumeSpecSet() {
        return isSet.contains("volumeSpec");
    }

    // Is autoResize Set boolean method
    @JsonIgnore
    public boolean isAutoResizeSet() {
        return isSet.contains("autoResize");
    }

    // Is state Set boolean method
    @JsonIgnore
    public boolean isStateSet() {
        return isSet.contains("state");
    }

    // Is createdAt Set boolean method
    @JsonIgnore
    public boolean isCreatedAtSet() {
        return isSet.contains("createdAt");
    }

    // Is updatedAt Set boolean method
    @JsonIgnore
    public boolean isUpdatedAtSet() {
        return isSet.contains("updatedAt");
    }
    //endregion
}
