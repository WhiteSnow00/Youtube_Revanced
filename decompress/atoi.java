// 
// Decompiled by Procyon v0.6.0
// 

public class atoi
{
    public final atok a;
    public int b;
    public int c;
    
    public atoi(final atok a) {
        this.a = a;
        this.c = -1;
        this.a();
    }
    
    public final void a() {
        while (true) {
            final int b = this.b;
            final atok a = this.a;
            if (b >= a.d || a.c[b] >= 0) {
                break;
            }
            this.b = b + 1;
        }
    }
    
    public final boolean hasNext() {
        return this.b < this.a.d;
    }
    
    public final void remove() {
        if (this.c != -1) {
            this.a.f();
            this.a.g(this.c);
            this.c = -1;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
