// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class MediaStream
{
    public final List a;
    public final List b;
    public final List c;
    public long d;
    
    public MediaStream(final long d) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = d;
    }
    
    private static void d(final List list, final long n) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final MediaStreamTrack mediaStreamTrack = (MediaStreamTrack)iterator.next();
            if (mediaStreamTrack.a() == n) {
                mediaStreamTrack.d();
                iterator.remove();
                return;
            }
        }
        Logging.b("MediaStream", "Couldn't not find track");
    }
    
    public static native boolean nativeAddAudioTrackToNativeStream(final long p0, final long p1);
    
    public static native boolean nativeAddVideoTrackToNativeStream(final long p0, final long p1);
    
    private static native String nativeGetId(final long p0);
    
    private static native boolean nativeRemoveAudioTrack(final long p0, final long p1);
    
    private static native boolean nativeRemoveVideoTrack(final long p0, final long p1);
    
    public final String a() {
        this.b();
        return nativeGetId(this.d);
    }
    
    void addNativeAudioTrack(final long n) {
        this.a.add(new AudioTrack(n));
    }
    
    void addNativeVideoTrack(final long n) {
        this.b.add(new VideoTrack(n));
    }
    
    public final void b() {
        if (this.d != 0L) {
            return;
        }
        throw new IllegalStateException("MediaStream has been disposed.");
    }
    
    public final void c(final VideoTrack videoTrack) {
        this.b();
        this.b.remove(videoTrack);
        this.c.remove(videoTrack);
        nativeRemoveVideoTrack(this.d, ((MediaStreamTrack)videoTrack).a());
    }
    
    public void dispose() {
        this.b();
        while (!this.a.isEmpty()) {
            final AudioTrack audioTrack = this.a.get(0);
            this.b();
            this.a.remove(audioTrack);
            nativeRemoveAudioTrack(this.d, ((MediaStreamTrack)audioTrack).a());
            ((MediaStreamTrack)audioTrack).d();
        }
        while (!this.b.isEmpty()) {
            final VideoTrack videoTrack = this.b.get(0);
            this.c(videoTrack);
            ((MediaStreamTrack)videoTrack).d();
        }
        while (!this.c.isEmpty()) {
            this.c(this.c.get(0));
        }
        JniCommon.nativeReleaseRef(this.d);
        this.d = 0L;
    }
    
    void removeAudioTrack(final long n) {
        d(this.a, n);
    }
    
    void removeVideoTrack(final long n) {
        d(this.b, n);
    }
    
    @Override
    public final String toString() {
        final String a = this.a();
        final int size = this.a.size();
        final int size2 = this.b.size();
        final StringBuilder sb = new StringBuilder("[");
        sb.append(a);
        sb.append(":A=");
        sb.append(size);
        sb.append(":V=");
        sb.append(size2);
        sb.append("]");
        return sb.toString();
    }
}
