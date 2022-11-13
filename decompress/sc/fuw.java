import java.util.List;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fuw implements acko
{
    public final Object a;
    private final int b;
    
    public fuw(final acbm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fuw(final aln aln, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = aln.p((Map)null, 2131625620);
    }
    
    public fuw(final Context context, final int b) {
        this.b = b;
        this.a = LayoutInflater.from(context).inflate(2131624174, (ViewGroup)null);
    }
    
    public fuw(final Context context, final int b, final byte[] array) {
        this.b = b;
        this.a = LayoutInflater.from(context).inflate(2131623977, (ViewGroup)null);
    }
    
    public fuw(final Context context, final int b, final char[] array) {
        this.b = b;
        this.a = LayoutInflater.from(context).inflate(2131624965, (ViewGroup)null);
    }
    
    public fuw(final Context context, final int b, final short[] array) {
        this.b = b;
        this.a = View.inflate(context, 2131625376, (ViewGroup)null);
    }
    
    public fuw(final Context context, final acgs acgs, final vcy vcy, final acpk acpk, final acpn acpn, final rzy rzy, final oyy oyy, final vgy vgy, final hyx hyx, final tgd tgd, final ViewGroup viewGroup, final InlinePlaybackLifecycleController inlinePlaybackLifecycleController, final fjv fjv, final hyx hyx2, final aeea aeea, final vai vai, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.b = b;
        this.a = new kld(context, acgs, vcy, acpk, acpn, rzy, oyy, vgy, hyx, tgd, viewGroup, inlinePlaybackLifecycleController, fjv, hyx2, aeea, vai, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public fuw(final Context context, final acgs acgs, final vcy vcy, final acpk acpk, final qcy qcy, final oby oby, final vai vai, final int n, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = new kik(context, acgs, View.inflate(context, n, (ViewGroup)null), vcy, acpk, oby, qcy, vai, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public fuw(final Context context, final ViewGroup viewGroup, final int b) {
        this.b = b;
        this.a = LayoutInflater.from(context).inflate(2131625785, viewGroup, false);
    }
    
    public fuw(final Context context, final gjh a, final int b) {
        this.b = b;
        ((gjh)(this.a = a)).c(new View(context));
    }
    
    public fuw(final blu blu, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = blu.j(2131624822);
    }
    
    public fuw(final blu blu, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = blu.j(2131624823);
    }
    
    public fuw(final fuf fuf, final int b, final byte[] array) {
        this.b = b;
        Object a;
        if (acjl.class.equals(acjq.class)) {
            a = new acjq((Context)fuf.a, (ackr)((afaq)fuf.c).a(), (acku)fuf.b);
        }
        else {
            if (!acjl.class.equals(acjl.class)) {
                throw new IllegalArgumentException("Unknown presenter class requested.");
            }
            a = new acjl((Context)fuf.a, (ackr)((afaq)fuf.c).a(), (acku)fuf.b);
        }
        this.a = a;
    }
    
    public final View a() {
        switch (this.b) {
            default: {
                return (View)this.a;
            }
            case 11: {
                return ((acbm)this.a).a();
            }
            case 10: {
                return (View)this.a;
            }
            case 9: {
                return (View)this.a;
            }
            case 8: {
                return (View)((ftx)this.a).b;
            }
            case 7: {
                return (View)((kld)this.a).j;
            }
            case 6: {
                return ((kds)this.a).i;
            }
            case 5: {
                return ((gjh)this.a).a;
            }
            case 4: {
                return ((acje)this.a).a();
            }
            case 3: {
                return (View)this.a;
            }
            case 2: {
                return ((fuv)this.a).a;
            }
            case 1: {
                return (View)this.a;
            }
            case 0: {
                return ((fuv)this.a).a;
            }
        }
    }
    
    public final void c(final acku acku) {
        final int b = this.b;
        if (b == 0) {
            ((fuv)this.a).c(acku);
            return;
        }
        if (b == 2) {
            ((fuv)this.a).c(acku);
            return;
        }
        if (b == 4) {
            ((acje)this.a).c(acku);
            return;
        }
        if (b == 11) {
            ((acbm)this.a).c(acku);
            return;
        }
        if (b == 6) {
            ((kds)this.a).c(acku);
            return;
        }
        if (b == 7) {
            ((kld)this.a).c(acku);
            return;
        }
        if (b != 8) {
            return;
        }
        ((ftx)this.a).c(acku);
    }
    
    public final void mN(final ackm ackm, Object o) {
        final int b = this.b;
        boolean h = true;
        switch (b) {
            default: {
                final adds adds = (adds)o;
                return;
            }
            case 11: {
                final acbj a = (acbj)o;
                final acbm acbm = (acbm)this.a;
                acbm.a = a;
                final boolean d = a.b().d;
                acbm.b(ackm, a);
                return;
            }
            case 10: {
                final rlj rlj = (rlj)o;
                return;
            }
            case 9: {
                final rky rky = (rky)o;
                return;
            }
            case 8: {
                final krr krr = (krr)o;
                final ahbb ahbb = (ahbb)((ahbh)krr.a).toBuilder();
                if (!ahbb.ry((ahaq)aicx.b)) {
                    ahbb.e((ahaq)aicx.b, (Object)aicx.a);
                }
                final ahaz builder = ((ahbh)ahbb.rx((ahaq)aicx.b)).toBuilder();
                builder.copyOnWrite();
                final aicx aicx = (aicx)builder.instance;
                aicx.d = 1;
                aicx.c |= 0x1;
                ahbb.e((ahaq)aicx.b, (Object)builder.build());
                krr.a = (aicz)((ahaz)ahbb).build();
                ((acld)this.a).mN(ackm, (Object)krr.a);
                final int dimensionPixelSize = this.a().getResources().getDimensionPixelSize(2131170084);
                if ((krr.a.b & 0x200) != 0x0) {
                    this.a().setMinimumWidth(this.a().getResources().getDimensionPixelSize(2131167257));
                    this.a().setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    return;
                }
                this.a().setMinimumHeight(0);
                final int dimensionPixelSize2 = this.a().getResources().getDimensionPixelSize(2131167258);
                this.a().setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
                return;
            }
            case 7: {
                final anpq anpq = (anpq)o;
                o = this.a;
                ackm.getClass();
                anpq.getClass();
                final kld kld = (kld)o;
                kld.j.removeAllViews();
                kld.d();
                final klf m = kld.m;
                anpn g;
                if ((g = anpq.c) == null) {
                    g = anpn.a;
                }
                m.g = g;
                final anpn c = anpq.c;
                anpn a2;
                if (c == null) {
                    a2 = anpn.a;
                }
                else {
                    a2 = c;
                }
                if ((a2.b & 0x2000) == 0x0) {
                    h = false;
                }
                m.h = h;
                anpn a3 = c;
                if (c == null) {
                    a3 = anpn.a;
                }
                m.i = a3.p;
                final anpi[] array = ((List)anpq.d).toArray(new anpi[0]);
                final int b2 = anpq.b;
                String h2;
                if ((b2 & 0x40) != 0x0) {
                    h2 = anpq.h;
                }
                else {
                    h2 = null;
                }
                anpn anpn;
                if ((anpn = anpq.c) == null) {
                    anpn = anpn.a;
                }
                ampx ampx;
                if ((b2 & 0x2) != 0x0) {
                    anuv anuv;
                    if ((anuv = anpq.e) == null) {
                        anuv = anuv.a;
                    }
                    ampx = (ampx)aakt.v(anuv, (ahaq)MutedSparklesRendererOuterClass.mutedSparklesRenderer);
                }
                else {
                    ampx = null;
                }
                ahmo ahmo;
                if ((ahmo = anpq.f) == null) {
                    ahmo = ahmo.a;
                }
                m.b(ackm, (Object)anpq, h2, anpn, array, ampx, ahmo, anpq.g.I());
                kld.j.addView(kld.m.e);
                return;
            }
            case 6: {
                final kij kij = (kij)o;
                o = this.a;
                ((kik)o).b(ackm, kij.a);
                return;
            }
            case 5: {
                final fal fal = (fal)o;
                ((gjh)this.a).e(ackm);
                return;
            }
            case 4: {
                ((acje)this.a).h(ackm, (acjo)o);
                return;
            }
            case 3: {
                final jla jla = (jla)o;
                return;
            }
            case 2: {
                ((fuv)this.a).b(ackm, (fva)o);
                return;
            }
            case 1: {
                final aikw aikw = (aikw)o;
                return;
            }
            case 0: {
                ((fuv)this.a).b(ackm, (fva)o);
            }
        }
    }
}
