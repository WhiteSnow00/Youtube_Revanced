// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.handoff;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class HandoffCoordinator implements tfg
{
    public final xdn a;
    public final xdo b;
    public final xlv c;
    public final xdp d;
    public final arhr e;
    public final xdm f;
    public final Map g;
    public final asib h;
    public asic i;
    private final wzt j;
    
    static {
        trn.a("HandoffCoordinator");
    }
    
    public HandoffCoordinator(final xdn a, final xdo b, final xlv c, final wzt j, final xdp d, final arhr e, final xdm f) {
        this.g = (Map)new ConcurrentHashMap();
        this.h = new asib();
        this.a = a;
        this.b = b;
        this.c = c;
        this.j = j;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void lW(final aum aum) {
        this.f.e = Optional.empty();
        this.h.c(ashe.O((Object[])new ashh[] { (ashh)this.j.l().z(), (ashh)this.j.n().z(), (ashh)this.j.j().z() }).aO(asju.a, 3, asgt.a).ae().aB((asix)new wvv(this, 6)));
    }
    
    public final void my(final aum aum) {
        this.h.b();
        this.b.b();
        this.g.clear();
    }
}
