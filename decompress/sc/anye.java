import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anye extends ahbh implements ahcw
{
    public static final anye a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private anuv h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)anye.class, (ahbh)(a = new anye()));
    }
    
    private anye() {
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
                if ((b = anye.b) == null) {
                    synchronized (anye.class) {
                        if (anye.b == null) {
                            anye.b = (ahdd)new ahba((ahbh)anye.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anye.a;
            }
            case 4: {
                return new ahaz((ahbh)anye.a);
            }
            case 3: {
                return new anye();
            }
            case 2: {
                return newMessageInfo((MessageLite)anye.a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\n\u1409\t", new Object[] { "c", "d", "e", "f", "g", "h" });
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