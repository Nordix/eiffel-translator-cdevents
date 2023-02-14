package com.ericsson.event.translator.eiffel.models;

import com.ericsson.eiffel.semantics.events.EiffelArtifactCreatedEventData;
import com.ericsson.eiffel.semantics.events.Link;

import java.util.ArrayList;

public class EiffelArtifactCreatedEventParams {

    private EiffelArtifactCreatedEventData data = new EiffelArtifactCreatedEventData();

    private ArrayList<Link> links = new ArrayList<>();

    /**
     * @return data
     */
    public EiffelArtifactCreatedEventData getData() {
        return data;
    }

    /**
     * @param data
     */
    public void setData(EiffelArtifactCreatedEventData data) {
        this.data = data;
    }

    /**
     * @return links
     */
    public ArrayList<Link> getLinks() {
        return links;
    }

    /**
     * @param links
     */
    public void setLinks(ArrayList<Link> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "EiffelArtifactPublishedEventParams{" + "data=" + data + ", links=" + links + '}';
    }
}
