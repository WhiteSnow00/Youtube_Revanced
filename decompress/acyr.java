import java.util.concurrent.Callable;
import android.accounts.Account;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyr implements tfw
{
    public final acyt a;
    public final String b;
    public final xbt c;
    public final tui d;
    public final Executor e;
    public final int f;
    
    public acyr(final acyt a, final String b, final int f, final xbt c, final tui d, final Executor e) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final Object o) {
        final acyt a = this.a;
        final String b = this.b;
        final int f = this.f;
        final xbt c = this.c;
        final tui d = this.d;
        tfx.k(agra.V(aewf.i(new acys(a, b, (Account)o, f, d, c, 0)), a.c), this.e, (tfv)new aciu(b, d, 3), (tfw)new vdm(c, b, d, 15));
    }
}
