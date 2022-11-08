import android.content.Context;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inp implements tec
{
    public final fml a;
    public final tdz b;
    public final TextView c;
    public final View d;
    public String e;
    private final Context f;
    private final atjj g;
    private final iki h;
    
    public inp(final Context f, final fml a, final atjj g, final iki h, final tdz b, final View view) {
        this.f = f;
        this.a = a;
        this.g = g;
        this.h = h;
        this.b = b;
        final TextView c = (TextView)view.findViewById(2131428728);
        c.getClass();
        this.c = c;
        final View viewById = view.findViewById(2131431819);
        viewById.getClass();
        this.d = viewById;
    }
    
    public final void a() {
        final String e = this.e;
        if (!aexs.f(e)) {
            this.b(((zzu)this.g.a()).a().i().d(e));
        }
    }
    
    public final void b(final zyy zyy) {
        if (zyy != null && !zyy.e()) {
            final ijj c = this.h.c(zyy);
            tmy.t(this.c, (CharSequence)((String[])c.c)[0]);
            this.c.setTextColor(tmy.ct(this.f, c.a).orElse(0));
            final TextView c2 = this.c;
            c2.setTypeface(c2.getTypeface(), 0);
            tmy.v(this.d, false);
            return;
        }
        tmy.v((View)this.c, false);
        tmy.v(this.d, true);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zwb zwb = (zwb)o;
                if (zwb.a.d().equals(this.e)) {
                    this.b(zwb.a);
                    return null;
                }
            }
            else {
                final tge tge = (tge)o;
                this.a();
            }
        }
        else {
            array = new Class[] { tge.class, zwb.class };
        }
        return array;
    }
}
