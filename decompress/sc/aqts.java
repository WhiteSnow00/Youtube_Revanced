import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqts extends ahbh implements ahcw
{
    public static final aqts a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public Object d;
    public aqtp e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqts.class, (ahbh)(a = new aqts()));
    }
    
    private aqts() {
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
                if ((f = aqts.f) == null) {
                    synchronized (aqts.class) {
                        if (aqts.f == null) {
                            aqts.f = (ahdd)new ahba((ahbh)aqts.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqts.a;
            }
            case 4: {
                return new ahaz((ahbh)aqts.a);
            }
            case 3: {
                return new aqts();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqts.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000\u0003\u1009\u0003\u0004\u103c\u0000", new Object[] { "d", "c", "b", aqtq.class, "e", aqtr.class });
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
