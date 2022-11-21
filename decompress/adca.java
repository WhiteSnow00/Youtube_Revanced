import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adca extends acph implements adci, adej
{
    public final apbu a;
    public final adby b;
    private final Context c;
    private final veh d;
    private final xab e;
    private final adcp f;
    private final acmr g;
    private final aefs h;
    
    public adca(final apbu a, final Context c, final veh d, final aefs h, final xab e, final adcp f, final adby b, final byte[] array, final byte[] array2, final byte[] array3) {
        a.getClass();
        this.a = a;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = e;
        this.f = f;
        this.b = b;
        (this.g = new acmr()).add((Object)a);
    }
    
    public final acla a() {
        return this.g;
    }
    
    @Override
    public final void d(final List list) {
    }
    
    @Override
    public final void e(final acmh acmh) {
        acmh.f(apbu.class, (acmf)new jkh(this.c, this.d, this.h, this.e, (Runnable)new acan(this.f, 20), (adej)this, 5, (byte[])null, (byte[])null, (byte[])null));
    }
}
