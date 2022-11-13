// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.endpoint;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import android.os.Looper;
import java.util.List;
import android.net.Uri;
import java.util.Map;
import java.util.concurrent.Executor;

public class LoggingUrlsPingController implements thj
{
    public final fja a;
    public final sit b;
    private final atke c;
    private final Executor d;
    private final abpu e;
    private asir f;
    private final aahc g;
    
    public LoggingUrlsPingController(final atke c, final fja a, final sit b, final aahc g, final Executor d, final abpu e, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.g = g;
        this.d = d;
        this.e = e;
    }
    
    public final thh g() {
        return thh.a;
    }
    
    public final Uri j(final String s, final Map map) {
        final Uri cl = tpe.cL(s);
        if (cl == null) {
            return null;
        }
        final zpj[] array = (zpj[])tpe.O(map, (Object)"MacrosConverters.CustomConvertersKey", (Class)zpj[].class);
        zpj[] array2;
        if (array != null) {
            array2 = (zpj[])tpe.S((Object[])array, (Object[])new zpj[] { (zpj)this.a });
        }
        else {
            array2 = new zpj[] { (zpj)this.a };
        }
        try {
            return ((zpk)this.c.a()).a(cl, array2);
        }
        catch (final twc twc) {
            ttr.l("Failed macro substitution for URI: ".concat(String.valueOf(s)));
            return cl;
        }
    }
    
    public final void k(final List list, final Map map) {
        for (final alwh alwh : list) {
            if (alwh != null && (alwh.b & 0x1) != 0x0) {
                final Uri j = this.j(alwh.c, map);
                if (((aale)this.b).b(j)) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        this.d.execute((Runnable)new vo(this, j, alwh, 13));
                    }
                    else {
                        this.l(((aale)this.b).a(j), alwh);
                    }
                }
                else {
                    this.l(j, alwh);
                }
            }
        }
    }
    
    public final void l(final Uri uri, final alwh alwh) {
        if (uri != null) {
            final znf m = aahc.m("appendpointlogging");
            m.b(uri);
            m.d = false;
            m.a((znx)new vjn((alwg[])((List)alwh.d).toArray(new alwg[0]), 2));
            this.g.j(m, zpl.b);
        }
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
        final asir f = this.f;
        f.getClass();
        athz.f((AtomicReference)f);
        this.f = null;
    }
    
    public final void mq(final aun aun) {
        this.f = ((ashi)this.e.p().b).an((asjm)new fcx(this, 4), (asjm)ezq.k);
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.g((thj)this);
    }
    
    public final void oW() {
        tfg.f((thj)this);
    }
    
    public final void oX(final aun aun) {
    }
}
