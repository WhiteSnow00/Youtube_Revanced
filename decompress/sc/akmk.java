import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmk extends ahbh implements ahcw
{
    public static final akmk a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akmk.class, (ahbh)(a = new akmk()));
    }
    
    private akmk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akmk.b) == null) {
                    synchronized (akmk.class) {
                        if (akmk.b == null) {
                            akmk.b = (ahdd)new ahba((ahbh)akmk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akmk.a;
            }
            case 4: {
                return new ahaz((ahbh)akmk.a);
            }
            case 3: {
                return new akmk();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmk.a, "\u0001\u0000", (Object[])null);
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
