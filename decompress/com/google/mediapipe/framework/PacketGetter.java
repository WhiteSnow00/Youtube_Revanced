// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

import java.nio.ByteBuffer;

public final class PacketGetter
{
    private PacketGetter() {
    }
    
    public static GraphTextureFrame a(final Packet packet) {
        return new GraphTextureFrame(nativeGetGpuBuffer(packet.getNativeHandle(), true), packet.a());
    }
    
    public static native byte[] nativeGetAudioData(final long p0);
    
    private static native boolean nativeGetBool(final long p0);
    
    private static native byte[] nativeGetBytes(final long p0);
    
    private static native float nativeGetFloat32(final long p0);
    
    private static native float[] nativeGetFloat32Vector(final long p0);
    
    private static native double nativeGetFloat64(final long p0);
    
    private static native double[] nativeGetFloat64Vector(final long p0);
    
    private static native long nativeGetGpuBuffer(final long p0, final boolean p1);
    
    private static native int nativeGetGpuBufferName(final long p0);
    
    public static native boolean nativeGetImageData(final long p0, final ByteBuffer p1);
    
    public static native int nativeGetImageHeight(final long p0);
    
    public static native int nativeGetImageWidth(final long p0);
    
    private static native short nativeGetInt16(final long p0);
    
    private static native short[] nativeGetInt16Vector(final long p0);
    
    private static native int nativeGetInt32(final long p0);
    
    private static native int[] nativeGetInt32Vector(final long p0);
    
    private static native long nativeGetInt64(final long p0);
    
    private static native long[] nativeGetInt64Vector(final long p0);
    
    private static native int nativeGetMatrixCols(final long p0);
    
    private static native float[] nativeGetMatrixData(final long p0);
    
    public static native int nativeGetMatrixRows(final long p0);
    
    private static native long nativeGetPacketFromReference(final long p0);
    
    private static native long[] nativeGetPairPackets(final long p0);
    
    private static native void nativeGetProto(final long p0, final ProtoUtil$SerializedMessage p1);
    
    public static native byte[] nativeGetProtoBytes(final long p0);
    
    private static native byte[][] nativeGetProtoVector(final long p0);
    
    private static native boolean nativeGetRgbaFromRgb(final long p0, final ByteBuffer p1);
    
    private static native String nativeGetString(final long p0);
    
    private static native int nativeGetTimeSeriesHeaderNumChannels(final long p0);
    
    private static native double nativeGetTimeSeriesHeaderSampleRate(final long p0);
    
    private static native long[] nativeGetVectorPackets(final long p0);
    
    private static native int nativeGetVideoHeaderHeight(final long p0);
    
    private static native int nativeGetVideoHeaderWidth(final long p0);
}
