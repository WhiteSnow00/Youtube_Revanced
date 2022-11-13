// 
// Decompiled by Procyon v0.6.0
// 

final class acii extends acig
{
    private final int b;
    private final tgd c;
    
    public acii(final acgs acgs, final aeea aeea, final int b, final int n, final int n2, final boolean b2, final boolean b3, final adia adia, final tgd c, final byte[] array, final byte[] array2) {
        super(acgs, aeea, b, n, n2, b2, b3, adia, (byte[])null, (byte[])null);
        this.b = b;
        this.c = c;
    }
    
    private final void m(final tfh tfh) {
        this.c.d((Object)tfh);
    }
    
    public final void a() {
        tfh tfh;
        if (this.b != 2) {
            tfh = new aciv();
        }
        else {
            tfh = new acit();
        }
        this.m(tfh);
    }
    
    public final void b(final acix acix) {
        this.m((tfh)acix);
    }
    
    public final void c(final aciy aciy) {
        this.m((tfh)aciy);
    }
    
    public final void h(final aciz aciz) {
        this.m((tfh)aciz);
    }
    
    public final void i(final acja acja) {
        this.m((tfh)acja);
    }
    
    public final void j() {
        tfh tfh;
        if (this.b != 2) {
            tfh = new aciw();
        }
        else {
            tfh = new aciu();
        }
        this.m(tfh);
    }
}
