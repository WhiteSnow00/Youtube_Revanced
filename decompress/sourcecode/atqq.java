import java.util.concurrent.locks.LockSupport;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atqq extends atqp implements atqg
{
    private final ator c;
    public final atou e;
    public final atou f;
    
    public atqq() {
        this.e = auet.h(null);
        this.f = auet.h(null);
        this.c = auet.f(false);
    }
    
    public final void d(final atli atli, final Runnable runnable) {
        atli.getClass();
        this.f(runnable);
    }
    
    public void f(final Runnable runnable) {
        final atou e = this.e;
        Label_0160: {
            while (true) {
                final Object a = e.a;
                if (this.c.a()) {
                    break Label_0160;
                }
                if (a == null) {
                    if (this.e.d((Object)null, (Object)runnable)) {
                        break;
                    }
                    continue;
                }
                else if (a instanceof atvc) {
                    final atvc atvc = (atvc)a;
                    final int a2 = atvc.a((Object)runnable);
                    if (a2 == 0) {
                        break;
                    }
                    if (a2 != 1) {
                        break Label_0160;
                    }
                    this.e.d(a, (Object)atvc.c());
                }
                else {
                    if (a == atqr.a) {
                        break Label_0160;
                    }
                    final atvc atvc2 = new atvc(8, true);
                    atvc2.a((Object)a);
                    atvc2.a((Object)runnable);
                    if (this.e.d(a, (Object)atvc2)) {
                        break;
                    }
                    continue;
                }
            }
            final Thread c = this.c();
            if (Thread.currentThread() != c) {
                LockSupport.unpark(c);
            }
            return;
        }
        atqd.c.f(runnable);
    }
    
    public void g() {
        final ThreadLocal a = atrv.a;
        atrv.a.set(null);
        this.c.c();
        final boolean a2 = atqb.a;
        final atou e = this.e;
        while (true) {
            final Object a3 = e.a;
            if (a3 == null) {
                if (this.e.d((Object)null, (Object)atqr.a)) {
                    break;
                }
                continue;
            }
            else {
                if (a3 instanceof atvc) {
                    ((atvc)a3).d();
                    break;
                }
                if (a3 == atqr.a) {
                    break;
                }
                final atvc atvc = new atvc(8, true);
                atvc.a((Object)a3);
                if (this.e.d(a3, (Object)atvc)) {
                    break;
                }
                continue;
            }
        }
        while (this.h() <= 0L) {}
        System.nanoTime();
        final atvp atvp = (atvp)this.f.a;
        if (atvp == null) {
            return;
        }
        monitorenter(atvp);
        try {
            throw null;
        }
        finally {
            monitorexit(atvp);
            while (true) {}
        }
    }
    
    public final long h() {
        final boolean m = this.m();
        final long n = 0L;
        if (m) {
            return 0L;
        }
        final atvp atvp = (atvp)this.f.a;
        Runnable runnable = null;
        if (atvp != null) {
            throw null;
        }
        final atou e = this.e;
        while (true) {
            final Object a = e.a;
            if (a == null) {
                break;
            }
            if (a instanceof atvc) {
                final atvc atvc = (atvc)a;
                final Object b = atvc.b();
                if (b != atvc.a) {
                    runnable = (Runnable)b;
                    break;
                }
                this.e.d(a, (Object)atvc.c());
            }
            else {
                if (a == atqr.a) {
                    break;
                }
                if (this.e.d(a, (Object)null)) {
                    runnable = (Runnable)a;
                    break;
                }
                continue;
            }
        }
        if (runnable == null) {
            final atui d = super.d;
            long n2;
            if (d != null && !d.a()) {
                n2 = 0L;
            }
            else {
                n2 = Long.MAX_VALUE;
            }
            long n3;
            if (n2 == 0L) {
                n3 = n;
            }
            else {
                final Object a2 = this.e.a;
                Label_0263: {
                    if (a2 != null) {
                        if (a2 instanceof atvc) {
                            if (!((atvc)a2).e()) {
                                n3 = n;
                                return n3;
                            }
                        }
                        else {
                            if (a2 == atqr.a) {
                                break Label_0263;
                            }
                            return 0L;
                        }
                    }
                    final atvp atvp2 = (atvp)this.f.a;
                    if (atvp2 != null) {
                        monitorenter(atvp2);
                        monitorexit(atvp2);
                        return Long.MAX_VALUE;
                    }
                }
                n3 = Long.MAX_VALUE;
            }
            return n3;
        }
        runnable.run();
        return 0L;
    }
    
    protected final boolean p() {
        final atui d = super.d;
        boolean e = false;
        if (d != null && !d.a()) {
            return false;
        }
        if (this.f.a == null) {
            final Object a = this.e.a;
            if (a == null) {
                e = true;
            }
            else if (a instanceof atvc) {
                e = ((atvc)a).e();
            }
            else if (a == atqr.a) {
                return true;
            }
            return e;
        }
        throw null;
    }
}
