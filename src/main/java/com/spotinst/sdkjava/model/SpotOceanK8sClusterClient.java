package com.spotinst.sdkjava.model;

import com.spotinst.sdkjava.exception.HttpError;
import com.spotinst.sdkjava.exception.SpotinstHttpException;
import com.spotinst.sdkjava.model.bl.ocean.kubernetes.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SpotOceanK8sClusterClient {
    private static final Logger                   LOGGER = LoggerFactory.getLogger(SpotOceanK8sClusterClient.class);
    //Members
    private              String                   authToken;
    private              String                   account;
    private              ISpotOceanK8sClusterRepo spotOceanK8sClusterRepo;

    public ISpotOceanK8sClusterRepo getSpotOceanK8sClusterRepo() {
        return spotOceanK8sClusterRepo;
    }

    public void setSpotinstOceanClusterRepo() {
        this.spotOceanK8sClusterRepo = SpotinstRepoManager.getInstance().getSpotinstOceanClusterRepo();
    }

    //Constructor
    public SpotOceanK8sClusterClient(String authToken, String account) {
        this.authToken = authToken;
        this.account = account;

        setSpotinstOceanClusterRepo();
    }

    //Methods
    //todo lihi - done- change ClusterCreationRequest to k8s (and more classes if needed)
    public OceanK8sCluster createK8sCluster(ClusterK8sCreationRequest oceanClusterCreationRequest) {
        OceanK8sCluster retVal;

        OceanK8sCluster clusterToCreate = oceanClusterCreationRequest.getCluster();

        RepoGenericResponse<OceanK8sCluster> creationResponse =
                getSpotOceanK8sClusterRepo().create(clusterToCreate, authToken, account);
        if (creationResponse.isRequestSucceed()) {
            retVal = creationResponse.getValue();
        }
        else {
            List<HttpError> httpExceptions = creationResponse.getHttpExceptions();
            HttpError       httpException  = httpExceptions.get(0);
            LOGGER.error(
                    String.format("Error encountered while attempting to create ocean cluster. Code: %s. Message: %s.",
                                  httpException.getCode(), httpException.getMessage()));
            throw new SpotinstHttpException(httpException.getMessage());
        }
        return retVal;
    }

    public Boolean updateK8sCluster(ClusterK8sUpdateRequest clusterK8sUpdateRequest, String clusterId) {
        Boolean retVal;

        OceanK8sCluster clusterToUpdate = clusterK8sUpdateRequest.getCluster();
        RepoGenericResponse<Boolean> updateResponse =
                getSpotOceanK8sClusterRepo().update(clusterId, clusterToUpdate, authToken, account);
        if (updateResponse.isRequestSucceed()) {
            retVal = updateResponse.getValue();
        }
        else {
            List<HttpError> httpExceptions = updateResponse.getHttpExceptions();
            HttpError       httpException  = httpExceptions.get(0);
            LOGGER.error(String.format("Error encountered while attempting to update cluster. Code: %s. Message: %s.",
                                       httpException.getCode(), httpException.getMessage()));
            throw new SpotinstHttpException(httpException.getMessage());
        }
        return retVal;
    }

    public Boolean deleteK8sCluster(ClusterK8sDeleteRequest clusterDeletionRequest) {
        Boolean                      retVal;
        String                       clusterIdToDelete       = clusterDeletionRequest.getClusterId();
        RepoGenericResponse<Boolean> clusterDeletionResponse =
                getSpotOceanK8sClusterRepo().delete(clusterIdToDelete, authToken, account);

        if (clusterDeletionResponse.isRequestSucceed()) {
            retVal = clusterDeletionResponse.getValue();
        }
        else {
            List<HttpError> httpExceptions = clusterDeletionResponse.getHttpExceptions();
            HttpError       httpException  = httpExceptions.get(0);
            LOGGER.error(
                    String.format("Error encountered while attempting to delete ocean cluster. Code: %s. Message: %s.",
                                  httpException.getCode(), httpException.getMessage()));
            throw new SpotinstHttpException(httpException.getMessage());
        }

        return retVal;
    }

    // todo lihi -done- add example
    public OceanK8sCluster getOceanK8sCluster(ClusterGetRequest oceanClusterGetRequest) {
        OceanK8sCluster retVal;
        String          clusterToGet = oceanClusterGetRequest.getClusterId();
        RepoGenericResponse<OceanK8sCluster> clusterRes =
                getSpotOceanK8sClusterRepo().get(clusterToGet, authToken, account);
        if (clusterRes.isRequestSucceed()) {
            retVal = clusterRes.getValue();
        }
        else {
            List<HttpError> httpExceptions = clusterRes.getHttpExceptions();
            HttpError       httpException  = httpExceptions.get(0);
            LOGGER.error(
                    String.format("Error encountered while attempting to get ocean cluster. Code: %s. Message: %s.",
                                  httpException.getCode(), httpException.getMessage()));
            throw new SpotinstHttpException(httpException.getMessage());
        }

        return retVal;
    }
}
