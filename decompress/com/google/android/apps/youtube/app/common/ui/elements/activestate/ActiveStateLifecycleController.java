// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.elements.activestate;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class ActiveStateLifecycleController implements aua
{
    public final Executor a;
    public final ArrayList b;
    public final List c;
    public final bu d;
    public asir e;
    private gds f;
    private atjo g;
    private final vwa h;
    
    public ActiveStateLifecycleController(final Executor a, final bu d) {
        this.h = vwa.Z((tvo)eyj.d);
        a.getClass();
        this.a = a;
        this.d = d;
        this.c = Collections.synchronizedList(new ArrayList<Object>());
        this.b = new ArrayList();
        this.f = gds.a;
    }
    
    public final ashc g(final gds gds) {
        String.valueOf(gds);
        if (this.i()) {
            ttr.c("Could not transition, request is blocked %s", this.b.toString());
        }
        for (final cdo cdo : this.c) {
            this.b.add(cdo);
            final gdq c = new gdq(this, cdo, gds, (byte[])null);
            if (gds == gds.b && fbu.J((vaf)cdo.b) > 0) {
                cdo.x();
                ((Handler)cdo.a).sendEmptyMessageDelayed(153535, (long)fbu.J((vaf)cdo.b));
                cdo.c = c;
                if (!gds.equals((Object)gds.a)) {
                    String.valueOf(cdo);
                    continue;
                }
            }
            else {
                cdo.x();
            }
            this.j(cdo);
        }
        if (!this.i()) {
            this.a.execute(new fsi(this, gds, 3));
        }
        this.g = atjo.aa();
        ashc ashc;
        if (gds.equals((Object)gds.a)) {
            ashc = ashc.f();
        }
        else {
            ashc = ((ashc)this.g).q((asjg)new esa(this, 10));
        }
        return ashc;
    }
    
    public final void h(final gds f) {
        final gds f2 = this.f;
        this.f = f;
        String.valueOf(f2);
        String.valueOf(this.f);
        this.h.G((Object)gdr.a(f2, this.f));
        if (f == gds.b) {
            final atjo g = this.g;
            if (g != null) {
                g.tx();
            }
        }
    }
    
    public final boolean i() {
        return !this.b.isEmpty();
    }
    
    public final void j(final cdo cdo) {
        this.b.remove(cdo);
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
        final asir e = this.e;
        if (e != null && !e.tA()) {
            asjv.b((AtomicReference)this.e);
        }
    }
}
