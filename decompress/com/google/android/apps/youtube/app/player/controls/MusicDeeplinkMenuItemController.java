// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.content.Context;
import android.app.Activity;

public class MusicDeeplinkMenuItemController implements itb, tio, thj
{
    public final veh a;
    public amis b;
    private final Activity c;
    private final abqz d;
    private final acqv e;
    private asln f;
    private itc g;
    private boolean h;
    
    public MusicDeeplinkMenuItemController(final Activity c, final abqz d, final veh a, final acqv e) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
    }
    
    private final void k(final akfi akfi, final boolean b) {
        final int a = this.e.a(akfi);
        if (a == 0) {
            return;
        }
        final itc g = this.g;
        if (g != null) {
            if (b) {
                ((qlk)g).e = tqf.k((Context)this.c, a, 2130970922);
                return;
            }
            ((qlk)g).f = tqf.k((Context)this.c, a, 2130970922);
        }
    }
    
    private final void l() {
        final amis b = this.b;
        if (b != null) {
            final CharSequence q = wbe.q(b);
            final itc g = this.g;
            if (g != null && q != null) {
                ((qlk)g).c = q.toString();
            }
            final akfj o = wbe.o(b);
            if (o != null) {
                akfi akfi;
                if ((akfi = akfi.b(o.c)) == null) {
                    akfi = akfi.a;
                }
                this.k(akfi, true);
            }
            final akfj p = wbe.p(b);
            if (p != null) {
                akfi akfi2;
                if ((akfi2 = akfi.b(p.c)) == null) {
                    akfi2 = akfi.a;
                }
                this.k(akfi2, false);
            }
        }
        final itc g2 = this.g;
        if (g2 != null) {
            ((actj)g2).g(this.h);
        }
    }
    
    public final itc a() {
        if (this.g == null) {
            this.g = new itc("", (ita)new isx(this, 5));
            this.l();
        }
        final itc g = this.g;
        g.getClass();
        return g;
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void j(final aapf aapf) {
        final WatchNextResponseModel a = aapf.a();
        final boolean b = false;
        boolean h;
        if (a == null) {
            h = b;
        }
        else {
            final anis i = a.i;
            h = b;
            if (i != null) {
                h = b;
                if ((i.b & 0x1) != 0x0) {
                    anir anir;
                    if ((anir = i.e) == null) {
                        anir = anir.a;
                    }
                    h = b;
                    if ((anir.b & 0x1) != 0x0) {
                        anir anir2;
                        if ((anir2 = i.e) == null) {
                            anir2 = anir.a;
                        }
                        amiv amiv;
                        if ((amiv = anir2.c) == null) {
                            amiv = amiv.a;
                        }
                        final Iterator<Object> iterator = ((List<Object>)amiv.c).iterator();
                        while (true) {
                            h = b;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final amis b2 = iterator.next();
                            if ((b2.b & 0x1) == 0x0) {
                                continue;
                            }
                            final akfj o = wbe.o(b2);
                            if (o == null) {
                                continue;
                            }
                            akfi akfi;
                            if ((akfi = akfi.b(o.c)) == null) {
                                akfi = akfi.a;
                            }
                            if (akfi == akfi.pt) {
                                this.b = b2;
                                h = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.h = h;
        if (this.g != null) {
            this.l();
        }
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.j((aapf)o);
            array = null;
        }
        else {
            array = new Class[] { aapf.class };
        }
        return array;
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oP() {
        this.g = null;
    }
    
    public final boolean oQ() {
        return true;
    }
    
    public final String oR() {
        return "menu_item_listen_in_yt_music";
    }
    
    public final void oT(final aup aup) {
        asln f;
        if (((vbs)this.d.cg().g).bA()) {
            f = this.d.Q().an((asmi)new isd(this, 18), (asmi)isj.g);
        }
        else {
            f = this.d.P().R().P(aslh.a()).an((asmi)new isd(this, 18), (asmi)isj.g);
        }
        this.f = f;
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        final asln f = this.f;
        if (f != null) {
            atkw.f((AtomicReference)f);
            this.f = null;
        }
    }
}
