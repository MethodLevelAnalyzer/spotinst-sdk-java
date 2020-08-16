package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotinst.sdkjava.client.rest.JsonMapper;
import com.spotinst.sdkjava.model.OceanConverter;
import com.spotinst.sdkjava.model.api.ocean.kubernetes.ApiOceanCluster;

import java.util.HashMap;
import java.util.Map;

public class ClusterEcsUpdateRequest {

    @JsonProperty("cluster")
    private OceanEcsCluster cluster;

    private ClusterEcsUpdateRequest() {
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
        private ClusterEcsUpdateRequest clusterCreationRequest;

        private Builder() {
            this.clusterCreationRequest = new ClusterEcsUpdateRequest();
        }

        public static Builder get() {
            Builder builder = new Builder();
            return builder;
        }

        public Builder setCluster(final OceanEcsCluster oceanEcsCluster) {
            clusterCreationRequest.setCluster(oceanEcsCluster);
            return this;
        }

        public ClusterEcsUpdateRequest build() {
            return clusterCreationRequest;
        }

    }
    //endregion

    //region Json methods
    public String toJson() {
        ApiOceanCluster apiClusterToCreate = OceanConverter.toDal(cluster);

        Map<String, ApiOceanCluster> clusterRequest = new HashMap<>();
        clusterRequest.put("cluster", apiClusterToCreate);
        String clusterJson = JsonMapper.toJson(clusterRequest);

        return clusterJson;
    }
    //endregion
}
