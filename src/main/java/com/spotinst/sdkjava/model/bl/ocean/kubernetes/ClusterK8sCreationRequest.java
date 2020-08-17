package com.spotinst.sdkjava.model.bl.ocean.kubernetes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotinst.sdkjava.client.rest.JsonMapper;
import com.spotinst.sdkjava.model.OceanK8sConverter;
import com.spotinst.sdkjava.model.api.ocean.kubernetes.ApiOceanK8sCluster;


import java.util.HashMap;
import java.util.Map;

public class ClusterK8sCreationRequest {

    @JsonProperty("cluster")
    private OceanK8sCluster cluster;

    private ClusterK8sCreationRequest() {
    }

    //region Getters & Setters
    public OceanK8sCluster getCluster() {
        return cluster;
    }

    public void setCluster(OceanK8sCluster cluster) {
        this.cluster = cluster;
    }

    //endregion

    //region Builder class
    public static class Builder {
        private ClusterK8sCreationRequest clusterCreationRequest;

        private Builder() {
            this.clusterCreationRequest = new ClusterK8sCreationRequest();
        }

        public static Builder get() {
            Builder builder = new Builder();
            return builder;
        }

        public Builder setCluster(final OceanK8sCluster oceanK8sCluster) {
            clusterCreationRequest.setCluster(oceanK8sCluster);
            return this;
        }

        public ClusterK8sCreationRequest build() {
            return clusterCreationRequest;
        }

    }
    //endregion

    //region Json methods
    public String toJson() {
        ApiOceanK8sCluster apiClusterToCreate = OceanK8sConverter.toDal(cluster);

        Map<String, ApiOceanK8sCluster> clusterRequest = new HashMap<>();
        clusterRequest.put("cluster", apiClusterToCreate);
        String clusterJson = JsonMapper.toJson(clusterRequest);

        return clusterJson;
    }
    //endregion
}
