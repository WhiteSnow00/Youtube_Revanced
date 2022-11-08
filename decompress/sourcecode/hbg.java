import java.util.concurrent.Callable;
import android.support.v7.widget.RecyclerView;
import android.os.Parcelable;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Typeface;
import android.view.View$OnClickListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import android.content.Context;
import com.google.android.libraries.youtube.edit.gallery.MediaGridRecyclerView;
import android.view.View;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbg extends hbj
{
    public Executor a;
    public hbf ae;
    public View af;
    public View ag;
    public MediaGridRecyclerView ah;
    public int ai;
    public String aj;
    public int ak;
    public wwv al;
    public ucs am;
    public avt an;
    public auip ao;
    private boolean ap;
    private int aq;
    private boolean ar;
    private boolean as;
    public Executor b;
    public Context c;
    public uje d;
    public uqe e;
    
    public hbg() {
        this.ai = -1;
        this.aj = null;
    }
    
    public static hbg aK(final boolean b, final aioe aioe, final AccountId accountId) {
        return s(b, 2132019767, b, 0, aioe, accountId);
    }
    
    public static hbg s(final boolean b, final int n, final boolean b2, final int n2, final aioe aioe, final AccountId accountId) {
        final hbg hbg = new hbg();
        final Bundle bundle = new Bundle();
        bundle.putString("ARG_DIRECTORY_PATH", (String)null);
        bundle.putBoolean("ARG_BOTTOM_SHEET_MODE", b);
        bundle.putInt("ARG_TITLE_RESOURCE", n);
        bundle.putInt("ARG_FILE_TYPE", n2);
        bundle.putBoolean("ARG_HIDE_HEADER", b2);
        if (aioe != null) {
            bundle.putByteArray("navigation_endpoint", ((agxl)aioe).toByteArray());
        }
        ((br)hbg).ag(bundle);
        aenz.e((br)hbg, accountId);
        return hbg;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final boolean ba = this.ao.bA();
        this.as = ba;
        if (ba) {
            this.c = (Context)new ContextThemeWrapper(this.c, 2132083491);
        }
        final View inflate = layoutInflater.cloneInContext(this.c).inflate(2131625400, viewGroup, false);
        final bu od = ((br)this).od();
        if (this.ar) {
            inflate.findViewById(2131429109).setVisibility(8);
        }
        if (this.as) {
            hjp.f(((br)this).od(), this.c.getResources().getColor(2131102338));
            final int n = (int)this.c.getResources().getDimension(2131169330);
            this.aq = 2132019768;
            final Typeface a = abyk.p.a(this.c);
            final TextView textView = (TextView)inflate.findViewById(2131427877);
            textView.setPadding(n, n, n, n);
            textView.setTypeface(a);
            textView.setTextSize(0, this.c.getResources().getDimension(2131169335));
            final ImageView imageView = (ImageView)inflate.findViewById(2131428234);
            imageView.setImageBitmap(((BitmapDrawable)this.c.getResources().getDrawable(2131233936)).getBitmap());
            imageView.setPadding(n, n, n, n);
            final ViewGroup$LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                ((ViewGroup$MarginLayoutParams)layoutParams).leftMargin = this.c.getResources().getDimensionPixelOffset(2131169333);
            }
            final ViewGroup viewGroup2 = (ViewGroup)inflate.findViewById(2131429109);
            final int dimensionPixelOffset = this.c.getResources().getDimensionPixelOffset(2131166384);
            viewGroup2.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        }
        ((TextView)inflate.findViewById(2131427877)).setText((CharSequence)this.c.getResources().getString(this.aq));
        this.af = inflate.findViewById(2131432519);
        this.ag = inflate.findViewById(2131430291);
        this.ah = (MediaGridRecyclerView)inflate.findViewById(2131429788);
        inflate.findViewById(2131427594).setOnClickListener((View$OnClickListener)new gxu(this, 9));
        inflate.findViewById(2131428234).setOnClickListener((View$OnClickListener)new gxu(this, 10));
        final MediaGridRecyclerView ah = this.ah;
        if (ah != null) {
            ah.setFocusableInTouchMode(false);
        }
        Parcelable parcelable;
        if (bundle != null) {
            parcelable = bundle.getParcelable("layout_manager_state");
        }
        else {
            parcelable = null;
        }
        if (od != null) {
            final uqe e = new uqe((Context)od, this.a, 0);
            this.e = e;
            e.e = this.ap;
            ((nq)e).v((hw)new hbe(this));
        }
        final MediaGridRecyclerView ah2 = this.ah;
        if (ah2 != null) {
            ((RecyclerView)ah2).ac((nq)this.e);
        }
        final MediaGridRecyclerView ah3 = this.ah;
        if (ah3 != null) {
            final nw n2 = ((RecyclerView)ah3).n;
            if (parcelable != null && n2 != null) {
                n2.Z(parcelable);
            }
        }
        final MediaGridRecyclerView ah4 = this.ah;
        if (ah4 != null) {
            ((RecyclerView)ah4).aC((hy)new hbh(this.c));
        }
        final uqe e2 = this.e;
        if (e2 != null) {
            e2.a = (uqb)new upv(this, 1);
        }
        final avt an = this.an;
        if (an != null) {
            final tuw s = an.S(wya.c(96638));
            s.k(true);
            s.c();
            this.an.S(wya.c(22156)).c();
        }
        final uqe e3 = this.e;
        if (e3 != null && !e3.B()) {
            this.d();
        }
        this.am.i(this.ap);
        return inflate;
    }
    
    public final void Y() {
        super.Y();
        final MediaGridRecyclerView ah = this.ah;
        if (ah != null) {
            uqe.y((RecyclerView)ah);
        }
    }
    
    public final void aa() {
        super.aa();
        this.e.getClass();
        tcp.k(afld.k((Callable)new hbi(this.r(), this.d, this.ak), this.a), this.b, (tcn)gnh.g, (tco)new erz(this, 17));
    }
    
    public final void d() {
        final avt an = this.an;
        if (an != null) {
            final tuw s = an.S(wya.c(97092));
            s.k(true);
            s.c();
        }
    }
    
    public final wwv n() {
        return this.al;
    }
    
    protected final wyb o() {
        if (this.ap) {
            return null;
        }
        return wya.b(96660);
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        if (m != null) {
            this.aj = m.getString("ARG_DIRECTORY_PATH");
            this.ap = m.getBoolean("ARG_BOTTOM_SHEET_MODE");
            this.aq = m.getInt("ARG_TITLE_RESOURCE");
            this.ar = m.getBoolean("ARG_HIDE_HEADER");
            this.ak = m.getInt("ARG_FILE_TYPE");
        }
    }
    
    public final void pK(final Bundle bundle) {
        final MediaGridRecyclerView ah = this.ah;
        if (ah != null) {
            final nw n = ((RecyclerView)ah).n;
            if (n != null) {
                bundle.putParcelable("layout_manager_state", n.Q());
            }
        }
    }
    
    public final boolean r() {
        return uqs.e((Context)((br)this).od(), 0);
    }
    
    protected final alff sz() {
        final alff a = alff.a;
        if (this.am.a() == null) {
            zjp.b(zjo.a, zjn.l, "[ShortsCreation][Android][Gallery]Frontend id not available for logging");
            return a;
        }
        final agza builder = ((agzi)alff.a).createBuilder();
        final agza builder2 = ((agzi)algf.a).createBuilder();
        final agza builder3 = ((agzi)algb.a).createBuilder();
        final String a2 = this.am.a();
        a2.getClass();
        builder3.copyOnWrite();
        final algb algb = (algb)builder3.instance;
        algb.b |= 0x1;
        algb.c = a2;
        final algb g = (algb)builder3.build();
        builder2.copyOnWrite();
        final algf algf = (algf)builder2.instance;
        g.getClass();
        algf.g = g;
        algf.b |= 0x20;
        final algf d = (algf)builder2.build();
        builder.copyOnWrite();
        final alff alff = (alff)builder.instance;
        d.getClass();
        alff.D = d;
        alff.c |= 0x40000;
        return (alff)builder.build();
    }
}
