import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import android.app.Activity;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsr implements acnc
{
    public final acmc a;
    private final Context b;
    @Deprecated
    private int c;
    private final Set d;
    private final ajxl e;
    private int f;
    
    public jsr(final Activity activity, final mrm mrm, final ajxm ajxm, final acmc a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = 0;
        this.d = Collections.newSetFromMap(new HashMap<Object, Boolean>());
        this.b = activity.getApplicationContext();
        this.a = a;
        ajxl e;
        if ((ajxm.b & 0x400) != 0x0) {
            if ((e = ajxm.g) == null) {
                e = ajxl.a;
            }
        }
        else {
            e = null;
        }
        this.e = e;
        this.c = ajxm.e;
        this.d(this.a());
        final int b = ajxm.b;
        if ((b & 0x400) != 0x0 && (b & 0x40) != 0x0) {
            return;
        }
        mrm.A((Callable)new inm(this, 20));
    }
    
    public static Integer c(final Context context) {
        return context.getResources().getInteger(2131492953);
    }
    
    @Override
    public final int a() {
        if (this.e != null) {
            final Context b = this.b;
            if (b != null) {
                final int orientation = b.getResources().getConfiguration().orientation;
                final boolean bq = tmy.bq(this.b);
                if (orientation != 2) {
                    final ajxl e = this.e;
                    int n;
                    if (bq) {
                        n = e.c;
                    }
                    else {
                        n = e.b;
                    }
                    return n;
                }
                final ajxl e2 = this.e;
                int n2;
                if (bq) {
                    n2 = e2.e;
                }
                else {
                    n2 = e2.d;
                }
                return n2;
            }
        }
        final int c = this.c;
        if (c > 0) {
            return c;
        }
        return this.a.a();
    }
    
    @Override
    public final acmc b() {
        return this.a;
    }
    
    public final void d(final int f) {
        agot.u(f > 0);
        if (this.f == f) {
            return;
        }
        this.f = f;
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aepj)iterator.next()).g(f);
        }
    }
    
    @Override
    public final void e(final aepj aepj) {
        this.d.add(aepj);
    }
    
    @Override
    public final void f(final aepj aepj) {
        this.d.remove(aepj);
    }
}
