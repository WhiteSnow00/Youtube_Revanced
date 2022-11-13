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
    public anfu f;
    private final e g;
    private final vcy h;
    private final pvh i;
    
    public a(final e g, final vcy h, final pvh i, final byte[] array, final byte[] array2) {
        this.g = g;
        this.h = h;
        this.i = i;
        this.d = new SparseArray();
    }
    
    @Override
    public final void a(final int n) {
        if (this.f == null) {
            return;
        }
        final Object value = this.d.get(n);
        if (value != null && !(value instanceof anfu) && !(value instanceof anft)) {
            if (value instanceof anfv) {
                final anfv anfv = (anfv)value;
                final vcy h = this.h;
                aiqj aiqj;
                if ((aiqj = anfv.b) == null) {
                    aiqj = aiqj.a;
                }
                vcx.a(h, aiqj);
            }
        }
        else {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.starttime", TimeUnit.MILLISECONDS.toSeconds(this.e));
            final vcy h2 = this.h;
            aiqj aiqj2;
            if ((aiqj2 = this.f.c) == null) {
                aiqj2 = aiqj.a;
            }
            h2.c(aiqj2, (Map)hashMap);
        }
        if (value != null) {
            final boolean b = value instanceof anfu;
            byte[] array = null;
            if (b) {
                final anfu anfu = (anfu)value;
                if ((anfu.b & 0x20) != 0x0) {
                    array = anfu.f.I();
                }
            }
            else if (value instanceof anft) {
                final anft anft = (anft)value;
                if ((anft.b & 0x4) != 0x0) {
                    array = anft.d.I();
                }
            }
            else if (value instanceof anfv) {
                array = ((anfv)value).d.I();
            }
            if (array != null) {
                this.g.j(array);
            }
        }
        ((b)this.i.a).a(3);
    }
}
