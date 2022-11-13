import java.util.List;
import java.util.Collections;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwc extends cvr
{
    protected czt e;
    protected czt f;
    private final PointF g;
    private final PointF h;
    private final cvr i;
    private final cvr j;
    
    public cwc(final cvr i, final cvr j) {
        super((List)Collections.emptyList());
        this.g = new PointF();
        this.h = new PointF();
        this.i = i;
        this.j = j;
        this.i(super.c);
    }
    
    public final /* bridge */ Object e() {
        return this.k();
    }
    
    public final /* bridge */ Object f(final czs czs, final float n) {
        return this.k();
    }
    
    public final void i(final float n) {
        this.i.i(n);
        this.j.i(n);
        this.g.set((float)this.i.e(), (float)this.j.e());
        for (int i = 0; i < this.a.size(); ++i) {
            ((cvm)this.a.get(i)).d();
        }
    }
    
    final PointF k() {
        final czt e = this.e;
        final Float n = null;
        Float n4 = null;
        Label_0083: {
            if (e != null) {
                final czs d = this.i.d();
                if (d != null) {
                    this.i.b();
                    final Float h = d.h;
                    final czt e2 = this.e;
                    if (h != null) {
                        h.floatValue();
                    }
                    final Float n2 = (Float)d.b;
                    final Float n3 = (Float)d.c;
                    n4 = (Float)e2.a();
                    break Label_0083;
                }
            }
            n4 = null;
        }
        Float n5 = n;
        if (this.f != null) {
            final czs d2 = this.j.d();
            n5 = n;
            if (d2 != null) {
                this.j.b();
                final Float h2 = d2.h;
                final czt f = this.f;
                if (h2 != null) {
                    h2.floatValue();
                }
                final Float n6 = (Float)d2.b;
                final Float n7 = (Float)d2.c;
                n5 = (Float)f.a();
            }
        }
        if (n4 == null) {
            this.h.set(this.g.x, 0.0f);
        }
        else {
            this.h.set((float)n4, 0.0f);
        }
        if (n5 == null) {
            final PointF h3 = this.h;
            h3.set(h3.x, this.g.y);
        }
        else {
            final PointF h4 = this.h;
            h4.set(h4.x, (float)n5);
        }
        return this.h;
    }
}
