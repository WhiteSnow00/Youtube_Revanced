// 
// Decompiled by Procyon v0.6.0
// 

final class acin extends acig
{
    private final acim b;
    
    public acin(final acgs acgs, final aeea aeea, final int n, final int n2, final int n3, final boolean b, final boolean b2, final adia adia, final xao xao, final byte[] array, final byte[] array2) {
        super(acgs, aeea, n, n2, n3, b, b2, adia, (byte[])null, (byte[])null);
        almx almx;
        if (n != 2) {
            almx = almx.A;
        }
        else {
            almx = almx.M;
        }
        this.b = new acim(acgs, aeea, adia, n, n2, n3, b, b2, xao.c(almx), null, null);
    }
    
    public final void a() {
        this.b.a();
    }
    
    public final void b(final acix acix) {
        this.b.b(acix);
    }
    
    public final void c(final aciy aciy) {
        this.b.c(aciy);
    }
    
    public final void h(final aciz aciz) {
        this.b.h(aciz);
    }
    
    public final void i(final acja acja) {
        this.b.i(acja);
    }
    
    public final void j() {
        this.b.j();
    }
}
