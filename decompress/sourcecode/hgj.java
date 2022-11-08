import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class hgj extends qf
{
    final /* synthetic */ hgl a;
    
    public hgj(final hgl a) {
        this.a = a;
    }
    
    public final int d(final RecyclerView recyclerView, final on on) {
        return n(12);
    }
    
    public final void f(final RecyclerView recyclerView, final on on) {
        super.f(recyclerView, on);
        on.a.setScaleX(1.0f);
        on.a.setScaleY(1.0f);
    }
    
    public final void g(final on on, final int n) {
        if (n == 2) {
            on.a.setScaleX(this.a.c);
            on.a.setScaleY(this.a.d);
        }
    }
    
    public final boolean h(final RecyclerView recyclerView, final on on, final on on2) {
        return this.a.a.b(on.a()) && this.a.a.b(on2.a());
    }
    
    public final boolean j() {
        return false;
    }
    
    public final boolean l(final RecyclerView recyclerView, final on on, final on on2) {
        final int a = on.a();
        final int a2 = on2.a();
        if (a != a2 && this.a.a.b(a) && this.a.a.b(a2)) {
            ((hgk)((aexw)this.a.f).a).c(a, a2);
            this.a.a.k(a, a2);
            return true;
        }
        return false;
    }
    
    public final void p() {
    }
}
