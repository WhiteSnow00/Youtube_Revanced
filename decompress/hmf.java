// 
// Decompiled by Procyon v0.6.0
// 

public final class hmf implements acpu
{
    public final hmg a;
    public final vnu b;
    public final wyw c;
    public final hmo d;
    public final sva e;
    public final qcy f;
    public final vwa g;
    public final aujg h;
    
    public hmf(final hmg a, final sva e, final vnu b, final wyw c, final vwa g, final aujg h, final hmo d, final qcy f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        this.g = g;
        this.h = h;
        this.d = d;
        this.f = f;
    }
    
    @Override
    public final acpt a(final Object o, final acrm acrm, final acrh acrh) {
        final hmg a = this.a;
        final sva e = this.e;
        final vnu b = this.b;
        final wyw c = this.c;
        final vwa g = this.g;
        final aujg h = this.h;
        final hmo d = this.d;
        final qcy f = this.f;
        sok k;
        if (o instanceof aitb) {
            k = e.k((aitb)o, (vmj)b, c, g, h);
            k.b = (soi)new kvz(d, 1);
            k.j(a.g);
        }
        else {
            if (o instanceof vgr) {
                final kwc h2 = f.H((vmj)b, c);
                ((acqa)h2).j((vgr)o);
                return (acpt)h2;
            }
            k = null;
        }
        return (acpt)k;
    }
}
