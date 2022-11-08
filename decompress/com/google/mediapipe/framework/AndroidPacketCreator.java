// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

import android.graphics.Bitmap;

public class AndroidPacketCreator extends PacketCreator
{
    public AndroidPacketCreator(final Graph graph) {
        super(graph);
    }
    
    private native long nativeCreateRgbImageFrame(final long p0, final Bitmap p1);
    
    private native long nativeCreateRgbaImage(final long p0, final Bitmap p1);
    
    public native long nativeCreateRgbaImageFrame(final long p0, final Bitmap p1);
}
