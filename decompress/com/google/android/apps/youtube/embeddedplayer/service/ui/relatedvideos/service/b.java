// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service;

import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e;
import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.model.g;

public final class b implements g
{
    public static int a = 1;
    public int b;
    public final SparseArray c;
    private final e d;
    private final vax e;
    
    public b(final e d, final vax e) {
        this.d = d;
        this.e = e;
        this.c = new SparseArray();
    }
    
    public final void a(final int n) {
        final ajmo ajmo = (ajmo)this.c.get(n);
        if (ajmo == null) {
            return;
        }
        this.d.j(ajmo.k.I());
        final vax e = this.e;
        aioe aioe;
        if ((aioe = ajmo.j) == null) {
            aioe = aioe.a;
        }
        vaw.a(e, aioe);
    }
}
