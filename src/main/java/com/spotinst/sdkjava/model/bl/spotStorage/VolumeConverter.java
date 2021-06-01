package com.spotinst.sdkjava.model.bl.spotStorage;

import com.spotinst.sdkjava.model.api.spotStorage.*;
import com.spotinst.sdkjava.model.api.spotStorage.ApiAzureStorageVolume;
import com.spotinst.sdkjava.model.bl.ocean.aks.*;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class VolumeConverter {
    //BL -> DAL

    public static ApiAzureStorageVolume toDal(VolumeAzureStorage src) {

        ApiAzureStorageVolume retVal = null;

        if (src != null) {
            retVal = new ApiAzureStorageVolume();

            if (src.isIdSet()){
                retVal.setId(src.getId());
            }

            if (src.isNameSet()) {
                retVal.setName(src.getName());
            }

            if (src.isRegionSet()) {
                retVal.setRegion(src.getRegion());
            }

            if (src.isCapacitySet()) {
                retVal.setCapacity(toDal(src.getCapacity()));
            }

            if (src.isThroughputSet()) {
                retVal.setThroughput(toDal(src.getThroughput()));
            }

            if (src.isVolumeSpecSet()) {
                retVal.setVolumeSpec(toDal(src.getVolumeSpec()));
            }

            if (src.isAutoResizeSet()) {
                retVal.setAutoResize(toDal(src.getAutoResize()));
            }

            if (src.isStateSet()) {
                retVal.setState(src.getState());
            }

            if (src.isCreatedAtSet()) {
                retVal.setCreatedAt(src.getCreatedAt());
            }

            if (src.isUpdatedAtSet()) {
                retVal.setUpdatedAt(src.getUpdatedAt());
            }
        }

        return retVal;
    }

    private static ApiAzureStorageVolumeCapacity toDal(VolumeCapacity capacity) {
        ApiAzureStorageVolumeCapacity retVal = null;

        if (capacity != null) {
            retVal = new ApiAzureStorageVolumeCapacity();

            if (capacity.isSizeGiBSet()) {
                retVal.setSizeGiB(capacity.getSizeGiB());
            }

            if (capacity.isMinSizeGiBSet()) {
                retVal.setMinSizeGiB(capacity.getMinSizeGiB());
            }

            if (capacity.isMaxSizeGiBSet()) {
                retVal.setMaxSizeGiB(capacity.getMaxSizeGiB());
            }
        }

        return retVal;
    }

        private static ApiAzureStorageVolumeThroughput toDal(VolumeThroughput throughput) {
        ApiAzureStorageVolumeThroughput retVal = null;

        if (throughput != null) {
            retVal = new ApiAzureStorageVolumeThroughput();

            if (throughput.isThroughputMibpsSet()) {
                retVal.setThroughputMibps(throughput.getThroughputMibps());
            }
        }

        return retVal;
    }

    private static ApiAzureStorageVolumeSpec toDal(VolumeSpec volumeSpec) {

        ApiAzureStorageVolumeSpec retVal = null;

        if (volumeSpec != null) {
            retVal = new ApiAzureStorageVolumeSpec();

            if (volumeSpec.isNetworkSet()) {
                retVal.setNetwork(toDal(volumeSpec.getNetwork()));
            }

            if (volumeSpec.isProtocolSet()) {
                retVal.setProtocol(toDal(volumeSpec.getProtocol()));
            }

            if (volumeSpec.isServiceLevelSet()) {
                retVal.setServiceLevel(toDal(volumeSpec.getServiceLevel()));
            }

            if (volumeSpec.isTagsSet()){

                if (volumeSpec.getTags() != null){
                    List<ApiAzureStorageVolumeTag> tags =
                            volumeSpec.getTags().stream().map(VolumeConverter::toDal)
                                                  .collect(Collectors.toList());
                    retVal.setTags(tags);
                }
                else{
                    retVal.setTags(null);

                }
            }
        }

        return retVal;
    }

    private static ApiAzureStorageVolumeAutoResize toDal(VolumeAutoResize volumeAutoResize) {
        ApiAzureStorageVolumeAutoResize retVal = null;

        if (volumeAutoResize != null) {
            retVal = new ApiAzureStorageVolumeAutoResize();

            if (volumeAutoResize.isModeSet()) {
                retVal.setMode(volumeAutoResize.getMode());
            }

            if (volumeAutoResize.isPolicyTypeSet()) {
                retVal.setPolicyType(volumeAutoResize.getPolicyType());
            }

            if (volumeAutoResize.isResizePoliciesSet()){
                if (volumeAutoResize.getResizePolicies() != null){
                    List<ApiAzureStorageVolumeAutoResizeResizePolicy> extensions =
                            volumeAutoResize.getResizePolicies().stream().map(VolumeConverter::toDal)
                                                  .collect(Collectors.toList());
                    retVal.setResizePolicies(extensions);
                }
                else{
                    retVal.setResizePolicies(null);

                }
            }
        }

        return retVal;
    }

    private static ApiAzureStorageVolumeSpecNetwork toDal(VolumeSpecNetwork volumeSpecNetwork) {
        ApiAzureStorageVolumeSpecNetwork retVal = null;

        if (volumeSpecNetwork != null) {
            retVal = new ApiAzureStorageVolumeSpecNetwork();

            if (volumeSpecNetwork.isResourceGroupNameSet()) {
                retVal.setResourceGroupName(volumeSpecNetwork.getResourceGroupName());
            }

            if (volumeSpecNetwork.isVirtualNetworkNameSet()) {
                retVal.setVirtualNetworkName(volumeSpecNetwork.getVirtualNetworkName());
            }

            if (volumeSpecNetwork.isSubnetNameSet()) {
                retVal.setSubnetName(volumeSpecNetwork.getSubnetName());
            }
        }

        return retVal;
    }

    private static ApiAzureStorageVolumeSpecProtocol toDal(VolumeSpecProtocol volumeSpecProtocol) {
        ApiAzureStorageVolumeSpecProtocol retVal = null;

        if (volumeSpecProtocol != null) {
            retVal = new ApiAzureStorageVolumeSpecProtocol();

            if (volumeSpecProtocol.isTypesSet()){

                if (volumeSpecProtocol.getTypes() != null){
                    List<String> types =
                            volumeSpecProtocol.getTypes().stream().map(VolumeConverter::toDal)
                                              .collect(Collectors.toList());
                    retVal.setTypes(types);
                }
                else{
                    retVal.setTypes(null);

                }
            }

            if (volumeSpecProtocol.isMountPathSet()) {
                retVal.setMountPath(volumeSpecProtocol.getMountPath());
            }

            if (volumeSpecProtocol.isExportPolicySet()) {
                retVal.setExportPolicy(toDal(volumeSpecProtocol.getExportPolicy()));
            }

            if (volumeSpecProtocol.isKerberosEnabledSet()) {
                retVal.setKerberosEnabled(volumeSpecProtocol.getKerberosEnabled());
            }

            if (volumeSpecProtocol.isSecurityStyleSet()) {
                retVal.setSecurityStyle(volumeSpecProtocol.getSecurityStyle());
            }
        }

        return retVal;
    }

    private static ApiAzureStorageVolumeTag toDal(VolumeTag volumeTag) {
        ApiAzureStorageVolumeTag retVal = null;

        if (volumeTag != null) {
            retVal = new ApiAzureStorageVolumeTag();

            if (volumeTag.isTagKeySet()) {
                retVal.setTagKey(volumeTag.getTagKey());
            }

            if (volumeTag.isTagValueSet()) {
                retVal.setTagValue(volumeTag.getTagValue());
            }
        }

        return retVal;
    }

    private static ApiAzureStorageVolumeAutoResize toDal(VolumeAutoResize volumeAutoResize) {
        ApiAzureStorageVolumeAutoResize retVal = null;

        if (volumeAutoResize != null) {
            retVal = new ApiAzureStorageVolumeAutoResize();

            if (volumeAutoResize.isModeSet()) {
                retVal.setMode(volumeAutoResize.getMode());
            }
            if (volumeAutoResize.isPolicyTypeSet()) {
                retVal.setPolicyType(volumeAutoResize.getPolicyType());
            }

            if (volumeAutoResize.isResizePoliciesSet()) {

                if (volumeAutoResize.getResizePolicies() != null){
                    List<ApiAzureStorageVolumeAutoResizeResizePolicy> resizePolicies =
                            volumeAutoResize.getResizePolicies().stream().map(VolumeConverter::toDal)
                                              .collect(Collectors.toList());
                    retVal.setResizePolicies(resizePolicies);
                }
                else{
                    retVal.setResizePolicies(null);

                }
            }
        }

        return retVal;
    }
//todo yael פה עצרתי
private static ApiAzureStorageVolumeSpecProtocolExportPolicy toDal(VolumeSpecProtocolExportPolicy volumeSpecProtocolExportPolicy) {
    ApiAzureStorageVolumeSpecProtocolExportPolicy retVal = null;

    if (volumeSpecProtocolExportPolicy != null) {
        retVal = new ApiAzureStorageVolumeSpecProtocolExportPolicy();

        if (volumeSpecProtocolExportPolicy.isRulesSet()) {

            if (volumeSpecProtocolExportPolicy.getRules() != null){
                List<ApiAzureStorageVolumeSpecProtocolExportPolicyRule> resizePolicies =
                        volumeSpecProtocolExportPolicy.getRules().stream().map(VolumeConverter::toDal)
                                        .collect(Collectors.toList());
                retVal.setRules(resizePolicies);
            }
            else{
                retVal.setRules(null);

            }
        }
    }

    return retVal;
}

    private static ApiAzureStorageVolumeSpecProtocolExportPolicyRule toDal(VolumeSpecProtocolExportPolicyRule volumeSpecProtocolExportPolicyRule){
        ApiAzureStorageVolumeSpecProtocolExportPolicyRule retVal = null;

        if (volumeSpecProtocolExportPolicyRule != null){
            retVal = new ApiAzureStorageVolumeSpecProtocolExportPolicyRule();


            if (volumeSpecProtocolExportPolicyRule.isIndexSet()){
                retVal.setResourceGroupName(volumeSpecProtocolExportPolicyRule.getResourceGroupName());
            }

            if (volumeSpecProtocolExportPolicyRule.isAllowedClientsSet()){
                retVal.setVirtualNetworkName(volumeSpecProtocolExportPolicyRule.getVirtualNetworkName());
            }

            if (volumeSpecProtocolExportPolicyRule.isAccessSet()){
                retVal.setResourceGroupName(volumeSpecProtocolExportPolicyRule.getResourceGroupName());
            }

            if (volumeSpecProtocolExportPolicyRule.isRootSet()){
                retVal.setVirtualNetworkName(volumeSpecProtocolExportPolicyRule.getVirtualNetworkName());
            }

            if (volumeSpecProtocolExportPolicyRule.isKerberosRuleAccessesSet()){

                if (volumeSpecProtocolExportPolicyRule.getNetworkInterfaces() != null){
                    List<ApiClusterNetworkInterfaceAks> networks =
                            volumeSpecProtocolExportPolicyRule.getNetworkInterfaces().stream().map(VolumeConverter::toDal)
                                      .collect(Collectors.toList());
                    retVal.setNetworkInterfaces(networks);
                }
                else{
                    retVal.setNetworkInterfaces(null);
                }
            }
        }
        return retVal;

    }

    private static ApiClusterNetworkInterfaceAks toDal(ClusterNetworkInterfaceAks networkInterfaceAks){
        ApiClusterNetworkInterfaceAks retVal = null;

        if (networkInterfaceAks != null){
            retVal = new ApiClusterNetworkInterfaceAks();

            if (networkInterfaceAks.isAssignPublicIpSet()){
                retVal.setAssignPublicIp(networkInterfaceAks.getAssignPublicIp());
            }

            if (networkInterfaceAks.isEnableIPForwardingSet()){
                retVal.setEnableIPForwarding(networkInterfaceAks.getEnableIPForwarding());
            }

            if (networkInterfaceAks.isIsPrimarySet()){
                retVal.setIsPrimary(networkInterfaceAks.getIsPrimary());
            }

            if (networkInterfaceAks.isSecurityGroupSet()){
                retVal.setSecurityGroup(toDal(networkInterfaceAks.getSecurityGroup()));
            }

            if (networkInterfaceAks.isSubnetNameSet()){
                retVal.setSubnetName(networkInterfaceAks.getSubnetName());
            }

            if (networkInterfaceAks.isPublicIpSkuSet()){
                retVal.setPublicIpSku(networkInterfaceAks.getPublicIpSku());
            }

            if (networkInterfaceAks.isAdditionalIpConfigurationsSet()){

                if (networkInterfaceAks.getAdditionalIpConfigurations() != null){
                    List<ApiClusterAdditionalIpConfigurationsAks> configurationsAks = networkInterfaceAks.getAdditionalIpConfigurations().stream().map(
                            VolumeConverter::toDal).collect(Collectors.toList());
                    retVal.setAdditionalIpConfigurations(configurationsAks);
                }
                else{
                    retVal.setAdditionalIpConfigurations(null);
                }
            }
        }
        return retVal;
    }

    private static ApiClusterSecurityGroupAks toDal(ClusterSecurityGroupAks securityGroupAks) {
        ApiClusterSecurityGroupAks retVal = null;

        if (securityGroupAks != null) {
            retVal = new ApiClusterSecurityGroupAks();

            if (securityGroupAks.isNameSet()){
                retVal.setName(securityGroupAks.getName());
            }

            if (securityGroupAks.isResourceGroupNameSet()){
                retVal.setResourceGroupName(securityGroupAks.getResourceGroupName());
            }
        }
        return retVal;
    }

    private static ApiClusterOsDiskAks toDal(ClusterOsDiskAks clusterOsDiskAks){
        ApiClusterOsDiskAks retVal = null;

        if(clusterOsDiskAks != null){
            retVal = new ApiClusterOsDiskAks();

            if (clusterOsDiskAks.isSizeGBSet()){
                retVal.setSizeGB(clusterOsDiskAks.getSizeGB());
            }
        }
        return retVal;
    }

    private static ApiClusterAdditionalIpConfigurationsAks toDal(ClusterAdditionalIpConfigurationsAks additionalIpConfigurationsAks){
        ApiClusterAdditionalIpConfigurationsAks retVal = null;

        if (additionalIpConfigurationsAks != null){
            retVal = new ApiClusterAdditionalIpConfigurationsAks();

            if (additionalIpConfigurationsAks.isNameSet()){
                retVal.setName(additionalIpConfigurationsAks.getName());
            }
        }
        return retVal;
    }

    private static ApiClusterTagAks toDal(ClusterTagAks tag){
        ApiClusterTagAks retVal = null;

        if (tag != null){
            retVal = new ApiClusterTagAks();

            if (tag.isTagKeySet()){
                retVal.setTagKey(tag.getTagKey());
            }

            if (tag.isTagValueSet()){
                retVal.setTagValue(tag.getTagValue());
            }
        }
        return retVal;
    }

    //DAL -> BL

    public static OceanClusterAks toBl(ApiClusterAks src) {

        OceanClusterAks retVal = null;

        if (src != null) {
            OceanClusterAks.Builder builder = OceanClusterAks.Builder.get();

            if (src.isAksSet()) {
                builder.setAks(toBl(src.getAks()));
            }

            if (src.isControllerClusterIdSet()) {
                builder.setControllerClusterId(src.getControllerClusterId());
            }

            if (src.isNameSet()) {
                builder.setName(src.getName());
            }

            if (src.isVirtualNodeGroupTemplateSet()) {
                builder.setVirtualNodeGroupTemplate(toBl(src.getVirtualNodeGroupTemplate()));
            }

            if (src.isIdSet()){
                builder.setId(src.getId());
            }

            retVal = builder.build();

        }
        return retVal;
    }

    private static ClusterConfigurationAks toBl(ApiClusterConfigurationAks aks) {
        ClusterConfigurationAks retVal = null;

        if (aks != null) {
            ClusterConfigurationAks.Builder builder = ClusterConfigurationAks.Builder.get();

            if (aks.isNameSet()) {
                builder.setName(aks.getName());
            }

            if (aks.isResourceGroupNameSet()) {
                builder.setResourceGroupName(aks.getResourceGroupName());
            }

            retVal = builder.build();

        }

        return retVal;
    }

    private static ClusterVirtualNodeGroupTemplateAks toBl(ApiClusterVirtualNodeGroupTemplateAks virtualNodeGroupTemplateAks) {
        ClusterVirtualNodeGroupTemplateAks retVal = null;

        if (virtualNodeGroupTemplateAks != null) {

            ClusterVirtualNodeGroupTemplateAks.Builder builder = ClusterVirtualNodeGroupTemplateAks.Builder.get();

            if (virtualNodeGroupTemplateAks.isLaunchSpecificationSet()) {
                builder.setLaunchSpecification(toBl(virtualNodeGroupTemplateAks.getLaunchSpecification()));
            }
            retVal = builder.build();
        }

        return retVal;
    }

    private static ClusterLaunchSpecificationAks toBl(ApiClusterLaunchSpecificationAks launchSpecificationAks) {

        ClusterLaunchSpecificationAks retVal = null;

        if (launchSpecificationAks != null) {

            ClusterLaunchSpecificationAks.Builder builder = ClusterLaunchSpecificationAks.Builder.get();

            if (launchSpecificationAks.isExtensionsSet()) {
                if (launchSpecificationAks.getExtensions() != null){

                    List<ClusterExtensionAks> extensions =
                            launchSpecificationAks.getExtensions().stream().map(VolumeConverter::toBl)
                                    .collect(Collectors.toList());
                    builder.setExtensions(extensions);
                }
                else{
                    builder.setExtensions(null);
                }
            }

            if (launchSpecificationAks.isImageSet()) {
                builder.setImage(toBl(launchSpecificationAks.getImage()));
            }

            if (launchSpecificationAks.isLoadBalancersConfigSet()){
                builder.setLoadBalancersConfig(toBl(launchSpecificationAks.getLoadBalancersConfig()));
            }

            if (launchSpecificationAks.isLoginSet()){
                builder.setLogin(toBl(launchSpecificationAks.getLogin()));
            }

            if (launchSpecificationAks.isNetworkSet()){
                builder.setNetwork(toBl(launchSpecificationAks.getNetwork()));
            }

            if (launchSpecificationAks.isOsDiskSet()){
                builder.setOsDisk(toBl(launchSpecificationAks.getOsDisk()));
            }

            if (launchSpecificationAks.isResourceGroupNameSet()){
                builder.setResourceGroupName(launchSpecificationAks.getResourceGroupName());
            }

            if (launchSpecificationAks.isTagsSet()){

            if (launchSpecificationAks.getTags() != null){
                List<ClusterTagAks> tags = launchSpecificationAks.getTags().stream()
                                                                 .map(VolumeConverter::toBl).collect(Collectors.toList());

                builder.setTags(tags);
                }
                else{
                    builder.setTags(null);

                }
            }

            retVal = builder.build();

        }

        return retVal;
    }

    private static ClusterExtensionAks toBl(ApiClusterExtensionAks extensionAks) {
        ClusterExtensionAks retVal = null;

        if (extensionAks != null) {
            ClusterExtensionAks.Builder builder = ClusterExtensionAks.Builder.get();

            if (extensionAks.isApiVersionSet()) {
                builder.setApiVersion(extensionAks.getApiVersion());
            }

            if (extensionAks.isMinorVersionAutoUpgradeSet()) {
                builder.setMinorVersionAutoUpgrade(extensionAks.getMinorVersionAutoUpgrade());
            }

            if (extensionAks.isNameSet()){
                builder.setName(extensionAks.getName());
            }

            if (extensionAks.isPublisherSet()){
                builder.setName(extensionAks.getPublisher());
            }

            if (extensionAks.isTypeSet()){
                builder.setName(extensionAks.getType());
            }

            retVal = builder.build();

        }

        return retVal;
    }

    private static ClusterImageAks toBl(ApiClusterImageAks imageAks) {
        ClusterImageAks retVal = null;

        if (imageAks != null) {
            ClusterImageAks.Builder builder = ClusterImageAks.Builder.get();

            if (imageAks.isMarketplaceSet()) {
                builder.setMarketplace(toBl(imageAks.getMarketplace()));
            }

            retVal = builder.build();
        }

        return retVal;
    }

    private static ClusterMarketplaceAks toBl(ApiClusterMarketplaceAks marketplaceAks) {
        ClusterMarketplaceAks retVal = null;

        if (marketplaceAks != null) {
            ClusterMarketplaceAks.Builder builder = ClusterMarketplaceAks.Builder.get();

            if (marketplaceAks.isOfferSet()) {
                builder.setOffer(marketplaceAks.getOffer());
            }

            if (marketplaceAks.isPublisherSet()) {
                builder.setPublisher(marketplaceAks.getPublisher());
            }

            if (marketplaceAks.isSkuSet()) {
                builder.setSku(marketplaceAks.getSku());
            }
            if (marketplaceAks.isVersioneSet()) {
                builder.setVersion(marketplaceAks.getVersion());
            }

            retVal = builder.build();

        }

        return retVal;
    }

    private static ClusterLoadBalancersConfigAks toBl(ApiClusterLoadBalancersConfigAks loadBalancersConfigAks) {
        ClusterLoadBalancersConfigAks retVal = null;

        if (loadBalancersConfigAks != null) {
            ClusterLoadBalancersConfigAks.Builder builder = ClusterLoadBalancersConfigAks.Builder.get();

            if (loadBalancersConfigAks.isLoadBalancersSet()) {

                if (loadBalancersConfigAks.getLoadBalancers() != null){
                    List<ClusterLoadBalancerAks> loadBalancers =
                            loadBalancersConfigAks.getLoadBalancers().stream().map(VolumeConverter::toBl)
                                    .collect(Collectors.toList());
                    builder.setLoadBalancers(loadBalancers);
                }
                else{
                    builder.setLoadBalancers(null);

                }
            }
            retVal = builder.build();
        }

        return retVal;
    }

    private static ClusterLoadBalancerAks toBl(ApiClusterLoadBalancerAks loadBalancerAks) {
        ClusterLoadBalancerAks retVal = null;

        if (loadBalancerAks != null) {
            ClusterLoadBalancerAks.Builder builder = ClusterLoadBalancerAks.Builder.get();

            if (loadBalancerAks.isBackendPoolNamesSet()) {

                if (loadBalancerAks.getBackendPoolNames() == null) {
                    builder.setBackendPoolNames(null);
                }
                else {
                    builder.setBackendPoolNames(new LinkedList<>(loadBalancerAks.getBackendPoolNames()));
                }
            }
            if (loadBalancerAks.isLoadBalancerSkuSet()) {
                builder.setLoadBalancerSku(loadBalancerAks.getLoadBalancerSku());
            }
            if (loadBalancerAks.isNameSet()) {
                builder.setName(loadBalancerAks.getName());
            }
            if (loadBalancerAks.isResourceGroupNameSet()) {
                builder.setResourceGroupName(loadBalancerAks.getResourceGroupName());
            }
            if (loadBalancerAks.isTypeSet()) {
                builder.setType(loadBalancerAks.getType());
            }
            retVal = builder.build();
        }

        return retVal;
    }

    private static ClusterLoginAks toBl(ApiClusterLoginAks loginAks){
        ClusterLoginAks retVal = null;

        if (loginAks != null){
            ClusterLoginAks.Builder builder = ClusterLoginAks.Builder.get();

            if (loginAks.isSshPublicKeySet()){
                builder.setSshPublicKey(loginAks.getSshPublicKey());
            }

            if (loginAks.isUserNameSet()){
                builder.setUserName(loginAks.getUserName());
            }
            retVal = builder.build();
        }
        return retVal;
    }

    private static ClusterNetworkAks toBl(ApiClusterNetworkAks networkAks){
        ClusterNetworkAks retVal = null;

        if (networkAks != null){
            ClusterNetworkAks.Builder builder = ClusterNetworkAks.Builder.get();

            if (networkAks.isNetworkInterfacesSet()){

                if (networkAks.getNetworkInterfaces() != null){
                    List<ClusterNetworkInterfaceAks> networks =
                            networkAks.getNetworkInterfaces().stream().map(VolumeConverter::toBl)
                                    .collect(Collectors.toList());
                    builder.setNetworkInterfaces(networks);
                }
                else{
                    builder.setNetworkInterfaces(null);
                }
            }

            if (networkAks.isResourceGroupNameSet()){
                builder.setResourceGroupName(networkAks.getResourceGroupName());
            }

            if (networkAks.isVirtualNetworkNameSet()){
                builder.setVirtualNetworkName(networkAks.getVirtualNetworkName());
            }
            retVal = builder.build();
        }
        return retVal;

    }

    private static ClusterNetworkInterfaceAks toBl(ApiClusterNetworkInterfaceAks networkInterfaceAks){
        ClusterNetworkInterfaceAks retVal = null;

        if (networkInterfaceAks != null){

            ClusterNetworkInterfaceAks.Builder builder = ClusterNetworkInterfaceAks.Builder.get();

            if (networkInterfaceAks.isAssignPublicIpSet()){
                builder.setAssignPublicIp(networkInterfaceAks.getAssignPublicIp());
            }

            if (networkInterfaceAks.isEnableIPForwardingSet()){
                builder.setEnableIPForwarding(networkInterfaceAks.getEnableIPForwarding());
            }

            if (networkInterfaceAks.isIsPrimarySet()){
                builder.setIsPrimary(networkInterfaceAks.getIsPrimary());
            }

            if (networkInterfaceAks.isSecurityGroupSet()){
                builder.setSecurityGroup(toBl(networkInterfaceAks.getSecurityGroup()));

            }

            if (networkInterfaceAks.isSubnetNameSet()){
                builder.setSubnetName(networkInterfaceAks.getSubnetName());
            }

            if (networkInterfaceAks.isPublicIpSkuSet()){
                builder.setPublicIpSku(networkInterfaceAks.getPublicIpSku());
            }

            if (networkInterfaceAks.isAdditionalIpConfigurationsSet()){
                if (networkInterfaceAks.getAdditionalIpConfigurations() != null){

                    List<ClusterAdditionalIpConfigurationsAks> configurationsAks = networkInterfaceAks.getAdditionalIpConfigurations().stream().map(
                            VolumeConverter::toBl).collect(Collectors.toList());
                    builder.setAdditionalIpConfigurations(configurationsAks);
                }
                else {
                    builder.setAdditionalIpConfigurations(null);
                }
            }

            retVal = builder.build();
        }
        return retVal;
    }

    private static ClusterSecurityGroupAks toBl(ApiClusterSecurityGroupAks securityGroupAks) {
        ClusterSecurityGroupAks retVal = null;

        if (securityGroupAks != null) {

            ClusterSecurityGroupAks.Builder builder = ClusterSecurityGroupAks.Builder.get();

            if (securityGroupAks.isNameSet()){
                builder.setName(securityGroupAks.getName());
            }

            if (securityGroupAks.isResourceGroupNameSet()){
                builder.setResourceGroupName(securityGroupAks.getResourceGroupName());
            }
            retVal = builder.build();
        }
        return retVal;
    }

    private static ClusterOsDiskAks toBl(ApiClusterOsDiskAks osDiskAks){
        ClusterOsDiskAks retVal = null;

        if (osDiskAks != null) {
            ClusterOsDiskAks.Builder builder = ClusterOsDiskAks.Builder.get();

            if (osDiskAks.isSizeGBSet()) {
                builder.setSizeGB(osDiskAks.getSizeGB());
            }

            retVal = builder.build();
        }

        return retVal;

    }

    private static ClusterAdditionalIpConfigurationsAks toBl(ApiClusterAdditionalIpConfigurationsAks additionalIpConfigurationsAks){
        ClusterAdditionalIpConfigurationsAks retVal = null;

        if (additionalIpConfigurationsAks != null){
            ClusterAdditionalIpConfigurationsAks.Builder builder = ClusterAdditionalIpConfigurationsAks.Builder.get();

            if (additionalIpConfigurationsAks.isNameSet()){
                builder.setName(additionalIpConfigurationsAks.getName());
            }
            retVal = builder.build();
        }
        return retVal;
    }

    private static ClusterTagAks toBl(ApiClusterTagAks tag){
        ClusterTagAks retVal = null;

        if (tag != null){

            ClusterTagAks.Builder builder = ClusterTagAks.Builder.get();
            if (tag.isTagKeySet()){

                builder.setTagKey(tag.getTagKey());
                }

            if (tag.isTagValueSet()){
                builder.setTagValue(tag.getTagValue());
                }

                retVal = builder.build();
            }
        return retVal;
    }
}
