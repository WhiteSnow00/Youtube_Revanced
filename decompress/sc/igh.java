import java.util.Iterator;
import java.util.List;
import android.content.res.Resources;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.app.Activity;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import android.widget.ImageView;
import android.view.View;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igh implements tgg
{
    private final LinearLayout A;
    private final PlaylistHeaderActionBarView B;
    private final TextView C;
    private final TextView D;
    private final FrameLayout E;
    private final FloatingActionButton F;
    private gja G;
    private final arwh H;
    private final fzw I;
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
    public final lmo p;
    public final aln q;
    public final ajb r;
    private final Activity s;
    private final acgs t;
    private final ImageView u;
    private final TextView v;
    private final TextView w;
    private final TextView x;
    private final TextView y;
    private final ImageView z;
    
    public igh(final Activity s, final acgs t, final lmo p20, final aaih a, final fzw i, final ajb r, final aln q, final atke b, final arwh h, final wyw c, final alog d, final ViewGroup viewGroup, final String e, final boolean b2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.s = s;
        this.t = t;
        this.p = p20;
        this.a = a;
        this.I = i;
        this.r = r;
        this.q = q;
        this.b = b;
        this.H = h;
        this.c = c;
        this.d = d;
        tvb.n(e);
        this.e = e;
        final View viewById = viewGroup.findViewById(2131432029);
        this.f = viewById;
        ImageView u;
        if (viewById != null) {
            u = (ImageView)viewById.findViewById(2131432009);
        }
        else {
            u = null;
        }
        this.u = u;
        this.v = (TextView)viewGroup.findViewById(2131430493);
        this.w = (TextView)viewGroup.findViewById(2131430473);
        final TextView x = (TextView)viewGroup.findViewById(2131430476);
        this.x = x;
        this.y = (TextView)viewGroup.findViewById(2131430485);
        final ImageView z = (ImageView)viewGroup.findViewById(2131430623);
        this.z = z;
        this.g = (ImageView)viewGroup.findViewById(2131429539);
        this.h = (ImageView)viewGroup.findViewById(2131431401);
        this.i = (TextView)viewGroup.findViewById(2131430136);
        final LinearLayout a2 = (LinearLayout)viewGroup.findViewById(2131430474);
        this.A = a2;
        final PlaylistHeaderActionBarView b3 = (PlaylistHeaderActionBarView)viewGroup.findViewById(2131427488);
        this.B = b3;
        final TextView c2 = (TextView)viewGroup.findViewById(2131430495);
        this.C = c2;
        final TextView d2 = (TextView)viewGroup.findViewById(2131427452);
        this.D = d2;
        final FrameLayout e2 = (FrameLayout)viewGroup.findViewById(2131429064);
        this.E = e2;
        this.j = (OfflineArrowView)viewGroup.findViewById(2131430125);
        this.F = (FloatingActionButton)viewGroup.findViewById(2131430479);
        if (b2) {
            a2.setPaddingRelative(s.getResources().getDimensionPixelSize(2131169824), a2.getPaddingTop(), a2.getPaddingEnd(), a2.getPaddingBottom());
            this.i((View)b3, 2131168530);
            this.i((View)c2, 2131169824);
            this.i((View)x, 2131169824);
            this.i((View)d2, 2131169824);
            this.i((View)e2, 2131169824);
        }
        viewGroup.findViewById(2131428785).setVisibility(8);
        viewGroup.findViewById(2131431540).setVisibility(8);
        viewGroup.findViewById(2131430595).setVisibility(8);
        a2.setBackground((Drawable)null);
        z.setImageResource(2131232809);
    }
    
    private final void i(final View view, final int n) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            ((ViewGroup$MarginLayoutParams)layoutParams).setMarginStart(this.s.getResources().getDimensionPixelSize(n));
        }
    }
    
    public final void a() {
        final gja g = this.G;
        if (g != null) {
            g.a((gdz)null);
            return;
        }
        ttr.b("playlistHeaderFabController is not properly initiated.");
    }
    
    public final void b(final Boolean m) {
        this.m = m;
        final ilk k = this.k;
        if (k != null) {
            k.d(m);
            return;
        }
        ttr.b("downloadButtonController is not properly initiated when sync.");
    }
    
    public final void c(final aaar l) {
        this.o = true;
        this.l = l;
        tpe.t(this.v, (CharSequence)l.b);
        final TextView w = this.w;
        final agq n = l.n;
        Object b;
        if (n == null) {
            b = null;
        }
        else {
            b = n.b;
        }
        tpe.t(w, (CharSequence)b);
        tpe.t(this.x, (CharSequence)null);
        this.f();
        final ImageView u = this.u;
        if (u != null && l.a() != null) {
            this.t.k(l.a(), (tcc)tca.c(this.s, (tcc)new igg(this, u)));
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
        tpe.v((View)this.z, l.h);
    }
    
    public final void d(final boolean b) {
        this.n = b;
        this.g.setSelected(b);
    }
    
    public final void f() {
        this.l.getClass();
        if (fbu.aZ(this.H) && this.l.f != 0) {
            this.y.setText((CharSequence)jgk.x(this.s.getResources(), this.l.f, (int)Collection$_EL.stream((Collection)((aabo)this.b.a()).a().i().n(this.e)).filter((Predicate)igi.b).count()));
            return;
        }
        final TextView y = this.y;
        final Resources resources = this.s.getResources();
        final int e = this.l.e;
        y.setText((CharSequence)resources.getQuantityString(2131886130, e, new Object[] { e }));
    }
    
    public final void g() {
        final gja ab = this.I.ab(this.F);
        this.G = ab;
        final aaeg i = ((aabo)this.b.a()).a().i();
        final List n = i.n(this.e);
        final String s = null;
        String a = null;
        Label_0118: {
            if (n == null) {
                a = s;
            }
            else {
                final Iterator iterator = i.n(this.e).iterator();
                aabf aabf;
                do {
                    a = s;
                    if (!iterator.hasNext()) {
                        break Label_0118;
                    }
                    aabf = (aabf)iterator.next();
                } while (aabf.i() != aabb.b);
                a = aabf.a();
            }
        }
        if (aezr.f(a)) {
            this.a();
            return;
        }
        final String e = this.e;
        final String string = this.s.getString(2132017341);
        a.getClass();
        string.getClass();
        ab.a((gdz)new geg(e, a, string));
    }
    
    public final void h() {
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
                quantityString = this.s.getResources().getQuantityString(2131886096, a, new Object[] { a });
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
                this.f();
                this.g();
                array2 = array;
                break;
            }
            case 7: {
                final zyg zyg = (zyg)o;
                this.f();
                this.g();
                array2 = array;
                break;
            }
            case 6: {
                final zxx zxx = (zxx)o;
                this.b(null);
                final aaas a = zxx.a;
                if (!a.d().equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.c(a.a);
                this.h();
                return null;
            }
            case 5: {
                if (!((zxw)o).a.equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.h();
                return null;
            }
            case 4: {
                if (!((zxv)o).a.d().equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.h();
                return null;
            }
            case 3: {
                if (!((zxt)o).a.equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.h();
                return null;
            }
            case 2: {
                if (!((zxs)o).a.equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.h();
                return null;
            }
            case 1: {
                if (!((zxr)o).a.equals(this.e)) {
                    array2 = array;
                    break;
                }
                this.h();
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
                    this.d(b);
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
