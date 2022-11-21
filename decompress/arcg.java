import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcg extends ahcz implements aheo
{
    private static final arcg a;
    private static volatile ahev b;
    private int c;
    private Object d;
    
    static {
        ahcz.registerDefaultInstance(arcg.class, a = new arcg());
    }
    
    private arcg() {
        this.c = 0;
    }
    
    public static arcg d() {
        return arcg.a;
    }
    
    public arbj a() {
        if (this.c == 8) {
            return (arbj)this.d;
        }
        return arbj.b();
    }
    
    public arcd b() {
        if (this.c == 6) {
            return (arcd)this.d;
        }
        return arcd.c();
    }
    
    public arce c() {
        if (this.c == 9) {
            return (arce)this.d;
        }
        return arce.c();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arcg.b) == null) {
                    synchronized (arcg.class) {
                        if (arcg.b == null) {
                            arcg.b = (ahev)new ahcs((ahcz)arcg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arcg.a;
            }
            case 4: {
                return new ahcr((ahcz)d());
            }
            case 3: {
                return new arcg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcg.a, "\u0001\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000", new Object[] { "d", "c", arcy.class, arch.class, arci.class, arcf.class, arck.class, arcd.class, arco.class, arbj.class, arce.class, arcj.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public arch e() {
        if (this.c == 2) {
            return (arch)this.d;
        }
        return arch.b();
    }
    
    public arcj f() {
        if (this.c == 10) {
            return (arcj)this.d;
        }
        return arcj.b();
    }
    
    public arco g() {
        if (this.c == 7) {
            return (arco)this.d;
        }
        return arco.l();
    }
    
    public arcy h() {
        if (this.c == 1) {
            return (arcy)this.d;
        }
        return arcy.f();
    }
    
    public boolean i() {
        return this.c == 7;
    }
    
    public boolean j() {
        return this.c == 6;
    }
    
    public boolean k() {
        return this.c == 8;
    }
    
    public boolean l() {
        return this.c == 9;
    }
    
    public boolean m() {
        return this.c == 4;
    }
    
    public boolean n() {
        return this.c == 2;
    }
    
    public boolean o() {
        return this.c == 3;
    }
    
    public boolean p() {
        return this.c == 1;
    }
    
    public boolean q() {
        return this.c == 10;
    }
    
    public boolean r() {
        return this.c == 5;
    }
}
