import java.util.Map;
import java.util.List;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmp implements zpf
{
    private final Activity a;
    private final vcy b;
    private final tqd c;
    private final atke d;
    private final Object e;
    private final aeea f;
    
    public hmp(final Activity a, final vcy b, final tqd c, final atke d, final aeea f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = this;
        this.f = f;
    }
    
    public final void a(final dbj dbj) {
        this.c.e((Throwable)dbj);
    }
    
    public final /* bridge */ void mX(final Object o) {
        final akol akol = (akol)o;
        if (akol != null) {
            final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper((Context)this.a, 2132083483);
            boolean b;
            if (b = (this.a.isFinishing() ^ true)) {
                b = (this.a.isDestroyed() ^ true);
            }
            akoo akoo;
            if ((akoo = akol.f) == null) {
                akoo = akoo.a;
            }
            alnm a;
            if (akoo.b == 171313147) {
                akoo akoo2;
                if ((akoo2 = akol.f) == null) {
                    akoo2 = akoo.a;
                }
                if (akoo2.b == 171313147) {
                    a = (alnm)akoo2.c;
                }
                else {
                    a = alnm.a;
                }
            }
            else {
                a = null;
            }
            final int n = 0;
            int n2;
            if (b && a != null) {
                ((acmr)this.d.a()).a(a, (aezp)aeyo.a, this.e);
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            final akoo f = akol.f;
            akoo a2;
            if (f == null) {
                a2 = akoo.a;
            }
            else {
                a2 = f;
            }
            ajrv a4;
            if (a2.b == 85374086) {
                akoo a3;
                if ((a3 = f) == null) {
                    a3 = akoo.a;
                }
                if (a3.b == 85374086) {
                    a4 = (ajrv)a3.c;
                }
                else {
                    a4 = ajrv.a;
                }
            }
            else {
                a4 = null;
            }
            if (b && a4 != null) {
                acaz.g((Context)contextThemeWrapper, a4, this.b, this.e, this.f);
                n2 = n;
            }
            if (b && akol.g.size() > 0) {
                this.b.d((List)akol.g, (Map)null);
                return;
            }
            if (n2 != 0) {
                tpe.x(this.a.getApplicationContext(), 2132020135, 1);
            }
        }
    }
    
    public final void mY() {
    }
}
