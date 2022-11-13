import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlk extends ahbh implements ahcw
{
    public static final aqlk a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqlk.class, (ahbh)(a = new aqlk()));
    }
    
    private aqlk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqlk.c) == null) {
                    synchronized (aqlk.class) {
                        if (aqlk.c == null) {
                            aqlk.c = (ahdd)new ahba((ahbh)aqlk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqlk.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlk.a);
            }
            case 3: {
                return new aqlk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
