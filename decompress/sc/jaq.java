import java.util.Map;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jaq implements jaf
{
    public final acbm a;
    public ajmo b;
    public ViewGroup c;
    public ajmt d;
    public acbj e;
    private final arkg f;
    private final wyw g;
    
    public jaq(final arkg f, final acbm a, final wyw g) {
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
        (this.c = (ViewGroup)tpe.l(view, 2131428816, 2131428815)).setVisibility(8);
    }
    
    public final void c() {
        final ajmt d = this.d;
        if (d != null) {
            if (this.c != null) {
                anuv anuv;
                if ((anuv = d.b) == null) {
                    anuv = anuv.a;
                }
                ajmo b;
                if (((ahbc)anuv).ry((ahaq)ElementRendererOuterClass.elementRenderer)) {
                    anuv anuv2;
                    if ((anuv2 = this.d.b) == null) {
                        anuv2 = anuv.a;
                    }
                    b = (ajmo)((ahbc)anuv2).rx((ahaq)ElementRendererOuterClass.elementRenderer);
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
    
    public final void f(final rqm rqm) {
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
        final ackm ackm = new ackm();
        ackm.g((Map)new HashMap());
        ((wyy)ackm).a(this.g);
        final acbj d = ((accf)this.f.a()).d(this.b);
        this.e = d;
        this.a.b(ackm, d);
    }
}
