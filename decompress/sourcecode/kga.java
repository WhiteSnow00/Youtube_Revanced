import android.text.Spanned;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import android.text.SpannedString;
import android.text.TextUtils;
import android.widget.ImageView$ScaleType;
import android.util.TypedValue;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kga implements acil
{
    public final vax a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final ProgressBar g;
    private final ProgressBar h;
    private final ProgressBar i;
    private final ProgressBar j;
    private final RelativeLayout k;
    private final View l;
    private final kmc m;
    private final Context n;
    private final aceo o;
    private final acio p;
    private final acnj q;
    private final uyi r;
    
    public kga(final Context n, final vax a, final aceo o, final giz p6, final acnj q, final uyi r) {
        this.n = n;
        this.o = o;
        this.a = a;
        this.r = r;
        final View inflate = View.inflate(n, 2131624974, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131432092);
        this.d = (TextView)inflate.findViewById(2131432246);
        this.e = (TextView)inflate.findViewById(2131432245);
        this.f = (ImageView)inflate.findViewById(2131432006);
        this.g = (ProgressBar)inflate.findViewById(2131432171);
        this.h = (ProgressBar)inflate.findViewById(2131428490);
        this.i = (ProgressBar)inflate.findViewById(2131432244);
        this.j = (ProgressBar)inflate.findViewById(2131430625);
        this.k = (RelativeLayout)inflate.findViewById(2131432026);
        this.l = inflate.findViewById(2131428448);
        this.m = new kmc((ViewStub)inflate.findViewById(2131430603), n);
        p6.getClass();
        this.p = (acio)p6;
        q.getClass();
        this.q = q;
        p6.c(inflate);
    }
    
    private final String d(final glc glc) {
        final double k = glc.k;
        if (Double.isNaN(k)) {
            return null;
        }
        if (Double.isInfinite(k)) {
            if (glc.f()) {
                return this.n.getResources().getString(2132020098);
            }
            if (glc.e()) {
                return this.n.getResources().getString(2132020097);
            }
            return this.n.getResources().getString(2132020096);
        }
        else {
            final int n = (int)k;
            final int n2 = n / 60;
            final int n3 = n2 / 60;
            if (n <= 1) {
                return null;
            }
            if (n <= 90) {
                return this.n.getResources().getQuantityString(2131886169, n, new Object[] { n });
            }
            if (n2 <= 90) {
                return this.n.getResources().getQuantityString(2131886166, n2, new Object[] { n2 });
            }
            if (n3 <= 3) {
                return this.n.getResources().getQuantityString(2131886159, n3, new Object[] { n3 });
            }
            return null;
        }
    }
    
    public final View a() {
        return ((giz)this.p).a;
    }
    
    final int b(final int n) {
        return (int)TypedValue.applyDimension(1, (float)n, this.n.getResources().getDisplayMetrics());
    }
    
    public final void c(final acir acir) {
    }
}
