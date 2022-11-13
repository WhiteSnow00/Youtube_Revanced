import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class cvp implements cvo
{
    private final List a;
    private czs b;
    private czs c;
    private float d;
    
    public cvp(final List a) {
        this.c = null;
        this.d = -1.0f;
        this.a = a;
        this.b = this.g(0.0f);
    }
    
    private final czs g(final float n) {
        final List a = this.a;
        final czs czs = a.get(a.size() - 1);
        if (n >= czs.c()) {
            return czs;
        }
        for (int i = this.a.size() - 2; i > 0; --i) {
            final czs czs2 = this.a.get(i);
            if (this.b != czs2) {
                if (czs2.d(n)) {
                    return czs2;
                }
            }
        }
        return this.a.get(0);
    }
    
    public final float a() {
        final List a = this.a;
        return ((czs)a.get(a.size() - 1)).b();
    }
    
    public final float b() {
        return this.a.get(0).c();
    }
    
    public final czs c() {
        return this.b;
    }
    
    public final boolean d(final float d) {
        final czs c = this.c;
        final czs b = this.b;
        if (c == b && this.d == d) {
            return true;
        }
        this.c = b;
        this.d = d;
        return false;
    }
    
    public final boolean e() {
        return false;
    }
    
    public final boolean f(final float n) {
        if (this.b.d(n)) {
            return !this.b.e();
        }
        this.b = this.g(n);
        return true;
    }
}
