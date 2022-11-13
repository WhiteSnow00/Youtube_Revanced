// 
// Decompiled by Procyon v0.6.0
// 

public final class day implements dbg
{
    private int a;
    private int b;
    private final int c;
    private final float d;
    
    public day() {
        this(2500, 1, 1.0f);
    }
    
    public day(final int a, final int c, final float d) {
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final void b(final dbj dbj) {
        final int b = this.b + 1;
        this.b = b;
        final int a = this.a;
        this.a = a + (int)(a * this.d);
        if (b <= this.c) {
            return;
        }
        throw dbj;
    }
}
