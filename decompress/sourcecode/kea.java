import java.util.Iterator;
import android.text.TextUtils;
import android.text.Spanned;
import java.util.ArrayList;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnClickListener;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.res.Resources;
import android.content.Context;
import android.widget.RelativeLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kea extends acja
{
    public final RelativeLayout a;
    public final Context b;
    public final Resources c;
    public aitw d;
    private final acio e;
    private final vax f;
    private final aceo g;
    private final View h;
    private final acnj i;
    private final View j;
    private final ImageView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final jgc p;
    private final fzy q;
    private final acih r;
    private CharSequence s;
    
    public kea(final Context b, final giz e, final aceo g, final acnj i, final vax f, final jjg jjg, final cxz cxz, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        final acih acih = new acih(f, (acio)e);
        this.r = acih;
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = (acio)e;
        i.getClass();
        this.i = i;
        g.getClass();
        this.g = g;
        f.getClass();
        this.f = f;
        this.c = b.getResources();
        final LayoutInflater from = LayoutInflater.from(b);
        fzy d = null;
        final View inflate = from.inflate(2131624262, (ViewGroup)null);
        this.h = inflate;
        final RelativeLayout a = (RelativeLayout)inflate.findViewById(2131432026);
        this.a = a;
        this.k = (ImageView)inflate.findViewById(2131432006);
        this.j = inflate.findViewById(2131428448);
        this.o = (TextView)inflate.findViewById(2131427884);
        this.l = (TextView)inflate.findViewById(2131432092);
        this.m = (TextView)inflate.findViewById(2131431415);
        this.n = (TextView)inflate.findViewById(2131429700);
        this.p = jjg.a((ViewStub)inflate.findViewById(2131427885));
        final ViewStub viewStub = (ViewStub)inflate.findViewById(2131427883);
        if (viewStub != null) {
            d = cxz.D(b, viewStub);
        }
        this.q = d;
        ((acio)e).c(inflate);
        inflate.setOnClickListener((View$OnClickListener)acih);
        if (uyi.aR()) {
            a.setClipToOutline(true);
            a.setBackgroundResource(2131231033);
        }
    }
    
    public final View a() {
        return ((giz)this.e).a;
    }
    
    public final void c(final acir acir) {
        this.r.c();
    }
}
