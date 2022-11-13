import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmw extends ahbh implements ahcw
{
    public static final akmw a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)akmw.class, (ahbh)(a = new akmw()));
    }
    
    private akmw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akmw.e) == null) {
                    synchronized (akmw.class) {
                        if (akmw.e == null) {
                            akmw.e = (ahdd)new ahba((ahbh)akmw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akmw.a;
            }
            case 4: {
                return new ahaz((ahbh)akmw.a);
            }
            case 3: {
                return new akmw();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
