// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.s;
import com.google.android.apps.youtube.embeddedplayer.service.model.AdEventData;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import java.lang.ref.WeakReference;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.t;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.b;

public final class d implements b
{
    public c a;
    public final ConcurrentMap b;
    
    public d() {
        this((ConcurrentMap)new ConcurrentHashMap());
    }
    
    public d(final ConcurrentMap b) {
        this.b = b;
    }
    
    public final void a(final String s, final t t) {
        if (s != null && t != null) {
            this.b.put(s, new WeakReference(t));
        }
    }
    
    public final void b(final BusSupported$Data busSupported$Data) {
        synchronized (this) {
            if (busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.a) && busSupported$Data instanceof AdEventData) {
                final AdEventData adEventData = (AdEventData)busSupported$Data;
                final c a = this.a;
                if (a != null) {
                    a.a(adEventData.b());
                }
                final WeakReference weakReference = (WeakReference)this.b.get(adEventData.e());
                if (weakReference != null) {
                    final t t = (t)weakReference.get();
                    if (t != null) {
                        final int b = adEventData.b();
                        final int a2 = adEventData.a();
                        final int s = t.s;
                        final int n = s - 1;
                        if (s == 0) {
                            throw null;
                        }
                        if (n == 0) {
                            t.a.add(com.google.android.apps.youtube.embeddedplayer.service.jar.client.s.c(b, a2));
                            return;
                        }
                        if (n == 1) {
                            t.l(b, a2);
                            return;
                        }
                        if (n == 2) {
                            afse.p("Ad events are unauthorized");
                        }
                    }
                }
            }
        }
    }
    
    public final void d() {
    }
}
