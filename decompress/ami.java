import android.view.View;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ami
{
    private final int a;
    private final Class b;
    private final int c;
    private final int d;
    
    public ami(final int n, final Class clazz) {
        this(n, clazz, 0, 28);
    }
    
    public ami(final int a, final Class b, final int d, final int c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    static final boolean f(final Boolean b, final Boolean b2) {
        return (b != null && b) == (b2 != null && b2);
    }
    
    private final boolean g() {
        return Build$VERSION.SDK_INT >= this.c;
    }
    
    public abstract Object a(final View p0);
    
    public abstract void b(final View p0, final Object p1);
    
    public boolean c(final Object o, final Object o2) {
        throw null;
    }
    
    final Object d(final View view) {
        if (this.g()) {
            return this.a(view);
        }
        final Object tag = view.getTag(this.a);
        if (this.b.isInstance(tag)) {
            return tag;
        }
        return null;
    }
    
    public final void e(final View view, final Object o) {
        if (!this.g()) {
            if (this.c(this.d(view), o)) {
                anc.C(view);
                view.setTag(this.a, o);
                anc.D(view, this.d);
            }
            return;
        }
        this.b(view, o);
    }
}
