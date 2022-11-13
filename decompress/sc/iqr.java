// 
// Decompiled by Procyon v0.6.0
// 

public final class iqr implements iqw
{
    private final atke a;
    private final atke b;
    private final atke c;
    private final int d;
    
    public iqr(final atke a, final atke b, final atke c, final int d) {
        this.d = d;
        a.getClass();
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public iqr(final atke a, final atke b, final atke c, final int d, final byte[] array) {
        this.d = d;
        a.getClass();
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public iqr(final atke b, final atke c, final atke a, final int d, final char[] array) {
        this.d = d;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final iqx a(final aezp aezp) {
        final int d = this.d;
        if (d == 0) {
            final heo heo = (heo)this.a.a();
            heo.getClass();
            final vai vai = (vai)this.b.a();
            vai.getClass();
            final fzw fzw = (fzw)this.c.a();
            fzw.getClass();
            return new iqg(heo, vai, fzw, aezp, 3, null, null, null, null);
        }
        if (d != 1) {
            final hzn hzn = (hzn)this.b.a();
            hzn.getClass();
            final oby oby = (oby)this.c.a();
            oby.getClass();
            final vdr vdr = (vdr)this.a.a();
            vdr.getClass();
            return new iqg(hzn, oby, vdr, aezp, 4, null, null, null);
        }
        final heo heo2 = (heo)this.a.a();
        heo2.getClass();
        final vai vai2 = (vai)this.b.a();
        vai2.getClass();
        final fzw fzw2 = (fzw)this.c.a();
        fzw2.getClass();
        return new iqg(heo2, vai2, fzw2, aezp, 0, null, null, null, null);
    }
}
