package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterEcsIamInstanceProfileSpec {
    @JsonIgnore
    private Set<String> isSet;
    private String      arn;

    private ClusterEcsIamInstanceProfileSpec() {
        isSet = new HashSet<>();
    }

    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }

    public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        isSet.add("arn");
        this.arn = arn;
    }

    public static class Builder {
        private ClusterEcsIamInstanceProfileSpec iamInstanceProfile;

        private Builder() {
            this.iamInstanceProfile = new ClusterEcsIamInstanceProfileSpec();
        }

        public static Builder get() {
            Builder builder = new ClusterEcsIamInstanceProfileSpec.Builder();
            return builder;
        }

        public Builder setArn(final String arn) {
            iamInstanceProfile.setArn(arn);
            return this;
        }

        public ClusterEcsIamInstanceProfileSpec build() {
            return iamInstanceProfile;
        }
    }

    @JsonIgnore
    public boolean isArnSet() {
        return isSet.contains("arn");
    }
}
