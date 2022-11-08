// 
// Decompiled by Procyon v0.6.0
// 

package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.util.List;

class NativeInterpreterWrapper implements AutoCloseable
{
    private long inferenceDurationNanoseconds;
    
    private static native long allocateTensors(final long p0, final long p1);
    
    private static native void allowBufferHandleOutput(final long p0, final boolean p1);
    
    private static native void allowFp16PrecisionForFp32(final long p0, final boolean p1);
    
    private static native long createCancellationFlag(final long p0);
    
    private static native long createErrorReporter(final int p0);
    
    private static native long createInterpreter(final long p0, final long p1, final int p2, final boolean p3, final List p4);
    
    private static native long createModel(final String p0, final long p1);
    
    private static native long createModelWithBuffer(final ByteBuffer p0, final long p1);
    
    private static native void delete(final long p0, final long p1, final long p2);
    
    private static native long deleteCancellationFlag(final long p0);
    
    private static native int getExecutionPlanLength(final long p0);
    
    private static native int getInputCount(final long p0);
    
    private static native String[] getInputNames(final long p0);
    
    private static native int getInputTensorIndex(final long p0, final int p1);
    
    private static native int getOutputCount(final long p0);
    
    private static native String[] getOutputNames(final long p0);
    
    private static native int getOutputTensorIndex(final long p0, final int p1);
    
    private static native String[] getSignatureKeys(final long p0);
    
    private static native boolean hasUnresolvedFlexOp(final long p0);
    
    private static native boolean resizeInput(final long p0, final long p1, final int p2, final int[] p3, final boolean p4);
    
    private static native void run(final long p0, final long p1);
    
    private static native void setCancelled(final long p0, final long p1, final boolean p2);
    
    @Override
    public final void close() {
        throw null;
    }
}
