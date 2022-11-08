// 
// Decompiled by Procyon v0.6.0
// 

public final class fue extends abyt
{
    private final ameo a;
    
    public fue(final ameo a, final vax vax, final aeby aeby, final Object o, final byte[] array, final byte[] array2, final byte[] array3) {
        super(vax, aeby, o, (String)null, (byte[])null, (byte[])null, (byte[])null);
        a.getClass();
        this.a = a;
    }
    
    protected final void a(final int n) {
        final amel amel = (amel)this.a.c.get(n);
        if (this.a.c.size() > n) {
            if (vwh.c(amel) != null) {
                super.h.c(vwh.c(amel), this.d());
            }
            else if (vwh.b(amel) != null) {
                super.h.c(vwh.b(amel), this.d());
            }
            this.i(4);
        }
    }
}
