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

public final class c implements tgg
{
    public abke a;
    public aanw b;
    public angr c;
    public final atjm d;
    public final asiq e;
    public final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.c f;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c g;
    public final a h;
    public final b i;
    public final e j;
    public final com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c k;
    private MutedAutoplayState l;
    private final elx m;
    
    public c(final e j, final vcy vcy, final com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c k, final com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.c f, final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.c g, final elx m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.d = atjm.aW((Object)false);
        this.e = new asiq();
        this.j = j;
        this.k = k;
        this.f = f;
        this.g = g;
        this.m = m;
        this.h = new a();
        this.i = new b(j, vcy);
    }
    
    private final boolean g() {
        final angr c = this.c;
        return c != null && c.d.size() > 0;
    }
    
    private final boolean h() {
        final abke a = this.a;
        return a != null && a.a(new abke[] { abke.j });
    }
    
    private final boolean i() {
        final MutedAutoplayState l = this.l;
        return l != null && l.g != 4;
    }
    
    public final void a() {
        this.m.y((BusSupported$Data)RelatedVideosScreen.a);
    }
    
    public final void b(final MutedAutoplayState l) {
        this.l = l;
        this.f();
        this.d();
    }
    
    public final void c() {
        final elx m = this.m;
        final angr c = this.c;
        Object b;
        if (c != null && (c.c & 0x1) != 0x0) {
            ajut ajut;
            if ((ajut = c.f) == null) {
                ajut = ajut.a;
            }
            b = acak.b(ajut);
        }
        else {
            b = "";
        }
        this.h.a();
        final ArrayList list = new ArrayList();
        final angr c2 = this.c;
        if (c2 != null) {
            for (final angt angt : c2.d) {
                if ((angt.b & 0x1) != 0x0) {
                    ajot ajot;
                    if ((ajot = angt.c) == null) {
                        ajot = ajot.a;
                    }
                    Object k = null;
                    final ahab ahab = null;
                    if (ajot != null) {
                        final a h = this.h;
                        aotp aotp;
                        if ((aotp = ajot.d) == null) {
                            aotp = aotp.a;
                        }
                        final int a = com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a.a;
                        com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a.a = a + 1;
                        h.c.append(a, (Object)aald.J(aotp));
                        final BitmapKey bitmapKey = new BitmapKey(h.b, a);
                        final b i = this.i;
                        final int a2 = com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b.a;
                        com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b.a = a2 + 1;
                        i.c.append(a2, (Object)ajot);
                        final SelectableItemKey selectableItemKey = new SelectableItemKey(i.b, a2);
                        final RelatedVideoItem a3 = RelatedVideoItem.a;
                        final String c3 = ajot.c;
                        ajut ajut2;
                        if ((ajot.b & 0x8) != 0x0) {
                            if ((ajut2 = ajot.f) == null) {
                                ajut2 = ajut.a;
                            }
                        }
                        else {
                            ajut2 = null;
                        }
                        final Spanned b2 = acak.b(ajut2);
                        ajut ajut3;
                        if ((ajot.b & 0x20) != 0x0) {
                            if ((ajut3 = ajot.h) == null) {
                                ajut3 = ajut.a;
                            }
                        }
                        else {
                            ajut3 = null;
                        }
                        final Spanned b3 = acak.b(ajut3);
                        ajut ajut4;
                        if ((ajot.b & 0x200) != 0x0) {
                            if ((ajut4 = ajot.i) == null) {
                                ajut4 = ajut.a;
                            }
                        }
                        else {
                            ajut4 = null;
                        }
                        final Spanned b4 = acak.b(ajut4);
                        ahab j = ahab;
                        if ((ajot.b & 0x4000) != 0x0) {
                            j = ajot.k;
                        }
                        k = kzr.k(c3, (CharSequence)b2, (CharSequence)b3, (CharSequence)b4, bitmapKey, selectableItemKey, j);
                    }
                    if (k == null) {
                        continue;
                    }
                    list.add(k);
                }
            }
        }
        m.y((BusSupported$Data)new RelatedVideosScreen((CharSequence)b, list));
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
                final abke a = this.a;
                b2 = b;
                if (a != null) {
                    b2 = b;
                    if (a.a(new abke[] { abke.i, abke.j })) {
                        b2 = b;
                        if (!this.i()) {
                            final aanw b3 = this.b;
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
        this.d.tu((Object)b2);
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
                    final aanw b = (aanw)o;
                    final aanw b2 = this.b;
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
                    final aans aans = (aans)o;
                    final abke a = this.a;
                    if (a == null || !a.equals((Object)aans.c())) {
                        this.a = aans.c();
                        this.a();
                        this.f();
                        this.d();
                        return null;
                    }
                    array2 = array;
                }
            }
            else {
                final WatchNextResponseModel a2 = ((aani)o).a();
                angr c = null;
                Label_0310: {
                    if (a2 != null) {
                        final alem a3 = a2.a;
                        aldx aldx;
                        if ((aldx = a3.g) == null) {
                            aldx = aldx.a;
                        }
                        angl a4;
                        if (aldx.b == 78882851) {
                            a4 = (angl)aldx.c;
                        }
                        else {
                            a4 = angl.a;
                        }
                        angi angi;
                        if ((angi = a4.h) == null) {
                            angi = angi.a;
                        }
                        if ((angi.b & 0x1) != 0x0) {
                            aldx aldx2;
                            if ((aldx2 = a3.g) == null) {
                                aldx2 = aldx.a;
                            }
                            angl a5;
                            if (aldx2.b == 78882851) {
                                a5 = (angl)aldx2.c;
                            }
                            else {
                                a5 = angl.a;
                            }
                            angi angi2;
                            if ((angi2 = a5.h) == null) {
                                angi2 = angi.a;
                            }
                            if ((c = angi2.c) == null) {
                                c = angr.a;
                            }
                            break Label_0310;
                        }
                    }
                    c = null;
                }
                if (!adkp.ae(c, this.c)) {
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
            array2 = new Class[] { aani.class, aans.class, aanw.class };
        }
        return array2;
    }
}
