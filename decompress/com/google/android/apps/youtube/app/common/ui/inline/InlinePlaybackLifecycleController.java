// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.inline;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.os.Handler;

public class InlinePlaybackLifecycleController implements thl
{
    public final Handler a;
    public final List b;
    public asir c;
    private int d;
    private gey e;
    private final cya f;
    
    public InlinePlaybackLifecycleController(final Handler a) {
        this.a = a;
        this.f = new cya((byte[])null, (short[])null);
        this.b = new ArrayList();
        this.d = 0;
    }
    
    private final void A(final gey h) {
        final gey e = this.e;
        e.getClass();
        final int g = e.g;
        int n2;
        final int n = n2 = 1;
        if (g != 3) {
            if (g == 2) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (n2 == 0) {
            e.g = 3;
        }
        final gey h2 = e.h;
        if (h2 != null) {
            h2.g = 3;
        }
        e.getClass();
        e.h = h;
        if (n2 == 0) {
            if (e.f == 3) {
                this.x(0, e);
                return;
            }
            e.g = 2;
            if (e.b()) {
                final Iterator iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    ((gez)iterator.next()).j(e.a);
                }
                e.c.clear();
            }
            e.g = 3;
            this.a.post((Runnable)new fsi(this, e, 4));
        }
    }
    
    public static final boolean w(final int n, final gey gey) {
        final int g = gey.g;
        return (g != 3 && g != 2) || n == 0;
    }
    
    private final void x(final int n, final gey gey) {
        final int g = gey.g;
        if (g == 0) {
            gey.g = 1;
        }
        else if (g == 3) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("Can't transition aborted requests to state ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
        }
        adkp.T(gey.b() ^ true, "Can't transition, request is already blocked %s", (Object)gey.c);
        for (final gez gez : this.b) {
            gey.c.add(gez);
            if (gez.m(gey.a, n, new wjg(this, gey, n, gez))) {
                gey.a(gez);
            }
            else {
                String.valueOf(gez);
            }
        }
        if (gey.b()) {
            return;
        }
        this.a.post((Runnable)new qo(this, n, gey, 11));
    }
    
    private final boolean y(final glm glm) {
        final gey e = this.e;
        return e != null && e.a.b.r(glm);
    }
    
    private final boolean z(final glm glm) {
        final gey e = this.e;
        if (e != null) {
            final gey h = e.h;
            if (h != null && h.a.b.r(glm)) {
                return true;
            }
        }
        return false;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final int j(final glm glm) {
        final gey e = this.e;
        if (e == null) {
            return 0;
        }
        if (e.a.b == glm) {
            return e.b;
        }
        final gey h = e.h;
        if (h != null && h.a.b == glm) {
            return h.b;
        }
        return 0;
    }
    
    public final ashc k() {
        tbi.f();
        final gey e = this.e;
        if (e != null && e.g != 3) {
            final atjo e2 = e.e;
            this.A(null);
            return (ashc)e2;
        }
        return ashc.f();
    }
    
    public final ashc l(final glm glm) {
        tbi.f();
        String.valueOf(glm);
        final gey e = this.e;
        if (e == null) {
            return ashc.f();
        }
        if (!this.y(glm) && !this.z(glm)) {
            return ashc.f();
        }
        final atjo e2 = e.e;
        this.A(null);
        return (ashc)e2;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final ashc m(final glm glm, final gfi gfi, final int n) {
        tbi.f();
        glm.getClass();
        glm.toString();
        final gey e = this.e;
        if (e != null && this.y(glm)) {
            return (ashc)e.d;
        }
        if (e != null && this.z(glm)) {
            final gey h = e.h;
            if (h != null) {
                return (ashc)h.d;
            }
        }
        final gey e2 = new gey(glm, gfi, n);
        final gey e3 = this.e;
        if (e3 == null) {
            this.x(1, this.e = e2);
        }
        else {
            if (e3.g == 0) {
                return ashc.t(new IllegalStateException("Requested Playback when currentRequest has status 0"));
            }
            this.A(e2);
        }
        return (ashc)e2.d;
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final ashc n() {
        tbi.f();
        final gey e = this.e;
        if (e == null) {
            return ashc.f();
        }
        final atjo e2 = e.e;
        this.A(null);
        return (ashc)e2;
    }
    
    public final void o(final gew gew) {
        final cya f = this.f;
        gew.getClass();
        ((Set<gew>)f.a).add(gew);
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        final asir c = this.c;
        if (c != null && !c.tA()) {
            asjv.b((AtomicReference)this.c);
        }
    }
    
    public final void p(final atke atke) {
        this.o((gew)atke.a());
    }
    
    public final void q(final gez gez) {
        gez.getClass();
        this.b.add(gez);
    }
    
    public final void r(final atke atke) {
        this.q((gez)atke.a());
    }
    
    public final void s(int n, gey gey) {
        String.valueOf(gey);
        gey.getClass();
        this.e = gey;
        if (w(n, gey)) {
            final int d = this.d;
            this.d = n;
            gey = this.e;
            gey.f = n;
            final cya f = this.f;
            n = this.d;
            final Iterator<Object> iterator = ((Set<Object>)f.a).iterator();
            while (iterator.hasNext()) {
                iterator.next().q(gey.a, d, n);
            }
            if (n == 0) {
                gey.e.tx();
            }
            else if (n == 3) {
                gey.d.tx();
            }
        }
        if ((n = this.d) == 3) {
            if (this.e.g != 3) {
                return;
            }
            n = 3;
        }
        if (n == 0) {
            gey = this.e.h;
            if ((this.e = gey) != null) {
                this.x(1, gey);
            }
            return;
        }
        gey = this.e;
        if (gey.g == 3) {
            n = 0;
        }
        else {
            ++n;
        }
        this.x(n, gey);
    }
    
    public final void t(final gew gew) {
        final cya f = this.f;
        gew.getClass();
        ((Set)f.a).remove(gew);
    }
    
    public final void u() {
        final asir c = this.c;
        if (c != null && !c.tA()) {
            asjv.b((AtomicReference)this.c);
        }
        this.c = this.k().W((asjg)gex.b, (asjm)fua.j);
    }
    
    public final void v() {
        final asir c = this.c;
        if (c != null && !c.tA()) {
            asjv.b((AtomicReference)this.c);
        }
        this.c = this.n().W((asjg)gex.c, (asjm)fua.h);
    }
}
