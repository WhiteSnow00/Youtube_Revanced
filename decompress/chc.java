import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chc implements cgt
{
    public final Context a;
    public final String b;
    public final cgq c;
    public final boolean d;
    public final boolean e;
    public final atne f;
    public boolean g;
    private final atne h;
    
    public chc(final Context a, final String b, final cgq c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final atne s = aqvs.s((atps)new cga(this, 2));
        this.f = s;
        this.h = s;
    }
    
    @Override
    public final cgp a() {
        return this.b().b();
    }
    
    public final chb b() {
        return (chb)this.h.a();
    }
    
    @Override
    public final void close() {
        if (this.f.b()) {
            this.b().close();
        }
    }
}
