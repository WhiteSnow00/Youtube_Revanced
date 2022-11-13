// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded;

import java.util.Iterator;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import java.util.ArrayList;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import j$.util.Optional;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.c;

public final class b extends c
{
    Optional a;
    Optional b;
    Optional c;
    
    public b() {
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
    }
    
    public final void a() {
        this.b = Optional.empty();
    }
    
    public final void b() {
        this.c = Optional.empty();
    }
    
    public final void c() {
        this.a = Optional.empty();
    }
    
    public final void d(final d d) {
        if (d != null) {
            try {
                if (this.a.isPresent()) {
                    d.k((SetOperationType)((acyi)this.a.get()).c, ((acyi)this.a.get()).a);
                    for (final fon fon : (ArrayList)((acyi)this.a.get()).b) {
                        d.g((Tick)fon.b, fon.a);
                    }
                    this.c();
                }
                if (this.b.isPresent()) {
                    d.h(((acyi)this.b.get()).a);
                    for (final fon fon2 : (ArrayList)((acyi)this.b.get()).b) {
                        d.e((Tick)fon2.b, fon2.a);
                    }
                    this.a();
                }
                if (this.c.isPresent()) {
                    d.i(((acyi)this.c.get()).a);
                    for (final fon fon3 : (ArrayList)((acyi)this.c.get()).b) {
                        d.f((Tick)fon3.b, fon3.a);
                    }
                    this.b();
                }
            }
            catch (final RemoteException ex) {
                afse.p("Csi controller service is disconnected.");
            }
        }
    }
    
    public final void e(final Tick tick, final long n) {
        if (this.b.isPresent()) {
            ((ArrayList<fon>)((acyi)this.b.get()).b).add(new fon(tick, n));
        }
    }
    
    public final void f(final Tick tick, final long n) {
        if (this.c.isPresent()) {
            ((ArrayList<fon>)((acyi)this.c.get()).b).add(new fon(tick, n));
        }
    }
    
    public final void g(final Tick tick, final long n) {
        if (this.a.isPresent()) {
            ((ArrayList<fon>)((acyi)this.a.get()).b).add(new fon(tick, n));
        }
    }
    
    public final void h(final long a) {
        this.a();
        final Optional of = Optional.of((Object)new acyi((byte[])null));
        this.b = of;
        ((acyi)of.get()).a = a;
    }
    
    public final void i(final long a) {
        this.b();
        final Optional of = Optional.of((Object)new acyi((byte[])null));
        this.c = of;
        ((acyi)of.get()).a = a;
    }
    
    public final void j(final SetOperationType c, final long a) {
        this.c();
        final Optional of = Optional.of((Object)new acyi((byte[])null));
        this.a = of;
        ((acyi)of.get()).a = a;
        ((acyi)this.a.get()).c = c;
    }
    
    public final void k(final SetOperationType setOperationType, final long n) {
    }
}
