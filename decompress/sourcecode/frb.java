import java.util.ArrayList;
import java.util.List;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frb implements acot
{
    public final SwipeRefreshLayout a;
    public int b;
    public final atix c;
    private final fqz e;
    private final List f;
    private aclp g;
    private final sin h;
    
    public frb(final sin h, final SwipeRefreshLayout a, final byte[] array, final byte[] array2, final byte[] array3) {
        final fqz e = new fqz(this);
        this.e = e;
        this.f = new ArrayList(2);
        this.h = h;
        this.a = a;
        this.b = 2;
        a.setEnabled(true);
        this.c = atix.e();
        a.a = (chq)new fqy(this, 0);
        h.j((fen)e);
    }
    
    public final void a() {
        final SwipeRefreshLayout a = this.a;
        a.getClass();
        this.c.getClass();
        final aclp g = this.g;
        if (g == null) {
            a.k(false);
            this.c.tr((Object)fra.b(false));
            return;
        }
        g.om();
        this.c.tr((Object)fra.b(true));
    }
    
    public final void b() {
        this.h.k((fen)this.e);
        this.c.tu();
    }
    
    public final void d(final acor g) {
        g.getClass();
        this.g = g;
        this.f.add(g.N);
        this.e();
    }
    
    public final void e() {
        this.a.setEnabled(this.b != 3);
    }
    
    public final void rV(final int b) {
        this.b = b;
        this.a.k(b == 2);
        this.e();
    }
}
