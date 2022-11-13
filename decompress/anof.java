import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anof extends ahbh implements ahcw
{
    public static final anof a;
    private static volatile ahdd g;
    public int b;
    public boolean c;
    public ahbx d;
    public aiqj e;
    public aiqj f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)anof.class, (ahbh)(a = new anof()));
    }
    
    private anof() {
        this.h = 2;
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = anof.g) == null) {
                    synchronized (anof.class) {
                        if (anof.g == null) {
                            anof.g = (ahdd)new ahba((ahbh)anof.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anof.a;
            }
            case 4: {
                return new ahaz((ahbh)anof.a);
            }
            case 3: {
                return new anof();
            }
            case 2: {
                return newMessageInfo((MessageLite)anof.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0003\u0002\u1007\u0001\u0003\u041b\u0004\u1409\u0002\u0005\u1409\u0003", new Object[] { "b", "c", "d", aiqj.class, "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
