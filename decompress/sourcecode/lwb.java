// 
// Decompiled by Procyon v0.6.0
// 

public final class lwb
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    
    public lwb(final byte[] array) {
        final lwf lwf = new lwf(array);
        lwf.d(136);
        this.a = lwf.a(16);
        this.b = lwf.a(16);
        lwf.a(24);
        lwf.a(24);
        this.c = lwf.a(20);
        this.d = lwf.a(3) + 1;
        this.e = lwf.a(5) + 1;
        this.f = lwf.a(36);
    }
}
