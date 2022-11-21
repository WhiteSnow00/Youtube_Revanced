// 
// Decompiled by Procyon v0.6.0
// 

public class adtq
{
    public final Object b;
    protected final String c;
    public Object d;
    public Object e;
    public String f;
    public boolean g;
    
    protected adtq(final String c, final Object d, final Object e) {
        this.b = new Object();
        this.f = "";
        this.g = false;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public void b(final Object o) {
    }
    
    protected int c(final Object o, final Object o2) {
        throw null;
    }
    
    public final adtr d() {
        synchronized (this.b) {
            return new adtr(this.d, this.e);
        }
    }
    
    public final int e(final Object d, final int n) {
        this.g = true;
        if (d != null && (n != 1 || this.c(this.d, d) != 1)) {
            this.b(this.d = d);
            return 2;
        }
        return 1;
    }
}
