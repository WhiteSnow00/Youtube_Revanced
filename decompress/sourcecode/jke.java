import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jke extends jkd
{
    public jke(final Context context, final vax vax, final aceo aceo, final acte acte, final zhb zhb, final acng acng, final fvf fvf, final hyc hyc, final adcr adcr, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, vax, aceo, acte, zhb, acng, fvf, hyc, adcr, 2131625790, viewGroup, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void b(final appm appm) {
        final apoy[] array = appm.j.toArray(new apoy[0]);
        final ajsq ajsq = null;
        ahys a = null;
        Label_0102: {
            if (array != null) {
                for (final apoy apoy : array) {
                    if (apoy != null) {
                        if (apoy.b == 104364901) {
                            a = (ahys)apoy.c;
                        }
                        else {
                            a = ahys.a;
                        }
                    }
                    else {
                        a = null;
                    }
                    if (a != null) {
                        break Label_0102;
                    }
                }
            }
            a = null;
        }
        if (a != null && !a.e.isEmpty()) {
            tmy.v((View)this.b, false);
        }
        else {
            final TextView b = this.b;
            ajsq ajsq2 = ajsq;
            if (appm.c == 3) {
                ajsq2 = (ajsq)appm.d;
            }
            tmy.t(b, (CharSequence)abyh.b(ajsq2));
        }
        final View viewById = this.a.findViewById(2131427727);
        final aa layoutParams = (aa)this.d.getLayoutParams();
        final aa layoutParams2 = (aa)viewById.getLayoutParams();
        final FrameLayout$LayoutParams layoutParams3 = (FrameLayout$LayoutParams)this.c.getLayoutParams();
        aorm a2;
        if (appm.e == 5) {
            a2 = (aorm)appm.f;
        }
        else {
            a2 = aorm.a;
        }
        Label_0403: {
            if (actc.M(a2)) {
                final int ad = aqql.ad(appm.n);
                if (ad != 0) {
                    if (ad == 3) {
                        layoutParams3.width = this.e.getResources().getDimensionPixelOffset(2131170353);
                        layoutParams3.height = this.e.getResources().getDimensionPixelOffset(2131170353);
                        layoutParams2.n = 0;
                        layoutParams2.p = -1;
                        layoutParams.n = -1;
                        layoutParams.m = 2131427727;
                        layoutParams.setMarginStart(this.e.getResources().getDimensionPixelOffset(2131170352));
                        break Label_0403;
                    }
                }
            }
            layoutParams3.width = this.e.getResources().getDimensionPixelOffset(2131170364);
            layoutParams3.height = this.e.getResources().getDimensionPixelOffset(2131170364);
            layoutParams2.n = -1;
            layoutParams2.p = 0;
            layoutParams.n = 0;
            layoutParams.m = -1;
            layoutParams.setMarginStart(0);
        }
        if (f(appm)) {
            final int bd = tmy.bd(this.e);
            final int dimensionPixelOffset = this.e.getResources().getDimensionPixelOffset(2131170365);
            final TextView d = this.d;
            final int marginStart = layoutParams.getMarginStart();
            d.setMaxWidth(bd - (marginStart + marginStart) - layoutParams3.width - dimensionPixelOffset);
        }
        else {
            this.d.setMaxWidth(Integer.MAX_VALUE);
        }
        this.c.setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
        viewById.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        this.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
}
