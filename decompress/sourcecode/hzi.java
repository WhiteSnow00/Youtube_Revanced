import java.util.Iterator;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzi extends fnh implements vxw, tec
{
    public final hzf a;
    public final vzk b;
    public final vax c;
    public final wwv d;
    public alpx e;
    public aibk f;
    public boolean g;
    public boolean h;
    public final adcr i;
    private final asho j;
    private final tdz k;
    private final ashe l;
    private final abns m;
    private final asib n;
    private final boolean o;
    
    public hzi(final asho j, final qv qv, final hzf a, final vzk b, final vax c, final adcr i, final tdz k, final ashe l, final abns m, final wwv d, final xgc xgc, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(qv, (byte[])null, (byte[])null);
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = i;
        this.k = k;
        this.l = l;
        this.m = m;
        this.d = d;
        this.o = xgc.J();
        this.n = new asib();
    }
    
    public final Map a() {
        final HashMap hashMap = new HashMap();
        hashMap.put("toggle_source", this);
        return hashMap;
    }
    
    public final void b(final boolean b) {
        aioe aioe = null;
        Label_0040: {
            if (b) {
                final aibk f = this.f;
                if ((f.b & 0x200) != 0x0) {
                    if ((aioe = f.k) == null) {
                        aioe = aioe.a;
                    }
                    break Label_0040;
                }
            }
            aioe = null;
        }
        aioe aioe2 = aioe;
        if (!b) {
            final aibk f2 = this.f;
            aioe2 = aioe;
            if ((f2.b & 0x8000) != 0x0 && (aioe2 = f2.p) == null) {
                aioe2 = aioe.a;
            }
        }
        this.c.c(aioe2, (Map)null);
    }
    
    public final void lV() {
        this.k.m((Object)this);
        this.n.b();
    }
    
    public final Class[] ms(final Class clazz, final Object o, int n) {
        final int n2 = 2;
        final boolean b = false;
        final boolean b2 = false;
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final aalx aalx = (aalx)o;
                final hzf a = this.a;
                final boolean a2 = aalx.a;
                if (a.f) {
                    a.g = a2;
                    a.h();
                    return null;
                }
                array2 = array;
            }
            else {
                final vyx vyx = (vyx)o;
                final boolean b3 = vyx.b();
                if (((aexq)((uxu)vyx).h()).f() == this) {
                    final hzf a3 = this.a;
                    boolean b4 = b2;
                    if (b3) {
                        b4 = b2;
                        if (!this.h) {
                            b4 = true;
                        }
                    }
                    a3.g(b4);
                    final alpx e = this.e;
                    if (e != null) {
                        final wws wws = new wws(e.j);
                        if (b3) {
                            this.d.t((wxz)wws, (alff)null);
                        }
                        else {
                            this.d.o((wxz)wws, (alff)null);
                        }
                    }
                }
                else {
                    final hzf a4 = this.a;
                    boolean b5 = b;
                    if (b3) {
                        b5 = b;
                        if (!this.h) {
                            b5 = true;
                        }
                    }
                    a4.k(b5);
                }
                final vzk b6 = this.b;
                if (!b3) {
                    n = n2;
                }
                else {
                    n = 1;
                }
                b6.c(n);
                array2 = array;
                if (((aexq)((uxu)vyx).h()).h()) {
                    final Iterator iterator = ((LinkedList)this.i.a).iterator();
                    while (true) {
                        array2 = array;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final vxw vxw = ((WeakReference<vxw>)iterator.next()).get();
                        if (vxw == null || vxw.equals(this)) {
                            continue;
                        }
                        vxw.b(b3);
                    }
                }
            }
        }
        else {
            array2 = new Class[] { vyx.class, aalx.class };
        }
        return array2;
    }
    
    public final void pc() {
        if (this.o) {
            return;
        }
        super.pc();
    }
    
    public final void qB() {
        final asib n = this.n;
        asic asic;
        if (((uyi)this.m.cd().h).bx()) {
            asic = this.m.R().am((asix)new hzg(this), (asix)hnn.e);
        }
        else {
            asic = this.m.Q().R().P(this.j).am((asix)new hzg(this), (asix)hnn.e);
        }
        final asic am = ((asgt)this.m.q().b).am((asix)new hzh(this, 0), (asix)hnn.e);
        asic asic2;
        if (((uyi)this.m.cd().h).bw()) {
            asic2 = ((asgt)this.m.f().f).am((asix)new hzh(this, 2), (asix)hnn.e);
        }
        else {
            asic2 = this.m.f().b().P(this.j).am((asix)new hzh(this, 2), (asix)hnn.e);
        }
        n.f(new asic[] { asic, am, asic2, this.l.aB((asix)new hzh(this, 1)) });
        this.k.g((Object)this);
        ((aazp)this.a).mm();
    }
}
