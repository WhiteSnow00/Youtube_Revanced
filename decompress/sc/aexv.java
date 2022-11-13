import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexv extends ahbh implements ahcw
{
    public static final aexv a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aexv.class, (ahbh)(a = new aexv()));
    }
    
    private aexv() {
        this.c = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aexv.d) == null) {
                    synchronized (aexv.class) {
                        if (aexv.d == null) {
                            aexv.d = (ahdd)new ahba((ahbh)aexv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aexv.a;
            }
            case 4: {
                return new ahaz((ahbh)aexv.a);
            }
            case 3: {
                return new aexv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aexv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
