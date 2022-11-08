import android.graphics.Bitmap;
import java.util.concurrent.Executor;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absl
{
    public final Context a;
    public Uri b;
    private final Executor c;
    private final Executor d;
    private final atjj e;
    private final atjj f;
    private final int g;
    private szx h;
    private szx i;
    private final abpj j;
    
    public absl(final Context a, final atjj e, final atjj f, final abpj j, final Executor c, final Executor d, final byte[] array, final byte[] array2) {
        this.a = a;
        this.e = e;
        this.f = f;
        this.j = j;
        this.c = c;
        this.d = d;
        this.g = Math.min(1024, Math.max(tmy.bb(a), tmy.bd(a)));
    }
    
    public final szx a() {
        if (this.i == null) {
            this.i = (szx)taa.c(this.d, (szx)new aats(this, 4));
        }
        return this.i;
    }
    
    public final void b(final Bitmap bitmap, final Bitmap bitmap2) {
        szc.f();
        ((absk)this.e.a()).k(bitmap, bitmap2);
    }
    
    public final void d(final vey vey, final aexq aexq) {
        final int g = this.g;
        final vex b = vey.b(g, g * 9 / 16);
        Uri a;
        if (b == null) {
            a = null;
        }
        else {
            a = b.a();
        }
        final boolean r = abpj.Z((arud)this.j.b).R;
        int n = 1;
        if (!r) {
            if (abpj.Z((arud)this.j.b).T && aexq.h() && !(boolean)aexq.c()) {
                n = n;
            }
            else {
                n = 0;
            }
        }
        if (a != null && n == 0) {
            this.b = a;
            final aceo aceo = (aceo)this.f.a();
            if (this.h == null) {
                this.h = (szx)taa.c(this.c, (szx)new aats(this, 3));
            }
            aceo.k(a, this.h);
            return;
        }
        this.b(null, null);
    }
}
