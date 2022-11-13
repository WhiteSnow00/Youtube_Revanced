import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxb extends ahbh implements ahcw
{
    public static final anxb a;
    private static volatile ahdd h;
    public int b;
    public anxc c;
    public anxa d;
    public ajut e;
    public ajut f;
    public ahab g;
    private aiqj i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)anxb.class, (ahbh)(a = new anxb()));
    }
    
    private anxb() {
        this.k = 2;
        this.g = ahab.b;
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
                final ahdd h;
                if ((h = anxb.h) == null) {
                    synchronized (anxb.class) {
                        if (anxb.h == null) {
                            anxb.h = (ahdd)new ahba((ahbh)anxb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anxb.a;
            }
            case 4: {
                return new ahaz((ahbh)anxb.a);
            }
            case 3: {
                return new anxb();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxb.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006\b\u100a\u0007", new Object[] { "b", "i", "c", "d", "e", "f", "j", "g" });
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
}
