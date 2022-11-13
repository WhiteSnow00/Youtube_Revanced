import android.widget.TextView;
import java.util.Map;
import android.text.Spanned;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfy implements fui
{
    public final Spanned a;
    public final ajkf b;
    public final Object c;
    private final int d;
    
    public jfy(final jfx c, final Spanned a, final ajkf b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jfy(final jgb c, final Spanned a, final ajkf b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        if (this.d != 0) {
            final Object c = this.c;
            final Spanned a = this.a;
            final ajkf b = this.b;
            final anio anio = (anio)o;
            final jfx jfx = (jfx)c;
            tpe.t(jfx.i, (CharSequence)a);
            if (!b.f && b.c == 5) {
                jfx.a.c((aiqj)b.d, (Map)null);
            }
            return;
        }
        final Object c2 = this.c;
        final Spanned a2 = this.a;
        final ajkf b2 = this.b;
        final anio anio2 = (anio)o;
        final jgb jgb = (jgb)c2;
        tpe.t((TextView)jgb.i, (CharSequence)a2);
        if (!b2.f && b2.c == 5) {
            jgb.a.a((aiqj)b2.d);
        }
    }
}
