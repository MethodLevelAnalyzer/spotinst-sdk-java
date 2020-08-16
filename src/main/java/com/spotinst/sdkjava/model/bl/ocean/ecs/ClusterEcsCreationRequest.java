package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotinst.sdkjava.client.rest.JsonMapper;
import com.spotinst.sdkjava.model.OceanConverter;
import com.spotinst.sdkjava.model.OceanEcsConverter;
import com.spotinst.sdkjava.model.api.ocean.kubernetes.ApiOceanCluster;

import java.util.HashMap;
import java.util.Map;

public class ClusterEcsCreationRequest {

    @JsonProperty("cluster")
    private OceanEcsCluster cluster;

    private ClusterEcsCreationRequest() {
    }

    //region Getters & Setters
    public OceanEcsCluster getCluster() {
        return cluster;
    }

    public void setCluster(OceanEcsCluster cluster) {
        this.cluster = cluster;
    }

    //endregion

    //region Builder class
    public static class Builder {
        private ClusterEcsCreationRequest clusterEcsCreationRequest;

        private Builder() {
            this.clusterEcsCreationRequest = new ClusterEcsCreationRequest();
        }

        public static Builder get() {
            Builder builder = new Builder();
            return builder;
        }

        public Builder setCluster(final OceanEcsCluster oceanEcsCluster) {
            clusterEcsCreationRequest.setCluster(oceanEcsCluster);
            return this;
        }

        public ClusterEcsCreationRequest build() {
            return clusterEcsCreationRequest;
        }

    }
    //endregion

    //region Json methods
    public String toJson() {
        ApiOceanEcsCluster apiClusterToCreate = OceanEcsConverter.toDal(cluster);

        Map<String, ApiOceanEcsCluster> clusterRequest = new HashMap<>();
        clusterRequest.put("cluster", apiClusterToCreate);
        String clusterJson = JsonMapper.toJson(clusterRequest);

        return clusterJson;
    }
    //endregion
}
