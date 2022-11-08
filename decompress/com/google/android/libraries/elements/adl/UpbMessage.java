// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.adl;

import java.nio.ByteBuffer;

public final class UpbMessage
{
    private native void jniClearField(final long p0, final int p1);
    
    private native boolean jniCopyFrom(final long p0, final long p1);
    
    private native void jniDecode(final long p0, final byte[] p1, final int p2, final int p3);
    
    private native void jniDecodeDirect(final long p0, final ByteBuffer p1, final int p2, final int p3);
    
    private native void jniDeleteInstance(final long p0);
    
    private native byte[] jniEncode(final long p0);
    
    private native boolean jniGetBool(final long p0, final int p1);
    
    private native byte[] jniGetBytes(final long p0, final int p1);
    
    private native double jniGetDouble(final long p0, final int p1);
    
    private native int jniGetEnum(final long p0, final int p1);
    
    private native long jniGetExtension(final long p0, final int p1, final String p2, final long p3);
    
    private native int jniGetFixed32(final long p0, final int p1);
    
    private native float jniGetFloat(final long p0, final int p1);
    
    private native int jniGetInt32(final long p0, final int p1);
    
    private native long jniGetInt64(final long p0, final int p1, final int p2);
    
    private native long jniGetMessage(final long p0, final int p1);
    
    private native byte[][] jniGetRepeatedBytes(final long p0, final int p1);
    
    private native double[] jniGetRepeatedDouble(final long p0, final int p1);
    
    private native float[] jniGetRepeatedFloat(final long p0, final int p1);
    
    private native int[] jniGetRepeatedInt32(final long p0, final int p1, final int p2);
    
    private native long[] jniGetRepeatedInt64(final long p0, final int p1, final int p2);
    
    private native long[] jniGetRepeatedMessage(final long p0, final int p1);
    
    private native int[] jniGetRepeatedUInt32(final long p0, final int p1, final int p2);
    
    private native long[] jniGetRepeatedUInt64(final long p0, final int p1, final int p2);
    
    private native int jniGetSFixed32(final long p0, final int p1);
    
    private native int jniGetSInt32(final long p0, final int p1);
    
    private native int jniGetUInt32(final long p0, final int p1);
    
    private native long jniGetUInt64(final long p0, final int p1, final int p2);
    
    private native boolean jniHasField(final long p0, final int p1);
    
    private native void jniSetBool(final long p0, final int p1, final boolean p2);
    
    private native void jniSetBytes(final long p0, final int p1, final byte[] p2, final int p3, final int p4);
    
    private native void jniSetDouble(final long p0, final int p1, final double p2);
    
    private native void jniSetEnum(final long p0, final int p1, final int p2);
    
    private native void jniSetFixed32(final long p0, final int p1, final int p2);
    
    private native void jniSetFloat(final long p0, final int p1, final float p2);
    
    private native void jniSetInt32(final long p0, final int p1, final int p2);
    
    private native void jniSetInt64(final long p0, final int p1, final long p2, final int p3);
    
    private native void jniSetMessage(final long p0, final int p1, final long p2);
    
    private native void jniSetRepeatedBytes(final long p0, final int p1, final byte[][] p2);
    
    private native void jniSetRepeatedDouble(final long p0, final int p1, final double[] p2);
    
    private native void jniSetRepeatedFloat(final long p0, final int p1, final float[] p2);
    
    private native void jniSetRepeatedInt32(final long p0, final int p1, final int[] p2, final int p3);
    
    private native void jniSetRepeatedInt64(final long p0, final int p1, final long[] p2, final int p3);
    
    private native void jniSetRepeatedMessage(final long p0, final int p1, final long[] p2);
    
    private native void jniSetRepeatedUInt32(final long p0, final int p1, final int[] p2, final int p3);
    
    private native void jniSetRepeatedUInt64(final long p0, final int p1, final long[] p2, final int p3);
    
    private native void jniSetSFixed32(final long p0, final int p1, final int p2);
    
    private native void jniSetSInt32(final long p0, final int p1, final int p2);
    
    private native void jniSetUInt32(final long p0, final int p1, final int p2);
    
    private native void jniSetUInt64(final long p0, final int p1, final long p2, final int p3);
    
    @Override
    protected final void finalize() {
        this.jniDeleteInstance(0L);
        super.finalize();
    }
}
