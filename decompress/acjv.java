// 
// Decompiled by Procyon v0.6.0
// 

final class acjv extends acjt
{
    private final int b;
    private final thg c;
    
    public acjv(final acig acig, final adgg adgg, final int b, final int n, final int n2, final boolean b2, final boolean b3, final adjq adjq, final thg c, final byte[] array) {
        super(acig, adgg, b, n, n2, b2, b3, adjq, (byte[])null);
        this.b = b;
        this.c = c;
    }
    
    private final void m(final tgk tgk) {
        this.c.d((Object)tgk);
    }
    
    public final void a() {
        tgk tgk;
        if (this.b != 2) {
            tgk = new acki();
        }
        else {
            tgk = new ackg();
        }
        this.m(tgk);
    }
    
    public final void b(final ackk ackk) {
        this.m((tgk)ackk);
    }
    
    public final void c(final ackl ackl) {
        this.m((tgk)ackl);
    }
    
    public final void h(final ackm ackm) {
        this.m((tgk)ackm);
    }
    
    public final void i(final ackn ackn) {
        this.m((tgk)ackn);
    }
    
    public final void j() {
        tgk tgk;
        if (this.b != 2) {
            tgk = new ackj();
        }
        else {
            tgk = new ackh();
        }
        this.m(tgk);
    }
}
