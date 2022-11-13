import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbb extends ahbh implements ahcw
{
    public static final anbb a;
    private static volatile ahdd b;
    private int c;
    private aida d;
    private anay e;
    private ajut f;
    private aiqj g;
    private anuv h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)anbb.class, (ahbh)(a = new anbb()));
    }
    
    private anbb() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anbb.b) == null) {
                    synchronized (anbb.class) {
                        if (anbb.b == null) {
                            anbb.b = (ahdd)new ahba((ahbh)anbb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anbb.a;
            }
            case 4: {
                return new ahaz((ahbh)anbb.a);
            }
            case 3: {
                return new anbb();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbb.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0005\u0006\u1409\u0004", new Object[] { "c", "d", "e", "f", "h", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
