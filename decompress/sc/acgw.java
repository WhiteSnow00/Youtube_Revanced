// 
// Decompiled by Procyon v0.6.0
// 

public final class acgw extends zok
{
    private final afaq c;
    
    public acgw(final tdm tdm, final zof zof, final oby oby, final afaq c) {
        super(tdm, zof, oby, 7200000L);
        this.c = c;
    }
    
    protected final void b(final tdm tdm) {
        if (((aezp)this.c.a()).h()) {
            final adia adia = (adia)((aezp)this.c.a()).c();
            String s;
            if (tdm instanceof tdt) {
                s = "MEMORY";
            }
            else if (tdm instanceof tdu) {
                s = "DISK";
            }
            else {
                s = "UNKNOWN";
            }
            adia.e("DEFAULT_IMAGE_CLIENT", s, false);
        }
    }
}
