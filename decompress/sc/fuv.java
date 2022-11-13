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

public final class fuv implements acko
{
    public final View a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final ImageView e;
    private final FrameLayout f;
    private final Context g;
    private final acpk h;
    private final vcy i;
    private final achb j;
    private final DisplayMetrics k;
    private ftx l;
    private final aln m;
    
    public fuv(final Context g, final acpk h, final vcy i, final acgs acgs, final aln m, final int n, final byte[] array, final byte[] array2, final byte[] array3) {
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
        this.j = new achb((tpo)acgs, e);
        this.k = g.getResources().getDisplayMetrics();
    }
    
    private final int d(final int n) {
        return tpe.aZ(this.k, n);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void b(final ackm ackm, final fva fva) {
        final amhi a = fva.a;
        if ((a.b & 0x1) != 0x0) {
            ajut ajut;
            if ((ajut = a.e) == null) {
                ajut = ajut.a;
            }
            this.b.setText((CharSequence)vde.a(ajut, this.i, false));
            this.b.setVisibility(0);
        }
        else {
            this.b.setVisibility(8);
        }
        amhl amhl;
        if ((amhl = a.f) == null) {
            amhl = amhl.a;
        }
        if ((amhl.b & 0x1) != 0x0) {
            final TextView c = this.c;
            amhl amhl2;
            if ((amhl2 = a.f) == null) {
                amhl2 = amhl.a;
            }
            amhk amhk;
            if ((amhk = amhl2.c) == null) {
                amhk = amhk.a;
            }
            ajut ajut2;
            if ((amhk.b & 0x1) != 0x0) {
                amhl amhl3;
                if ((amhl3 = a.f) == null) {
                    amhl3 = amhl.a;
                }
                amhk amhk2;
                if ((amhk2 = amhl3.c) == null) {
                    amhk2 = amhk.a;
                }
                if ((ajut2 = amhk2.c) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            c.setText((CharSequence)vde.a(ajut2, this.i, false));
            this.c.setVisibility(0);
            this.c.setLineSpacing((float)tpe.aZ(this.g.getResources().getDisplayMetrics(), ackm.b("BaseMessagePresenter.SubtextLineSpacingExtra", 0)), 1.0f);
            this.b.setTextColor(tpe.cx(this.g, 2130970924).orElse(0));
        }
        else {
            this.c.setVisibility(8);
            this.b.setTextColor(tpe.cx(this.g, 2130970926).orElse(0));
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        final int c2 = a.c;
        if (c2 == 2) {
            final acpk h = this.h;
            akdh akdh;
            if ((akdh = akdh.b(((amho)a.d).b)) == null) {
                akdh = akdh.a;
            }
            final int a2 = h.a(akdh);
            if (a2 != 0) {
                this.d.setImageResource(a2);
                this.d.setVisibility(0);
            }
        }
        else {
            amhn a3;
            if (c2 == 7) {
                a3 = (amhn)a.d;
            }
            else {
                a3 = amhn.a;
            }
            if ((a3.b & 0x1) != 0x0) {
                amhn a4;
                if (a.c == 7) {
                    a4 = (amhn)a.d;
                }
                else {
                    a4 = amhn.a;
                }
                amhm amhm;
                if ((amhm = a4.c) == null) {
                    amhm = amhm.a;
                }
                tpe.aH((View)this.e, this.d(amhm.c), this.d(amhm.d));
                final achb j = this.j;
                aotp aotp;
                if ((aotp = amhm.b) == null) {
                    aotp = aotp.a;
                }
                j.k(aotp);
                this.e.setVisibility(0);
            }
        }
        this.f.setVisibility(8);
        aida aida;
        if ((aida = a.h) == null) {
            aida = aida.a;
        }
        if ((aida.b & 0x1) != 0x0) {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", a);
            final ftx p2 = this.m.p((Map)hashMap, 2131625824);
            aida aida2;
            if ((aida2 = a.h) == null) {
                aida2 = aida.a;
            }
            aicz aicz;
            if ((aicz = aida2.c) == null) {
                aicz = aicz.a;
            }
            p2.mN(ackm, (Object)aicz);
            this.f.removeAllViews();
            this.f.addView((View)p2.b);
            this.f.setVisibility(0);
            this.l = p2;
        }
    }
    
    public final void c(final acku acku) {
        this.c.setLineSpacing(0.0f, 1.0f);
        this.f.removeAllViews();
        final ftx l = this.l;
        if (l != null) {
            l.c(acku);
            this.l = null;
        }
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        this.b(ackm, (fva)o);
    }
}
