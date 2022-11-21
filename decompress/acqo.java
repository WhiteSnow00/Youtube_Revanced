import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqo implements acqr
{
    public final Activity a;
    public final askz b;
    public final aoft c;
    public final acpr d;
    private final Set e;
    private int f;
    
    public acqo(final Activity a, final askz b, final mtf mtf, final aoft c, final acpr d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        if (c.d == 45 && (int)c.e > 0) {
            int intValue;
            if (c.d == 45) {
                intValue = (int)c.e;
            }
            else {
                intValue = 0;
            }
            this.f = intValue;
            return;
        }
        if (c.d == 48) {
            this.f = ((aofx)c.e).b;
            mtf.w((Callable)new zms(this, 8));
            return;
        }
        this.f = d.a();
        mtf.w((Callable)new zms(this, 9));
    }
    
    @Override
    public final int a() {
        return this.f;
    }
    
    @Override
    public final acpr b() {
        return this.d;
    }
    
    public final void c(final int f) {
        adme.K(f > 0);
        if (this.f == f) {
            return;
        }
        this.f = f;
        final Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((adzx)iterator.next()).e(f);
        }
    }
    
    @Override
    public final void e(final adzx adzx) {
        this.e.add(adzx);
    }
    
    @Override
    public final void f(final adzx adzx) {
        this.e.remove(adzx);
    }
}
