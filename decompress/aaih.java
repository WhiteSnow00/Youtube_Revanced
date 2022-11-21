// 
// Decompiled by Procyon v0.6.0
// 

public final class aaih implements Runnable
{
    public final boolean a;
    public final boolean b;
    public final Object c;
    private final int d;
    
    public aaih(final aaij c, final boolean a, final boolean b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aaih(final wka c, final boolean a, final boolean b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.d == 0) {
            ((aaij)this.c).a.c(this.a, this.b);
            return;
        }
        final Object c = this.c;
        final boolean a = this.a;
        final boolean b = this.b;
        if (a) {
            final wka wka = (wka)c;
            final wkb a2 = wka.a;
            a2.c.i(a2.k);
            final wkb a3 = wka.a;
            a3.b.a(a3.j);
            return;
        }
        if (b) {
            final wkb a4 = ((wka)c).a;
            a4.b.a(a4.j);
        }
        final wkb a5 = ((wka)c).a;
        a5.c.i(a5.k);
    }
}
