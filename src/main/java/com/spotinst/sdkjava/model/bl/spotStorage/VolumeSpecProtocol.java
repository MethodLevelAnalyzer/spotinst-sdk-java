package com.spotinst.sdkjava.model.bl.spotStorage;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VolumeSpecProtocol {
    //region Members
    @JsonIgnore
    private Set<String>                    isSet;
    private List<String>                   types;
    private String                         mountPath;
    private VolumeSpecProtocolExportPolicy exportPolicy;
    private Boolean                        kerberosEnabled;
    private String                         securityStyle;
    //endregion

    //region Constructor
    private VolumeSpecProtocol() {
        isSet = new HashSet<>();
    }
    //endregion

    //region getters &setters
    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        isSet.add("types");
        this.types = types;
    }

    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        isSet.add("mountPath");
        this.mountPath = mountPath;
    }

    public VolumeSpecProtocolExportPolicy getExportPolicy() {
        return exportPolicy;
    }

    public void setExportPolicy(VolumeSpecProtocolExportPolicy exportPolicy) {
        isSet.add("exportPolicy");
        this.exportPolicy = exportPolicy;
    }

    public Boolean getKerberosEnabled() {
        return kerberosEnabled;
    }

    public void setKerberosEnabled(Boolean kerberosEnabled) {
        isSet.add("kerberosEnabled");
        this.kerberosEnabled = kerberosEnabled;
    }

    public String getSecurityStyle() {
        return securityStyle;
    }

    public void setSecurityStyle(String securityStyle) {
        isSet.add("securityStyle");
        this.securityStyle = securityStyle;
    }
    //end region

    //region Builder class
    public static class Builder {
        //region Members
        private VolumeSpecProtocol volumeSpecProtocol;
        //endregion


        private Builder() {
            this.volumeSpecProtocol = new VolumeSpecProtocol();
        }

        public static Builder get() {
            Builder builder = new Builder();
            return builder;
        }

        //region Build methods
        protected Builder setTypes(final List<String> types) {
            volumeSpecProtocol.setTypes(types);
            return this;
        }

        public Builder setMountPath(final String mountPath) {
            volumeSpecProtocol.setMountPath(mountPath);
            return this;
        }

        public Builder setExportPolicy(final VolumeSpecProtocolExportPolicy exportPolicy) {
            volumeSpecProtocol.setExportPolicy(exportPolicy);
            return this;
        }

        public Builder setKerberosEnabled(final Boolean kerberosEnabled) {
            volumeSpecProtocol.setKerberosEnabled(kerberosEnabled);
            return this;
        }

        public Builder setSecurityStyle(final String securityStyle) {
            volumeSpecProtocol.setSecurityStyle(securityStyle);
            return this;
        }

        public VolumeSpecProtocol build() {
            // Validations
            return volumeSpecProtocol;
        }
        //endregion
    }
    //endregion

    //region isSet methods
    // Is types Set boolean method
    @JsonIgnore
    public boolean isTypesSet() {
        return isSet.contains("types");
    }

    // Is mountPath Set boolean method
    @JsonIgnore
    public boolean isMountPathSet() {
        return isSet.contains("mountPath");
    }

    // Is exportPolicy Set boolean method
    @JsonIgnore
    public boolean isExportPolicySet() {
        return isSet.contains("exportPolicy");
    }

    // Is kerberosEnabled Set boolean method
    @JsonIgnore
    public boolean isKerberosEnabledSet() {
        return isSet.contains("kerberosEnabled");
    }

    // Is securityStyle Set boolean method
    @JsonIgnore
    public boolean isSecurityStyleSet() {
        return isSet.contains("securityStyle");
    }
    //endregion
}
