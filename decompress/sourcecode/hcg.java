import com.google.android.libraries.youtube.player.ui.PlayerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcg implements hcf
{
    private final hbr a;
    private final tzg b;
    private long c;
    
    public hcg(final hbr a, final tzg b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final long c) {
        this.c = c;
        this.a.d(c);
    }
    
    public final void c() {
        this.a.g(false);
        this.a.h(true);
        this.b.j(this.c);
    }
    
    public final void d() {
        this.a.h(false);
        this.a.f(1.0f);
        this.a.g(true);
        this.a.j();
    }
    
    public final void f(final long n) {
        final long a = this.a.a();
        final long c = this.c;
        if (a >= n + c) {
            this.a.d(c);
        }
    }
    
    public final void g() {
        this.a.c();
    }
}
