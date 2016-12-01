package com.bignerdranch.android.storycards;

import java.util.UUID;

public class Story {
    private UUID mUuid;
    private String mName;
    private String mDescription;

    private Story mStoryInstance = new Story();

    private Story() {
        mUuid = UUID.randomUUID();
    }

    public Story getInstance() {
        return mStoryInstance;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getName() {

        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public UUID getUuid() {

        return mUuid;
    }
}
