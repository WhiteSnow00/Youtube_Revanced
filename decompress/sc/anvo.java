import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvo extends ahbh implements ahcw
{
    public static final anvo a;
    private static volatile ahdd d;
    public String b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anvo.class, (ahbh)(a = new anvo()));
    }
    
    private anvo() {
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
                if ((d = anvo.d) == null) {
                    synchronized (anvo.class) {
                        if (anvo.d == null) {
                            anvo.d = (ahdd)new ahba((ahbh)anvo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anvo.a;
            }
            case 4: {
                return new ahaz((ahbh)anvo.a);
            }
            case 3: {
                return new anvo();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", ajmw.c });
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
