import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaks
{
    public final vbo a;
    @Deprecated
    public final vbs b;
    public final vbs c;
    public final arzb d;
    private final tuv e;
    private final vbs f;
    
    public aaks(final arzb d, final vbo a, final vbs b, final vbs c, final vbs f, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = tuv.c(zxc.class.getName(), (afci)new yyl(this, 10));
    }
    
    public static amvy u(final vbo vbo) {
        if (vbo != null && vbo.b() != null) {
            amvy amvy;
            if ((amvy = vbo.b().k) == null) {
                amvy = amvy.a;
            }
            return amvy;
        }
        return null;
    }
    
    public static boolean v(final vbo vbo) {
        final amvy u = u(vbo);
        return u != null && u.e;
    }
    
    public static boolean w(final arzb arzb) {
        if (arzb != null && arzb.f() != null && (arzb.f().b & 0x200) != 0x0) {
            amwj amwj;
            if ((amwj = arzb.f().g) == null) {
                amwj = amwj.a;
            }
            if (amwj.q) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean x(final arzb arzb) {
        if (arzb != null && arzb.f() != null && (arzb.f().b & 0x200) != 0x0) {
            amwj amwj;
            if ((amwj = arzb.f().g) == null) {
                amwj = amwj.a;
            }
            if (amwj.u) {
                return true;
            }
        }
        return false;
    }
    
    public final long a() {
        return this.c.h(45360008L);
    }
    
    public final long b() {
        return this.c.h(45385102L);
    }
    
    public final zxc c() {
        return (zxc)this.e.a();
    }
    
    public final boolean d() {
        return this.c.f(45367315L);
    }
    
    public final boolean e() {
        amwj amwj;
        if ((amwj = this.d.f().g) == null) {
            amwj = amwj.a;
        }
        return amwj.z;
    }
    
    public final boolean f() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)this.c.l(45362776L).aC(false).aa(new aaid(atomicBoolean, 4)));
        return atomicBoolean.get();
    }
    
    public final boolean g() {
        return this.c.f(45370748L);
    }
    
    public final boolean h() {
        return this.c.f(45376587L);
    }
    
    public final boolean i() {
        return this.c.f(45359867L);
    }
    
    public final boolean j() {
        amwj amwj;
        if ((amwj = this.d.f().g) == null) {
            amwj = amwj.a;
        }
        return amwj.E;
    }
    
    public final boolean k() {
        amwj amwj;
        if ((amwj = this.d.f().g) == null) {
            amwj = amwj.a;
        }
        return amwj.B;
    }
    
    public final boolean l() {
        return this.b.f(45354129L);
    }
    
    public final boolean m() {
        return this.c.f(45360007L);
    }
    
    public final boolean n() {
        return this.c.f(45367079L);
    }
    
    public final boolean o() {
        amwj amwj;
        if ((amwj = this.d.f().g) == null) {
            amwj = amwj.a;
        }
        return amwj.r;
    }
    
    public final boolean p() {
        amvy amvy;
        if ((amvy = this.a.b().k) == null) {
            amvy = amvy.a;
        }
        return amvy.h;
    }
    
    public final boolean q() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)this.f.l(45370134L).aC(false).aa(new aaid(atomicBoolean, 4)));
        return atomicBoolean.get();
    }
    
    public final boolean r() {
        final arzb d = this.d;
        if (d != null && d.f() != null && (this.d.f().b & 0x200) != 0x0) {
            amwj amwj;
            if ((amwj = this.d.f().g) == null) {
                amwj = amwj.a;
            }
            if (amwj.t) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean s() {
        return this.c.f(45370274L);
    }
    
    public final boolean t() {
        return this.c.f(45370273L);
    }
}
