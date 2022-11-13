import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxt
{
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    
    public aaxt() {
        this.a = new HashSet();
    }
    
    public aaxt(final byte[] array) {
        this.a = yrg.j;
        this.b = zir.q;
    }
    
    public static wzz a(final aiqj aiqj) {
        if (aiqj != null && ((ahbc)aiqj).ry((ahaq)amqf.b)) {
            appm appm;
            if ((appm = ((amqg)((ahbc)aiqj).rx((ahaq)amqf.b)).h) == null) {
                appm = appm.a;
            }
            return xmm.ac(appm);
        }
        return null;
    }
    
    public static void b(final wyw wyw, final wzz wzz, final String s) {
        if (wzz == null) {
            wyw.q(s);
            return;
        }
        wyw.r(wzz, s);
    }
    
    public static final xah d(final xag xag, final Runnable runnable, final wyt wyt, final aiqj aiqj) {
        final wzz a = a(aiqj);
        xah xah;
        if (a != null) {
            xah = xag.e((wzz)wyt, a);
        }
        else {
            xah = xag.d((wzz)wyt);
        }
        runnable.run();
        return xah;
    }
    
    public final void c(final wyw e) {
        e.getClass();
        this.e = e;
    }
    
    public final ziy e() {
        return new ziy(this, (byte[])null);
    }
}
