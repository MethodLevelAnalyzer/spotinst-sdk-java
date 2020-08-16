package com.spotinst.sdkjava.model.bl.ocean.ecs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterEcsSchedulingConfiguration {
    @JsonIgnore
    private Set<String>                          isSet;
    private ClusterEcsShutdownHoursSpecification shutdownHours;
    private List<ClusterEcsTasksSpecification>   tasks;
    private ClusterEcsSchedulingConfiguration() {
        isSet = new HashSet<>();
    }


    public Set<String> getIsSet() {
        return isSet;
    }

    public void setIsSet(Set<String> isSet) {
        this.isSet = isSet;
    }

    public List<ClusterEcsTasksSpecification> getTasks() {
        return tasks;
    }

    public void setTasks(List<ClusterEcsTasksSpecification> tasks) {
        isSet.add("tasks");
        this.tasks = tasks;
    }

    public ClusterEcsShutdownHoursSpecification getShutdownHours() {
        return shutdownHours;
    }

    public void setShutdownHours(ClusterEcsShutdownHoursSpecification shutdownHours) {
        isSet.add("shutdownHours");
        this.shutdownHours = shutdownHours;
    }

    public static class Builder {
        private ClusterEcsSchedulingConfiguration scheduling;

        private Builder() {
            this.scheduling = new ClusterEcsSchedulingConfiguration();
        }

        public static Builder get() {
            Builder builder = new Builder();
            return builder;
        }

        public Builder setTasks(final List<ClusterEcsTasksSpecification> tasks) {
            scheduling.setTasks(tasks);
            return this;
        }
        public Builder setShutdownHours(final ClusterEcsShutdownHoursSpecification shutdownHours) {
            scheduling.setShutdownHours(shutdownHours);
            return this;
        }

        public ClusterEcsSchedulingConfiguration build() {
            return scheduling;
        }
    }

    @JsonIgnore
    public boolean isTasksSet() {
        return isSet.contains("tasks");
    }

    @JsonIgnore
    public boolean isShutdownHoursSet() {
        return isSet.contains("shutdownHours");
    }
}
