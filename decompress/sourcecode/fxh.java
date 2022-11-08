// 
// Decompiled by Procyon v0.6.0
// 

final class fxh implements svs
{
    final /* synthetic */ fxi a;
    
    public fxh(final fxi a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.d("transactionStarted");
    }
    
    public final void b() {
        this.a.d("transactionCanceled");
    }
    
    public final void d(final vvk vvk) {
        final alm j = this.a.j;
        if (j != null) {
            final Object a = j.a;
            if (a != null) {
                vvk.z = ((xhs)a).b;
                return;
            }
        }
        trn.c("RemoteTransactionController", "onTransactionReady: no valid screenID");
    }
    
    public final void e(final aldd aldd) {
        this.a.d("transactionCompleted");
        final fxi a = this.a;
        final alm j = a.j;
        if (j != null) {
            a.i.add(j.b);
        }
        a.j = null;
        this.a.b();
    }
    
    public final void f() {
        this.a.d("transactionError");
    }
    
    public final void rW(final CharSequence charSequence) {
        this.a.d("transactionError");
    }
}
