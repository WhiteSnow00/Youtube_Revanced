import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsd implements asig
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public hsd(final aadx a, final hsw b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hsd(final fjo b, final vkk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hsd(final jxm a, final Uri b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final ateo ateo) {
        final int c = this.c;
        if (c == 0) {
            ((aadx)this.a).n((hsw)this.b, (zpf)new fch(ateo, 6));
            return;
        }
        if (c != 1) {
            final Object a = this.a;
            final Object b = this.b;
            final hbr hbr = new hbr(ateo, 13);
            final jxm jxm = (jxm)a;
            aefb.K((Object)jxm.a);
            jxm.a.l((Uri)b, (tcc)hbr);
            return;
        }
        ((fjo)this.b).h((vkk)this.a, (zpf)new fjm(ateo));
    }
}
