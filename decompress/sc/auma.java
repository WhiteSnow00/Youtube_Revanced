// 
// Decompiled by Procyon v0.6.0
// 

public final class auma implements aumb
{
    final Object a;
    private final int b;
    
    public auma(final aulx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public auma(final aumc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public auma(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final int b = this.b;
        if (b == 0) {
            ((Runnable)this.a).run();
            return;
        }
        if (b != 1) {
            ((aumc)this.a).release();
            return;
        }
        final aulx aulx = (aulx)this.a;
        aulx.a.post((Runnable)new audk(aulx, 20));
    }
    
    public final void b() {
        final int b = this.b;
        if (b != 0 && b != 1) {
            ((aumc)this.a).e.b();
        }
    }
    
    public final void c() {
        final int b = this.b;
        if (b != 0 && b != 1) {
            ((aumc)this.a).e.c();
        }
    }
}
