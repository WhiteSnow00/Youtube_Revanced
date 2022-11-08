import android.support.v7.widget.RecyclerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgl
{
    public final hgi a;
    public final Context b;
    public final float c;
    public final float d;
    public RecyclerView e;
    public aexq f;
    aexq g;
    aexq h;
    
    public hgl(final Context b, final hgi a) {
        this.b = b;
        this.a = a;
        this.c = b.getResources().getDimension(2131168887) / b.getResources().getDimension(2131168890);
        this.d = b.getResources().getDimension(2131168886) / b.getResources().getDimension(2131168888);
    }
    
    public final void a(final int n) {
        ((hgk)((aexw)this.f).a).a(n);
    }
    
    public final void b(final int n) {
        ((hgk)((aexw)this.f).a).b(n);
    }
    
    public final void c() {
        this.a.rT();
    }
    
    public final void d(final Object o, final hgo hgo) {
        final hgi a = this.a;
        final hgm a2 = hgn.a();
        a2.b = hgo.c(o);
        final afcm d = afcr.d();
        for (int a3 = hgo.a(o), i = 0; i < a3; ++i) {
            d.h(hgo.b(o, i));
        }
        a2.b(d.g());
        a.a = a2.a();
    }
}
