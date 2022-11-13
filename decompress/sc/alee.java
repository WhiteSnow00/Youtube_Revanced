import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alee extends ahbh implements ahcw
{
    public static final alee a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)alee.class, (ahbh)(a = new alee()));
    }
    
    private alee() {
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
                final ahdd b;
                if ((b = alee.b) == null) {
                    synchronized (alee.class) {
                        if (alee.b == null) {
                            alee.b = (ahdd)new ahba((ahbh)alee.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alee.a;
            }
            case 4: {
                return new ahaz((ahbh)alee.a);
            }
            case 3: {
                return new alee();
            }
            case 2: {
                return newMessageInfo((MessageLite)alee.a, "\u0001\u0002\u0000\u0001\u0007\b\u0002\u0000\u0000\u0002\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "c", "d", "e" });
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
