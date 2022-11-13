import com.google.firebase.iid.FirebaseInstanceId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aglb implements aglg
{
    final FirebaseInstanceId a;
    
    public aglb(final FirebaseInstanceId a) {
        this.a = a;
    }
    
    public final nnc a() {
        final String e = this.a.e();
        if (e != null) {
            return nnv.c((Object)e);
        }
        final FirebaseInstanceId a = this.a;
        FirebaseInstanceId.g(a.c);
        return a.a(agla.e(a.c), "*").a(nne.a, (nmr)myh.e);
    }
    
    public final void b() {
        this.a.e();
    }
    
    public final void c(final xra xra) {
        this.a.g.add(xra);
    }
}
