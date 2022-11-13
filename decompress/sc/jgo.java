import android.view.View$OnClickListener;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import android.content.Context;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgo extends jgn implements tgg
{
    public String b;
    public Boolean c;
    public ilk d;
    private final Activity e;
    private final tgd f;
    private final fmr g;
    private final OfflineArrowView h;
    private final atke i;
    private final atke j;
    private final ktn k;
    private final aln l;
    private final ajb m;
    
    public jgo(final Activity e, final Context context, final vcy vcy, final ktn k, final tgd f, final fmr g, final gjh gjh, final aln aln, final ajb m, final aln l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context, vcy, gjh, aln, 2131624113, new nx(context.getResources().getDimensionPixelSize(2131165565), context.getResources().getDimensionPixelSize(2131165563)), new nx(context.getResources().getDimensionPixelSize(2131165565), context.getResources().getDimensionPixelSize(2131165562)), context.getResources().getDimensionPixelSize(2131165561), (byte[])null, (byte[])null, (byte[])null);
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = k;
        this.m = m;
        this.l = l;
        this.h = (OfflineArrowView)this.a().findViewById(2131430125);
        this.i = (atke)new jfz(this, 2);
        this.j = (atke)epv.n;
    }
    
    public final void c(final acku acku) {
        this.f.m((Object)this);
        this.d = null;
        this.b = null;
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aicw aicw = (aicw)o;
        super.lR(ackm, (Object)aicw);
        this.f.g((Object)this);
        final int b = aicw.b;
        final amxe amxe = null;
        String i;
        if ((b & 0x10) != 0x0) {
            i = aicw.i;
        }
        else {
            i = null;
        }
        this.b = i;
        anuv anuv;
        if ((anuv = aicw.h) == null) {
            anuv = anuv.a;
        }
        amxe amxe2;
        if (!anuv.ry((ahaq)OfflineabilityRendererOuterClass.offlineabilityRenderer)) {
            amxe2 = amxe;
        }
        else {
            anuv anuv2;
            if ((anuv2 = aicw.h) == null) {
                anuv2 = anuv.a;
            }
            amxe2 = (amxe)anuv2.rx((ahaq)OfflineabilityRendererOuterClass.offlineabilityRenderer);
        }
        final ajb m = this.m;
        final String b2 = this.b;
        final OfflineArrowView h = this.h;
        int n;
        if (amxe2 != null && amxe2.c) {
            n = 1;
        }
        else {
            n = 3;
        }
        ((ikv)(this.d = m.x(b2, h, n, (View$OnClickListener)this.l.I(b2, amxe2, (aicz)null, this.i, this.j, ackm.a)))).a();
        if (this.g.j(this.b)) {
            final ktn k = this.k;
            final String b3 = this.b;
            k.k(b3, (tcc)tca.c(this.e, (tcc)new jfw(this, b3, 3)));
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 5: {
                if (!((zxy)o).a.equals(this.b)) {
                    break;
                }
                ((ikv)this.d).a();
                return null;
            }
            case 4: {
                final zxx zxx = (zxx)o;
                if (!zxx.a.d().equals(this.b)) {
                    break;
                }
                ((ikv)this.d).b(ikg.a((aaau)zxx.a));
                return null;
            }
            case 3: {
                final zxv zxv = (zxv)o;
                if (!zxv.a.d().equals(this.b)) {
                    break;
                }
                ((ikv)this.d).b(ikg.a((aaau)zxv.a));
                return null;
            }
            case 2: {
                if (!((zxt)o).a.equals(this.b)) {
                    break;
                }
                ((ikv)this.d).a();
                return null;
            }
            case 1: {
                if (!((zxs)o).a.equals(this.b)) {
                    break;
                }
                ((ikv)this.d).a();
                return null;
            }
            case 0: {
                if (!((zxr)o).a.equals(this.b)) {
                    break;
                }
                ((ikv)this.d).a();
                return null;
            }
            case -1: {
                array = new Class[] { zxr.class, zxs.class, zxt.class, zxv.class, zxx.class, zxy.class };
                break;
            }
        }
        return array;
    }
}
