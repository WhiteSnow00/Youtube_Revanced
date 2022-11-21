// 
// Decompiled by Procyon v0.6.0
// 

public final class aaiu implements aaiy
{
    public final Object a;
    private final int b;
    
    public aaiu(final aaip a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaiu(final aaiw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final long n, final double n2) {
        if (this.b != 0) {
            ((aaip)this.a).c(n, n2, true);
            return;
        }
        ((aaiw)this.a).b(n, n2, true);
    }
}
