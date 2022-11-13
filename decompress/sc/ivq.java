import java.util.function.Function;
import android.util.Rational;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivq implements abtx
{
    final Object a;
    private final int b;
    
    public ivq(final DefaultPipController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivq(final ivr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivq(final ivw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ivq(final jcz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void f(final int n, final int n2) {
        final int b = this.b;
        boolean b2 = false;
        if (b == 0) {
            final atjm b3 = ((ivr)this.a).b;
            if (n < n2) {
                b2 = true;
            }
            b3.tu((Object)b2);
            return;
        }
        if (b != 1) {
            if (b != 2) {
                final jcz jcz = (jcz)this.a;
                jcz.j = jcz.b.g();
                jcz.k = glb.n(jcz.e.a(), 1.0f);
                jcz.c();
                return;
            }
            ((ivw)this.a).a();
        }
        else {
            final Object a = this.a;
            final Rational rational = new Rational(n, n2);
            Rational a2 = null;
            Label_0126: {
                if (rational.floatValue() >= 0.41841003f) {
                    a2 = rational;
                    if (rational.floatValue() <= 2.39f) {
                        break Label_0126;
                    }
                }
                a2 = DefaultPipController.a;
            }
            final DefaultPipController defaultPipController = (DefaultPipController)a;
            if (adkp.ae(defaultPipController.v, a2)) {
                return;
            }
            defaultPipController.v = a2;
            defaultPipController.k((Function)new fnr(defaultPipController, 13), (Function)new fnr(defaultPipController, 14));
        }
    }
}
