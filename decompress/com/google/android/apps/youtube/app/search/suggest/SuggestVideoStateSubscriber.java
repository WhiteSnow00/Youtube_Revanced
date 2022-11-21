// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.search.suggest;

import java.util.concurrent.TimeUnit;

public class SuggestVideoStateSubscriber implements tio
{
    public String a;
    public String b;
    public long c;
    public final oco d;
    private final abqz e;
    private final aslm f;
    
    public SuggestVideoStateSubscriber(final oco d, final abqz e) {
        this.c = -1L;
        this.d = d;
        this.e = e;
        this.f = new aslm();
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final long j() {
        if (this.c == -1L) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(this.d.c() - this.c);
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.f.b();
        this.f.f(((aske)this.e.p().b).an((asmi)new jds(this, 20), (asmi)jmn.a));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.f.b();
    }
}
