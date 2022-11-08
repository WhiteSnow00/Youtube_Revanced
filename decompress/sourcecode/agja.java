import com.google.firebase.iid.FirebaseInstanceId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agja implements agjf
{
    final FirebaseInstanceId a;
    
    public agja(final FirebaseInstanceId a) {
        this.a = a;
    }
    
    public final nly a() {
        final String e = this.a.e();
        if (e != null) {
            return nmr.c((Object)e);
        }
        final FirebaseInstanceId a = this.a;
        FirebaseInstanceId.g(a.c);
        return a.a(agiz.e(a.c), "*").a(nma.a, (nln)mxc.e);
    }
    
    public final void b() {
        this.a.e();
    }
    
    public final void c(final xpb xpb) {
        this.a.g.add(xpb);
    }
}
