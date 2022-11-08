import java.util.Iterator;
import android.text.Spanned;
import java.util.List;
import android.text.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnLayoutChangeListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import app.revanced.integrations.patches.HideMixPlaylistsPatch;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.widget.CompoundButton;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgl extends acja
{
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final uyi G;
    private final arud H;
    public final TextView a;
    public hdv b;
    private final Context c;
    private final aceo d;
    private final vax e;
    private final acio f;
    private final irp g;
    private final View h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;
    private final View m;
    private final acnj n;
    private final ChipCloudView o;
    private final CompoundButton p;
    private final Resources q;
    private final aamv r;
    private aobk s;
    private final acih t;
    private final int u;
    private final int v;
    private final int x;
    private final int y;
    private final int z;
    
    public kgl(final Context c, final giz f, final aceo d, final vax e, final acnj n, final irp g, final arud h, final uyi g2, final byte[] array, final byte[] array2) {
        this.t = new acih(e, (acio)f);
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.f = (acio)f;
        n.getClass();
        this.n = n;
        g.getClass();
        this.g = g;
        this.H = h;
        this.G = g2;
        final Resources resources = c.getResources();
        this.q = resources;
        this.u = resources.getDimensionPixelSize(2131169562);
        this.v = resources.getDimensionPixelSize(2131169550);
        this.x = resources.getDimensionPixelSize(2131169557);
        this.y = resources.getDimensionPixelSize(2131169561);
        this.z = resources.getDimensionPixelSize(2131169549);
        this.A = resources.getDimensionPixelSize(2131169551);
        this.B = resources.getDimensionPixelSize(2131169555);
        this.C = resources.getDimensionPixelSize(2131169558);
        this.D = resources.getDimensionPixelSize(2131169556);
        this.E = resources.getDimensionPixelSize(2131169553);
        this.F = resources.getDimensionPixelSize(2131169554);
        final View inflate = View.inflate(c, 2131625376, (ViewGroup)null);
        HideMixPlaylistsPatch.hideMixPlaylists(inflate);
        this.h = inflate;
        this.i = (TextView)inflate.findViewById(2131432092);
        this.a = (TextView)inflate.findViewById(2131427718);
        this.j = (TextView)inflate.findViewById(2131427721);
        this.k = (TextView)inflate.findViewById(2131431819);
        final ChipCloudView o = (ChipCloudView)inflate.findViewById(2131427776);
        this.o = o;
        final int dimensionPixelSize = c.getResources().getDimensionPixelSize(2131165833);
        o.a(dimensionPixelSize, dimensionPixelSize);
        this.l = (ImageView)inflate.findViewById(2131432006);
        this.m = inflate.findViewById(2131428448);
        final CompoundButton p10 = (CompoundButton)inflate.findViewById(2131427719);
        this.p = p10;
        this.r = (aamv)new jqf(this, 4);
        p10.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new jqg(this, g, 2));
        inflate.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jbw(this, 7));
        f.c(inflate);
    }
    
    private static aibk g(final aobk aobk) {
        aobb aobb;
        if ((aobb = aobk.n) == null) {
            aobb = aobb.a;
        }
        if ((aobb.b & 0x1) != 0x0) {
            aobb aobb2;
            if ((aobb2 = aobk.n) == null) {
                aobb2 = aobb.a;
            }
            aibk aibk;
            if ((aibk = aobb2.c) == null) {
                aibk = aibk.a;
            }
            return aibk;
        }
        return null;
    }
    
    private static CharSequence h(final ahgn ahgn, final CharSequence charSequence) {
        if (ahgn == null) {
            return charSequence;
        }
        if ((ahgn.b & 0x1) != 0x0) {
            ahgm ahgm;
            if ((ahgm = ahgn.c) == null) {
                ahgm = ahgm.a;
            }
            if ((ahgm.b & 0x2) != 0x0) {
                return ahgm.c;
            }
        }
        return charSequence;
    }
    
    public final View a() {
        return ((giz)this.f).a;
    }
    
    public final void c(final acir acir) {
        this.t.c();
        this.g.h(this.r);
    }
    
    public final void f() {
        final boolean i = this.g.i();
        this.p.setChecked(i);
        final hdv b = this.b;
        if (b != null) {
            b.q(i);
        }
    }
    
    protected final boolean pS() {
        return true;
    }
}
