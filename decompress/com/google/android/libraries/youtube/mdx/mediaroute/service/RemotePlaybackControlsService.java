// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.mediaroute.service;

import android.app.Service;
import android.os.Binder;
import android.os.IBinder;
import android.content.Intent;

public class RemotePlaybackControlsService extends xgs implements tec
{
    public tdz a;
    public abns b;
    public abkw c;
    public abkw d;
    public abky e;
    public xgt f;
    public abks g;
    public atjj h;
    public atjj i;
    public xbz j;
    public boolean k;
    final ibc l;
    public xgt m;
    public aukm n;
    private final asib o;
    private final xlu p;
    private final aepj q;
    private final aepj r;
    
    static {
        trn.a("MDX.RemoteService");
    }
    
    public RemotePlaybackControlsService() {
        this.l = new ibc(this, 2);
        this.o = new asib();
        this.p = (xlu)new xgv(this, 1);
        this.r = new aepj(this);
        this.q = new aepj(this);
    }
    
    public final void b() {
        this.n.h();
        if (this.k && this.j.e) {
            this.c.b(false);
            this.d.h();
            return;
        }
        this.d.b(false);
        this.c.h();
    }
    
    public final void d() {
        final boolean o = ((xlv)this.i.a()).o();
        final xgc n = ((xfw)this.h.a()).n;
        if (o) {
            this.k = false;
            this.b();
            return;
        }
        if (n != null) {
            this.c.a = this.getString(2132018820, new Object[] { akb.a().b((String)n.a) });
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        boolean k = false;
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final ryv ryv = (ryv)o;
            final xlo g = ((xlv)this.i.a()).g();
            array = null;
            if (g == null) {
                this.k = false;
            }
            else {
                final ryu a = ryv.a();
                if (a == ryu.a || a == ryu.b || a == ryu.c) {
                    k = true;
                }
                this.k = k;
                this.b();
            }
        }
        else {
            array = new Class[] { ryv.class };
        }
        return array;
    }
    
    public final IBinder onBind(final Intent intent) {
        this.d();
        return (IBinder)new Binder();
    }
    
    public final void onCreate() {
        super.onCreate();
        final abkw c = this.c;
        c.c = this.q;
        c.g((abkq)this.e, (abkq)this.f);
        this.c.d = this.r;
        this.d.g((abkq)this.e, (abkq)this.m);
        this.g.f((Service)this);
        this.o.f(this.l.lX(this.b));
        this.a.g((Object)this);
        ((xlv)this.i.a()).j(this.p);
        ((xfw)this.h.a()).w();
    }
    
    public final void onDestroy() {
        this.k = false;
        this.c.d = null;
        ((xfw)this.h.a()).x();
        this.c.b(true);
        this.d.b(true);
        this.g.f((Service)null);
        this.o.b();
        this.a.m((Object)this);
        ((xlv)this.i.a()).l(this.p);
        super.onDestroy();
    }
    
    public final void onTaskRemoved(final Intent intent) {
    }
}
