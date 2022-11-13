// 
// Decompiled by Procyon v0.6.0
// 

public final class aart implements aaph
{
    public float a;
    private final aars b;
    private final aapg c;
    private final float d;
    
    public aart(final aars b, final float a, final float d) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = new aapg();
    }
    
    @Override
    public final void a(final boolean b, final long n) {
        this.c.b(b, n);
        final float a = this.c.a();
        this.b.j(this.d * a + (1.0f - a) * this.a);
    }
}
