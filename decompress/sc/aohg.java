import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohg extends ahbh implements ahcw
{
    public static final aohg a;
    private static volatile ahdd e;
    public int b;
    public aohf c;
    public aiqj d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aohg.class, (ahbh)(a = new aohg()));
    }
    
    private aohg() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aohg.e) == null) {
                    synchronized (aohg.class) {
                        if (aohg.e == null) {
                            aohg.e = (ahdd)new ahba((ahbh)aohg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aohg.a;
            }
            case 4: {
                return new ahaz((ahbh)aohg.a);
            }
            case 3: {
                return new aohg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1009\u0001\u0002\u1409\u0002", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
