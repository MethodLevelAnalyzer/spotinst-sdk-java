package com.spotinst.sdkjava.model.bl.ocean.ecs;

public class ClusterEcsGetRequest {

    private String clusterId;

    private ClusterEcsGetRequest() {
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
        private ClusterEcsGetRequest clusterEcsGetRequest;

        private Builder() {
            this.clusterEcsGetRequest = new ClusterEcsGetRequest();
        }

        public static ClusterEcsGetRequest.Builder get() {
            ClusterEcsGetRequest.Builder builder = new ClusterEcsGetRequest.Builder();
            return builder;
        }

        public ClusterEcsGetRequest.Builder setClusterId(final String oceanCluster) {
            clusterEcsGetRequest.setClusterId(oceanCluster);
            return this;
        }

        public ClusterEcsGetRequest build() {
            return clusterEcsGetRequest;
        }

    }
    //endregion
}
