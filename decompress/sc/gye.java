// 
// Decompiled by Procyon v0.6.0
// 

public final class gye implements rbe
{
    public long a;
    final gyf b;
    private int c;
    
    public gye(final gyf b) {
        this.b = b;
        this.c = 0;
    }
    
    public final void a(final double n) {
        final int c = this.c + 1;
        this.c = c;
        if (c % 20 != 0) {}
        this.b.c.execute(aeun.h((Runnable)new tg(10)));
    }
}
