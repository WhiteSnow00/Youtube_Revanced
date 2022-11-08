// 
// Decompiled by Procyon v0.6.0
// 

package com.youtube.android.libraries.elements.templates;

import io.grpc.Status;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.blocks.Container;
import java.util.concurrent.atomic.AtomicBoolean;

public class UnifiedTemplateResolver
{
    public static final byte[] a;
    private static final AtomicBoolean d;
    public final boolean b;
    public final int c;
    
    static {
        ogh.a();
        a = new byte[0];
        d = new AtomicBoolean(false);
    }
    
    public UnifiedTemplateResolver() {
        this(null, false, null, null, false, 0);
    }
    
    public UnifiedTemplateResolver(final Container container, final boolean b, final String s, final DebuggerClient debuggerClient, final boolean b2, final int c) {
        this.b = b2;
        this.c = c;
        if (UnifiedTemplateResolver.d.compareAndSet(false, true)) {
            String s2;
            if ((s2 = s) == null) {
                s2 = "localhost:5001";
            }
            this.jni_init(b, debuggerClient, s2);
            if (container != null) {
                this.jni_setBlocksContainer(container);
            }
        }
    }
    
    private native void jni_init(final boolean p0, final DebuggerClient p1, final String p2);
    
    private native void jni_setBlocksContainer(final Container p0);
    
    public native Status jni_resolveFlat(final byte[] p0, final byte[] p1, final int p2, final int p3, final byte[] p4, final String p5, final boolean p6, final int p7, final byte[][] p8, final long[] p9);
    
    public native Status jni_setTemplateConfig(final String p0, final byte[] p1);
}
