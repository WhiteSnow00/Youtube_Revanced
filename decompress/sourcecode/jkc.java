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

public final class jkc extends acja
{
    public final vax a;
    public boolean b;
    public appl c;
    private final Context d;
    private final aceo e;
    private final acio f;
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
    
    public jkc(final Context d, final aceo e, final giz f, final vax a) {
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = (acio)f;
        a.getClass();
        this.a = a;
        this.g = d.getResources();
        final LayoutInflater from = LayoutInflater.from(d);
        this.h = from;
        final View inflate = from.inflate(2131625767, (ViewGroup)null);
        this.i = (LinearLayout)inflate.findViewById(2131428016);
        this.j = (LinearLayout)inflate.findViewById(2131428008);
        this.b = false;
        this.o = false;
        this.p = false;
        f.c(inflate);
    }
    
    private final void g() {
        appj appj;
        if ((appj = this.c.g) == null) {
            appj = appj.a;
        }
        if (appj.d.size() == 0) {
            return;
        }
        appj appj2;
        if ((appj2 = this.c.g) == null) {
            appj2 = appj.a;
        }
        final agzy d = appj2.d;
        if (!this.p) {
            this.h.inflate(2131625792, (ViewGroup)this.j, true);
            final LinearLayout j = this.j;
            final TextView textView = (TextView)j.getChildAt(j.getChildCount() - 1);
            final appj g = this.c.g;
            appj a;
            if (g == null) {
                a = appj.a;
            }
            else {
                a = g;
            }
            ajsq ajsq;
            if ((a.b & 0x1) != 0x0) {
                appj a2;
                if ((a2 = g) == null) {
                    a2 = appj.a;
                }
                if ((ajsq = a2.c) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            textView.setText((CharSequence)abyh.b(ajsq));
            this.h.inflate(2131625783, (ViewGroup)this.j, true);
        }
        final LinearLayout n = this.n;
        if (n == null) {
            (this.n = new LinearLayout(this.d)).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
            this.n.setOrientation(0);
            final int az = tmy.aZ(this.g.getDisplayMetrics(), 7);
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
            final appk appk = (appk)((List)d).get(i);
            final View inflate = this.h.inflate(2131625788, (ViewGroup)null);
            final TextView textView2 = (TextView)inflate.findViewById(2131432092);
            ajsq ajsq2;
            if ((appk.b & 0x1) != 0x0) {
                if ((ajsq2 = appk.c) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            textView2.setText((CharSequence)abyh.b(ajsq2));
            aorm aorm;
            if ((aorm = appk.d) == null) {
                aorm = aorm.a;
            }
            this.h(inflate, 2131432006, aorm);
            aioe aioe;
            if ((appk.b & 0x4) != 0x0) {
                if ((aioe = appk.e) == null) {
                    aioe = aioe.a;
                }
            }
            else {
                aioe = null;
            }
            inflate.setOnClickListener((View$OnClickListener)new jjz(this, aioe, 5));
            this.n.addView(inflate);
            inflate.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, -1, 1.0f));
        }
    }
    
    private final void h(final View view, int visibility, final aorm aorm) {
        final ImageView imageView = (ImageView)view.findViewById(visibility);
        this.e.g(imageView, aorm);
        if (!actc.M(aorm)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        imageView.setVisibility(visibility);
    }
    
    public final View a() {
        return ((giz)this.f).a;
    }
    
    public final void c(final acir acir) {
    }
    
    public final void f() {
        if (this.b) {
            if (!this.p) {
                final appl c = this.c;
                appg appg;
                if ((appg = c.h) == null) {
                    appg = appg.a;
                }
                Object b;
                if (appg.b == 49961548) {
                    appg appg2;
                    if ((appg2 = c.h) == null) {
                        appg2 = appg.a;
                    }
                    appv a;
                    if (appg2.b == 49961548) {
                        a = (appv)appg2.c;
                    }
                    else {
                        a = appv.a;
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
                            this.h.inflate(2131625783, (ViewGroup)this.j, true);
                        }
                        final LinearLayout j = this.j;
                        final appt appt = (appt)((List)b).get(i);
                        final View inflate = this.h.inflate(2131625794, (ViewGroup)null);
                        final TextView textView = (TextView)inflate.findViewById(2131432092);
                        ajsq ajsq;
                        if ((appt.b & 0x4) != 0x0) {
                            if ((ajsq = appt.e) == null) {
                                ajsq = ajsq.a;
                            }
                        }
                        else {
                            ajsq = null;
                        }
                        textView.setText((CharSequence)abyh.b(ajsq));
                        final TextView textView2 = (TextView)inflate.findViewById(2131428769);
                        ajsq ajsq2;
                        if ((appt.b & 0x8) != 0x0) {
                            if ((ajsq2 = appt.f) == null) {
                                ajsq2 = ajsq.a;
                            }
                        }
                        else {
                            ajsq2 = null;
                        }
                        tmy.t(textView2, (CharSequence)abyh.b(ajsq2));
                        ajsq ajsq3;
                        if ((appt.b & 0x2) != 0x0) {
                            if ((ajsq3 = appt.d) == null) {
                                ajsq3 = ajsq.a;
                            }
                        }
                        else {
                            ajsq3 = null;
                        }
                        final Spanned b2 = abyh.b(ajsq3);
                        if (!TextUtils.isEmpty((CharSequence)b2)) {
                            final TextView textView3 = (TextView)inflate.findViewById(2131429358);
                            textView3.setVisibility(0);
                            textView3.setText((CharSequence)b2);
                        }
                        if ((appt.b & 0x1) != 0x0) {
                            aorm aorm;
                            if ((aorm = appt.c) == null) {
                                aorm = aorm.a;
                            }
                            this.h(inflate, 2131432006, aorm);
                        }
                        inflate.findViewById(2131432320).setOnClickListener((View$OnClickListener)new jjz(this, appt, 3));
                        j.addView(inflate);
                    }
                }
                appg appg3;
                if ((appg3 = this.c.h) == null) {
                    appg3 = appg.a;
                }
                if (appg3.b == 49627160) {
                    int n = 0;
                    while (true) {
                        apow a2;
                        if (appg3.b == 49627160) {
                            a2 = (apow)appg3.c;
                        }
                        else {
                            a2 = apow.a;
                        }
                        if (n >= a2.b.size()) {
                            break;
                        }
                        if (n != 0) {
                            this.h.inflate(2131625783, (ViewGroup)this.j, true);
                        }
                        final LinearLayout k = this.j;
                        apow a3;
                        if (appg3.b == 49627160) {
                            a3 = (apow)appg3.c;
                        }
                        else {
                            a3 = apow.a;
                        }
                        final apov apov = (apov)a3.b.get(n);
                        final View inflate2 = this.h.inflate(2131625768, (ViewGroup)null);
                        final TextView textView4 = (TextView)inflate2.findViewById(2131432092);
                        ajsq ajsq4;
                        if ((apov.b & 0x2) != 0x0) {
                            if ((ajsq4 = apov.d) == null) {
                                ajsq4 = ajsq.a;
                            }
                        }
                        else {
                            ajsq4 = null;
                        }
                        textView4.setText((CharSequence)abyh.b(ajsq4));
                        final TextView textView5 = (TextView)inflate2.findViewById(2131432499);
                        ajsq ajsq5;
                        if ((apov.b & 0x4) != 0x0) {
                            if ((ajsq5 = apov.e) == null) {
                                ajsq5 = ajsq.a;
                            }
                        }
                        else {
                            ajsq5 = null;
                        }
                        tmy.t(textView5, (CharSequence)abyh.b(ajsq5));
                        if ((apov.b & 0x1) != 0x0) {
                            aorm aorm2;
                            if ((aorm2 = apov.c) == null) {
                                aorm2 = aorm.a;
                            }
                            this.h(inflate2, 2131432006, aorm2);
                        }
                        inflate2.findViewById(2131427574).setOnClickListener((View$OnClickListener)new jjz(this, apov, 4));
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
}
