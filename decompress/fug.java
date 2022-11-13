import android.text.Spanned;
import java.util.function.Function;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import java.util.Iterator;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fug implements acko
{
    public final Object a;
    private final int b;
    private final Object c;
    private final Object d;
    
    public fug(final Context context, final int b) {
        this.b = b;
        final LinearLayout c = (LinearLayout)LayoutInflater.from(context).inflate(2131624774, (ViewGroup)null);
        this.c = c;
        final LinearLayout linearLayout = c;
        this.a = c.findViewById(2131428917);
        final LinearLayout linearLayout2 = c;
        this.d = c.findViewById(2131428919);
    }
    
    public fug(final Context context, final int n, final wyw a, final int b) {
        this.b = b;
        this.a = a;
        final View inflate = LayoutInflater.from(context).inflate(n, (ViewGroup)null);
        this.d = inflate;
        final View view = inflate;
        final TextView c = (TextView)inflate.findViewById(2131432095);
        this.c = c;
        final OptionalInt cz = tpe.cz(context, 2130970915);
        final TextView textView = c;
        cz.ifPresent((IntConsumer)new rla(c, 1));
        final Optional cv = tpe.cv(context, 2130970926);
        c.getClass();
        cv.ifPresent((Consumer)new rlb(c, 1));
    }
    
    public fug(final Context d, final acpk a, final int b) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = View.inflate(d, 17367043, (ViewGroup)null);
    }
    
    public fug(final Context d, final afaq afaq, final int b) {
        this.b = b;
        this.d = d;
        final ackr a = (ackr)afaq.a();
        this.a = a;
        final View inflate = View.inflate(d, 2131624399, (ViewGroup)null);
        this.c = inflate;
        final View view = inflate;
        a.c(inflate);
    }
    
    public fug(final Context context, final ViewGroup viewGroup, final elx c, final rkc a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = LayoutInflater.from(context).inflate(2131625804, viewGroup, false);
    }
    
    public fug(final Context context, final gjh a, final int b) {
        this.b = b;
        context.getClass();
        a.getClass();
        this.a = a;
        final View inflate = View.inflate(context, 2131624424, (ViewGroup)null);
        this.d = inflate;
        final View view = inflate;
        this.c = inflate.findViewById(2131432095);
        final View view2 = inflate;
        a.c(inflate);
    }
    
    public fug(final Context context, final gug gug, final wyw a, final ViewGroup viewGroup, final int b, final byte[] array) {
        this.b = b;
        final TextView d = (TextView)LayoutInflater.from(context).inflate(2131625532, viewGroup, false);
        this.d = d;
        final TextView textView = d;
        this.c = gug.d(d);
        this.a = a;
    }
    
    public fug(final Context context, final rli rli, final int b) {
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624788, (ViewGroup)null);
        this.d = inflate;
        final View view = inflate;
        inflate.findViewById(2131427946).setVisibility(8);
        final View view2 = inflate;
        final TextView a = (TextView)inflate.findViewById(2131430009);
        this.a = a;
        final View view3 = inflate;
        this.c = inflate.findViewById(2131432009);
        final rhs onClickListener = new rhs(rli, 10);
        final View view4 = inflate;
        inflate.setOnClickListener((View$OnClickListener)onClickListener);
        final OptionalInt cz = tpe.cz(context, 2130970914);
        final TextView textView = a;
        cz.ifPresent((IntConsumer)new rla(a, 0));
        final Optional cv = tpe.cv(context, 2130968579);
        a.getClass();
        cv.ifPresent((Consumer)new rlb(a, 0));
    }
    
    public fug(final Context context, final vcy a, final ViewGroup viewGroup, final int b) {
        this.b = b;
        this.a = a;
        final View inflate = LayoutInflater.from(context).inflate(2131625344, viewGroup, false);
        this.d = inflate;
        final View view = inflate;
        this.c = inflate.findViewById(2131431986);
    }
    
    public fug(final blu blu, final Context d, final vai a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = blu.j(2131624821);
    }
    
    public static aezp b(final anyz anyz) {
        final int b = anyz.b;
        ahab f;
        if ((b & 0x8) != 0x0) {
            f = anyz.f;
        }
        else {
            f = null;
        }
        if (f != null && !f.H()) {
            return aezp.k((Object)new wyt(f));
        }
        if ((b & 0x4) != 0x0) {
            ahhu ahhu;
            if ((ahhu = anyz.e) == null) {
                ahhu = ahhu.a;
            }
            if (xaa.d(ahhu.c)) {
                ahhu ahhu2;
                if ((ahhu2 = anyz.e) == null) {
                    ahhu2 = ahhu.a;
                }
                return aezp.k((Object)new wyt(xaa.c(ahhu2.c)));
            }
        }
        return (aezp)aeyo.a;
    }
    
    public final View a() {
        switch (this.b) {
            default: {
                return (View)this.d;
            }
            case 8: {
                return (View)this.d;
            }
            case 7: {
                return ((ackr)this.a).a();
            }
            case 6: {
                return (View)this.c;
            }
            case 5: {
                return ((gjh)this.a).a;
            }
            case 4: {
                return (View)this.d;
            }
            case 3: {
                return ((fuv)this.c).a;
            }
            case 2: {
                return (View)this.c;
            }
            case 1: {
                return (View)this.d;
            }
            case 0: {
                return (View)this.d;
            }
        }
    }
    
    public final void c(final acku acku) {
        final int b = this.b;
        if (b == 0) {
            for (evi evi : ((rkc)this.a).a) {}
            return;
        }
        if (b == 1) {
            ((fwp)this.c).g((aomw)null, (wyw)this.a);
            return;
        }
        if (b != 3) {
            return;
        }
        ((fuv)this.c).c(acku);
    }
    
    public final void mN(final ackm h, Object o) {
        final int b = this.b;
        final appm appm = null;
        final ajut ajut = null;
        switch (b) {
            default: {
                final rlc rlc = (rlc)o;
                ((TextView)this.a).setText(2132017429);
                final Context context = ((View)this.d).getContext();
                final Drawable drawable = context.getResources().getDrawable(2131232584, (Resources$Theme)null);
                ((ImageView)this.c).setImageDrawable((Drawable)tpe.cv(context, 2130970926).map((Function)new gjs(context, drawable, 3)).orElse((Object)drawable));
                return;
            }
            case 8: {
                final ahjr ahjr = (ahjr)o;
                ((wyw)this.a).t((wzz)new wyt(ahjr.d), (alhi)null);
                ajut ajut2;
                if ((ajut2 = ahjr.c) == null) {
                    ajut2 = ajut.a;
                }
                final Spanned b2 = acak.b(ajut2);
                ((TextView)this.c).setText((CharSequence)b2);
                ((View)this.d).setContentDescription((CharSequence)b2);
                return;
            }
            case 7: {
                final acpe acpe = (acpe)o;
                if (tpe.bq((Context)this.d)) {
                    o = this.c;
                    ((View)o).setMinimumHeight(((Context)this.d).getResources().getDimensionPixelSize(2131166404));
                }
                ((ackr)this.a).e(h);
                return;
            }
            case 6: {
                final kdt kdt = (kdt)o;
                if (kdt == null) {
                    return;
                }
                tpe.v((View)this.c, true);
                final Object a = this.a;
                o = kdt.a;
                tpe.t((TextView)a, (CharSequence)o);
                tpe.v((View)this.d, true);
                o = this.d;
                ((Button)o).setOnClickListener((View$OnClickListener)new jux(kdt, 13));
                return;
            }
            case 5: {
                final ajrn ajrn = (ajrn)o;
                final Object c = this.c;
                ajut ajut3 = ajut;
                if ((0x1 & ajrn.b) != 0x0 && (ajut3 = ajrn.c) == null) {
                    ajut3 = ajut.a;
                }
                ((TextView)c).setText((CharSequence)acak.b(ajut3));
                ((ackr)this.a).e(h);
                return;
            }
            case 4: {
                final anyz anyz = (anyz)o;
                final Object c2 = this.c;
                ajut ajut4;
                if ((ajut4 = anyz.c) == null) {
                    ajut4 = ajut.a;
                }
                tpe.t((TextView)c2, (CharSequence)acak.b(ajut4));
                final byte[] b3 = ((wyy)h).b;
                appm appm3;
                if (b3 != null && b3.length > 0) {
                    final ahaz builder = appm.a.createBuilder();
                    final ahab x = ahab.x(((wyy)h).b);
                    builder.copyOnWrite();
                    final appm appm2 = (appm)builder.instance;
                    appm2.b |= 0x1;
                    appm2.c = x;
                    appm3 = (appm)builder.build();
                }
                else {
                    final xab c3 = ((wyy)h).c;
                    appm3 = appm;
                }
                final aezp b4 = b(anyz);
                if (b4.h()) {
                    ((wyy)h).a.m((wzz)b4.c(), xmm.ac(appm3));
                }
                o = this.d;
                ((View)o).setOnClickListener((View$OnClickListener)new gbw(this, anyz, h, 15, (byte[])null));
                return;
            }
            case 3: {
                final fux fux = (fux)o;
                if (((vai)this.a).aU()) {
                    ((fuv)this.c).a.findViewById(2131429844).setBackgroundColor(tpe.cr((Context)this.d, 2130970829));
                }
                ((fuv)this.c).b(h, (fva)fux);
                return;
            }
            case 2: {
                final amgp amgp = (amgp)o;
                o = this.c;
                ((TextView)o).setText(vyg.h(amgp));
                if (vyg.f(amgp) != null) {
                    final Object c4 = this.c;
                    final Object a2 = this.a;
                    akdh akdh;
                    if ((akdh = akdh.b(vyg.f(amgp).c)) == null) {
                        akdh = akdh.a;
                    }
                    ((TextView)c4).setCompoundDrawablesWithIntrinsicBounds(((acpk)a2).a(akdh), 0, 0, 0);
                    ((TextView)this.c).setCompoundDrawablePadding(((Context)this.d).getResources().getDimensionPixelOffset(2131166971));
                }
                return;
            }
            case 1: {
                ((fwp)this.c).g((aomw)o, (wyw)this.a);
                return;
            }
            case 0: {
                final fue fue = (fue)o;
                final Object a3 = ((elx)this.c).a;
                a3.getClass();
                final View g = (View)this.d;
                final rox rox = (rox)a3;
                rox.g = g;
                rox.h = h;
                final rou c5 = rox.c;
                if (c5 != null) {
                    c5.b(g, h);
                }
                for (evi evi : ((rkc)this.a).a) {}
            }
        }
    }
}
