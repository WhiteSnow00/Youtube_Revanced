import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjp extends ahbh implements ahcw
{
    public static final ahjp a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public aiqj d;
    public ahab e;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjp.class, (ahbh)(a = new ahjp()));
    }
    
    private ahjp() {
        this.h = 2;
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ahjp.f) == null) {
                    synchronized (ahjp.class) {
                        if (ahjp.f == null) {
                            ahjp.f = (ahdd)new ahba((ahbh)ahjp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahjp.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjp.a);
            }
            case 3: {
                return new ahjp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003", new Object[] { "b", "c", "d", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
