// 
// Decompiled by Procyon v0.6.0
// 

package androidx.camera.core;

import android.view.Surface;
import java.nio.ByteBuffer;

public final class ImageProcessingUtil
{
    static {
        System.loadLibrary("image_processing_util_jni");
    }
    
    private ImageProcessingUtil() {
    }
    
    private static native int nativeConvertAndroid420ToABGR(final ByteBuffer p0, final int p1, final ByteBuffer p2, final int p3, final ByteBuffer p4, final int p5, final int p6, final int p7, final Surface p8, final ByteBuffer p9, final int p10, final int p11, final int p12, final int p13, final int p14, final int p15);
    
    private static native int nativeRotateYUV(final ByteBuffer p0, final int p1, final ByteBuffer p2, final int p3, final ByteBuffer p4, final int p5, final int p6, final ByteBuffer p7, final int p8, final int p9, final ByteBuffer p10, final int p11, final int p12, final ByteBuffer p13, final int p14, final int p15, final ByteBuffer p16, final ByteBuffer p17, final ByteBuffer p18, final int p19, final int p20, final int p21);
    
    private static native int nativeShiftPixel(final ByteBuffer p0, final int p1, final ByteBuffer p2, final int p3, final ByteBuffer p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10, final int p11, final int p12);
    
    private static native int nativeWriteJpegToSurface(final byte[] p0, final Surface p1);
}
