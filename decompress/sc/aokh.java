import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokh extends ahbh implements ahcw
{
    private static final aokh a;
    private static volatile ahdd b;
    private int c;
    private boolean d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aokh.class, (ahbh)(a = new aokh()));
    }
    
    private aokh() {
        this.k = 2;
    }
    
    public static aokh g() {
        return aokh.a;
    }
    
    public static aokh h() {
        return aokh.a;
    }
    
    public ajut a() {
        ajut ajut;
        if ((ajut = this.j) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public ajut b() {
        ajut ajut;
        if ((ajut = this.g) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public ajut c() {
        ajut ajut;
        if ((ajut = this.h) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public ajut d() {
        ajut ajut;
        if ((ajut = this.i) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aokh.b) == null) {
                    synchronized (aokh.class) {
                        if (aokh.b == null) {
                            aokh.b = (ahdd)new ahba((ahbh)aokh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aokh.a;
            }
            case 4: {
                return new ahaz((ahbh)g());
            }
            case 3: {
                return new aokh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokh.a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0006\u0002\u1007\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
    
    public ajut e() {
        ajut ajut;
        if ((ajut = this.e) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public ajut f() {
        ajut ajut;
        if ((ajut = this.f) == null) {
            ajut = ajut.a;
        }
        return ajut;
    }
    
    public boolean i() {
        return this.d;
    }
    
    public boolean j() {
        return (this.c & 0x40) != 0x0;
    }
    
    public boolean k() {
        return (this.c & 0x8) != 0x0;
    }
    
    public boolean l() {
        return (this.c & 0x10) != 0x0;
    }
    
    public boolean m() {
        return (this.c & 0x20) != 0x0;
    }
    
    public boolean n() {
        return (this.c & 0x2) != 0x0;
    }
    
    public boolean o() {
        return (this.c & 0x4) != 0x0;
    }
}
