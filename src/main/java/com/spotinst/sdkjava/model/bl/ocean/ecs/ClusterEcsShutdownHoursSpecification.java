package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterEcsShutdownHoursSpecification {
    @JsonIgnore
    private Set<String>  isSet;
    private Boolean      isEnabled;
    private List<String> timeWindows;

    private ClusterEcsShutdownHoursSpecification() {
        isSet = new HashSet<>();
    }

    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }


    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isSet.add("isEnabled");
        isEnabled = enabled;
    }

    public List<String> getTimeWindows() {
        return timeWindows;
    }

    public void setTimeWindows(List<String> timeWindows) {
        isSet.add("timeWindows");
        this.timeWindows = timeWindows;
    }

    public static class Builder {
        private ClusterEcsShutdownHoursSpecification scheduling;

        private Builder() {
            this.scheduling = new ClusterEcsShutdownHoursSpecification();
        }

        public static ClusterEcsShutdownHoursSpecification.Builder get() {
            ClusterEcsShutdownHoursSpecification.Builder builder = new ClusterEcsShutdownHoursSpecification.Builder();
            return builder;
        }

        public ClusterEcsShutdownHoursSpecification.Builder setEnabled(final Boolean isEnabled) {
            scheduling.setEnabled(isEnabled);
            return this;
        }

        public ClusterEcsShutdownHoursSpecification.Builder setTimeWindows(final List<String> timeWindows) {
            scheduling.setTimeWindows(timeWindows);
            return this;
        }

        public ClusterEcsShutdownHoursSpecification build() {
            return scheduling;
        }
    }

    @JsonIgnore
    public boolean isIsEnabledSet() {
        return isSet.contains("isEnabled");
    }
    @JsonIgnore
    public boolean istimeWindowsSet() {
        return isSet.contains("timeWindows");
    }
}
