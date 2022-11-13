import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkk implements dfy, dfv
{
    private final Resources a;
    private final dfy b;
    
    private dkk(final Resources a, final dfy b) {
        clm.h((Object)a);
        this.a = a;
        clm.h((Object)b);
        this.b = b;
    }
    
    public static dfy f(final Resources resources, final dfy dfy) {
        if (dfy == null) {
            return null;
        }
        return new dkk(resources, dfy);
    }
    
    @Override
    public final int a() {
        return this.b.a();
    }
    
    @Override
    public final Class b() {
        return BitmapDrawable.class;
    }
    
    @Override
    public final /* bridge */ Object c() {
        return new BitmapDrawable(this.a, (Bitmap)this.b.c());
    }
    
    @Override
    public final void d() {
        final dfy b = this.b;
        if (b instanceof dfv) {
            ((dfv)b).d();
        }
    }
    
    @Override
    public final void e() {
        this.b.e();
    }
}
