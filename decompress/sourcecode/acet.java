// 
// Decompiled by Procyon v0.6.0
// 

final class acet implements szx
{
    private final szx a;
    private final aeyr b;
    private final String c;
    
    public acet(final szx a, final aeyr b) {
        this.a = a;
        this.b = b;
        this.c = "NOT_CACHED";
    }
    
    public final void b(final Object o, final Object o2) {
        if (((aexq)this.b.a()).h()) {
            ((adfy)((aexq)this.b.a()).c()).e("DEFAULT_IMAGE_CLIENT", this.c, false);
        }
        this.a.b(o, o2);
    }
    
    public final void rX(final Object o, final Exception ex) {
        if (((aexq)this.b.a()).h()) {
            ((adfy)((aexq)this.b.a()).c()).e("DEFAULT_IMAGE_CLIENT", this.c, true);
        }
        this.a.rX(o, ex);
    }
}
