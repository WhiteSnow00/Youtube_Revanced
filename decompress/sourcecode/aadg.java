import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aadg implements aadu
{
    private final ztk a;
    private final atjj b;
    private final atjj c;
    
    public aadg(final atjj b, final atjj c, final aaha aaha) {
        this.b = b;
        this.c = c;
        this.a = aaha.c();
    }
    
    public final aexq a(final String s) {
        aexq aexq;
        if (this.a.b()) {
            aexq = ((aadf)this.c.a()).a(s);
        }
        else {
            aexq = ((aadm)this.b.a()).a(s);
        }
        return aexq;
    }
    
    public final List b(final zkh zkh) {
        List list;
        if (this.a.b()) {
            list = ((aadf)this.c.a()).b(zkh);
        }
        else {
            list = ((aadm)this.b.a()).b(zkh);
        }
        return list;
    }
    
    public final void c(final aadh aadh) {
        if (this.a.c()) {
            ((aadf)this.c.a()).h(aadh);
        }
        if (this.a.d()) {
            ((aadm)this.b.a()).f(aadh);
        }
    }
    
    public final void d(final aadh aadh) {
        if (this.a.d()) {
            ((aadm)this.b.a()).d(aadh);
        }
    }
    
    public final void e() {
        if (this.a != ztk.d) {
            ((aadm)this.b.a()).e();
        }
        if (this.a != ztk.a) {
            final aadf aadf = (aadf)this.c.a();
        }
    }
    
    public final void f(final aadh aadh) {
        ((aadm)this.b.a()).f(aadh);
    }
    
    public final void g(final String s) {
        ((aadm)this.b.a()).g(s);
    }
    
    public final void h(final aadh aadh) {
        if (this.a.d()) {
            ((aadm)this.b.a()).h(aadh);
        }
        if (this.a.c()) {
            ((aadf)this.c.a()).h(aadh);
        }
    }
}
