import java.util.function.Function;
import android.util.Rational;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iur implements abrw
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public iur(final ius a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iur(final iux a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iur(final jbx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void f(final int n, final int n2) {
        final int b = this.b;
        boolean b2 = false;
        if (b == 0) {
            final atir b3 = ((ius)this.a).b;
            if (n < n2) {
                b2 = true;
            }
            b3.tr((Object)b2);
            return;
        }
        if (b != 1) {
            if (b != 2) {
                final jbx jbx = (jbx)this.a;
                jbx.j = jbx.b.g();
                jbx.k = gkt.b(jbx.e.a(), 1.0f);
                jbx.c();
                return;
            }
            ((iux)this.a).a();
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
            if (aeda.v((Object)defaultPipController.v, (Object)a2)) {
                return;
            }
            defaultPipController.v = a2;
            defaultPipController.k(new Function[] { new fnm(defaultPipController, 13), new fnm(defaultPipController, 14) });
        }
    }
}
