import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqk implements acps
{
    private final Context a;
    private final vcy b;
    private final acku c;
    private acqj d;
    
    public acqk(final Context a, final vcy b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = (acku)new acjv();
    }
    
    public final Object a() {
        return this.c;
    }
    
    public final void b(final Class clazz) {
        if (amgp.class.isAssignableFrom(clazz)) {
            this.c.f(amgp.class, (acks)this.c());
        }
    }
    
    public final acqj c() {
        if (this.d == null) {
            this.d = new acqj(this.a, this.b);
        }
        return this.d;
    }
}
