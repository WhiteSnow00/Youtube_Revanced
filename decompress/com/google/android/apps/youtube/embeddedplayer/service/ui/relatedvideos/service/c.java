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

public final class c implements tec
{
    public abim a;
    public aamc b;
    public anen c;
    public final atir d;
    public final asib e;
    public final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.c f;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c g;
    public final a h;
    public final b i;
    public final e j;
    public final lzi k;
    private MutedAutoplayState l;
    private final elw m;
    
    public c(final e j, final vax vax, final lzi k, final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.c f, final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c g, final elw m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = atir.aR((Object)false);
        this.e = new asib();
        this.j = j;
        this.k = k;
        this.f = f;
        this.g = g;
        this.m = m;
        this.h = new a();
        this.i = new b(j, vax);
    }
    
    private final boolean g() {
        final anen c = this.c;
        return c != null && c.d.size() > 0;
    }
    
    private final boolean h() {
        final abim a = this.a;
        return a != null && a.a(new abim[] { abim.j });
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
        final elw m = this.m;
        final anen c = this.c;
        Object b;
        if (c != null && (c.c & 0x1) != 0x0) {
            ajsq ajsq;
            if ((ajsq = c.f) == null) {
                ajsq = ajsq.a;
            }
            b = abyh.b(ajsq);
        }
        else {
            b = "";
        }
        this.h.a();
        final ArrayList list = new ArrayList();
        final anen c2 = this.c;
        if (c2 != null) {
            for (final anep anep : c2.d) {
                if ((anep.b & 0x1) != 0x0) {
                    ajmo ajmo;
                    if ((ajmo = anep.c) == null) {
                        ajmo = ajmo.a;
                    }
                    Object t = null;
                    final agyc agyc = null;
                    if (ajmo != null) {
                        final a h = this.h;
                        aorm aorm;
                        if ((aorm = ajmo.d) == null) {
                            aorm = aorm.a;
                        }
                        final int a = com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a.a;
                        com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a.a = a + 1;
                        h.c.append(a, (Object)actc.D(aorm));
                        final BitmapKey bitmapKey = new BitmapKey(h.b, a);
                        final b i = this.i;
                        final int a2 = com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b.a;
                        com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b.a = a2 + 1;
                        i.c.append(a2, (Object)ajmo);
                        final SelectableItemKey selectableItemKey = new SelectableItemKey(i.b, a2);
                        final RelatedVideoItem a3 = RelatedVideoItem.a;
                        final String c3 = ajmo.c;
                        ajsq ajsq2;
                        if ((ajmo.b & 0x8) != 0x0) {
                            if ((ajsq2 = ajmo.f) == null) {
                                ajsq2 = ajsq.a;
                            }
                        }
                        else {
                            ajsq2 = null;
                        }
                        final Spanned b2 = abyh.b(ajsq2);
                        ajsq ajsq3;
                        if ((ajmo.b & 0x20) != 0x0) {
                            if ((ajsq3 = ajmo.h) == null) {
                                ajsq3 = ajsq.a;
                            }
                        }
                        else {
                            ajsq3 = null;
                        }
                        final Spanned b3 = abyh.b(ajsq3);
                        ajsq ajsq4;
                        if ((ajmo.b & 0x200) != 0x0) {
                            if ((ajsq4 = ajmo.i) == null) {
                                ajsq4 = ajsq.a;
                            }
                        }
                        else {
                            ajsq4 = null;
                        }
                        final Spanned b4 = abyh.b(ajsq4);
                        agyc k = agyc;
                        if ((ajmo.b & 0x4000) != 0x0) {
                            k = ajmo.k;
                        }
                        t = jyg.t(c3, (CharSequence)b2, (CharSequence)b3, (CharSequence)b4, bitmapKey, selectableItemKey, k);
                    }
                    if (t == null) {
                        continue;
                    }
                    list.add(t);
                }
            }
        }
        m.w((BusSupported$Data)new RelatedVideosScreen((CharSequence)b, (List)list));
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
                final abim a = this.a;
                b2 = b;
                if (a != null) {
                    b2 = b;
                    if (a.a(new abim[] { abim.i, abim.j })) {
                        b2 = b;
                        if (!this.i()) {
                            final aamc b3 = this.b;
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
        this.d.tr((Object)b2);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
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
                    final aamc b = (aamc)o;
                    final aamc b2 = this.b;
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
                    final aaly aaly = (aaly)o;
                    final abim a = this.a;
                    if (a == null || !a.equals((Object)aaly.c())) {
                        this.a = aaly.c();
                        this.a();
                        this.f();
                        this.d();
                        return null;
                    }
                    array2 = array;
                }
            }
            else {
                final WatchNextResponseModel a2 = ((aalo)o).a();
                anen c = null;
                Label_0310: {
                    if (a2 != null) {
                        final alcj a3 = a2.a;
                        albu albu;
                        if ((albu = a3.g) == null) {
                            albu = albu.a;
                        }
                        aneh a4;
                        if (albu.b == 78882851) {
                            a4 = (aneh)albu.c;
                        }
                        else {
                            a4 = aneh.a;
                        }
                        anee anee;
                        if ((anee = a4.h) == null) {
                            anee = anee.a;
                        }
                        if ((anee.b & 0x1) != 0x0) {
                            albu albu2;
                            if ((albu2 = a3.g) == null) {
                                albu2 = albu.a;
                            }
                            aneh a5;
                            if (albu2.b == 78882851) {
                                a5 = (aneh)albu2.c;
                            }
                            else {
                                a5 = aneh.a;
                            }
                            anee anee2;
                            if ((anee2 = a5.h) == null) {
                                anee2 = anee.a;
                            }
                            if ((c = anee2.c) == null) {
                                c = anen.a;
                            }
                            break Label_0310;
                        }
                    }
                    c = null;
                }
                if (!aeda.v((Object)c, (Object)this.c)) {
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
            array2 = new Class[] { aalo.class, aaly.class, aamc.class };
        }
        return array2;
    }
}
