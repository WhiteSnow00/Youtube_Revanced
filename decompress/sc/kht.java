import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.GridLayout$LayoutParams;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.GridLayout;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kht extends acld
{
    public final vcy a;
    public aotx b;
    public Map c;
    private final acpk d;
    private final gjh e;
    private final GridLayout f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    
    public kht(final Context context, final acpk d, final vcy a, final gjh e) {
        this.d = d;
        this.a = a;
        this.e = e;
        final View inflate = LayoutInflater.from(context).inflate(2131625636, (ViewGroup)null);
        final View viewById = inflate.findViewById(2131428027);
        this.f = (GridLayout)inflate.findViewById(2131428424);
        this.g = (ImageView)inflate.findViewById(2131429270);
        this.h = (TextView)inflate.findViewById(2131432095);
        this.i = (TextView)inflate.findViewById(2131429361);
        this.j = (TextView)inflate.findViewById(2131428624);
        viewById.setOnClickListener((View$OnClickListener)new kgx(this, 3));
        e.c(inflate);
    }
    
    private static GridLayout$LayoutParams f(final int n, final int n2, final int n3) {
        return new GridLayout$LayoutParams(GridLayout.spec(n, n3, GridLayout.CENTER), GridLayout.spec(n2, 1));
    }
    
    public final View a() {
        return this.e.a;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aotx)o).j.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aotx b = (aotx)o;
        this.b = b;
        final ajut ajut = null;
        Map c;
        if (ackm == null) {
            c = null;
        }
        else {
            final afes h = afev.h();
            h.g("sectionListController", ackm.c("sectionListController"));
            h.k(ackm.e());
            c = h.c();
        }
        this.c = c;
        final GridLayout f = this.f;
        int ak;
        if ((ak = aqsx.aK(b.i)) == 0) {
            ak = 1;
        }
        int gravity;
        if (ak - 1 != 2) {
            gravity = 8388611;
        }
        else {
            gravity = 1;
        }
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)f.getLayoutParams();
        layoutParams.gravity = gravity;
        f.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        final int b2 = b.b;
        final int n = b2 & 0x4;
        boolean b3 = false;
        final boolean b4 = n == 0 || (b2 & 0x1) == 0x0;
        if (n != 0) {
            if ((b2 & 0x1) != 0x0) {
                this.h.setLayoutParams((ViewGroup$LayoutParams)f(0, 1, 1));
                this.j.setLayoutParams((ViewGroup$LayoutParams)f(1, 1, 1));
            }
            else {
                this.j.setLayoutParams((ViewGroup$LayoutParams)f(0, 1, 2));
            }
        }
        else {
            this.h.setLayoutParams((ViewGroup$LayoutParams)f(0, 1, 2));
        }
        if (b4) {
            this.i.setLayoutParams((ViewGroup$LayoutParams)f(0, 2, 2));
        }
        else {
            this.i.setLayoutParams((ViewGroup$LayoutParams)f(0, 2, 1));
        }
        final ImageView g = this.g;
        if ((b.b & 0x8) != 0x0) {
            b3 = true;
        }
        tpe.v((View)g, b3);
        if ((b.b & 0x8) != 0x0) {
            final ImageView g2 = this.g;
            final acpk d = this.d;
            akdi akdi;
            if ((akdi = b.h) == null) {
                akdi = akdi.a;
            }
            akdh akdh;
            if ((akdh = akdh.b(akdi.c)) == null) {
                akdh = akdh.a;
            }
            g2.setImageResource(d.a(akdh));
        }
        final TextView h2 = this.h;
        ajut ajut2;
        if ((b.b & 0x1) != 0x0) {
            if ((ajut2 = b.e) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        tpe.t(h2, (CharSequence)acak.b(ajut2));
        final TextView i = this.i;
        ajut ajut3;
        if ((b.b & 0x2) != 0x0) {
            if ((ajut3 = b.f) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        tpe.t(i, (CharSequence)acak.b(ajut3));
        final TextView j = this.j;
        ajut ajut4 = ajut;
        if ((b.b & 0x4) != 0x0 && (ajut4 = b.g) == null) {
            ajut4 = ajut.a;
        }
        tpe.t(j, (CharSequence)acak.b(ajut4));
        this.e.e(ackm);
    }
}
