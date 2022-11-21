import android.app.Notification;
import android.os.Bundle;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aahy implements aaig
{
    public final aail a;
    
    public aahy(final aail a) {
        this.a = a;
    }
    
    @Override
    public final String a() {
        final aahu g = this.a.g;
        if (g == null) {
            return null;
        }
        return g.e;
    }
    
    @Override
    public final Map b(final String s) {
        if (!s.equals(((aahu)this.a.a()).e)) {
            return Collections.emptyMap();
        }
        return afgm.k(this.a.c);
    }
    
    @Override
    public final void c(final String s, final String s2, final int n, final aach aach) {
        final aahp a = this.a.a();
        aahc.t(aach);
        final aaha aaha = new aaha(s, s2, n, aach, 0);
        final aahs a2 = aaht.a(2);
        a2.b = afbh.k(aaha);
        ((aahu)a).k(a2.a());
    }
    
    public final void d(final String s, final Bundle bundle) {
        this.a.a().f(s, bundle);
    }
    
    @Override
    public final void e() {
        final aail a = this.a;
        if (a.d.getApplicationInfo().targetSdkVersion >= 26) {
            final Notification a2 = ((aads)a.f.a()).a();
            if (a2 != null) {
                if (a.p(a2)) {
                    return;
                }
            }
        }
        a.j.h();
    }
    
    @Override
    public final void f(final String s) {
        final aahp a = this.a.a();
        final aahs a2 = aaht.a(22);
        a2.f(s);
        ((aahu)a).k(a2.a());
    }
    
    @Override
    public final void g() {
        ((aahu)this.a.a()).k(aaht.a(12).a());
    }
    
    @Override
    public final void h(final String s) {
        final aahp a = this.a.a();
        final aahs a2 = aaht.a(19);
        a2.f(s);
        ((aahu)a).k(a2.a());
    }
    
    @Override
    public final void i(final String s) {
        this.a.a().h(s);
    }
    
    @Override
    public final void j(final String s) {
        final aahp a = this.a.a();
        final aahs a2 = aaht.a(20);
        a2.f(s);
        ((aahu)a).k(a2.a());
    }
    
    @Override
    public final void k(final String s) {
        final aahp a = this.a.a();
        final aahs a2 = aaht.a(5);
        a2.f(s);
        ((aahu)a).k(a2.a());
    }
    
    @Override
    public final void l(final String s) {
        this.a.a().i(s);
    }
    
    @Override
    public final void m() {
    }
    
    @Override
    public final void n() {
    }
    
    @Override
    public final void o(final String s) {
        final aahp a = this.a.a();
        final aahs a2 = aaht.a(3);
        a2.f(s);
        a2.e(512);
        ((aahu)a).k(a2.a());
    }
    
    @Override
    public final boolean p(final Notification notification) {
        return this.a.p(notification);
    }
}
