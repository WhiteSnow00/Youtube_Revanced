// 
// Decompiled by Procyon v0.6.0
// 

final class acgx implements tcc
{
    private final tcc a;
    private final afaq b;
    private final String c;
    
    public acgx(final tcc a, final afaq b) {
        this.a = a;
        this.b = b;
        this.c = "NOT_CACHED";
    }
    
    public final void b(final Object o, final Object o2) {
        if (((aezp)this.b.a()).h()) {
            ((adia)((aezp)this.b.a()).c()).e("DEFAULT_IMAGE_CLIENT", this.c, false);
        }
        this.a.b(o, o2);
    }
    
    public final void sd(final Object o, final Exception ex) {
        if (((aezp)this.b.a()).h()) {
            ((adia)((aezp)this.b.a()).c()).e("DEFAULT_IMAGE_CLIENT", this.c, true);
        }
        this.a.sd(o, ex);
    }
}
