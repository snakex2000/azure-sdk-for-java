// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetFilterInner;
import com.azure.resourcemanager.mediaservices.models.AssetFilter;
import com.azure.resourcemanager.mediaservices.models.FilterTrackSelection;
import com.azure.resourcemanager.mediaservices.models.FirstQuality;
import com.azure.resourcemanager.mediaservices.models.PresentationTimeRange;
import java.util.Collections;
import java.util.List;

public final class AssetFilterImpl implements AssetFilter, AssetFilter.Definition, AssetFilter.Update {
    private AssetFilterInner innerObject;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public PresentationTimeRange presentationTimeRange() {
        return this.innerModel().presentationTimeRange();
    }

    public FirstQuality firstQuality() {
        return this.innerModel().firstQuality();
    }

    public List<FilterTrackSelection> tracks() {
        List<FilterTrackSelection> inner = this.innerModel().tracks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AssetFilterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String assetName;

    private String filterName;

    public AssetFilterImpl withExistingAsset(String resourceGroupName, String accountName, String assetName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.assetName = assetName;
        return this;
    }

    public AssetFilter create() {
        this.innerObject = serviceManager.serviceClient()
            .getAssetFilters()
            .createOrUpdateWithResponse(resourceGroupName, accountName, assetName, filterName, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public AssetFilter create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAssetFilters()
            .createOrUpdateWithResponse(resourceGroupName, accountName, assetName, filterName, this.innerModel(),
                context)
            .getValue();
        return this;
    }

    AssetFilterImpl(String name, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = new AssetFilterInner();
        this.serviceManager = serviceManager;
        this.filterName = name;
    }

    public AssetFilterImpl update() {
        return this;
    }

    public AssetFilter apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAssetFilters()
            .updateWithResponse(resourceGroupName, accountName, assetName, filterName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public AssetFilter apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAssetFilters()
            .updateWithResponse(resourceGroupName, accountName, assetName, filterName, this.innerModel(), context)
            .getValue();
        return this;
    }

    AssetFilterImpl(AssetFilterInner innerObject,
        com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "mediaServices");
        this.assetName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "assets");
        this.filterName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "assetFilters");
    }

    public AssetFilter refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAssetFilters()
            .getWithResponse(resourceGroupName, accountName, assetName, filterName, Context.NONE)
            .getValue();
        return this;
    }

    public AssetFilter refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAssetFilters()
            .getWithResponse(resourceGroupName, accountName, assetName, filterName, context)
            .getValue();
        return this;
    }

    public AssetFilterImpl withPresentationTimeRange(PresentationTimeRange presentationTimeRange) {
        this.innerModel().withPresentationTimeRange(presentationTimeRange);
        return this;
    }

    public AssetFilterImpl withFirstQuality(FirstQuality firstQuality) {
        this.innerModel().withFirstQuality(firstQuality);
        return this;
    }

    public AssetFilterImpl withTracks(List<FilterTrackSelection> tracks) {
        this.innerModel().withTracks(tracks);
        return this;
    }
}
