import java.util.Map;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxw extends dzc
{
    private final dxv e;
    private final dwi f;
    
    public dxw(final dwi dwi, final dxv e) {
        this.f = new dwi();
        this.b(dwi);
        this.e = e;
    }
    
    private static Object i(final WeakReference weakReference) {
        Object value;
        if (weakReference != null) {
            value = weakReference.get();
        }
        else {
            value = null;
        }
        if (value == null) {
            return null;
        }
        if (value instanceof Drawable && ((Drawable)value).getCallback() == null) {
            weakReference.clear();
            return null;
        }
        return value;
    }
    
    @Override
    public final float a(final long n) {
        if (this.d() > 1) {
            throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
        }
        final Map a = super.a;
        final boolean b = a != null && a.containsKey("default_input");
        final Object i = i((WeakReference)this.f.d());
        if (i == null) {
            if (b) {
                return this.e().c;
            }
            return super.c;
        }
        else {
            if (!b) {
                return this.e.a(i);
            }
            final float c = this.e().c;
            this.c(c);
            return c;
        }
    }
    
    public final void b(final dwi dwi) {
        final dwi f = this.f;
        final int n = 0;
        for (int i = 0; i < 5; ++i) {
            f.a[i] = null;
        }
        f.b = 0;
        if (dwi == null) {
            return;
        }
        for (short b = dwi.b, n2 = (short)n; n2 < b; ++n2) {
            this.f.e(dwi.a((int)n2), (Object)new WeakReference(dwi.c((int)n2)));
        }
    }
    
    public final void c(final float n) {
        for (short b = this.f.b, n2 = 0; n2 < b; ++n2) {
            final Object i = i((WeakReference)this.f.c((int)n2));
            if (i != null) {
                this.e.d(i, n);
            }
        }
    }
}
