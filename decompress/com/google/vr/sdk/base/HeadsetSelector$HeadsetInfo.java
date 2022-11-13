// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import com.google.vr.sdk.proto.CardboardDevice$DeviceParams$Builder;
import com.google.vr.ndk.base.DaydreamUtils;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;

public final class HeadsetSelector$HeadsetInfo
{
    private final boolean cardboardViewer;
    private final CardboardDevice$DeviceParams deviceParam;
    private final String displayName;
    private final String uniqueKey;
    
    static /* bridge */ CardboardDevice$DeviceParams -$$Nest$fgetdeviceParam(final HeadsetSelector$HeadsetInfo headsetSelector$HeadsetInfo) {
        return headsetSelector$HeadsetInfo.deviceParam;
    }
    
    static /* bridge */ boolean -$$Nest$mequalsDeviceParam(final HeadsetSelector$HeadsetInfo headsetSelector$HeadsetInfo, final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        return headsetSelector$HeadsetInfo.equalsDeviceParam(cardboardDevice$DeviceParams);
    }
    
    private HeadsetSelector$HeadsetInfo(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        this(cardboardDevice$DeviceParams, DaydreamUtils.getDeviceParamsDisplayedName(cardboardDevice$DeviceParams), DaydreamUtils.isDaydreamViewer(cardboardDevice$DeviceParams) ^ true);
    }
    
    public HeadsetSelector$HeadsetInfo(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams, final HeadsetSelector$HeadsetInfo-IA headsetSelector$HeadsetInfo-IA) {
        this(cardboardDevice$DeviceParams);
    }
    
    private HeadsetSelector$HeadsetInfo(final CardboardDevice$DeviceParams deviceParam, final String displayName, final boolean cardboardViewer) {
        this.deviceParam = deviceParam;
        this.uniqueKey = HeadsetSelector.-$$Nest$smgetHeadsetParamsKey(deviceParam);
        this.displayName = displayName;
        this.cardboardViewer = cardboardViewer;
    }
    
    private boolean equalsDeviceParam(final CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        return this.uniqueKey.equalsIgnoreCase(HeadsetSelector.-$$Nest$smgetHeadsetParamsKey(cardboardDevice$DeviceParams));
    }
    
    public static HeadsetSelector$HeadsetInfo newInstance(final String s, final String s2, final String s3, final boolean b) {
        final CardboardDevice$DeviceParams$Builder builder = CardboardDevice$DeviceParams.newBuilder();
        builder.setVendor("Samsung");
        builder.setModel("Gear VR");
        return new HeadsetSelector$HeadsetInfo((CardboardDevice$DeviceParams)builder.build(), "Samsung Gear VR", false);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof HeadsetSelector$HeadsetInfo && this.uniqueKey.equalsIgnoreCase(((HeadsetSelector$HeadsetInfo)o).uniqueKey));
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    @Override
    public int hashCode() {
        return this.uniqueKey.hashCode();
    }
    
    public boolean isCardboardViewer() {
        return this.cardboardViewer;
    }
}
