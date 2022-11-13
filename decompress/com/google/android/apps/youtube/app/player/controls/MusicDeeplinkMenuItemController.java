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

public class MusicDeeplinkMenuItemController implements iss, thl, tgg
{
    public final vcy a;
    public amgp b;
    private final Activity c;
    private final abpu d;
    private final acpk e;
    private asir f;
    private ist g;
    private boolean h;
    
    public MusicDeeplinkMenuItemController(final Activity c, final abpu d, final vcy a, final acpk e) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
    }
    
    private final void k(final akdh akdh, final boolean b) {
        final int a = this.e.a(akdh);
        if (a == 0) {
            return;
        }
        final ist g = this.g;
        if (g != null) {
            if (b) {
                ((qkq)g).e = tpe.k((Context)this.c, a, 2130970924);
                return;
            }
            ((qkq)g).f = tpe.k((Context)this.c, a, 2130970924);
        }
    }
    
    private final void l() {
        final amgp b = this.b;
        if (b != null) {
            final CharSequence h = vyg.h(b);
            final ist g = this.g;
            if (g != null && h != null) {
                ((qkq)g).c = h.toString();
            }
            final akdi f = vyg.f(b);
            if (f != null) {
                akdh akdh;
                if ((akdh = akdh.b(f.c)) == null) {
                    akdh = akdh.a;
                }
                this.k(akdh, true);
            }
            final akdi g2 = vyg.g(b);
            if (g2 != null) {
                akdh akdh2;
                if ((akdh2 = akdh.b(g2.c)) == null) {
                    akdh2 = akdh.a;
                }
                this.k(akdh2, false);
            }
        }
        final ist g3 = this.g;
        if (g3 != null) {
            g3.g(this.h);
        }
    }
    
    @Override
    public final ist a() {
        if (this.g == null) {
            this.g = new ist("", new iso(this, 5));
            this.l();
        }
        final ist g = this.g;
        g.getClass();
        return g;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void j(final aani aani) {
        final WatchNextResponseModel a = aani.a();
        final boolean b = false;
        boolean h;
        if (a == null) {
            h = b;
        }
        else {
            final angl i = a.i;
            h = b;
            if (i != null) {
                h = b;
                if ((i.b & 0x1) != 0x0) {
                    angk angk;
                    if ((angk = i.e) == null) {
                        angk = angk.a;
                    }
                    h = b;
                    if ((angk.b & 0x1) != 0x0) {
                        angk angk2;
                        if ((angk2 = i.e) == null) {
                            angk2 = angk.a;
                        }
                        amgs amgs;
                        if ((amgs = angk2.c) == null) {
                            amgs = amgs.a;
                        }
                        final Iterator<Object> iterator = ((List<Object>)amgs.c).iterator();
                        while (true) {
                            h = b;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final amgp b2 = iterator.next();
                            if ((b2.b & 0x1) == 0x0) {
                                continue;
                            }
                            final akdi f = vyg.f(b2);
                            if (f == null) {
                                continue;
                            }
                            akdh akdh;
                            if ((akdh = akdh.b(f.c)) == null) {
                                akdh = akdh.a;
                            }
                            if (akdh == akdh.pr) {
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
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.j((aani)o);
            array = null;
        }
        else {
            array = new Class[] { aani.class };
        }
        return array;
    }
    
    public final void my(final aun aun) {
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
    
    public final void oS(final aun aun) {
        asir f;
        if (((vai)this.d.ci().g).bx()) {
            f = this.d.Q().an((asjm)new irw(this, 16), (asjm)ise.f);
        }
        else {
            f = this.d.P().R().P(asil.a()).an((asjm)new irw(this, 16), (asjm)ise.f);
        }
        this.f = f;
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        final asir f = this.f;
        if (f != null) {
            athz.f((AtomicReference)f);
            this.f = null;
        }
    }
}
