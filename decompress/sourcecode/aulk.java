// 
// Decompiled by Procyon v0.6.0
// 

public final class aulk implements aull
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public aulk(final auli a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aulk(final aulm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aulk(final Runnable a, final int b) {
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
            ((aulm)this.a).release();
            return;
        }
        final auli auli = (auli)this.a;
        auli.a.post((Runnable)new aulh(auli, 2));
    }
    
    public final void b() {
        final int b = this.b;
        if (b != 0 && b != 1) {
            ((aulm)this.a).e.b();
        }
    }
    
    public final void c() {
        final int b = this.b;
        if (b != 0 && b != 1) {
            ((aulm)this.a).e.c();
        }
    }
}
