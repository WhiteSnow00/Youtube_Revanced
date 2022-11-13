import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipw implements iqw
{
    private final atke a;
    private final int b;
    
    public ipw(final atke a, final int b) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public ipw(final atke a, final int b, final byte[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public ipw(final atke a, final int b, final char[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public ipw(final atke a, final int b, final int[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public ipw(final atke a, final int b, final short[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public ipw(final atke a, final int b, final boolean[] array) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final iqx a(final aezp aezp) {
        final int b = this.b;
        if (b == 0) {
            final hzn hzn = (hzn)this.a.a();
            hzn.getClass();
            return new ipt(hzn, aezp, 2, null, null, null);
        }
        if (b == 1) {
            final ihb ihb = (ihb)this.a.a();
            ihb.getClass();
            return new iqc(ihb, 1);
        }
        if (b == 2) {
            final ihb ihb2 = (ihb)this.a.a();
            ihb2.getClass();
            return new ipt(ihb2, aezp, 3);
        }
        if (b == 3) {
            final ihb ihb3 = (ihb)this.a.a();
            ihb3.getClass();
            return new iqc(ihb3, 0);
        }
        if (b != 4) {
            final Context context = (Context)this.a.a();
            context.getClass();
            return new iqc(context, 2);
        }
        final hzn hzn2 = (hzn)this.a.a();
        hzn2.getClass();
        return new iqi(hzn2, aezp, null, null, null);
    }
}
