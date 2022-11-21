import android.graphics.Bitmap;
import java.util.concurrent.Executor;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abvw
{
    public final Context a;
    public Uri b;
    private final Executor c;
    private final Executor d;
    private final atnb e;
    private final atnb f;
    private final int g;
    private tdg h;
    private tdg i;
    private final absv j;
    
    public abvw(final Context a, final atnb e, final atnb f, final absv j, final Executor c, final Executor d, final byte[] array) {
        this.a = a;
        this.e = e;
        this.f = f;
        this.j = j;
        this.c = c;
        this.d = d;
        this.g = Math.min(1024, Math.max(tqf.bb(a), tqf.bd(a)));
    }
    
    public static /* bridge */ void c(final abvw abvw) {
        abvw.b = null;
    }
    
    public final tdg a() {
        if (this.i == null) {
            this.i = (tdg)tdj.a(this.d, (tdg)new aawx(this, 4));
        }
        return this.i;
    }
    
    public final void b(final Bitmap bitmap, final Bitmap bitmap2) {
        tcl.l();
        ((abvv)this.e.a()).k(bitmap, bitmap2);
    }
    
    public final void d(final vig vig, final afbh afbh) {
        final int g = this.g;
        final vif b = vig.b(g, g * 9 / 16);
        Uri a;
        if (b == null) {
            a = null;
        }
        else {
            a = b.a();
        }
        final boolean r = absv.ac((arzb)this.j.a).R;
        int n = 1;
        if (!r) {
            if (absv.ac((arzb)this.j.a).T && afbh.h() && !(boolean)afbh.c()) {
                n = n;
            }
            else {
                n = 0;
            }
        }
        if (a != null && n == 0) {
            this.b = a;
            final acig acig = (acig)this.f.a();
            if (this.h == null) {
                this.h = (tdg)tdj.a(this.c, (tdg)new aawx(this, 3));
            }
            acig.k(a, this.h);
            return;
        }
        this.b(null, null);
    }
}
