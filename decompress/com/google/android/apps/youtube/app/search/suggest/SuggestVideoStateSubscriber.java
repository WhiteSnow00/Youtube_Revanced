// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.search.suggest;

import java.util.concurrent.TimeUnit;

public class SuggestVideoStateSubscriber implements tfh
{
    public String a;
    public String b;
    public long c;
    public final oas d;
    private final abns e;
    private final asib f;
    
    public SuggestVideoStateSubscriber(final oas d, final abns e) {
        this.c = -1L;
        this.d = d;
        this.e = e;
        this.f = new asib();
    }
    
    public final long j() {
        if (this.c == -1L) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(this.d.c() - this.c);
    }
    
    public final void oS(final aum aum) {
        this.f.b();
        this.f.f(new asic[] { ((asgt)this.e.q().b).am((asix)new jcp(this, 15), (asix)jky.c) });
    }
    
    public final void oW(final aum aum) {
        this.f.b();
    }
}
