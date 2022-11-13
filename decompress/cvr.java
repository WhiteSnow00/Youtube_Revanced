import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cvr
{
    final List a;
    public boolean b;
    public float c;
    public czt d;
    private final cvo e;
    private Object f;
    private float g;
    private float h;
    
    public cvr(final List list) {
        this.a = new ArrayList(1);
        this.b = false;
        this.c = 0.0f;
        this.f = null;
        this.g = -1.0f;
        this.h = -1.0f;
        Object e;
        if (list.isEmpty()) {
            e = new cvn();
        }
        else if (list.size() == 1) {
            e = new cvq(list);
        }
        else {
            e = new cvp(list);
        }
        this.e = (cvo)e;
    }
    
    private final float k() {
        float g;
        if ((g = this.g) == -1.0f) {
            g = this.e.b();
            this.g = g;
        }
        return g;
    }
    
    public float a() {
        float h;
        if ((h = this.h) == -1.0f) {
            h = this.e.a();
            this.h = h;
        }
        return h;
    }
    
    public final float b() {
        final czs d = this.d();
        if (d.e()) {
            return 0.0f;
        }
        return d.d.getInterpolation(this.c());
    }
    
    final float c() {
        if (this.b) {
            return 0.0f;
        }
        final czs d = this.d();
        if (d.e()) {
            return 0.0f;
        }
        return (this.c - d.c()) / (d.b() - d.c());
    }
    
    public final czs d() {
        final czs c = this.e.c();
        ctq.a();
        return c;
    }
    
    public Object e() {
        final float c = this.c();
        if (this.d == null && this.e.d(c)) {
            return this.f;
        }
        final czs d = this.d();
        final Interpolator e = d.e;
        Object f;
        if (e != null && d.f != null) {
            f = this.j(d, e.getInterpolation(c), d.f.getInterpolation(c));
        }
        else {
            f = this.f(d, this.b());
        }
        return this.f = f;
    }
    
    public abstract Object f(final czs p0, final float p1);
    
    public final void g(final cvm cvm) {
        this.a.add(cvm);
    }
    
    public void h() {
        for (int i = 0; i < this.a.size(); ++i) {
            ((cvm)this.a.get(i)).d();
        }
    }
    
    public void i(final float n) {
        if (this.e.e()) {
            return;
        }
        float c;
        if (n < this.k()) {
            c = this.k();
        }
        else {
            c = n;
            if (n > this.a()) {
                c = this.a();
            }
        }
        if (c == this.c) {
            return;
        }
        this.c = c;
        if (this.e.f(c)) {
            this.h();
        }
    }
    
    protected Object j(final czs czs, final float n, final float n2) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
