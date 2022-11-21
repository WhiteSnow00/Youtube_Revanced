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
    public anib f;
    private final e g;
    private final veh h;
    private final oqz i;
    
    public a(final e g, final veh h, final oqz i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
        if (value != null && !(value instanceof anib) && !(value instanceof ania)) {
            if (value instanceof anic) {
                final anic anic = (anic)value;
                final veh h = this.h;
                aisc aisc;
                if ((aisc = anic.b) == null) {
                    aisc = aisc.a;
                }
                veg.a(h, aisc);
            }
        }
        else {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.starttime", TimeUnit.MILLISECONDS.toSeconds(this.e));
            final veh h2 = this.h;
            aisc aisc2;
            if ((aisc2 = this.f.c) == null) {
                aisc2 = aisc.a;
            }
            h2.c(aisc2, (Map)hashMap);
        }
        if (value != null) {
            final boolean b = value instanceof anib;
            byte[] array = null;
            if (b) {
                final anib anib = (anib)value;
                if ((anib.b & 0x20) != 0x0) {
                    array = anib.f.I();
                }
            }
            else if (value instanceof ania) {
                final ania ania = (ania)value;
                if ((ania.b & 0x4) != 0x0) {
                    array = ania.d.I();
                }
            }
            else if (value instanceof anic) {
                array = ((anic)value).d.I();
            }
            if (array != null) {
                this.g.j(array);
            }
        }
        ((b)this.i.a).a(3);
    }
}
