import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anee extends ahbh implements ahcw
{
    public static final anee a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public ajut d;
    public ahbp e;
    public ahbp f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)anee.class, (ahbh)(a = new anee()));
    }
    
    private anee() {
        this.h = 2;
        this.c = "";
        this.e = emptyIntList();
        this.f = emptyIntList();
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
                if ((g = anee.g) == null) {
                    synchronized (anee.class) {
                        if (anee.g == null) {
                            anee.g = (ahdd)new ahba((ahbh)anee.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anee.a;
            }
            case 4: {
                return new ahaz((ahbh)anee.a);
            }
            case 3: {
                return new anee();
            }
            case 2: {
                return newMessageInfo((MessageLite)anee.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u0016\u0004\u0016", new Object[] { "b", "c", "d", "e", "f" });
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
