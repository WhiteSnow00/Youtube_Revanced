import android.content.Context;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duf extends dst
{
    final Drawable a;
    int b;
    int c;
    
    public duf(final Drawable a) {
        super("DrawableComponent");
        this.a = a;
    }
    
    protected final Object R(final Context context) {
        return new dvw();
    }
    
    public final void S(final dsx dsx, final Object o) {
        try {
            ((dtd)this).X(dsx, o);
        }
        finally {}
    }
    
    public final void V(final dsx dsx, final Object o) {
        try {
            ((dtd)this).aa(dsx, o);
        }
        finally {}
    }
    
    protected final void X(final dsx dsx, final Object o) {
        ((dvw)o).a(this.b, this.c);
    }
    
    protected final void Y(final dsx dsx, final dtb dtb) {
        this.b = dtb.H();
        this.c = dtb.a();
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        ((dvw)o).b(this.a, (duh)null);
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        ((dvw)o).c();
    }
    
    protected final boolean am() {
        return true;
    }
    
    public final int an() {
        return 2;
    }
    
    protected final boolean ay(final dst dst, final dst dst2) {
        return !blf.f(((duf)dst).a, ((duf)dst2).a);
    }
    
    public final boolean f(final dst dst) {
        return this == dst || (dst != null && this.getClass() == dst.getClass() && blf.f(this.a, ((duf)dst).a));
    }
}
