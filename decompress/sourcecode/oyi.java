// 
// Decompiled by Procyon v0.6.0
// 

final class oyi
{
    public int a;
    public int b;
    private int c;
    private boolean d;
    
    public oyi() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    
    private final void b(final int n, final boolean b) {
        final int b2 = this.b;
        Label_0067: {
            int a;
            if ((c(n) & b2) != 0x0 && !b) {
                a = (this.a & ~c(n));
            }
            else {
                if ((c(n) & b2) != 0x0 || !b) {
                    break Label_0067;
                }
                a = (this.a | c(n));
            }
            this.a = a;
        }
        this.b = (c(n) | b2);
    }
    
    private static final int c(final int n) {
        return 1 << n;
    }
    
    final void a(final int n, final boolean d) {
        final int c = this.c;
        int i = c / 1000;
        final int n2 = (c + n) / 1000;
        if (n2 >= 32) {
            return;
        }
        this.b(n2, d);
        while (i < n2) {
            this.b(i, this.d);
            ++i;
        }
        this.c += n;
        this.d = d;
    }
}
