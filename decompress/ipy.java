import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipy implements iqw
{
    private final atke a;
    private final atke b;
    private final int c;
    
    public ipy(final atke a, final atke b, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public ipy(final atke a, final atke b, final int c, final byte[] array) {
        this.c = c;
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public ipy(final atke b, final atke a, final int c, final char[] array) {
        this.c = c;
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public ipy(final atke a, final atke b, final int c, final int[] array) {
        this.c = c;
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public ipy(final atke a, final atke b, final int c, final short[] array) {
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final iqx a(final aezp aezp) {
        final int c = this.c;
        if (c == 0) {
            final hzn hzn = (hzn)this.a.a();
            hzn.getClass();
            final fmr fmr = (fmr)this.b.a();
            fmr.getClass();
            return new ipx(hzn, fmr, aezp, 2, null, null, null);
        }
        if (c == 1) {
            final hzn hzn2 = (hzn)this.a.a();
            hzn2.getClass();
            final flv flv = (flv)this.b.a();
            flv.getClass();
            return new ipx(hzn2, flv, aezp, 0, null, null, null);
        }
        if (c == 2) {
            final Context context = (Context)this.b.a();
            context.getClass();
            final heo heo = (heo)this.a.a();
            heo.getClass();
            return new ipt(context, heo, 5, null, null);
        }
        if (c != 3) {
            final hzn hzn3 = (hzn)this.a.a();
            hzn3.getClass();
            final fmr fmr2 = (fmr)this.b.a();
            fmr2.getClass();
            return new ipx(hzn3, fmr2, aezp, 4, null, null, null);
        }
        final hzn hzn4 = (hzn)this.a.a();
        hzn4.getClass();
        final vdr vdr = (vdr)this.b.a();
        vdr.getClass();
        return new ipx(hzn4, vdr, aezp, 3, null, null, null);
    }
}
