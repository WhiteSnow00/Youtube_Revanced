import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ktc extends fnh implements aaut, abnq
{
    public final Context a;
    public final tku b;
    public final atjj c;
    public volatile boolean d;
    public boolean e;
    private final aauw f;
    private final abns g;
    private final asib h;
    
    public ktc(final Context a, final tku b, final qv qv, final atjj c, final aauw f, final abns g, final byte[] array, final byte[] array2) {
        super(qv, (byte[])null, (byte[])null);
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        f.getClass();
        this.f = f;
        this.g = g;
        this.h = new asib();
    }
    
    public final void lV() {
        this.h.b();
        this.f.f = null;
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().b).am((asix)new kca(this, 20), (asix)jky.u) };
    }
    
    public final void qB() {
        this.h.f(this.lX(this.g));
        this.f.f = (aaut)this;
        if (this.e && !((aqot)this.b.c()).d) {
            this.e = false;
            ((abno)this.c.a()).D();
            this.f.f();
        }
    }
}
