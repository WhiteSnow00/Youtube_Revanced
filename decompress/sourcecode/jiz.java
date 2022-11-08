import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import android.text.Spanned;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import android.widget.RelativeLayout$LayoutParams;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.content.res.Resources;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jiz extends acja implements acie
{
    public final View a;
    private final String b;
    private final Context c;
    private final Resources d;
    private final vax e;
    private final aceo f;
    private final ImageView g;
    private final ImageView h;
    private final FrameLayout i;
    private final TextView j;
    private final TextView k;
    private final ViewGroup l;
    private final ImageView m;
    private final ChipCloudView n;
    private final acih o;
    private final acih p;
    private final RelativeLayout$LayoutParams q;
    private final RelativeLayout$LayoutParams r;
    private anty s;
    private final List t;
    private final List u;
    private final acng v;
    
    public jiz(final Context c, final vax e, final acng v, final aceo f) {
        this.t = new ArrayList();
        this.u = new ArrayList();
        c.getClass();
        this.c = c;
        final Resources resources = c.getResources();
        this.d = resources;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        v.getClass();
        this.v = v;
        final View inflate = View.inflate(c, 2131625300, (ViewGroup)null);
        this.a = inflate;
        final ImageView g = (ImageView)inflate.findViewById(2131428086);
        this.g = g;
        final View viewById = inflate.findViewById(2131432495);
        this.i = (FrameLayout)inflate.findViewById(2131427895);
        this.h = (ImageView)inflate.findViewById(2131427894);
        final TextView j = (TextView)inflate.findViewById(2131432092);
        this.j = j;
        this.k = (TextView)inflate.findViewById(2131431819);
        this.l = (ViewGroup)inflate.findViewById(2131431676);
        this.m = (ImageView)inflate.findViewById(2131429270);
        final ChipCloudView n = (ChipCloudView)inflate.findViewById(2131427776);
        this.n = n;
        final int dimensionPixelSize = c.getResources().getDimensionPixelSize(2131165833);
        n.a(dimensionPixelSize, dimensionPixelSize);
        this.o = new acih(e, (View)g);
        this.p = new acih(e, inflate);
        this.q = (RelativeLayout$LayoutParams)viewById.getLayoutParams();
        this.r = (RelativeLayout$LayoutParams)j.getLayoutParams();
        this.b = resources.getString(2132017279);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acir acir) {
        this.o.c();
        this.p.c();
    }
    
    public final boolean h(final View view) {
        final anty s = this.s;
        if (s != null) {
            antx antx;
            if ((antx = s.h) == null) {
                antx = antx.a;
            }
            aibb a;
            if (antx.b == 65153809) {
                a = (aibb)antx.c;
            }
            else {
                a = aibb.a;
            }
            if ((a.b & 0x4000) != 0x0) {
                final vax e = this.e;
                antx antx2;
                if ((antx2 = this.s.h) == null) {
                    antx2 = antx.a;
                }
                aibb a2;
                if (antx2.b == 65153809) {
                    a2 = (aibb)antx2.c;
                }
                else {
                    a2 = aibb.a;
                }
                aioe aioe;
                if ((aioe = a2.n) == null) {
                    aioe = aioe.a;
                }
                e.c(aioe, (Map)null);
            }
        }
        return false;
    }
}
