import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghq extends ahbh implements ahcw
{
    public static final aghq a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public Object d;
    public long e;
    
    static {
        ahbh.registerDefaultInstance((Class)aghq.class, (ahbh)(a = new aghq()));
    }
    
    private aghq() {
        this.c = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aghq.f) == null) {
                    synchronized (aghq.class) {
                        if (aghq.f == null) {
                            aghq.f = (ahdd)new ahba((ahbh)aghq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aghq.a;
            }
            case 4: {
                return new ahaz((ahbh)aghq.a);
            }
            case 3: {
                return new aghq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghq.a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000", new Object[] { "d", "c", "b", "e", aghi.class, aghg.class, aghk.class, aghc.class, aghp.class, agho.class, aghn.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
