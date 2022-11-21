// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.text.Spanned;
import java.util.Iterator;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
import java.util.ArrayList;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideosScreen;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.e;

public final class c implements thj
{
    public abll a;
    public aapt b;
    public aniy c;
    public final atmj d;
    public final aslm e;
    public final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.c f;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c g;
    public final a h;
    public final b i;
    public final e j;
    public final mbb k;
    private MutedAutoplayState l;
    private final ema m;
    
    public c(final e j, final veh veh, final mbb k, final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.c f, final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c g, final ema m, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = atmj.aW((Object)false);
        this.e = new aslm();
        this.j = j;
        this.k = k;
        this.f = f;
        this.g = g;
        this.m = m;
        this.h = new a();
        this.i = new b(j, veh);
    }
    
    private final boolean g() {
        final aniy c = this.c;
        return c != null && c.d.size() > 0;
    }
    
    private final boolean h() {
        final abll a = this.a;
        return a != null && a.a(abll.j);
    }
    
    private final boolean i() {
        final MutedAutoplayState l = this.l;
        return l != null && l.g != 4;
    }
    
    public final void a() {
        this.m.w((BusSupported$Data)RelatedVideosScreen.a);
    }
    
    public final void b(final MutedAutoplayState l) {
        this.l = l;
        this.f();
        this.d();
    }
    
    public final void c() {
        final ema m = this.m;
        final aniy c = this.c;
        Object b;
        if (c != null && (c.c & 0x1) != 0x0) {
            ajws ajws;
            if ((ajws = c.f) == null) {
                ajws = ajws.a;
            }
            b = acbu.b(ajws);
        }
        else {
            b = "";
        }
        this.h.a();
        final ArrayList list = new ArrayList();
        final aniy c2 = this.c;
        if (c2 != null) {
            for (final anja anja : c2.d) {
                if ((anja.b & 0x1) != 0x0) {
                    ajqs ajqs;
                    if ((ajqs = anja.c) == null) {
                        ajqs = ajqs.a;
                    }
                    Object v = null;
                    final ahbt ahbt = null;
                    if (ajqs != null) {
                        final a h = this.h;
                        aowb aowb;
                        if ((aowb = ajqs.d) == null) {
                            aowb = aowb.a;
                        }
                        final int a = com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a.a;
                        com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a.a = a + 1;
                        h.c.append(a, (Object)aamz.N(aowb));
                        final BitmapKey bitmapKey = new BitmapKey(h.b, a);
                        final b i = this.i;
                        final int a2 = com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b.a;
                        com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b.a = a2 + 1;
                        i.c.append(a2, (Object)ajqs);
                        final SelectableItemKey selectableItemKey = new SelectableItemKey(i.b, a2);
                        final RelatedVideoItem a3 = RelatedVideoItem.a;
                        final String c3 = ajqs.c;
                        ajws ajws2;
                        if ((ajqs.b & 0x8) != 0x0) {
                            if ((ajws2 = ajqs.f) == null) {
                                ajws2 = ajws.a;
                            }
                        }
                        else {
                            ajws2 = null;
                        }
                        final Spanned b2 = acbu.b(ajws2);
                        ajws ajws3;
                        if ((ajqs.b & 0x20) != 0x0) {
                            if ((ajws3 = ajqs.h) == null) {
                                ajws3 = ajws.a;
                            }
                        }
                        else {
                            ajws3 = null;
                        }
                        final Spanned b3 = acbu.b(ajws3);
                        ajws ajws4;
                        if ((ajqs.b & 0x200) != 0x0) {
                            if ((ajws4 = ajqs.i) == null) {
                                ajws4 = ajws.a;
                            }
                        }
                        else {
                            ajws4 = null;
                        }
                        final Spanned b4 = acbu.b(ajws4);
                        ahbt k = ahbt;
                        if ((ajqs.b & 0x4000) != 0x0) {
                            k = ajqs.k;
                        }
                        v = jzq.v(c3, (CharSequence)b2, (CharSequence)b3, (CharSequence)b4, bitmapKey, selectableItemKey, k);
                    }
                    if (v == null) {
                        continue;
                    }
                    list.add(v);
                }
            }
        }
        m.w((BusSupported$Data)new RelatedVideosScreen((CharSequence)b, list));
    }
    
    public final void d() {
        if (this.g() && !this.i() && this.h()) {
            this.c();
        }
    }
    
    public final void f() {
        final boolean g = this.g();
        boolean b2;
        final boolean b = b2 = false;
        Label_0094: {
            if (g) {
                final abll a = this.a;
                b2 = b;
                if (a != null) {
                    b2 = b;
                    if (a.a(abll.i, abll.j)) {
                        b2 = b;
                        if (!this.i()) {
                            final aapt b3 = this.b;
                            if (b3 == null || !b3.e()) {
                                b2 = b;
                                if (!this.h()) {
                                    break Label_0094;
                                }
                            }
                            b2 = true;
                        }
                    }
                }
            }
        }
        this.d.tt((Object)b2);
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    final aapt b = (aapt)o;
                    final aapt b2 = this.b;
                    if (b2 == null || !b2.equals(b)) {
                        this.b = b;
                        this.a();
                        this.f();
                        this.d();
                        return null;
                    }
                    array2 = array;
                }
                else {
                    final aapp aapp = (aapp)o;
                    final abll a = this.a;
                    if (a == null || !a.equals(aapp.c())) {
                        this.a = aapp.c();
                        this.a();
                        this.f();
                        this.d();
                        return null;
                    }
                    array2 = array;
                }
            }
            else {
                final WatchNextResponseModel a2 = ((aapf)o).a();
                aniy c = null;
                Label_0310: {
                    if (a2 != null) {
                        final algm a3 = a2.a;
                        alfx alfx;
                        if ((alfx = a3.g) == null) {
                            alfx = alfx.a;
                        }
                        anis a4;
                        if (alfx.b == 78882851) {
                            a4 = (anis)alfx.c;
                        }
                        else {
                            a4 = anis.a;
                        }
                        anip anip;
                        if ((anip = a4.h) == null) {
                            anip = anip.a;
                        }
                        if ((anip.b & 0x1) != 0x0) {
                            alfx alfx2;
                            if ((alfx2 = a3.g) == null) {
                                alfx2 = alfx.a;
                            }
                            anis a5;
                            if (alfx2.b == 78882851) {
                                a5 = (anis)alfx2.c;
                            }
                            else {
                                a5 = anis.a;
                            }
                            anip anip2;
                            if ((anip2 = a5.h) == null) {
                                anip2 = anip.a;
                            }
                            if ((c = anip2.c) == null) {
                                c = aniy.a;
                            }
                            break Label_0310;
                        }
                    }
                    c = null;
                }
                if (!aexq.c(c, this.c)) {
                    this.c = c;
                    this.h.a();
                    this.a();
                    this.f();
                    this.d();
                    return null;
                }
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { aapf.class, aapp.class, aapt.class };
        }
        return array2;
    }
}
