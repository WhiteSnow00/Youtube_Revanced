import android.content.res.Resources;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnClickListener;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.app.Activity;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igk implements tgg
{
    private final TextView A;
    private final TextView B;
    private final ImageView C;
    private final LinearLayout D;
    private final PlaylistHeaderActionBarView E;
    private final TextView F;
    private final TextView G;
    private final FrameLayout H;
    private final arwh I;
    public final aaih a;
    public final atke b;
    public final wyw c;
    public final alog d;
    public final String e;
    public final View f;
    public final ImageView g;
    public final ImageView h;
    public final TextView i;
    public final OfflineArrowView j;
    public ilk k;
    public aaar l;
    public Boolean m;
    public boolean n;
    public boolean o;
    final acsy p;
    public final TextView q;
    final FrameLayout r;
    public final lmo s;
    public final aln t;
    public final ajb u;
    private final Activity v;
    private final acgs w;
    private final ImageView x;
    private final TextView y;
    private final TextView z;
    
    public igk(final Activity v, final acgs w, final lmo s, final aaih a, final ajb u, final aln t, final atke b, final arwh i, final ziy ziy, final wyw c, final alog d, final ViewGroup viewGroup, final String s2, final boolean b2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.v = v;
        this.w = w;
        this.s = s;
        this.a = a;
        this.u = u;
        this.t = t;
        this.b = b;
        this.I = i;
        this.c = c;
        this.d = d;
        tvb.n(s2);
        this.e = s2;
        final View viewById = viewGroup.findViewById(2131432029);
        this.f = viewById;
        ImageView x;
        if (viewById != null) {
            x = (ImageView)viewById.findViewById(2131432009);
        }
        else {
            x = null;
        }
        this.x = x;
        this.y = (TextView)viewGroup.findViewById(2131430493);
        this.z = (TextView)viewGroup.findViewById(2131430473);
        final TextView a2 = (TextView)viewGroup.findViewById(2131430476);
        this.A = a2;
        this.B = (TextView)viewGroup.findViewById(2131430485);
        this.C = (ImageView)viewGroup.findViewById(2131430623);
        this.g = (ImageView)viewGroup.findViewById(2131429539);
        this.h = (ImageView)viewGroup.findViewById(2131431401);
        this.i = (TextView)viewGroup.findViewById(2131430136);
        final LinearLayout d2 = (LinearLayout)viewGroup.findViewById(2131430474);
        this.D = d2;
        final PlaylistHeaderActionBarView e = (PlaylistHeaderActionBarView)viewGroup.findViewById(2131427488);
        this.E = e;
        final TextView f = (TextView)viewGroup.findViewById(2131430495);
        this.F = f;
        final TextView g = (TextView)viewGroup.findViewById(2131427452);
        this.G = g;
        final FrameLayout h = (FrameLayout)viewGroup.findViewById(2131429064);
        this.H = h;
        this.j = (OfflineArrowView)viewGroup.findViewById(2131430125);
        final TextView q = (TextView)viewGroup.findViewById(2131430412);
        this.q = q;
        final FrameLayout r = (FrameLayout)viewGroup.findViewById(2131430411);
        this.r = r;
        final acsy ap = ziy.ap(q);
        this.p = ap;
        if (b2) {
            d2.setPaddingRelative(v.getResources().getDimensionPixelSize(2131169824), d2.getPaddingTop(), d2.getPaddingEnd(), d2.getPaddingBottom());
            this.g((View)e, 2131168530);
            this.g((View)f, 2131169824);
            this.g((View)a2, 2131169824);
            this.g((View)g, 2131169824);
            this.g((View)h, 2131169824);
        }
        viewGroup.findViewById(2131428785).setVisibility(8);
        viewGroup.findViewById(2131431541).setVisibility(8);
        viewGroup.findViewById(2131431542).setVisibility(8);
        d2.setBackground((Drawable)null);
        final ahbb ahbb = (ahbb)((ahbh)aicz.a).createBuilder();
        final ahbb ahbb2 = (ahbb)((ahbh)akdi.a).createBuilder();
        final akdh hd = akdh.hd;
        ((ahaz)ahbb2).copyOnWrite();
        final akdi akdi = (akdi)ahbb2.instance;
        akdi.c = hd.sy;
        akdi.b |= 0x1;
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz = (aicz)ahbb.instance;
        final akdi g2 = (akdi)((ahaz)ahbb2).build();
        g2.getClass();
        aicz.g = g2;
        aicz.b |= 0x20;
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz2 = (aicz)ahbb.instance;
        aicz2.d = 35;
        aicz2.c = 1;
        final ajut g3 = acak.g(new String[] { "PLAY" });
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz3 = (aicz)ahbb.instance;
        g3.getClass();
        aicz3.i = g3;
        aicz3.b |= 0x200;
        final ahaz builder = ((ahbh)amwo.a).createBuilder();
        builder.copyOnWrite();
        final amwo amwo = (amwo)builder.instance;
        amwo.b |= 0x2;
        amwo.d = s2;
        final amwo amwo2 = (amwo)builder.build();
        final ahbb ahbb3 = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb3.e((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)amwo2);
        final aiqj o = (aiqj)((ahaz)ahbb3).build();
        ((ahaz)ahbb).copyOnWrite();
        final aicz aicz4 = (aicz)ahbb.instance;
        o.getClass();
        aicz4.o = o;
        aicz4.b |= 0x8000;
        ((acsx)ap).b((aicz)((ahaz)ahbb).build(), c);
        final Drawable background = q.getBackground();
        q.setBackground((Drawable)null);
        r.setBackground(background);
        r.setOnClickListener((View$OnClickListener)new ibb(this, 20));
    }
    
    private final void g(final View view, final int n) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            ((ViewGroup$MarginLayoutParams)layoutParams).setMarginStart(this.v.getResources().getDimensionPixelSize(n));
        }
    }
    
    public final void a(final Boolean m) {
        this.m = m;
        final ilk k = this.k;
        if (k != null) {
            k.d(m);
            return;
        }
        ttr.b("downloadButtonController is not properly initiated when sync.");
    }
    
    public final void b(final aaar l) {
        this.o = true;
        this.l = l;
        tpe.t(this.y, (CharSequence)l.b);
        final TextView z = this.z;
        final agq n = l.n;
        Object b;
        if (n == null) {
            b = null;
        }
        else {
            b = n.b;
        }
        tpe.t(z, (CharSequence)b);
        tpe.t(this.A, (CharSequence)null);
        this.d();
        final ImageView x = this.x;
        if (x != null && l.a() != null) {
            this.w.k(l.a(), (tcc)tca.c(this.v, (tcc)new igj(this, x)));
        }
        this.g.setEnabled(true);
        final ImageView g = this.g;
        final agq n2 = l.n;
        boolean b3;
        final boolean b2 = b3 = false;
        if (n2 != null) {
            b3 = b2;
            if (!n2.a) {
                b3 = b2;
                if (!l.a.startsWith("BL")) {
                    b3 = true;
                }
            }
        }
        tpe.v((View)g, b3);
        tpe.v((View)this.h, true ^ l.h);
        tpe.v((View)this.C, l.h);
    }
    
    public final void c(final boolean b) {
        this.n = b;
        this.g.setSelected(b);
    }
    
    public final void d() {
        this.l.getClass();
        if (fbu.aZ(this.I) && this.l.f != 0) {
            this.B.setText((CharSequence)jgk.x(this.v.getResources(), this.l.f, (int)Collection$_EL.stream((Collection)((aabo)this.b.a()).a().i().n(this.e)).filter((Predicate)igi.a).count()));
            return;
        }
        final TextView b = this.B;
        final Resources resources = this.v.getResources();
        final int e = this.l.e;
        b.setText((CharSequence)resources.getQuantityString(2131886130, e, new Object[] { e }));
    }
    
    public final void f() {
        final ilk k = this.k;
        if (k != null) {
            ((ikv)k).a();
        }
        else {
            ttr.b("downloadButtonController is not properly initiated when update.");
        }
        final int a = ((aabo)this.b.a()).a().i().a(this.e);
        if (this.i != null) {
            String quantityString;
            if (a > 0) {
                quantityString = this.v.getResources().getQuantityString(2131886096, a, new Object[] { a });
            }
            else {
                quantityString = null;
            }
            tpe.t(this.i, (CharSequence)quantityString);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        boolean b = true;
        final Class[] array = null;
        Class[] array2 = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 8: {
                final zyh zyh = (zyh)o;
                this.d();
                array2 = array;
                break;
            }
            case 7: {
                final zyg zyg = (zyg)o;
                this.d();
                array2 = array;
                break;
            }
            case 6: {
                final zxx zxx = (zxx)o;
                this.a(null);
                final aaas a = zxx.a;
                if (!a.d().equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.b(a.a);
                this.f();
                return null;
            }
            case 5: {
                if (!((zxw)o).a.equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 4: {
                if (!((zxv)o).a.d().equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 3: {
                if (!((zxt)o).a.equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 2: {
                if (!((zxs)o).a.equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 1: {
                if (!((zxr)o).a.equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 0: {
                final gfu gfu = (gfu)o;
                final aaar l = this.l;
                array2 = array;
                if (l == null) {
                    break;
                }
                array2 = array;
                if (l.a.equals(gfu.b())) {
                    if (gfu.a() != alog.a) {
                        b = false;
                    }
                    this.c(b);
                    return null;
                }
                break;
            }
            case -1: {
                array2 = new Class[] { gfu.class, zxr.class, zxs.class, zxt.class, zxv.class, zxw.class, zxx.class, zyg.class, zyh.class };
                break;
            }
        }
        return array2;
    }
}
