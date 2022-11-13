// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.HashSet;
import java.util.Set;

public class ReelSnackbarController implements aua, acvo, tgg
{
    public final bu a;
    public boolean b;
    public final fzw c;
    private final tgd d;
    private final acwb e;
    private final wyv f;
    private final gbc g;
    private final Set h;
    
    public ReelSnackbarController(final bu a, final tgd d, final acwb e, final fzw c, final wyv f, final gbc g, final msr msr, final vai vai, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.h = new HashSet();
        this.b = false;
        this.a = a;
        this.d = d;
        this.e = e;
        this.c = c;
        this.f = f;
        this.g = g;
        msr.Q((Callable)new exo(this, vai, 20));
    }
    
    public final /* bridge */ void a(final Object o, final int n) {
        final acwd acwd = (acwd)o;
        if (this.b) {
            synchronized (this.h) {
                this.h.remove(acwd);
                return;
            }
        }
        this.h.remove(acwd);
    }
    
    public final void g() {
        if (this.b) {
            Object h = this.h;
            synchronized (h) {
                final afft p = afft.p((Collection)this.h);
                this.h.clear();
                monitorexit(h);
                final afke k = p.k();
                while (k.hasNext()) {
                    h = k.next();
                    this.e.l((acwd)h);
                }
                return;
            }
        }
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            this.e.l((acwd)iterator.next());
        }
    }
    
    public final void h(final byte[] array, final gbv gbv) {
        final wyw pf = this.f.pF();
        if (array.length > 0 && pf != null) {
            gbv.a = (acvo)new hlc(pf, array, 0);
        }
        gbv.j();
        this.e.n((acwd)gbv.a());
    }
    
    public final void lW(final aun aun) {
        this.d.g((Object)this);
        this.e.k((acvo)this);
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
        this.g.f((BottomUiContainer)this.a.findViewById(2131427886));
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final uzm uzm = (uzm)o;
            final aezp e = uzm.e();
            final aezp f = uzm.f();
            final boolean h = e.h();
            final Class[] array = null;
            if (h) {
                this.h(((amrl)e.c()).e.I(), this.c.a((amrl)e.c(), uzm.g()));
                array2 = array;
            }
            else {
                array2 = array;
                if (f.h()) {
                    final amsn amsn = (amsn)f.c();
                    final bu a = this.a;
                    ajut ajut;
                    if ((ajut = amsn.c) == null) {
                        ajut = ajut.a;
                    }
                    tpe.y((Context)a, (CharSequence)acak.b(ajut), 0);
                    array2 = array;
                }
            }
        }
        else {
            array2 = new Class[] { uzm.class };
        }
        return array2;
    }
    
    public final /* bridge */ void mv(final Object o) {
        final acwd acwd = (acwd)o;
        if (this.b) {
            synchronized (this.h) {
                this.h.add(acwd);
                return;
            }
        }
        this.h.add(acwd);
    }
    
    public final void my(final aun aun) {
        this.d.m((Object)this);
        this.e.m((acvo)this);
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
}
