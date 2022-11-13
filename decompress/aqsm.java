import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsm extends ahbh implements ahcw
{
    public static final aqsm a;
    private static volatile ahdd e;
    public int b;
    public ahab c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsm.class, (ahbh)(a = new aqsm()));
    }
    
    private aqsm() {
        this.c = ahab.b;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqsm.e) == null) {
                    synchronized (aqsm.class) {
                        if (aqsm.e == null) {
                            aqsm.e = (ahdd)new ahba((ahbh)aqsm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqsm.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsm.a);
            }
            case 3: {
                return new aqsm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
