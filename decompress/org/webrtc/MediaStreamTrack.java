// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

public class MediaStreamTrack
{
    private long a;
    
    public MediaStreamTrack(final long a) {
        if (a != 0L) {
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("nativeTrack may not be null");
    }
    
    static MediaStreamTrack c(final long n) {
        if (n == 0L) {
            return null;
        }
        final String nativeGetKind = nativeGetKind(n);
        if (nativeGetKind.equals("audio")) {
            return (MediaStreamTrack)new AudioTrack(n);
        }
        if (nativeGetKind.equals("video")) {
            return (MediaStreamTrack)new VideoTrack(n);
        }
        return null;
    }
    
    private final void g() {
        if (this.a != 0L) {
            return;
        }
        throw new IllegalStateException("MediaStreamTrack has been disposed.");
    }
    
    private static native boolean nativeGetEnabled(final long p0);
    
    private static native String nativeGetId(final long p0);
    
    private static native String nativeGetKind(final long p0);
    
    private static native MediaStreamTrack$State nativeGetState(final long p0);
    
    private static native boolean nativeSetEnabled(final long p0, final boolean p1);
    
    public final long a() {
        this.g();
        return this.a;
    }
    
    public final String b() {
        this.g();
        return nativeGetId(this.a);
    }
    
    public void d() {
        this.g();
        JniCommon.nativeReleaseRef(this.a);
        this.a = 0L;
    }
    
    public final boolean e() {
        this.g();
        return nativeGetEnabled(this.a);
    }
    
    public final boolean f(final boolean b) {
        this.g();
        return nativeSetEnabled(this.a, b);
    }
}
