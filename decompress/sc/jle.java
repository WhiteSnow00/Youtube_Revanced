import android.view.ViewStub;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import java.util.List;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jle extends acld
{
    public final vcy a;
    public boolean b;
    public aprp c;
    private final Context d;
    private final acgs e;
    private final ackr f;
    private final Resources g;
    private final LayoutInflater h;
    private final LinearLayout i;
    private final LinearLayout j;
    private FrameLayout k;
    private ImageView l;
    private TextView m;
    private LinearLayout n;
    private boolean o;
    private boolean p;
    private int q;
    
    public jle(final Context d, final acgs e, final gjh f, final vcy a) {
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = (ackr)f;
        a.getClass();
        this.a = a;
        this.g = d.getResources();
        final LayoutInflater from = LayoutInflater.from(d);
        this.h = from;
        final View inflate = from.inflate(2131625771, (ViewGroup)null);
        this.i = (LinearLayout)inflate.findViewById(2131428016);
        this.j = (LinearLayout)inflate.findViewById(2131428008);
        this.b = false;
        this.o = false;
        this.p = false;
        f.c(inflate);
    }
    
    private final void g() {
        aprn aprn;
        if ((aprn = this.c.g) == null) {
            aprn = aprn.a;
        }
        if (aprn.d.size() == 0) {
            return;
        }
        aprn aprn2;
        if ((aprn2 = this.c.g) == null) {
            aprn2 = aprn.a;
        }
        final ahbx d = aprn2.d;
        if (!this.p) {
            this.h.inflate(2131625796, (ViewGroup)this.j, true);
            final LinearLayout j = this.j;
            final TextView textView = (TextView)j.getChildAt(j.getChildCount() - 1);
            final aprn g = this.c.g;
            aprn a;
            if (g == null) {
                a = aprn.a;
            }
            else {
                a = g;
            }
            ajut ajut;
            if ((a.b & 0x1) != 0x0) {
                aprn a2;
                if ((a2 = g) == null) {
                    a2 = aprn.a;
                }
                if ((ajut = a2.c) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            textView.setText((CharSequence)acak.b(ajut));
            this.h.inflate(2131625787, (ViewGroup)this.j, true);
        }
        final LinearLayout n = this.n;
        if (n == null) {
            (this.n = new LinearLayout(this.d)).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
            this.n.setOrientation(0);
            final int az = tpe.aZ(this.g.getDisplayMetrics(), 7);
            this.n.setPadding(az, az, az, az);
            this.j.addView((View)this.n);
        }
        else {
            n.removeAllViews();
        }
        final int integer = this.g.getInteger(2131493128);
        final int min = Math.min(integer, ((List)d).size());
        this.n.setWeightSum((float)integer);
        for (int i = 0; i < min; ++i) {
            final apro apro = (apro)((List)d).get(i);
            final View inflate = this.h.inflate(2131625792, (ViewGroup)null);
            final TextView textView2 = (TextView)inflate.findViewById(2131432095);
            ajut ajut2;
            if ((apro.b & 0x1) != 0x0) {
                if ((ajut2 = apro.c) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            textView2.setText((CharSequence)acak.b(ajut2));
            aotp aotp;
            if ((aotp = apro.d) == null) {
                aotp = aotp.a;
            }
            this.h(inflate, 2131432009, aotp);
            aiqj aiqj;
            if ((apro.b & 0x4) != 0x0) {
                if ((aiqj = apro.e) == null) {
                    aiqj = aiqj.a;
                }
            }
            else {
                aiqj = null;
            }
            inflate.setOnClickListener((View$OnClickListener)new jlb(this, aiqj, 6));
            this.n.addView(inflate);
            inflate.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, -1, 1.0f));
        }
    }
    
    private final void h(final View view, int visibility, final aotp aotp) {
        final ImageView imageView = (ImageView)view.findViewById(visibility);
        this.e.g(imageView, aotp);
        if (!aald.S(aotp)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        imageView.setVisibility(visibility);
    }
    
    public final View a() {
        return ((gjh)this.f).a;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aprp)o).k.I();
    }
    
    public final void f() {
        if (this.b) {
            if (!this.p) {
                final aprp c = this.c;
                aprk aprk;
                if ((aprk = c.h) == null) {
                    aprk = aprk.a;
                }
                Object b;
                if (aprk.b == 49961548) {
                    aprk aprk2;
                    if ((aprk2 = c.h) == null) {
                        aprk2 = aprk.a;
                    }
                    aprz a;
                    if (aprk2.b == 49961548) {
                        a = (aprz)aprk2.c;
                    }
                    else {
                        a = aprz.a;
                    }
                    b = a.b;
                }
                else {
                    b = null;
                }
                if (b != null) {
                    this.j.removeAllViews();
                    for (int i = 0; i < ((List)b).size(); ++i) {
                        if (i != 0) {
                            this.h.inflate(2131625787, (ViewGroup)this.j, true);
                        }
                        final LinearLayout j = this.j;
                        final aprx aprx = (aprx)((List)b).get(i);
                        final View inflate = this.h.inflate(2131625798, (ViewGroup)null);
                        final TextView textView = (TextView)inflate.findViewById(2131432095);
                        ajut ajut;
                        if ((aprx.b & 0x4) != 0x0) {
                            if ((ajut = aprx.e) == null) {
                                ajut = ajut.a;
                            }
                        }
                        else {
                            ajut = null;
                        }
                        textView.setText((CharSequence)acak.b(ajut));
                        final TextView textView2 = (TextView)inflate.findViewById(2131428769);
                        ajut ajut2;
                        if ((aprx.b & 0x8) != 0x0) {
                            if ((ajut2 = aprx.f) == null) {
                                ajut2 = ajut.a;
                            }
                        }
                        else {
                            ajut2 = null;
                        }
                        tpe.t(textView2, (CharSequence)acak.b(ajut2));
                        ajut ajut3;
                        if ((aprx.b & 0x2) != 0x0) {
                            if ((ajut3 = aprx.d) == null) {
                                ajut3 = ajut.a;
                            }
                        }
                        else {
                            ajut3 = null;
                        }
                        final Spanned b2 = acak.b(ajut3);
                        if (!TextUtils.isEmpty((CharSequence)b2)) {
                            final TextView textView3 = (TextView)inflate.findViewById(2131429358);
                            textView3.setVisibility(0);
                            textView3.setText((CharSequence)b2);
                        }
                        if ((aprx.b & 0x1) != 0x0) {
                            aotp aotp;
                            if ((aotp = aprx.c) == null) {
                                aotp = aotp.a;
                            }
                            this.h(inflate, 2131432009, aotp);
                        }
                        inflate.findViewById(2131432323).setOnClickListener((View$OnClickListener)new jlb(this, aprx, 4));
                        j.addView(inflate);
                    }
                }
                aprk aprk3;
                if ((aprk3 = this.c.h) == null) {
                    aprk3 = aprk.a;
                }
                if (aprk3.b == 49627160) {
                    int n = 0;
                    while (true) {
                        apra a2;
                        if (aprk3.b == 49627160) {
                            a2 = (apra)aprk3.c;
                        }
                        else {
                            a2 = apra.a;
                        }
                        if (n >= a2.b.size()) {
                            break;
                        }
                        if (n != 0) {
                            this.h.inflate(2131625787, (ViewGroup)this.j, true);
                        }
                        final LinearLayout k = this.j;
                        apra a3;
                        if (aprk3.b == 49627160) {
                            a3 = (apra)aprk3.c;
                        }
                        else {
                            a3 = apra.a;
                        }
                        final apqz apqz = (apqz)a3.b.get(n);
                        final View inflate2 = this.h.inflate(2131625772, (ViewGroup)null);
                        final TextView textView4 = (TextView)inflate2.findViewById(2131432095);
                        ajut ajut4;
                        if ((apqz.b & 0x2) != 0x0) {
                            if ((ajut4 = apqz.d) == null) {
                                ajut4 = ajut.a;
                            }
                        }
                        else {
                            ajut4 = null;
                        }
                        textView4.setText((CharSequence)acak.b(ajut4));
                        final TextView textView5 = (TextView)inflate2.findViewById(2131432502);
                        ajut ajut5;
                        if ((apqz.b & 0x4) != 0x0) {
                            if ((ajut5 = apqz.e) == null) {
                                ajut5 = ajut.a;
                            }
                        }
                        else {
                            ajut5 = null;
                        }
                        tpe.t(textView5, (CharSequence)acak.b(ajut5));
                        if ((apqz.b & 0x1) != 0x0) {
                            aotp aotp2;
                            if ((aotp2 = apqz.c) == null) {
                                aotp2 = aotp.a;
                            }
                            this.h(inflate2, 2131432009, aotp2);
                        }
                        inflate2.findViewById(2131427574).setOnClickListener((View$OnClickListener)new jlb(this, apqz, 5));
                        k.addView(inflate2);
                        ++n;
                    }
                }
                this.g();
                this.p = true;
            }
            if (this.g.getConfiguration().orientation == 1) {
                final View viewById = this.k.findViewById(2131428023);
                final int paddingTop = viewById.getPaddingTop();
                viewById.setPadding(paddingTop, paddingTop, paddingTop, 0);
            }
            this.l.setImageResource(2131230971);
            this.j.setVisibility(0);
            return;
        }
        if (this.g.getConfiguration().orientation == 1) {
            final View viewById2 = this.k.findViewById(2131428023);
            final int paddingTop2 = viewById2.getPaddingTop();
            viewById2.setPadding(paddingTop2, paddingTop2, paddingTop2, paddingTop2);
        }
        this.l.setImageResource(2131230972);
        this.j.setVisibility(8);
    }
    
    public final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aprp c = (aprp)o;
        this.p = false;
        if (!c.equals((Object)this.c)) {
            this.o = false;
        }
        if (this.o && this.g.getConfiguration().orientation == this.q) {
            this.f.e(ackm);
            return;
        }
        final boolean o2 = this.o;
        final int n = 1;
        if (!o2) {
            this.c = c;
            this.b = (c.i ^ true);
        }
        if (this.i.findViewById(2131428014) != null) {
            this.i.removeViewAt(0);
        }
        final LayoutInflater h = this.h;
        final ajut ajut = null;
        final ajut ajut2 = null;
        final LinearLayout linearLayout = (LinearLayout)h.inflate(2131625780, (ViewGroup)null);
        this.i.addView((View)linearLayout, 0);
        final TextView textView = (TextView)this.i.findViewById(2131428026);
        final aprp c2 = this.c;
        ajut ajut3;
        if ((c2.b & 0x1) != 0x0) {
            if ((ajut3 = c2.c) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        textView.setText((CharSequence)acak.b(ajut3));
        (this.m = (TextView)this.i.findViewById(2131428015)).setPadding(0, 0, 0, tpe.aZ(this.g.getDisplayMetrics(), 4));
        this.m.setVisibility(0);
        this.m.setText((CharSequence)acak.n((List)this.c.e)[0]);
        if ((this.c.b & 0x4) != 0x0) {
            this.i.findViewById(2131428011).setOnClickListener((View$OnClickListener)new jgx(this, 20));
        }
        final TextView textView2 = (TextView)linearLayout.findViewById(2131428025);
        final aprp c3 = this.c;
        ajut ajut4;
        if ((c3.b & 0x80) != 0x0) {
            if ((ajut4 = c3.j) == null) {
                ajut4 = ajut.a;
            }
        }
        else {
            ajut4 = null;
        }
        textView2.setText((CharSequence)acak.b(ajut4));
        this.l = (ImageView)this.i.findViewById(2131428024);
        (this.k = (FrameLayout)this.i.findViewById(2131428022)).setOnClickListener((View$OnClickListener)new jms(this, 1));
        final FrameLayout frameLayout = (FrameLayout)this.i.findViewById(2131427957);
        final FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = (FixedAspectRatioRelativeLayout)this.i.findViewById(2131427954);
        final TextView textView3 = (TextView)frameLayout.findViewById(2131427953);
        final aprp c4 = this.c;
        aprd aprd;
        if ((c4.b & 0x8) != 0x0) {
            if ((aprd = c4.f) == null) {
                aprd = aprd.a;
            }
        }
        else {
            aprd = null;
        }
        final int b = aprd.b;
        int n2 = 49968063;
        apre apre;
        if (b == 49968063) {
            apre = (apre)aprd.c;
        }
        else {
            n2 = b;
            apre = null;
        }
        aiqj aiqj;
        if (apre != null) {
            fixedAspectRatioRelativeLayout.a = this.g.getFraction(2131361794, 1, 1);
            if (frameLayout.findViewById(2131432426) == null) {
                ((ViewStub)frameLayout.findViewById(2131432427)).inflate();
            }
            if ((aiqj = apre.f) == null) {
                aiqj = aiqj.a;
            }
            aotp aotp;
            if ((aotp = apre.c) == null) {
                aotp = aotp.a;
            }
            this.h((View)frameLayout, 2131429522, aotp);
            aotp aotp2;
            if ((aotp2 = apre.d) == null) {
                aotp2 = aotp.a;
            }
            this.h((View)frameLayout, 2131432157, aotp2);
            aotp aotp3;
            if ((aotp3 = apre.e) == null) {
                aotp3 = aotp.a;
            }
            this.h((View)frameLayout, 2131427857, aotp3);
            ajut ajut5 = ajut2;
            if ((apre.b & 0x10) != 0x0 && (ajut5 = apre.g) == null) {
                ajut5 = ajut.a;
            }
            textView3.setText((CharSequence)acak.b(ajut5));
        }
        else {
            aprw a;
            if (n2 == 49970284) {
                a = (aprw)aprd.c;
            }
            else {
                a = aprw.a;
            }
            if ((aiqj = a.d) == null) {
                aiqj = aiqj.a;
            }
            aotp aotp4;
            if ((aotp4 = a.c) == null) {
                aotp4 = aotp.a;
            }
            this.h((View)frameLayout, 2131432432, aotp4);
            ajut ajut6 = ajut;
            if ((a.b & 0x4) != 0x0 && (ajut6 = a.e) == null) {
                ajut6 = ajut.a;
            }
            textView3.setText((CharSequence)acak.b(ajut6));
        }
        frameLayout.setOnClickListener((View$OnClickListener)new jlb(this, aiqj, 3));
        if (this.o && this.p) {
            this.g();
        }
        this.f();
        this.o = true;
        if ((this.q = this.g.getConfiguration().orientation) == 2) {
            int n3;
            if (apre == null) {
                n3 = n;
            }
            else {
                n3 = 4;
            }
            tpe.aF((View)frameLayout, tpe.aC((float)n3), (Class)LinearLayout$LayoutParams.class);
            tpe.aF((View)linearLayout.findViewById(2131428012), tpe.aC(2.0f), (Class)LinearLayout$LayoutParams.class);
        }
        this.f.e(ackm);
    }
}
