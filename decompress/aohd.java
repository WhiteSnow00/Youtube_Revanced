import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohd extends ahbh implements ahcw
{
    public static final aohd a;
    private static volatile ahdd d;
    public aiqj b;
    public ahab c;
    private int e;
    private ahhu f;
    private ajut g;
    private ajut h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aohd.class, (ahbh)(a = new aohd()));
    }
    
    private aohd() {
        this.i = 2;
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aohd.d) == null) {
                    synchronized (aohd.class) {
                        if (aohd.d == null) {
                            aohd.d = (ahdd)new ahba((ahbh)aohd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aohd.a;
            }
            case 4: {
                return new ahaz((ahbh)aohd.a);
            }
            case 3: {
                return new aohd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohd.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0004\u1409\u0001\u0005\u100a\u0002\u0006\u1409\u0003\u0007\u1409\u0004", new Object[] { "e", "b", "f", "c", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
