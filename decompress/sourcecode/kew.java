import java.util.Iterator;
import android.text.TextUtils;
import android.text.Spanned;
import java.util.ArrayList;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.content.res.Resources;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kew extends acja
{
    final RelativeLayout a;
    final RelativeLayout b;
    final ImageView c;
    final TextView d;
    final TextView e;
    final TextView f;
    final TextView g;
    final View h;
    final jgc i;
    final fzy j;
    private final Context k;
    private final Resources l;
    private final vax m;
    private final acio n;
    private final View o;
    private final aceo p;
    private final acnj q;
    private final LinearLayout r;
    private final acih s;
    private CharSequence t;
    private ajxp u;
    
    public kew(final Context k, final giz n, final aceo p12, final acnj q, final vax m, final jjg jjg, final cxz cxz, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final acih acih = new acih(m, (acio)n);
        this.s = acih;
        k.getClass();
        this.k = k;
        m.getClass();
        this.m = m;
        n.getClass();
        this.n = (acio)n;
        p12.getClass();
        this.p = p12;
        q.getClass();
        this.q = q;
        this.l = k.getResources();
        final LayoutInflater from = LayoutInflater.from(k);
        fzy d = null;
        final View inflate = from.inflate(2131624505, (ViewGroup)null);
        this.o = inflate;
        this.r = (LinearLayout)inflate.findViewById(2131429162);
        final RelativeLayout a = (RelativeLayout)inflate.findViewById(2131432026);
        this.a = a;
        this.b = (RelativeLayout)inflate.findViewById(2131431975);
        this.c = (ImageView)inflate.findViewById(2131432006);
        this.d = (TextView)inflate.findViewById(2131427852);
        this.h = inflate.findViewById(2131428448);
        this.e = (TextView)inflate.findViewById(2131432092);
        this.f = (TextView)inflate.findViewById(2131431415);
        this.g = (TextView)inflate.findViewById(2131429700);
        this.i = jjg.a((ViewStub)inflate.findViewById(2131427885));
        final ViewStub viewStub = (ViewStub)inflate.findViewById(2131427883);
        if (viewStub != null) {
            d = cxz.D(k, viewStub);
        }
        this.j = d;
        ((acio)n).c(inflate);
        inflate.setOnClickListener((View$OnClickListener)acih);
        if (uyi.aR()) {
            a.setClipToOutline(true);
            a.setBackgroundResource(2131231033);
        }
    }
    
    public final View a() {
        return ((giz)this.n).a;
    }
    
    public final void c(final acir acir) {
        this.s.c();
    }
}
