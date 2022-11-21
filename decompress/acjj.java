import android.graphics.drawable.Drawable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjj extends dcp
{
    public acjj(final dbs dbs, final dmk dmk, final dmu dmu, final Context context) {
        super(dbs, dmk, dmu, context);
    }
    
    public final /* bridge */ dcm a(final Class clazz) {
        return new acjh(this.a, this, clazz, this.b);
    }
    
    public final /* bridge */ dcm b() {
        return super.b();
    }
    
    public final /* bridge */ dcm c() {
        return super.c();
    }
    
    public final /* bridge */ dcm d(final Drawable drawable) {
        return super.d(drawable);
    }
    
    public final /* bridge */ dcm e(final Integer n) {
        return super.e(n);
    }
    
    public final /* bridge */ dcm f(final Object o) {
        return super.f(o);
    }
    
    public final /* bridge */ dcm g(final byte[] array) {
        return super.g(array);
    }
    
    protected final void p(final dnt dnt) {
        if (dnt instanceof acjf) {
            super.p(dnt);
            return;
        }
        super.p((dnt)new acjf().d((dnk)dnt));
    }
}
