// 
// Decompiled by Procyon v0.6.0
// 

public final class ett extends hw
{
    final etu a;
    
    public ett(final etu a) {
        this.a = a;
    }
    
    public final void c() {
        final ackz c = this.a.c;
        if (c != null) {
            for (int a = c.a(), i = 0; i < a; ++i) {
                final etu a2 = this.a;
                a2.a(a2.c.getItem(i));
            }
        }
    }
    
    public final void f(final int n, final int n2) {
        if (this.a.c != null) {
            for (int i = n; i < n2 + n; ++i) {
                final etu a = this.a;
                a.a(a.c.getItem(i));
            }
        }
    }
}
