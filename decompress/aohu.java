import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohu extends ahbh implements ahcw
{
    public static final aohu a;
    private static volatile ahdd c;
    public ahla b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aohu.class, (ahbh)(a = new aohu()));
    }
    
    private aohu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aohu.c) == null) {
                    synchronized (aohu.class) {
                        if (aohu.c == null) {
                            aohu.c = (ahdd)new ahba((ahbh)aohu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aohu.a;
            }
            case 4: {
                return new ahaz((ahbh)aohu.a);
            }
            case 3: {
                return new aohu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohu.a, "\u0001\u0001\u0000\u0001\uea6f\u32ff\uea6f\u32ff\u0001\u0000\u0000\u0000\uea6f\u32ff\u1009\u0000", new Object[] { "d", "b" });
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
