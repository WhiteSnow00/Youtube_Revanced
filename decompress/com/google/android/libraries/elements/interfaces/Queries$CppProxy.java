// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import com.youtube.android.libraries.elements.StatusOr;
import com.google.android.libraries.blocks.Container;
import java.util.concurrent.atomic.AtomicBoolean;

final class Queries$CppProxy extends Queries
{
    private final AtomicBoolean destroyed;
    private final long nativeRef;
    
    private Queries$CppProxy(final long nativeRef) {
        this.destroyed = new AtomicBoolean(false);
        if (nativeRef != 0L) {
            this.nativeRef = nativeRef;
            return;
        }
        throw new RuntimeException("nativeRef is zero");
    }
    
    public static native StatusOr createByteStoreBlock(final Container p0, final ByteStore p1);
    
    public static native StatusOr createEnvironmentDataBlock(final Container p0, final EnvironmentDataSource p1);
    
    private native void nativeDestroy(final long p0);
    
    public static native Status registerProcessors(final Container p0, final byte[] p1, final EntitiesProcessorResolver p2);
    
    public void _djinni_private_destroy() {
        if (!this.destroyed.getAndSet(true)) {
            this.nativeDestroy(this.nativeRef);
        }
    }
    
    @Override
    protected void finalize() {
        this._djinni_private_destroy();
        super.finalize();
    }
}
