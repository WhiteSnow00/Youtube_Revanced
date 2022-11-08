// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.AutoValue_ShareButtonData;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model.ShareButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d;

public final class a implements d, tec
{
    public aibb a;
    public String b;
    public String c;
    private final e e;
    private final Context f;
    private b g;
    private ShareButtonData h;
    private boolean i;
    private int j;
    private int k;
    
    private a(final e e, final Context f) {
        this.a = aibb.a;
        this.g = com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b.S;
        this.h = ShareButtonData.b;
        this.b = "";
        this.c = "";
        this.j = -1;
        this.k = 0;
        this.e = e;
        this.f = f;
    }
    
    public static a b(final e e, final Context context) {
        return new a(e, context);
    }
    
    public final int a() {
        synchronized (this) {
            return this.k;
        }
    }
    
    public final void c(final aibb aibb, final b g, final String b, final String c, final boolean i, int j) {
        monitorenter(this);
        aibb a = aibb;
        Label_0014: {
            if (aibb != null) {
                break Label_0014;
            }
            try {
                a = aibb.a;
                this.a = a;
                g.getClass();
                this.g = g;
                this.b = b;
                this.c = c;
                this.i = i;
                this.j = j;
                agyc agyc = agyc.b;
                final aibb a2 = this.a;
                j = a2.b;
                if ((j & 0x200) != 0x0 && (j & 0x40) != 0x0) {
                    final boolean h = a2.h;
                    j = 1;
                    if (!h) {
                        j = 2;
                    }
                    agyc = a2.w;
                    this.d(j);
                }
                else {
                    this.d(0);
                }
                j = this.a();
                final aeaf c2 = ShareButtonData.c();
                c2.l(j);
                c2.m(agyc);
                final ShareButtonData k = c2.k();
                this.h = k;
                this.g.ra(k);
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void d(final int k) {
        synchronized (this) {
            this.k = k;
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final PlayerResponseModel b = ((aaly)o).b();
                if (b != null) {
                    this.b = b.K();
                    this.c = b.J();
                    return null;
                }
                array2 = array;
            }
            else {
                final WatchNextResponseModel a = ((aalo)o).a();
                if (a != null) {
                    final aneh i = a.i;
                    if (i != null) {
                        anei anei;
                        if ((anei = i.f) == null) {
                            anei = anei.a;
                        }
                        if ((anei.b & 0x1) != 0x0) {
                            anei anei2;
                            if ((anei2 = i.f) == null) {
                                anei2 = anei.a;
                            }
                            aibb a2;
                            if ((a2 = anei2.c) == null) {
                                a2 = aibb.a;
                            }
                            this.a = a2;
                            this.d(2);
                            array2 = array;
                            return array2;
                        }
                        this.a = aibb.a;
                        this.d(0);
                        array2 = array;
                        return array2;
                    }
                }
                this.a = aibb.a;
                this.d(0);
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { aalo.class, aaly.class };
        }
        return array2;
    }
    
    public final void t() {
        synchronized (this) {
            if (this.a() != 2 || this.b.isEmpty()) {
                return;
            }
            final Uri cf = tmy.cF(this.b);
            final Context f = this.f;
            final Intent aj = tmy.aj(f, this.c, cf);
            if (aj != null) {
                f.startActivity(aj);
            }
            else {
                trn.l("Share video error: null watch uri");
            }
            if (this.i) {
                this.e.l(this.j, ((AutoValue_ShareButtonData)this.h).a.I());
                return;
            }
            this.e.j(((AutoValue_ShareButtonData)this.h).a.I());
        }
    }
    
    public final void u() {
        synchronized (this) {
            if (this.a() != 2) {
                zjp.b(zjo.b, zjn.d, "Share button renderer not received.");
                return;
            }
            if (this.i) {
                this.e.s(this.j, ((AutoValue_ShareButtonData)this.h).a.I());
                return;
            }
            this.e.q(((AutoValue_ShareButtonData)this.h).a.I());
        }
    }
}
