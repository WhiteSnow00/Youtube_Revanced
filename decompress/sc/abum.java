import android.graphics.Bitmap;
import java.util.concurrent.Executor;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abum
{
    public final Context a;
    public Uri b;
    private final Executor c;
    private final Executor d;
    private final atke e;
    private final atke f;
    private final int g;
    private tcc h;
    private tcc i;
    private final abrj j;
    
    public abum(final Context a, final atke e, final atke f, final abrj j, final Executor c, final Executor d, final byte[] array) {
        this.a = a;
        this.e = e;
        this.f = f;
        this.j = j;
        this.c = c;
        this.d = d;
        this.g = Math.min(1024, Math.max(tpe.bb(a), tpe.bd(a)));
    }
    
    public static /* bridge */ void c(final abum abum) {
        abum.b = null;
    }
    
    public final tcc a() {
        if (this.i == null) {
            this.i = (tcc)tcf.c(this.d, (tcc)new aavo(this, 4));
        }
        return this.i;
    }
    
    public final void b(final Bitmap bitmap, final Bitmap bitmap2) {
        tbi.f();
        ((abul)this.e.a()).k(bitmap, bitmap2);
    }
    
    public final void d(final vgy vgy, final aezp aezp) {
        final int g = this.g;
        final vgx b = vgy.b(g, g * 9 / 16);
        Uri a;
        if (b == null) {
            a = null;
        }
        else {
            a = b.a();
        }
        final boolean r = abrj.ag((arwh)this.j.a).R;
        int n = 1;
        if (!r) {
            if (abrj.ag((arwh)this.j.a).T && aezp.h() && !(boolean)aezp.c()) {
                n = n;
            }
            else {
                n = 0;
            }
        }
        if (a != null && n == 0) {
            this.b = a;
            final acgs acgs = (acgs)this.f.a();
            if (this.h == null) {
                this.h = (tcc)tcf.c(this.c, (tcc)new aavo(this, 3));
            }
            acgs.k(a, this.h);
            return;
        }
        this.b(null, null);
    }
}
