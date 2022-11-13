import android.app.Service;
import android.os.Build$VERSION;
import java.util.List;
import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frx implements Runnable
{
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public frx(final acgs c, final aoto d, final int a, final int b, final int e) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public frx(final SystemForegroundService d, final int a, final Notification c, final int b, final int e) {
        this.e = e;
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public frx(final jkj c, final List d, final int a, final int b, final int e) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final int e = this.e;
        if (e == 0) {
            final Object c = this.c;
            final Object d = this.d;
            final int a = this.a;
            final int b = this.b;
            final ahbb ahbb = (ahbb)((ahbh)aotp.a).createBuilder();
            ((ahaz)ahbb).copyOnWrite();
            final aotp aotp = (aotp)ahbb.instance;
            d.getClass();
            aotp.a();
            aotp.c.add(d);
            ((acgs)c).m((aotp)((ahaz)ahbb).build(), a, b);
            return;
        }
        if (e != 1) {
            final Object c2 = this.c;
            final Object d2 = this.d;
            final int a2 = this.a;
            final int b2 = this.b;
            final apqw apqw = ((List<apqw>)d2).get(a2);
            final int b3 = apqw.b;
            if (b3 == 122814739) {
                final jkj jkj = (jkj)c2;
                final acle a3 = jkj.a;
                final Object value = ((tfz)a3).get(jkj.j + b2);
                aprf a4;
                if (apqw.b == 122814739) {
                    a4 = (aprf)apqw.c;
                }
                else {
                    a4 = aprf.a;
                }
                a3.o(value, (Object)a4);
                if (a2 < ((List)d2).size() - 1 && jkj.g(apqw)) {
                    final acle a5 = jkj.a;
                    a5.o(((tfz)a5).get(b2 + 1 + jkj.j), (Object)new jla());
                }
            }
            else if (b3 == 153515154) {
                final jkj jkj2 = (jkj)c2;
                final acle a6 = jkj2.a;
                final Object value2 = ((tfz)a6).get(b2 + jkj2.j);
                final accf g = jkj2.g;
                ajmo a7;
                if (apqw.b == 153515154) {
                    a7 = (ajmo)apqw.c;
                }
                else {
                    a7 = ajmo.a;
                }
                a6.o(value2, (Object)g.d(a7));
            }
            return;
        }
        if (Build$VERSION.SDK_INT >= 31) {
            cqh.a((Service)this.d, this.a, (Notification)this.c, this.b);
            return;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            cqg.a((Service)this.d, this.a, (Notification)this.c, this.b);
            return;
        }
        ((SystemForegroundService)this.d).startForeground(this.a, (Notification)this.c);
    }
}
