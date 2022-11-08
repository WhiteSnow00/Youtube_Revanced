import java.util.Map;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izs implements izg
{
    public final abzk a;
    public ajkj b;
    public ViewGroup c;
    public ajko d;
    public abzh e;
    private final arhr f;
    private final wwv g;
    
    public izs(final arhr f, final abzk a, final wwv g) {
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        g.getClass();
        this.g = g;
    }
    
    public final void b(final View view) {
        if (this.c != null) {
            return;
        }
        (this.c = (ViewGroup)tmy.l(view, 2131428816, 2131428815)).setVisibility(8);
    }
    
    public final void c() {
        final ajko d = this.d;
        if (d != null) {
            if (this.c != null) {
                anss anss;
                if ((anss = d.b) == null) {
                    anss = anss.a;
                }
                ajkj b;
                if (((agzd)anss).rs((agyr)ElementRendererOuterClass.elementRenderer)) {
                    anss anss2;
                    if ((anss2 = this.d.b) == null) {
                        anss2 = anss.a;
                    }
                    b = (ajkj)((agzd)anss2).rr((agyr)ElementRendererOuterClass.elementRenderer);
                }
                else {
                    b = null;
                }
                this.b = b;
                this.c.addView(this.a.a());
            }
        }
    }
    
    public final void d() {
        throw null;
    }
    
    public final void e(final boolean b) {
    }
    
    public final void f(final roi roi) {
    }
    
    public final void g(final int n, final boolean b) {
        final ViewGroup c = this.c;
        if (c == null) {
            return;
        }
        if (n != 2) {
            c.setVisibility(8);
            return;
        }
        if (this.b == null) {
            c.setVisibility(8);
            return;
        }
        if (this.e != null) {
            c.setVisibility(0);
            return;
        }
        c.setVisibility(0);
        final acij acij = new acij();
        acij.g(new HashMap());
        acij.a(this.g);
        final abzh d = ((acae)this.f.a()).d(this.b);
        this.e = d;
        this.a.b(acij, d);
    }
}
