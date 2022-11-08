import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kan
{
    public final gle a;
    public final kas b;
    public boolean c;
    public boolean d;
    private PlaybackStartDescriptor e;
    private final aucj f;
    
    public kan(final aucj f, final kas b, final gle a, final byte[] array, final byte[] array2) {
        this.d = true;
        b.getClass();
        this.b = b;
        f.getClass();
        this.f = f;
        this.a = a;
        this.d();
    }
    
    public final PlaybackStartDescriptor a() {
        if (this.e == null) {
            final abhx d = PlaybackStartDescriptor.d();
            d.a = this.a.c();
            this.e = d.a();
        }
        return this.e;
    }
    
    public final void b() {
        if (!this.c) {
            return;
        }
        this.b.o();
        this.d = true;
    }
    
    public final void c(final int n, final boolean e) {
        if (this.c) {
            this.b.q();
            return;
        }
        final gle a = this.a;
        if (a.i() == null) {
            return;
        }
        final boolean f = n == 1 || n == 0;
        final String i = a.i();
        final abhx e2 = this.a().e();
        final foi l = this.f.l(i);
        if (l != null) {
            final long a2 = l.a;
            if (a2 > 0L) {
                e2.l = a2;
            }
        }
        e2.f = f;
        e2.e = e;
        e2.e();
        this.e = e2.a();
        final WatchDescriptor watchDescriptor = new WatchDescriptor(this.e);
        final gle a3 = this.a;
        final kas b = this.b;
        final fkf b2 = fkg.b();
        b2.f(watchDescriptor);
        final fkg a4 = b2.a();
        a3.t();
        b.u(a4);
        this.c = true;
    }
    
    public final void d() {
        this.c = false;
    }
    
    public final void e() {
        if (!this.c) {
            return;
        }
        this.b.r();
    }
    
    public final boolean f() {
        return TextUtils.equals((CharSequence)this.b.n(), (CharSequence)this.a.i());
    }
}
