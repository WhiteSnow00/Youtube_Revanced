// 
// Decompiled by Procyon v0.6.0
// 

final class ldh extends achd implements achj
{
    final /* synthetic */ ldi a;
    private final acib b;
    
    public ldh(final ldi a, final acib b) {
        this.a = a;
        (this.b = b).qK((achj)this);
    }
    
    private final void h(final int n, final int n2) {
        final int j = this.b.j(this.a.a.a());
        int i;
        if (j == -1) {
            i = Integer.MAX_VALUE;
        }
        else {
            i = Math.max(n, j + this.a.a.a().a());
        }
        while (i <= n + n2 - 1) {
            this.a.b.add(this.b.c(i));
            ++i;
        }
    }
    
    public final int a() {
        return this.b.a();
    }
    
    public final long b(final int n) {
        return this.b.b(n);
    }
    
    public final Object c(final int n) {
        return this.b.c(n);
    }
    
    public final boolean contains(final Object o) {
        throw null;
    }
    
    public final void e(final int n, final int n2) {
        this.A(n, n2);
    }
    
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }
    
    public final void ni(final acik acik) {
        this.b.ni(acik);
    }
    
    public final void oo(final acij acij, final int n) {
        this.b.oo(acij, n);
    }
    
    public final void qH() {
        this.h(0, this.b.a());
        this.u();
    }
    
    public final void qI(final int n, final int n2) {
        this.h(n, n2);
        this.w(n, n2);
    }
    
    public final void qJ(final int n, final int n2) {
        this.h(n, n2);
        this.x(n, n2);
    }
    
    public final void ta(final int n, final int n2) {
        this.y(n, n2);
    }
}
