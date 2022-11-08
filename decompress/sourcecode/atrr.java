// 
// Decompiled by Procyon v0.6.0
// 

final class atrr extends atrf
{
    private final atpe a;
    
    public atrr(final atpe a) {
        this.a = a;
    }
    
    public final void a(final Throwable t) {
        final Object w = this.e().w();
        final boolean a = atqb.a;
        if (w instanceof atpm) {
            ((atld)this.a).resumeWith(arxj.g(((atpm)w).b));
            return;
        }
        ((atld)this.a).resumeWith(atrl.b(w));
    }
}
