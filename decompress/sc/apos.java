import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apos extends ahbh implements ahcw
{
    public static final apos a;
    private static volatile ahdd g;
    public int b;
    public apor c;
    public apkz d;
    public ajmd e;
    public aoes f;
    
    static {
        ahbh.registerDefaultInstance((Class)apos.class, (ahbh)(a = new apos()));
    }
    
    private apos() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = apos.g) == null) {
                    synchronized (apos.class) {
                        if (apos.g == null) {
                            apos.g = (ahdd)new ahba((ahbh)apos.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apos.a;
            }
            case 4: {
                return new ahaz((ahbh)apos.a);
            }
            case 3: {
                return new apos();
            }
            case 2: {
                return newMessageInfo((MessageLite)apos.a, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004\u1009\u0000\u0005\u1009\u0001\u0006\u1009\u0002\u0007\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
