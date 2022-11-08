// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e;
import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.g;

public final class a implements g
{
    public SelectableItemKey a;
    public SelectableItemKey b;
    public SelectableItemKey c;
    public final SparseArray d;
    public long e;
    public andq f;
    private final e g;
    private final vax h;
    private final qpt i;
    
    public a(final e g, final vax h, final qpt i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.g = g;
        this.h = h;
        this.i = i;
        this.d = new SparseArray();
    }
    
    public final void a(final int n) {
        if (this.f == null) {
            return;
        }
        final Object value = this.d.get(n);
        if (value != null && !(value instanceof andq) && !(value instanceof andp)) {
            if (value instanceof andr) {
                final andr andr = (andr)value;
                final vax h = this.h;
                aioe aioe;
                if ((aioe = andr.b) == null) {
                    aioe = aioe.a;
                }
                vaw.a(h, aioe);
            }
        }
        else {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.starttime", TimeUnit.MILLISECONDS.toSeconds(this.e));
            final vax h2 = this.h;
            aioe aioe2;
            if ((aioe2 = this.f.c) == null) {
                aioe2 = aioe.a;
            }
            h2.c(aioe2, (Map)hashMap);
        }
        if (value != null) {
            final boolean b = value instanceof andq;
            byte[] array = null;
            if (b) {
                final andq andq = (andq)value;
                if ((andq.b & 0x20) != 0x0) {
                    array = andq.f.I();
                }
            }
            else if (value instanceof andp) {
                final andp andp = (andp)value;
                if ((andp.b & 0x4) != 0x0) {
                    array = andp.d.I();
                }
            }
            else if (value instanceof andr) {
                array = ((andr)value).d.I();
            }
            if (array != null) {
                this.g.j(array);
            }
        }
        ((b)this.i.a).a(3);
    }
}
