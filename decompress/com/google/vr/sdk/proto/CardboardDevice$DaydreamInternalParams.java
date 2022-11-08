// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import java.util.List;
import com.google.protobuf.MessageLite;

public final class CardboardDevice$DaydreamInternalParams extends agzi implements ahax
{
    public static final int ALIGNMENT_MARKERS_FIELD_NUMBER = 2;
    public static final int CLAMP_DISTORTION_TO_MAXIMUM_FIELD_OF_VIEW_FIELD_NUMBER = 8;
    public static final int CLIP_FIELD_OF_VIEW_TO_DISPLAY_FIELD_NUMBER = 7;
    private static final CardboardDevice$DaydreamInternalParams DEFAULT_INSTANCE;
    public static final int DISABLE_VIGNETTE_FIELD_NUMBER = 9;
    public static final int DISTORTION_MESH_RESOLUTION_FIELD_NUMBER = 6;
    private static volatile ahbe PARSER;
    public static final int SENSOR_ORIENTATION_INDEPENDENT_OF_DISPLAY_FIELD_NUMBER = 4;
    public static final int SWAP_DISPLAYS_FIELD_NUMBER = 10;
    public static final int USE_ROTATIONAL_ALIGNMENT_CORRECTION_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int VIGNETTE_PARAMS_FIELD_NUMBER = 5;
    private agzy alignmentMarkers_;
    private int bitField0_;
    private boolean clampDistortionToMaximumFieldOfView_;
    private boolean clipFieldOfViewToDisplay_;
    private boolean disableVignette_;
    private int distortionMeshResolution_;
    private boolean sensorOrientationIndependentOfDisplay_;
    private boolean swapDisplays_;
    private boolean useRotationalAlignmentCorrection_;
    private int version_;
    private CardboardDevice$VignetteParams vignetteParams_;
    
    static {
        agzi.registerDefaultInstance((Class)CardboardDevice$DaydreamInternalParams.class, (agzi)(DEFAULT_INSTANCE = new CardboardDevice$DaydreamInternalParams()));
    }
    
    private CardboardDevice$DaydreamInternalParams() {
        this.alignmentMarkers_ = emptyProtobufList();
        this.distortionMeshResolution_ = 40;
        this.clipFieldOfViewToDisplay_ = true;
    }
    
    public static CardboardDevice$DaydreamInternalParams getDefaultInstance() {
        return CardboardDevice$DaydreamInternalParams.DEFAULT_INSTANCE;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe parser;
                if ((parser = CardboardDevice$DaydreamInternalParams.PARSER) == null) {
                    synchronized (CardboardDevice$DaydreamInternalParams.class) {
                        if (CardboardDevice$DaydreamInternalParams.PARSER == null) {
                            CardboardDevice$DaydreamInternalParams.PARSER = (ahbe)new agzb((agzi)CardboardDevice$DaydreamInternalParams.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return CardboardDevice$DaydreamInternalParams.DEFAULT_INSTANCE;
            }
            case 4: {
                return new CardboardDevice$DaydreamInternalParams$Builder(null);
            }
            case 3: {
                return new CardboardDevice$DaydreamInternalParams();
            }
            case 2: {
                return newMessageInfo((MessageLite)CardboardDevice$DaydreamInternalParams.DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u1007\u0001\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1004\u0004\u0007\u1007\u0005\b\u1007\u0006\t\u1007\u0007\n\u1007\b", new Object[] { "bitField0_", "version_", "alignmentMarkers_", CardboardDevice$ScreenAlignmentMarker.class, "useRotationalAlignmentCorrection_", "sensorOrientationIndependentOfDisplay_", "vignetteParams_", "distortionMeshResolution_", "clipFieldOfViewToDisplay_", "clampDistortionToMaximumFieldOfView_", "disableVignette_", "swapDisplays_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public int getAlignmentMarkersCount() {
        return this.alignmentMarkers_.size();
    }
    
    public List getAlignmentMarkersList() {
        return this.alignmentMarkers_;
    }
    
    public boolean getUseRotationalAlignmentCorrection() {
        return this.useRotationalAlignmentCorrection_;
    }
}
