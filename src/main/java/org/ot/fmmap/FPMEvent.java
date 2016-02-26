/**
 * Copyright 2015-2016 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ot.fmmap;

/**
 * Created by daniel on 23/04/15.
 */
public class FPMEvent {
    public enum EventType {NEW, UPDATE, DELETE}

    private EventType eventType;
    private boolean programmatic;
    private String key;
    private String value;

    public FPMEvent(EventType eventType, boolean programmatic, String key, String value) {
        this.eventType = eventType;
        this.programmatic = programmatic;
        this.key = key;
        this.value = value;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public boolean isProgrammatic() {
        return programmatic;
    }

    public void setProgrammatic(boolean programmatic) {
        this.programmatic = programmatic;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FPMEvent{" +
                "eventType=" + eventType +
                ", programmatic=" + programmatic +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
