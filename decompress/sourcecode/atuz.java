// 
// Decompiled by Procyon v0.6.0
// 

public class atuz
{
    private final atou a;
    public final atou c;
    public final atou d;
    
    public atuz() {
        this.c = auet.h((Object)this);
        this.d = auet.h((Object)this);
        this.a = auet.h((Object)null);
    }
    
    private final atuz a() {
    Label_0000:
        while (true) {
            atuz atuz2;
            final atuz atuz = atuz2 = (atuz)this.d.a;
            Object a = null;
            Block_5: {
            Block_0:
                while (true) {
                    atuz atuz3 = null;
                    while (true) {
                        a = atuz2.c.a;
                        if (a == this) {
                            break Block_0;
                        }
                        if (this.tD()) {
                            return null;
                        }
                        if (a == null) {
                            return atuz2;
                        }
                        if (a instanceof atve) {
                            break Block_5;
                        }
                        if (a instanceof atvf) {
                            if (atuz3 != null) {
                                if (atuz3.c.d(atuz2, ((atvf)a).a)) {
                                    atuz2 = atuz3;
                                    break;
                                }
                                continue Label_0000;
                            }
                            else {
                                atuz2 = (atuz)atuz2.d.a;
                            }
                        }
                        else {
                            final atuz atuz4 = (atuz)a;
                            atuz3 = atuz2;
                            atuz2 = atuz4;
                        }
                    }
                }
                if (atuz == atuz2) {
                    return atuz2;
                }
                if (this.d.d(atuz, atuz2)) {
                    return atuz2;
                }
                continue;
            }
            ((atve)a).c(atuz2);
        }
    }
    
    public final int f(final atuz atuz, final atuz d, final atux atux) {
        atuz.d.b(this);
        atuz.c.b(d);
        atux.d = d;
        if (!this.c.d(d, atux)) {
            return 0;
        }
        if (atux.c(this) == null) {
            return 1;
        }
        return 2;
    }
    
    public final Object g() {
        final atou c = this.c;
        Object a;
        while (true) {
            a = c.a;
            if (!(a instanceof atve)) {
                break;
            }
            ((atve)a).c(this);
        }
        return a;
    }
    
    public final atuz h() {
        final Object g = this.g();
        g.getClass();
        atvf atvf;
        if (g instanceof atvf) {
            atvf = (atvf)g;
        }
        else {
            atvf = null;
        }
        atuz a;
        if (atvf != null) {
            a = atvf.a;
        }
        else {
            a = (atuz)g;
        }
        return a;
    }
    
    public final atuz i() {
        final atuz a = this.a();
        if (a == null) {
            atuz atuz;
            for (atuz = (atuz)this.d.a; atuz.tD(); atuz = (atuz)atuz.d.a) {}
            return atuz;
        }
        return a;
    }
    
    public final atuz j() {
        Object g;
        atvf atvf;
        atuz atuz;
        do {
            g = this.g();
            if (g instanceof atvf) {
                return ((atvf)g).a;
            }
            if (g == this) {
                return (atuz)g;
            }
            g.getClass();
            atuz = (atuz)g;
            if ((atvf = (atvf)atuz.a.a) != null) {
                continue;
            }
            atvf = new atvf(atuz);
            atuz.a.b(atvf);
        } while (!this.c.d(g, atvf));
        atuz.a();
        return null;
    }
    
    public final void k(final atuz atuz) {
        final atou d = atuz.d;
        atuz atuz2;
        do {
            atuz2 = (atuz)d.a;
            if (this.g() != atuz) {
                return;
            }
        } while (!atuz.d.d(atuz2, this));
        if (this.tD()) {
            atuz.a();
        }
    }
    
    public final void l() {
        final Object g = this.g();
        g.getClass();
        ((atvf)g).a.m();
    }
    
    public final void m() {
        atuz a = this;
        while (true) {
            final Object g = a.g();
            if (!(g instanceof atvf)) {
                break;
            }
            a = ((atvf)g).a;
        }
        a.a();
    }
    
    public final boolean n(final atuz atuz, final atuz atuz2) {
        atuz.d.b(this);
        atuz.c.b(atuz2);
        if (!this.c.d(atuz2, atuz)) {
            return false;
        }
        atuz.k(atuz2);
        return true;
    }
    
    public boolean tD() {
        return this.g() instanceof atvf;
    }
    
    public boolean tE() {
        return this.j() == null;
    }
    
    @Override
    public String toString() {
        final atuy atuy = new atuy((Object)this);
        final String b = atqc.b(this);
        final StringBuilder sb = new StringBuilder();
        sb.append(atuy);
        sb.append("@");
        sb.append(b);
        return sb.toString();
    }
}
