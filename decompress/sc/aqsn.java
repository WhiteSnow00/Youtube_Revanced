import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsn extends ahbh implements ahcw
{
    public static final aqsn a;
    private static volatile ahdd f;
    public int b;
    public ahab c;
    public ahdy d;
    public ahdy e;
    private String g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsn.class, (ahbh)(a = new aqsn()));
    }
    
    private aqsn() {
        this.g = "";
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqsn.f) == null) {
                    synchronized (aqsn.class) {
                        if (aqsn.f == null) {
                            aqsn.f = (ahdd)new ahba((ahbh)aqsn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqsn.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsn.a);
            }
            case 3: {
                return new aqsn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsn.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "g", "c", "d", "e" });
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
