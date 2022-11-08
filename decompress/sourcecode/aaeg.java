import android.app.Notification;
import android.os.Bundle;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaeg implements aaen
{
    public final aaes a;
    
    public aaeg(final aaes a) {
        this.a = a;
    }
    
    public final String a() {
        final aaeb g = this.a.g;
        if (g == null) {
            return null;
        }
        return g.e;
    }
    
    public final Map b(final String s) {
        if (!s.equals(((aaeb)this.a.a()).e)) {
            return Collections.emptyMap();
        }
        return (Map)afcw.k(this.a.c);
    }
    
    public final void c(final String s, final String s2, final int n, final zyq zyq) {
        final aadw a = this.a.a();
        aadj.t(zyq);
        final aadh aadh = new aadh(s, s2, n, zyq, 0);
        final aadz a2 = aaea.a(2);
        a2.b = aexq.k(aadh);
        ((aaeb)a).k(a2.a());
    }
    
    public final void d(final String s, final Bundle bundle) {
        this.a.a().f(s, bundle);
    }
    
    public final void e() {
        final aaes a = this.a;
        if (a.d.getApplicationInfo().targetSdkVersion >= 26) {
            final Notification a2 = ((aaab)a.f.a()).a();
            if (a2 != null) {
                if (a.p(a2)) {
                    return;
                }
            }
        }
        a.j.U();
    }
    
    public final void f(final String s) {
        final aadw a = this.a.a();
        final aadz a2 = aaea.a(22);
        a2.f(s);
        ((aaeb)a).k(a2.a());
    }
    
    public final void g() {
        ((aaeb)this.a.a()).k(aaea.a(12).a());
    }
    
    public final void h(final String s) {
        final aadw a = this.a.a();
        final aadz a2 = aaea.a(19);
        a2.f(s);
        ((aaeb)a).k(a2.a());
    }
    
    public final void i(final String s) {
        this.a.a().h(s);
    }
    
    public final void j(final String s) {
        final aadw a = this.a.a();
        final aadz a2 = aaea.a(20);
        a2.f(s);
        ((aaeb)a).k(a2.a());
    }
    
    public final void k(final String s) {
        final aadw a = this.a.a();
        final aadz a2 = aaea.a(5);
        a2.f(s);
        ((aaeb)a).k(a2.a());
    }
    
    public final void l(final String s) {
        this.a.a().i(s);
    }
    
    public final void m() {
    }
    
    public final void n() {
    }
    
    public final void o(final String s) {
        final aadw a = this.a.a();
        final aadz a2 = aaea.a(3);
        a2.f(s);
        a2.e(512);
        ((aaeb)a).k(a2.a());
    }
    
    public final boolean p(final Notification notification) {
        return this.a.p(notification);
    }
}
