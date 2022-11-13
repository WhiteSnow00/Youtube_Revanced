// 
// Decompiled by Procyon v0.6.0
// 

final class fxp implements sxx
{
    final fxq a;
    
    public fxp(final fxq a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.d("transactionStarted");
    }
    
    public final void b() {
        this.a.d("transactionCanceled");
    }
    
    public final void d(final vxl vxl) {
        final aln j = this.a.j;
        if (j != null) {
            final Object a = j.a;
            if (a != null) {
                vxl.z = ((xjr)a).b;
                return;
            }
        }
        ttr.c("RemoteTransactionController", "onTransactionReady: no valid screenID");
    }
    
    public final void e(final alfg alfg) {
        this.a.d("transactionCompleted");
        final fxq a = this.a;
        final aln j = a.j;
        if (j != null) {
            a.i.add(j.b);
        }
        a.j = null;
        this.a.b();
    }
    
    public final void f() {
        this.a.d("transactionError");
    }
    
    public final void sc(final CharSequence charSequence) {
        this.a.d("transactionError");
    }
}
