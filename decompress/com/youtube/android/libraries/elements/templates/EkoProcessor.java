// 
// Decompiled by Procyon v0.6.0
// 

package com.youtube.android.libraries.elements.templates;

import io.grpc.Status;

public final class EkoProcessor
{
    static {
        ogh.a();
    }
    
    private EkoProcessor() {
    }
    
    public static aseo a(final byte[] array, final byte[] array2, final boolean b) {
        final byte[][] array3 = { null, null };
        final Status nativeProcess = nativeProcess(array, array2, b, array3);
        if (nativeProcess.f()) {
            return new aseo(nativeProcess, array3[0]);
        }
        return new aseo(nativeProcess, null);
    }
    
    private static native Status nativeProcess(final byte[] p0, final byte[] p1, final boolean p2, final byte[][] p3);
}
