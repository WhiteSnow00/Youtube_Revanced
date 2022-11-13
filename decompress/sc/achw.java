import android.graphics.drawable.Drawable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achw extends dcm
{
    public achw(final dbp dbp, final dmh dmh, final dmr dmr, final Context context) {
        super(dbp, dmh, dmr, context);
    }
    
    public final /* bridge */ dcj a(final Class clazz) {
        return new achu(this.a, this, clazz, this.b);
    }
    
    public final /* bridge */ dcj b() {
        return super.b();
    }
    
    public final /* bridge */ dcj c() {
        return super.c();
    }
    
    public final /* bridge */ dcj d(final Drawable drawable) {
        return super.d(drawable);
    }
    
    public final /* bridge */ dcj e(final Integer n) {
        return super.e(n);
    }
    
    public final /* bridge */ dcj f(final Object o) {
        return super.f(o);
    }
    
    public final /* bridge */ dcj g(final byte[] array) {
        return super.g(array);
    }
    
    protected final void p(final dnq dnq) {
        if (dnq instanceof achs) {
            super.p(dnq);
            return;
        }
        super.p((dnq)new achs().d(dnq));
    }
}
