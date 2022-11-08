import java.util.function.Consumer;
import android.view.View;
import j$.util.Optional;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kaj implements gfa, gez
{
    public final aceo a;
    public final tpc b;
    public final aorm c;
    public final acek d;
    public final akeb e;
    public final boolean f;
    private final WeakReference g;
    private final Optional h;
    
    public kaj(final jzv jzv, final aceo a, final tpc b, final String s, final aqdw aqdw, final akeb e, final boolean f, final WeakReference g, final Optional h) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.c = aaja.x(aqdw);
        this.e = e;
        this.f = f;
        acek a2;
        if (f) {
            a2 = null;
        }
        else {
            final kai c = new kai(aqdw, jzv, s);
            final acej a3 = acek.a();
            a3.c = (acem)c;
            a2 = a3.a();
        }
        this.d = a2;
        this.h = h;
    }
    
    @Override
    public final void a() {
        final fsj fsj = (fsj)this.g.get();
        if (fsj != null) {
            fsj.a(true);
        }
    }
    
    @Override
    public final View f() {
        return null;
    }
    
    @Override
    public final gez g() {
        return this;
    }
    
    @Override
    public final void i() {
        this.h.ifPresent((Consumer)kbd.b);
    }
    
    @Override
    public final void j() {
        this.h.ifPresent((Consumer)hus.s);
    }
    
    @Override
    public final void k(final boolean b) {
        final fsj fsj = (fsj)this.g.get();
        if (fsj == null) {
            return;
        }
        if (b) {
            fsj.b(new qpt(this));
            return;
        }
        fsj.a(false);
    }
}
