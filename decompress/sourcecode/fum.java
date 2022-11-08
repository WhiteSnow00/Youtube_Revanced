import java.util.Map;
import java.util.HashMap;
import android.view.ViewGroup;
import android.util.DisplayMetrics;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fum implements acil
{
    public final View a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final ImageView e;
    private final FrameLayout f;
    private final Context g;
    private final acng h;
    private final vax i;
    private final acex j;
    private final DisplayMetrics k;
    private ftp l;
    private final alm m;
    
    public fum(final Context g, final acng h, final vax i, final aceo aceo, final alm m, final int n, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        this.h = h;
        this.i = i;
        this.m = m;
        final View inflate = View.inflate(g, n, (ViewGroup)null);
        this.a = inflate;
        this.b = (TextView)inflate.findViewById(2131429856);
        this.c = (TextView)inflate.findViewById(2131429855);
        this.d = (ImageView)inflate.findViewById(2131429850);
        final ImageView e = (ImageView)inflate.findViewById(2131429857);
        this.e = e;
        this.f = (FrameLayout)inflate.findViewById(2131429846);
        this.j = new acex((tni)aceo, e);
        this.k = g.getResources().getDisplayMetrics();
    }
    
    private final int d(final int n) {
        return tmy.aZ(this.k, n);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void b(final acij acij, final fur fur) {
        final amfe a = fur.a;
        if ((a.b & 0x1) != 0x0) {
            ajsq ajsq;
            if ((ajsq = a.e) == null) {
                ajsq = ajsq.a;
            }
            this.b.setText((CharSequence)vbd.a(ajsq, this.i, false));
            this.b.setVisibility(0);
        }
        else {
            this.b.setVisibility(8);
        }
        amfh amfh;
        if ((amfh = a.f) == null) {
            amfh = amfh.a;
        }
        if ((amfh.b & 0x1) != 0x0) {
            final TextView c = this.c;
            amfh amfh2;
            if ((amfh2 = a.f) == null) {
                amfh2 = amfh.a;
            }
            amfg amfg;
            if ((amfg = amfh2.c) == null) {
                amfg = amfg.a;
            }
            ajsq ajsq2;
            if ((amfg.b & 0x1) != 0x0) {
                amfh amfh3;
                if ((amfh3 = a.f) == null) {
                    amfh3 = amfh.a;
                }
                amfg amfg2;
                if ((amfg2 = amfh3.c) == null) {
                    amfg2 = amfg.a;
                }
                if ((ajsq2 = amfg2.c) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            c.setText((CharSequence)vbd.a(ajsq2, this.i, false));
            this.c.setVisibility(0);
            this.c.setLineSpacing((float)tmy.aZ(this.g.getResources().getDisplayMetrics(), acij.b("BaseMessagePresenter.SubtextLineSpacingExtra", 0)), 1.0f);
            this.b.setTextColor(tmy.ct(this.g, 2130970924).orElse(0));
        }
        else {
            this.c.setVisibility(8);
            this.b.setTextColor(tmy.ct(this.g, 2130970926).orElse(0));
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        final int c2 = a.c;
        if (c2 == 2) {
            final acng h = this.h;
            akbe akbe;
            if ((akbe = akbe.b(((amfk)a.d).b)) == null) {
                akbe = akbe.a;
            }
            final int a2 = h.a(akbe);
            if (a2 != 0) {
                this.d.setImageResource(a2);
                this.d.setVisibility(0);
            }
        }
        else {
            amfj a3;
            if (c2 == 7) {
                a3 = (amfj)a.d;
            }
            else {
                a3 = amfj.a;
            }
            if ((a3.b & 0x1) != 0x0) {
                amfj a4;
                if (a.c == 7) {
                    a4 = (amfj)a.d;
                }
                else {
                    a4 = amfj.a;
                }
                amfi amfi;
                if ((amfi = a4.c) == null) {
                    amfi = amfi.a;
                }
                tmy.aH((View)this.e, this.d(amfi.c), this.d(amfi.d));
                final acex j = this.j;
                aorm aorm;
                if ((aorm = amfi.b) == null) {
                    aorm = aorm.a;
                }
                j.k(aorm);
                this.e.setVisibility(0);
            }
        }
        this.f.setVisibility(8);
        aibc aibc;
        if ((aibc = a.h) == null) {
            aibc = aibc.a;
        }
        if ((aibc.b & 0x1) != 0x0) {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", a);
            final ftp p2 = this.m.p((Map)hashMap, 2131625820);
            aibc aibc2;
            if ((aibc2 = a.h) == null) {
                aibc2 = aibc.a;
            }
            aibb aibb;
            if ((aibb = aibc2.c) == null) {
                aibb = aibb.a;
            }
            p2.mN(acij, (Object)aibb);
            this.f.removeAllViews();
            this.f.addView((View)p2.b);
            this.f.setVisibility(0);
            this.l = p2;
        }
    }
    
    public final void c(final acir acir) {
        this.c.setLineSpacing(0.0f, 1.0f);
        this.f.removeAllViews();
        final ftp l = this.l;
        if (l != null) {
            l.c(acir);
            this.l = null;
        }
    }
}
