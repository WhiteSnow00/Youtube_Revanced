// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import java.util.Map;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.WeakHashMap;

public final class ReelWatchActivityLifecycleObserver implements aua
{
    private final vcy a;
    private final fzw b;
    private final fzw c;
    
    public ReelWatchActivityLifecycleObserver(final fzw c, final fzw b, final vcy a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        for (final Runnable runnable : ((WeakHashMap)this.c.a).values()) {
            if (runnable != null) {
                runnable.run();
            }
        }
        final fzw b = this.b;
        final vcy a = this.a;
        for (final kmi kmi : ((Map<K, kmi>)b.a).values()) {
            final Object c = kmi.c;
            if (kmi.a && c != null) {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)c;
                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x80000) == 0x0) {
                    continue;
                }
                aiqj aiqj;
                if ((aiqj = reelWatchEndpointOuterClass$ReelWatchEndpoint.s) == null) {
                    aiqj = aiqj.a;
                }
                a.a(aiqj);
                kmi.a = false;
            }
        }
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
