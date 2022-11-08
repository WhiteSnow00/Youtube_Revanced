import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acog implements acno
{
    private final Context a;
    private final vax b;
    private final acir c;
    private acof d;
    
    public acog(final Context a, final vax b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = (acir)new achs();
    }
    
    public final void b(final Class clazz) {
        if (amel.class.isAssignableFrom(clazz)) {
            this.c.f((Class)amel.class, (acip)this.c());
        }
    }
    
    public final acof c() {
        if (this.d == null) {
            this.d = new acof(this.a, this.b);
        }
        return this.d;
    }
}
