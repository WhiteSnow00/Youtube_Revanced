// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.content.Context;
import android.app.Activity;

public class MusicDeeplinkMenuItemController implements iru, tfh, tec
{
    public final vax a;
    public amel b;
    private final Activity c;
    private final abns d;
    private final acng e;
    private asic f;
    private irv g;
    private boolean h;
    
    public MusicDeeplinkMenuItemController(final Activity c, final abns d, final vax a, final acng e) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
    }
    
    private final void k(final akbe akbe, final boolean b) {
        final int a = this.e.a(akbe);
        if (a == 0) {
            return;
        }
        final irv g = this.g;
        if (g != null) {
            if (b) {
                ((qjg)g).e = tmy.k((Context)this.c, a, 2130970924);
                return;
            }
            ((qjg)g).f = tmy.k((Context)this.c, a, 2130970924);
        }
    }
    
    private final void l() {
        final amel b = this.b;
        if (b != null) {
            final CharSequence f = vwh.f(b);
            final irv g = this.g;
            if (g != null && f != null) {
                ((qjg)g).c = f.toString();
            }
            final akbf d = vwh.d(b);
            if (d != null) {
                akbe akbe;
                if ((akbe = akbe.b(d.c)) == null) {
                    akbe = akbe.a;
                }
                this.k(akbe, true);
            }
            final akbf e = vwh.e(b);
            if (e != null) {
                akbe akbe2;
                if ((akbe2 = akbe.b(e.c)) == null) {
                    akbe2 = akbe.a;
                }
                this.k(akbe2, false);
            }
        }
        final irv g2 = this.g;
        if (g2 != null) {
            g2.g(this.h);
        }
    }
    
    @Override
    public final irv a() {
        if (this.g == null) {
            this.g = new irv("", (irt)new irq(this, 5));
            this.l();
        }
        final irv g = this.g;
        g.getClass();
        return g;
    }
    
    public final void j(final aalo aalo) {
        final WatchNextResponseModel a = aalo.a();
        final boolean b = false;
        boolean h;
        if (a == null) {
            h = b;
        }
        else {
            final aneh i = a.i;
            h = b;
            if (i != null) {
                h = b;
                if ((i.b & 0x1) != 0x0) {
                    aneg aneg;
                    if ((aneg = i.e) == null) {
                        aneg = aneg.a;
                    }
                    h = b;
                    if ((aneg.b & 0x1) != 0x0) {
                        aneg aneg2;
                        if ((aneg2 = i.e) == null) {
                            aneg2 = aneg.a;
                        }
                        ameo ameo;
                        if ((ameo = aneg2.c) == null) {
                            ameo = ameo.a;
                        }
                        final Iterator<Object> iterator = ameo.c.iterator();
                        while (true) {
                            h = b;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final amel b2 = iterator.next();
                            if ((b2.b & 0x1) == 0x0) {
                                continue;
                            }
                            final akbf d = vwh.d(b2);
                            if (d == null) {
                                continue;
                            }
                            akbe akbe;
                            if ((akbe = akbe.b(d.c)) == null) {
                                akbe = akbe.a;
                            }
                            if (akbe == akbe.pq) {
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
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.j((aalo)o);
            array = null;
        }
        else {
            array = new Class[] { aalo.class };
        }
        return array;
    }
    
    @Override
    public final void oO() {
        this.g = null;
    }
    
    @Override
    public final boolean oP() {
        return true;
    }
    
    @Override
    public final String oQ() {
        return "menu_item_listen_in_yt_music";
    }
    
    public final void oS(final aum aum) {
        asic f;
        if (((uyi)this.d.cd().h).bx()) {
            f = this.d.R().am((asix)new iqv(this, 17), (asix)irb.g);
        }
        else {
            f = this.d.Q().R().P(ashw.a()).am((asix)new iqv(this, 17), (asix)irb.g);
        }
        this.f = f;
    }
    
    public final void oW(final aum aum) {
        final asic f = this.f;
        if (f != null) {
            athh.f((AtomicReference)f);
            this.f = null;
        }
    }
}
