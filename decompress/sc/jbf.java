// 
// Decompiled by Procyon v0.6.0
// 

public final class jbf implements tri
{
    public final Object a;
    private final int b;
    
    public jbf(final jbh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jbf(final toz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final int b = this.b;
        if (b == 0) {
            ((jbh)this.a).d(jbg.a);
            return;
        }
        if (b == 1) {
            ((jbh)this.a).d(jbg.b);
            return;
        }
        if (b != 2) {
            ((toz)this.a).m();
            return;
        }
        ((toz)this.a).h();
    }
}
