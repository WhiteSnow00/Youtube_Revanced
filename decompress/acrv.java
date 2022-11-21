import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acrv implements acrd
{
    private final Context a;
    private final veh b;
    private final acmh c;
    private acru d;
    
    public acrv(final Context a, final veh b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = (acmh)new acli();
    }
    
    @Override
    public final Object a() {
        return this.c;
    }
    
    @Override
    public final void b(final Class clazz) {
        if (amis.class.isAssignableFrom(clazz)) {
            this.c.f(amis.class, this.c());
        }
    }
    
    public final acru c() {
        if (this.d == null) {
            this.d = new acru(this.a, this.b);
        }
        return this.d;
    }
}
