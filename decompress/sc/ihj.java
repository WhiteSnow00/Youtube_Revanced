import android.content.DialogInterface$OnDismissListener;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.HashMap;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihj implements ttg
{
    public final ihk a;
    public final aiqj b;
    public final Map c;
    
    public ihj(final ihk a, final aiqj b, final Map c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Object o) {
        final ihk a = this.a;
        final aiqj b = this.b;
        final Map c = this.c;
        final aleu aleu = (aleu)o;
        a.c.k();
        if (aleu != null) {
            alev alev;
            if ((alev = aleu.d) == null) {
                alev = alev.a;
            }
            amva a2;
            if (alev.b == 131899791) {
                alev alev2;
                if ((alev2 = aleu.d) == null) {
                    alev2 = alev.a;
                }
                if (alev2.b == 131899791) {
                    a2 = (amva)alev2.c;
                }
                else {
                    a2 = amva.a;
                }
            }
            else {
                a2 = null;
            }
            a.h.O();
            if (a2 != null) {
                final wyw p = (wyw)a.a.a();
                p.b(xaa.b(33986), b, (alhi)null);
                p.D((wzz)new wyt(aleu.e));
                final CharSequence charSequence = (CharSequence)tpe.O(c, (Object)"YpcGetOfflineUpsellResponse_videoIdKey", (Class)CharSequence.class);
                final aaif d = a.d;
                final fap s = new fap(a, 7);
                if (!d.a.isFinishing() && !d.a.isDestroyed()) {
                    if (d.e == null) {
                        d.e = new aaie(d.a, d.b, d.c, d.d, d.h, d.i, d.g, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                    }
                    if (d.e.i.isShowing()) {
                        d.e.i.dismiss();
                    }
                    final aaie e = d.e;
                    e.s = (DialogInterface$OnDismissListener)s;
                    final boolean f = d.f.f(45360031L);
                    e.r.clear();
                    e.p = p;
                    final ImageView d2 = e.d;
                    aott aott;
                    if (a2.c == 12) {
                        if ((aott = ((aotu)a2.d).c) == null) {
                            aott = aott.a;
                        }
                    }
                    else {
                        aott = null;
                    }
                    aotp aotp = null;
                    Label_0491: {
                        if (aott != null) {
                            final int b2 = aott.b;
                            if ((b2 & 0x1) != 0x0 && (b2 & 0x2) != 0x0) {
                                if (tpe.bq((Context)e.a)) {
                                    if ((aotp = aott.c) == null) {
                                        aotp = aotp.a;
                                    }
                                    break Label_0491;
                                }
                                else {
                                    if ((aotp = aott.d) == null) {
                                        aotp = aotp.a;
                                    }
                                    break Label_0491;
                                }
                            }
                        }
                        if ((aotp = a2.g) == null) {
                            aotp = aotp.a;
                        }
                    }
                    e.a(d2, aotp);
                    final ImageView e2 = e.e;
                    aotp aotp2;
                    if ((aotp2 = a2.h) == null) {
                        aotp2 = aotp.a;
                    }
                    e.a(e2, aotp2);
                    final TextView f2 = e.f;
                    ajut ajut;
                    if ((a2.b & 0x10) != 0x0) {
                        if ((ajut = a2.i) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    tpe.t(f2, (CharSequence)vde.a(ajut, e.b, false));
                    final TextView g = e.g;
                    ajut ajut2;
                    if ((a2.b & 0x20) != 0x0) {
                        if ((ajut2 = a2.j) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    tpe.t(g, (CharSequence)vde.a(ajut2, e.b, false));
                    final aaia r = e.r;
                    final amwy[] array = ((List)a2.m).toArray(new amwy[0]);
                    final afeq s2 = e.c.s();
                    final ArrayList list = new ArrayList();
                    for (final amwy amwy : array) {
                        amwz amwz;
                        if ((amwz = amwz.b(amwy.e)) == null) {
                            amwz = amwz.a;
                        }
                        if (s2.contains((Object)amwz)) {
                            list.add(new aaan(amwy));
                        }
                    }
                    Collections.sort((List<Object>)list, e.c.f());
                    r.setNotifyOnChange(false);
                    r.clear();
                    r.addAll((Collection)list);
                    r.notifyDataSetChanged();
                    r.a(-1);
                    Label_0935: {
                        if ((TextUtils.isEmpty(charSequence) && (f ^ true)) || e.r.isEmpty()) {
                            e.q.setVisibility(8);
                        }
                        else {
                            e.q.setVisibility(0);
                            final amwz u = e.c.u();
                            final aaia r2 = e.r;
                            for (int count = r2.getCount(), j = 0; j < count; ++j) {
                                final aaan aaan = (aaan)r2.getItem(j);
                                if (aaan != null && aaan.a == u) {
                                    r2.a(j);
                                    break Label_0935;
                                }
                            }
                            e.r.a(0);
                        }
                    }
                    final TextView h = e.h;
                    ajut ajut3;
                    if (a2.e == 3) {
                        ajut3 = (ajut)a2.f;
                    }
                    else {
                        ajut3 = null;
                    }
                    tpe.t(h, (CharSequence)vde.a(ajut3, e.b, false));
                    aida aida;
                    if ((aida = a2.k) == null) {
                        aida = aida.a;
                    }
                    aicz o2;
                    if ((aida.b & 0x1) != 0x0) {
                        aida aida2;
                        if ((aida2 = a2.k) == null) {
                            aida2 = aida.a;
                        }
                        if ((o2 = aida2.c) == null) {
                            o2 = aicz.a;
                        }
                    }
                    else {
                        o2 = null;
                    }
                    e.o = o2;
                    final aida l = a2.l;
                    aida a3;
                    if (l == null) {
                        a3 = aida.a;
                    }
                    else {
                        a3 = l;
                    }
                    aicz n;
                    if ((a3.b & 0x1) != 0x0) {
                        aida a4;
                        if ((a4 = l) == null) {
                            a4 = aida.a;
                        }
                        if ((n = a4.c) == null) {
                            n = aicz.a;
                        }
                    }
                    else {
                        n = null;
                    }
                    e.n = n;
                    final HashMap hashMap = new HashMap();
                    final HashMap hashMap2 = new HashMap();
                    final String b3 = wyx.b;
                    final Boolean value = true;
                    hashMap.put(b3, value);
                    hashMap2.put(wyx.b, value);
                    if (p != null) {
                        hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", p);
                        hashMap2.put("com.google.android.libraries.youtube.logging.interaction_logger", p);
                    }
                    ((acsx)e.l).a(e.o, p, (Map)hashMap);
                    if (!TextUtils.isEmpty(charSequence)) {
                        final aaia r3 = e.r;
                        final int a5 = r3.a;
                        amwz amwz2 = null;
                        Label_1278: {
                            if (a5 != -1) {
                                final aaan aaan2 = (aaan)r3.getItem(a5);
                                if (aaan2 != null) {
                                    amwz2 = aaan2.a;
                                    break Label_1278;
                                }
                            }
                            amwz2 = amwz.a;
                        }
                        if (amwz2 != amwz.a) {
                            hashMap2.put("VideoToSaveInfoContainerKey", new aakr());
                        }
                    }
                    ((acsx)e.k).a(e.n, p, (Map)hashMap2);
                    if (e.o == null && e.n == null) {
                        tpe.t(e.j, e.a.getResources().getText(2132017611));
                    }
                    e.i.show();
                    if (p != null) {
                        p.t((wzz)new wyt(a2.n), (alhi)null);
                    }
                }
            }
            else if ((aleu.b & 0x10) != 0x0) {
                a.f.pF().F((wzz)new wyt(aleu.e), (wzz)new wyt(b.c));
                aiqj aiqj;
                if ((aiqj = aleu.f) == null) {
                    aiqj = aiqj.a;
                }
                if (((ahbc)aiqj).ry((ahaq)ajmu.a)) {
                    final wyw wyw = (wyw)a.a.a();
                    final afev m = afev.m("com.google.android.libraries.youtube.logging.interaction_logger", wyw);
                    try {
                        a.g.mE(aiqj, (Map)m);
                        wyw.D((wzz)new wyt(aleu.e));
                        return;
                    }
                    catch (final vdj vdj) {
                        throw ihj$$ExternalSyntheticBackport0.m("Unknown command", (Throwable)vdj);
                    }
                }
                final vcy e3 = a.e;
                aiqj aiqj2;
                if ((aiqj2 = aleu.f) == null) {
                    aiqj2 = aiqj.a;
                }
                e3.a(aiqj2);
            }
        }
    }
}
