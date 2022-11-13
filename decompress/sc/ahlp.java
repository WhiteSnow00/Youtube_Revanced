import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlp extends ahbh implements ahcw
{
    public static final ahlp a;
    private static volatile ahdd e;
    public int b;
    public ahab c;
    public ahqb d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlp.class, (ahbh)(a = new ahlp()));
    }
    
    private ahlp() {
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ahlp.e) == null) {
                    synchronized (ahlp.class) {
                        if (ahlp.e == null) {
                            ahlp.e = (ahdd)new ahba((ahbh)ahlp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahlp.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlp.a);
            }
            case 3: {
                return new ahlp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
