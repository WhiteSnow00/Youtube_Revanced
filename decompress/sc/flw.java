import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flw implements flv, tgg
{
    public final Set a;
    public final Set b;
    public final atiw c;
    public final atiw d;
    public final vdr e;
    public final zmf f;
    public final vai g;
    private final atke h;
    
    public flw(final atke h, final vdr e, final zmf f, final vai g) {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = (atiw)ativ.aE();
        this.d = (atiw)ativ.aE();
        this.h = h;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final asht a() {
        return ((ashi)this.d).Q().ai();
    }
    
    public final asht b() {
        return ((ashi)this.c).Q().ai();
    }
    
    public final asie c() {
        return asie.I(afft.p((Collection)this.b));
    }
    
    public final asie d() {
        return asie.I(afft.p((Collection)this.a));
    }
    
    public final void f() {
        ((tgd)this.h.a()).g((Object)this);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            final StringBuilder sb = new StringBuilder("unsupported op code: ");
                            sb.append(n);
                            throw new IllegalStateException(sb.toString());
                        }
                        this.a.remove(((zyh)o).a);
                        this.c.tu((Object)afft.p((Collection)this.a));
                        array2 = array;
                    }
                    else {
                        final zxu zxu = (zxu)o;
                        this.b.add(zxu.a);
                        this.d.tu((Object)afft.p((Collection)this.b));
                        final vdq a = this.e.a(this.f.c());
                        String s;
                        if (this.g.ax()) {
                            s = glb.H(zxu.a);
                        }
                        else {
                            s = glb.w(zxu.a);
                        }
                        ((vfp)a).h(s, true).K((asjs)exh.p).aD().e().D().V((asjg)new gcw(this, zxu, 1));
                        array2 = array;
                    }
                }
                else {
                    this.a.remove(((ijy)o).a);
                    this.c.tu((Object)afft.p((Collection)this.a));
                    array2 = array;
                }
            }
            else {
                this.a.add(((ijx)o).a);
                this.c.tu((Object)afft.p((Collection)this.a));
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { ijx.class, ijy.class, zxu.class, zyh.class };
        }
        return array2;
    }
}
