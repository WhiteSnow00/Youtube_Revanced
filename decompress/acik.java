// 
// Decompiled by Procyon v0.6.0
// 

public final class acik extends zqg
{
    private final afci c;
    
    public acik(final teq teq, final zqb zqb, final oco oco, final afci c) {
        super(teq, zqb, oco, 7200000L);
        this.c = c;
    }
    
    protected final void b(final teq teq) {
        if (((afbh)this.c.a()).h()) {
            final adjq adjq = (adjq)((afbh)this.c.a()).c();
            String s;
            if (teq instanceof tex) {
                s = "MEMORY";
            }
            else if (teq instanceof tey) {
                s = "DISK";
            }
            else {
                s = "UNKNOWN";
            }
            adjq.e("DEFAULT_IMAGE_CLIENT", s, false);
        }
    }
}
