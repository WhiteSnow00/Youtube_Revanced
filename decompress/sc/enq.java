// 
// Decompiled by Procyon v0.6.0
// 

public final class enq extends env
{
    private final emq h;
    private long i;
    
    public enq(final emk emk, final ahaz ahaz, final int n, final emq h) {
        super(emk, "yXY8/mGMSUXAD/doic4NhOcSiaIXIqWtQGozx2RibPkZkGDEn3zdgJKu8ncuIp2B", "lomf+VO0Ecj7WivSbw6aVWdgbo/lmDysFNgyXwY+gTY=", ahaz, n, 53);
        this.h = h;
        if (h != null) {
            this.i = h.a();
        }
    }
    
    protected final void a() {
        if (this.h != null) {
            final ahaz g = this.g;
            final long longValue = (long)this.d.invoke(null, this.i);
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.c |= 0x4000;
            eht.N = longValue;
        }
    }
}
