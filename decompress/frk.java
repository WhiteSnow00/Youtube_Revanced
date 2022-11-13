import java.util.ArrayList;
import java.util.List;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frk implements acqx
{
    public final SwipeRefreshLayout a;
    public int b;
    public final atjs c;
    private final fri e;
    private final List f;
    private acns g;
    private final skt h;
    
    public frk(final skt h, final SwipeRefreshLayout a, final byte[] array, final byte[] array2, final byte[] array3) {
        final fri e = new fri(this);
        this.e = e;
        this.f = new ArrayList(2);
        this.h = h;
        this.a = a;
        this.b = 2;
        a.setEnabled(true);
        this.c = atjs.e();
        a.a = new frh(this, 0);
        h.j((feu)e);
    }
    
    public final void a() {
        final SwipeRefreshLayout a = this.a;
        a.getClass();
        this.c.getClass();
        final acns g = this.g;
        if (g == null) {
            a.k(false);
            this.c.tu((Object)frj.b(false));
            return;
        }
        g.om();
        this.c.tu((Object)frj.b(true));
    }
    
    public final void b() {
        this.h.k((feu)this.e);
        this.c.tx();
    }
    
    public final void d(final acqv g) {
        g.getClass();
        this.g = (acns)g;
        this.f.add(g.N);
        this.e();
    }
    
    public final void e() {
        this.a.setEnabled(this.b != 3);
    }
    
    @Override
    public final void sb(final int b) {
        this.b = b;
        this.a.k(b == 2);
        this.e();
    }
}
