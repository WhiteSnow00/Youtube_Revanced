import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class cvq implements cvo
{
    private final czs a;
    private float b;
    
    public cvq(final List list) {
        this.b = -1.0f;
        this.a = list.get(0);
    }
    
    public final float a() {
        return this.a.b();
    }
    
    public final float b() {
        return this.a.c();
    }
    
    public final czs c() {
        return this.a;
    }
    
    public final boolean d(final float b) {
        if (this.b == b) {
            return true;
        }
        this.b = b;
        return false;
    }
    
    public final boolean e() {
        return false;
    }
    
    public final boolean f(final float n) {
        return !this.a.e();
    }
}
