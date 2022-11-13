import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsj extends ahbh implements ahcw
{
    public static final aqsj a;
    private static volatile ahdd e;
    public int b;
    public aqsb c;
    public float d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsj.class, (ahbh)(a = new aqsj()));
    }
    
    private aqsj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqsj.e) == null) {
                    synchronized (aqsj.class) {
                        if (aqsj.e == null) {
                            aqsj.e = (ahdd)new ahba((ahbh)aqsj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqsj.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsj.a);
            }
            case 3: {
                return new aqsj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1001\u0001", new Object[] { "b", "c", "d" });
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
