// 
// Decompiled by Procyon v0.6.0
// 

final class acil implements tdg
{
    private final tdg a;
    private final afci b;
    private final String c;
    
    public acil(final tdg a, final afci b) {
        this.a = a;
        this.b = b;
        this.c = "NOT_CACHED";
    }
    
    public final void c(final Object o, final Exception ex) {
        if (((afbh)this.b.a()).h()) {
            ((adjq)((afbh)this.b.a()).c()).e("DEFAULT_IMAGE_CLIENT", this.c, true);
        }
        this.a.c(o, ex);
    }
    
    public final void d(final Object o, final Object o2) {
        if (((afbh)this.b.a()).h()) {
            ((adjq)((afbh)this.b.a()).c()).e("DEFAULT_IMAGE_CLIENT", this.c, false);
        }
        this.a.d(o, o2);
    }
}
