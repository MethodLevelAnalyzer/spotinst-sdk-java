package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterEcsInstanceTypes {
    @JsonIgnore
    private Set<String>  isSet;
    private List<String> whitelist;
    private List<String> blacklist;

    private ClusterEcsInstanceTypes() {
        isSet = new HashSet<>();
    }

    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }

    public List<String> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<String> whitelist) {
        isSet.add("whitelist");
        this.whitelist = whitelist;
    }

    public List<String> getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(List<String> blacklist) {
        isSet.add("blacklist");
        this.blacklist = blacklist;
    }

    public static class Builder {
        private ClusterEcsInstanceTypes instanceTypes;

        private Builder() {
            this.instanceTypes = new ClusterEcsInstanceTypes();
        }

        public static ClusterEcsInstanceTypes.Builder get() {
            ClusterEcsInstanceTypes.Builder builder = new ClusterEcsInstanceTypes.Builder();
            return builder;
        }

        public ClusterEcsInstanceTypes.Builder setWhitelist(final List<String> whitelist) {
            instanceTypes.setWhitelist(whitelist);
            return this;
        }

        public ClusterEcsInstanceTypes.Builder setBlacklist(final List<String> blacklist) {
            instanceTypes.setBlacklist(blacklist);
            return this;
        }

        public ClusterEcsInstanceTypes build() {
            return instanceTypes;
        }
    }
    @JsonIgnore
    public boolean isWhitelistSet() {
        return isSet.contains("whitelist");
    }

    @JsonIgnore
    public boolean isBlacklistSet() {
        return isSet.contains("blacklist");
    }
}
