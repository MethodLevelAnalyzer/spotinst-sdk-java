package com.spotinst.sdkjava.model.bl.ocean.ecs;

public class ClusterEcsDeleteRequest {

    private String clusterId;

    private ClusterEcsDeleteRequest() {
    }

    //region Getters & Setters
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String cluster) {
        this.clusterId = cluster;
    }

    //endregion

    //region Builder class
    public static class Builder {
        private ClusterEcsDeleteRequest clusterDeletionRequest;

        private Builder() {
            this.clusterDeletionRequest = new ClusterEcsDeleteRequest();
        }

        public static Builder get() {
            Builder builder = new Builder();
            return builder;
        }

        public Builder setClusterId(final String oceanCluster) {
            clusterDeletionRequest.setClusterId(oceanCluster);
            return this;
        }

        public ClusterEcsDeleteRequest build() {
            return clusterDeletionRequest;
        }

    }
    //endregion
}
