import java.util.concurrent.locks.LockSupport;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atrl extends atrk implements atrb
{
    private final atpm c;
    public final atpp e;
    public final atpp f;
    
    public atrl() {
        this.e = aucl.i((Object)null);
        this.f = aucl.i((Object)null);
        this.c = aucl.g(false);
    }
    
    public final void d(final atmd atmd, final Runnable runnable) {
        atmd.getClass();
        this.f(runnable);
    }
    
    public void f(final Runnable runnable) {
        final atpp e = this.e;
        Label_0165: {
            while (true) {
                final Object a = e.a;
                if (this.c.a()) {
                    break Label_0165;
                }
                if (a == null) {
                    if (this.e.d((Object)null, (Object)runnable)) {
                        break;
                    }
                    continue;
                }
                else if (a instanceof atvz) {
                    final atvz atvz = (atvz)a;
                    final int a2 = atvz.a((Object)runnable);
                    if (a2 == 0) {
                        break;
                    }
                    if (a2 != 1) {
                        break Label_0165;
                    }
                    this.e.d(a, (Object)atvz.c());
                }
                else {
                    if (a == atrm.a) {
                        break Label_0165;
                    }
                    final atvz atvz2 = new atvz(8, true);
                    atvz2.a((Object)a);
                    atvz2.a((Object)runnable);
                    if (this.e.d(a, (Object)atvz2)) {
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
        atqy.c.f(runnable);
    }
    
    public void g() {
        final ThreadLocal a = atsq.a;
        atsq.a.set(null);
        this.c.c();
        final boolean a2 = atqw.a;
        final atpp e = this.e;
        while (true) {
            final Object a3 = e.a;
            if (a3 == null) {
                if (this.e.d((Object)null, (Object)atrm.a)) {
                    break;
                }
                continue;
            }
            else {
                if (a3 instanceof atvz) {
                    ((atvz)a3).d();
                    break;
                }
                if (a3 == atrm.a) {
                    break;
                }
                final atvz atvz = new atvz(8, true);
                atvz.a((Object)a3);
                if (this.e.d(a3, (Object)atvz)) {
                    break;
                }
                continue;
            }
        }
        while (this.h() <= 0L) {}
        System.nanoTime();
        final atwm atwm = (atwm)this.f.a;
        if (atwm == null) {
            return;
        }
        monitorenter(atwm);
        try {
            throw null;
        }
        finally {
            monitorexit(atwm);
            while (true) {}
        }
    }
    
    public final long h() {
        final boolean m = this.m();
        final long n = 0L;
        if (m) {
            return 0L;
        }
        final atwm atwm = (atwm)this.f.a;
        Runnable runnable = null;
        if (atwm != null) {
            throw null;
        }
        final atpp e = this.e;
        while (true) {
            final Object a = e.a;
            if (a == null) {
                break;
            }
            if (a instanceof atvz) {
                final atvz atvz = (atvz)a;
                final Object b = atvz.b();
                if (b != atvz.a) {
                    runnable = (Runnable)b;
                    break;
                }
                this.e.d(a, (Object)atvz.c());
            }
            else {
                if (a == atrm.a) {
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
            final atvf d = super.d;
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
                Label_0260: {
                    if (a2 != null) {
                        if (a2 instanceof atvz) {
                            if (!((atvz)a2).e()) {
                                n3 = n;
                                return n3;
                            }
                        }
                        else {
                            if (a2 == atrm.a) {
                                break Label_0260;
                            }
                            return 0L;
                        }
                    }
                    final atwm atwm2 = (atwm)this.f.a;
                    if (atwm2 != null) {
                        monitorenter(atwm2);
                        monitorexit(atwm2);
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
        final atvf d = super.d;
        boolean e = false;
        if (d != null && !d.a()) {
            return false;
        }
        if (this.f.a == null) {
            final Object a = this.e.a;
            if (a == null) {
                e = true;
            }
            else if (a instanceof atvz) {
                e = ((atvz)a).e();
            }
            else if (a == atrm.a) {
                return true;
            }
            return e;
        }
        throw null;
    }
}
