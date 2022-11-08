// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class MediaSource
{
    private final aula a;
    private long b;
    
    public MediaSource(final long b) {
        this.a = new aula((Runnable)new aukp(b, 0));
        this.b = b;
    }
    
    private final void c() {
        if (this.b != 0L) {
            return;
        }
        throw new IllegalStateException("MediaSource has been disposed.");
    }
    
    private static native MediaSource$State nativeGetState(final long p0);
    
    public final long a() {
        this.c();
        return this.b;
    }
    
    public void b() {
        this.c();
        this.a.release();
        this.b = 0L;
    }
}
