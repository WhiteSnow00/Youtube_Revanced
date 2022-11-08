// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

import java.nio.FloatBuffer;
import java.nio.ByteBuffer;

public class PacketCreator
{
    public Graph a;
    
    public PacketCreator(final Graph a) {
        this.a = a;
    }
    
    private native long nativeCreateBool(final long p0, final boolean p1);
    
    private native long nativeCreateCalculatorOptions(final long p0, final byte[] p1);
    
    private native long nativeCreateCameraIntrinsics(final long p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6);
    
    private native long nativeCreateCpuImage(final long p0, final ByteBuffer p1, final int p2, final int p3, final int p4);
    
    private native long nativeCreateFloat32(final long p0, final float p1);
    
    private native long nativeCreateFloat32Array(final long p0, final float[] p1);
    
    private native long nativeCreateFloat32Vector(final long p0, final float[] p1);
    
    private native long nativeCreateFloat64(final long p0, final double p1);
    
    private native long nativeCreateFloatImageFrame(final long p0, final FloatBuffer p1, final int p2, final int p3);
    
    private native long nativeCreateGpuBuffer(final long p0, final int p1, final int p2, final int p3, final TextureReleaseCallback p4);
    
    private native long nativeCreateGpuImage(final long p0, final int p1, final int p2, final int p3, final TextureReleaseCallback p4);
    
    private native long nativeCreateGrayscaleImage(final long p0, final ByteBuffer p1, final int p2, final int p3);
    
    private native long nativeCreateInt16(final long p0, final short p1);
    
    private native long nativeCreateInt32(final long p0, final int p1);
    
    private native long nativeCreateInt32Array(final long p0, final int[] p1);
    
    private native long nativeCreateInt64(final long p0, final long p1);
    
    private native long nativeCreateMatrix(final long p0, final int p1, final int p2, final float[] p3);
    
    private native long nativeCreateProto(final long p0, final ProtoUtil$SerializedMessage p1);
    
    private native long nativeCreateReferencePacket(final long p0, final long p1);
    
    private native long nativeCreateRgbImage(final long p0, final ByteBuffer p1, final int p2, final int p3);
    
    private native long nativeCreateRgbImageFromRgba(final long p0, final ByteBuffer p1, final int p2, final int p3);
    
    private native long nativeCreateRgbaImageFrame(final long p0, final ByteBuffer p1, final int p2, final int p3);
    
    private native long nativeCreateString(final long p0, final String p1);
    
    private native long nativeCreateTimeSeriesHeader(final long p0, final int p1, final double p2);
    
    private native long nativeCreateVideoHeader(final long p0, final int p1, final int p2);
    
    private void releaseWithSyncToken(final long n, final TextureReleaseCallback textureReleaseCallback) {
        textureReleaseCallback.release(new GraphGlSyncToken(n));
    }
    
    public final Packet a(final TextureFrame textureFrame) {
        return Packet.create(this.nativeCreateGpuBuffer(this.a.a(), textureFrame.getTextureName(), textureFrame.getWidth(), textureFrame.getHeight(), textureFrame));
    }
    
    public final Packet b(final String s) {
        return Packet.create(this.nativeCreateString(this.a.a(), s));
    }
    
    public native long nativeCreateAudioPacket(final long p0, final byte[] p1, final int p2, final int p3, final int p4);
    
    public native long nativeCreateAudioPacketDirect(final long p0, final ByteBuffer p1, final int p2, final int p3);
    
    public native long nativeCreateStringFromByteArray(final long p0, final byte[] p1);
}
