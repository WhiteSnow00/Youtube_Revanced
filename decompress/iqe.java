import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqe implements iqw
{
    private final atke a;
    private final atke b;
    private final atke c;
    private final atke d;
    private final int e;
    
    public iqe(final atke a, final atke b, final atke c, final atke d, final int e) {
        this.e = e;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public iqe(final atke b, final atke d, final atke c, final atke a, final int e, final byte[] array) {
        this.e = e;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
        this.a = a;
    }
    
    public iqe(final atke d, final atke c, final atke b, final atke a, final int e, final char[] array) {
        this.e = e;
        d.getClass();
        this.d = d;
        c.getClass();
        this.c = c;
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public iqe(final atke a, final atke c, final atke d, final atke b, final int e, final int[] array) {
        this.e = e;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        b.getClass();
        this.b = b;
    }
    
    public iqe(final atke a, final atke c, final atke d, final atke b, final int e, final short[] array) {
        this.e = e;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.b = b;
    }
    
    @Override
    public final iqx a(final aezp aezp) {
        final int e = this.e;
        if (e == 0) {
            final heo heo = (heo)this.a.a();
            heo.getClass();
            final atke b = this.b;
            final vai vai = (vai)this.c.a();
            vai.getClass();
            final fzw fzw = (fzw)this.d.a();
            fzw.getClass();
            return new iqd(heo, b, vai, fzw, aezp, null, null, null, null);
        }
        if (e == 1) {
            final hzn hzn = (hzn)this.b.a();
            hzn.getClass();
            final arwh arwh = (arwh)this.d.a();
            arwh.getClass();
            final tjm tjm = (tjm)this.c.a();
            tjm.getClass();
            final fmr fmr = (fmr)this.a.a();
            fmr.getClass();
            return new iqg(hzn, arwh, tjm, fmr, 1, null, null, null, null);
        }
        if (e == 2) {
            final Context context = (Context)this.d.a();
            context.getClass();
            final heo heo2 = (heo)this.c.a();
            heo2.getClass();
            final vai vai2 = (vai)this.b.a();
            vai2.getClass();
            final fzw fzw2 = (fzw)this.a.a();
            fzw2.getClass();
            return new iqs(context, heo2, vai2, fzw2, aezp, 1, null, null, null, null);
        }
        if (e != 3) {
            final Context context2 = (Context)this.a.a();
            context2.getClass();
            final heo heo3 = (heo)this.c.a();
            heo3.getClass();
            final oby oby = (oby)this.d.a();
            oby.getClass();
            final tjm tjm2 = (tjm)this.b.a();
            tjm2.getClass();
            return new iqs(context2, heo3, oby, tjm2, aezp, 0, null, null);
        }
        final Context context3 = (Context)this.a.a();
        context3.getClass();
        final heo heo4 = (heo)this.c.a();
        heo4.getClass();
        this.d.a().getClass();
        final vai vai3 = (vai)this.b.a();
        vai3.getClass();
        return new iqg(context3, heo4, vai3, aezp, 2, null, null);
    }
}
