// 
// Decompiled by Procyon v0.6.0
// 

public class aks implements akr
{
    private final Object[] a;
    private int b;
    
    public aks(final int n) {
        this.a = new Object[n];
    }
    
    public Object a() {
        int b = this.b;
        if (b > 0) {
            --b;
            final Object[] a = this.a;
            final Object o = a[b];
            a[b] = null;
            this.b = b;
            return o;
        }
        return null;
    }
    
    public boolean b(final Object o) {
        int n = 0;
        while (true) {
            final int b = this.b;
            if (n < b) {
                if (this.a[n] == o) {
                    throw new IllegalStateException("Already in the pool!");
                }
                ++n;
            }
            else {
                final Object[] a = this.a;
                if (b < a.length) {
                    a[b] = o;
                    this.b = b + 1;
                    return true;
                }
                return false;
            }
        }
    }
}
