import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmh extends ahbh implements ahcw
{
    public static final akmh a;
    private static volatile ahdd d;
    public String b;
    public long c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)akmh.class, (ahbh)(a = new akmh()));
    }
    
    private akmh() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akmh.d) == null) {
                    synchronized (akmh.class) {
                        if (akmh.d == null) {
                            akmh.d = (ahdd)new ahba((ahbh)akmh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmh.a;
            }
            case 4: {
                return new ahaz((ahbh)akmh.a);
            }
            case 3: {
                return new akmh();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "e", "b", "c" });
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
