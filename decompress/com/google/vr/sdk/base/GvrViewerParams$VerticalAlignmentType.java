// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import android.util.Log;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams$VerticalAlignmentType;

public enum GvrViewerParams$VerticalAlignmentType
{
    private static final GvrViewerParams$VerticalAlignmentType[] $VALUES;
    
    BOTTOM("BOTTOM", 0, CardboardDevice$DeviceParams$VerticalAlignmentType.BOTTOM), 
    CENTER("CENTER", 1, CardboardDevice$DeviceParams$VerticalAlignmentType.CENTER), 
    TOP("TOP", 2, CardboardDevice$DeviceParams$VerticalAlignmentType.TOP);
    
    private final CardboardDevice$DeviceParams$VerticalAlignmentType protoValue;
    
    private static GvrViewerParams$VerticalAlignmentType[] $values() {
        return new GvrViewerParams$VerticalAlignmentType[] { GvrViewerParams$VerticalAlignmentType.BOTTOM, GvrViewerParams$VerticalAlignmentType.CENTER, GvrViewerParams$VerticalAlignmentType.TOP };
    }
    
    static {
        $VALUES = $values();
    }
    
    private GvrViewerParams$VerticalAlignmentType(final String s, final int n, final CardboardDevice$DeviceParams$VerticalAlignmentType protoValue) {
        this.protoValue = protoValue;
    }
    
    static GvrViewerParams$VerticalAlignmentType fromProtoValue(final CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType) {
        for (final GvrViewerParams$VerticalAlignmentType gvrViewerParams$VerticalAlignmentType : values()) {
            if (gvrViewerParams$VerticalAlignmentType.protoValue == cardboardDevice$DeviceParams$VerticalAlignmentType) {
                return gvrViewerParams$VerticalAlignmentType;
            }
        }
        Log.e("GvrViewerParams", String.format("Unknown alignment type from proto: %d", cardboardDevice$DeviceParams$VerticalAlignmentType.getNumber()));
        return GvrViewerParams$VerticalAlignmentType.BOTTOM;
    }
    
    public CardboardDevice$DeviceParams$VerticalAlignmentType toProtoValue() {
        return this.protoValue;
    }
}
