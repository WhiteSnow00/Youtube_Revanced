import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class anwj extends ahbh implements ahcw
{
    public static final anwj a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private anuv f;
    private aiqj g;
    private ajut h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)anwj.class, (ahbh)(a = new anwj()));
    }
    
    private anwj() {
        this.i = 2;
        emptyProtobufList();
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
                if ((b = anwj.b) == null) {
                    synchronized (anwj.class) {
                        if (anwj.b == null) {
                            anwj.b = (ahdd)new ahba((ahbh)anwj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anwj.a;
            }
            case 4: {
                return new ahaz((ahbh)anwj.a);
            }
            case 3: {
                return new anwj();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwj.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0001\u0002\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
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
