import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anup extends ahbh implements ahcw
{
    public static final anup a;
    private static volatile ahdd d;
    public aiqj b;
    public anuv c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anup.class, (ahbh)(a = new anup()));
    }
    
    private anup() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anup.d) == null) {
                    synchronized (anup.class) {
                        if (anup.d == null) {
                            anup.d = (ahdd)new ahba((ahbh)anup.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anup.a;
            }
            case 4: {
                return new ahaz((ahbh)anup.a);
            }
            case 3: {
                return new anup();
            }
            case 2: {
                return newMessageInfo((MessageLite)anup.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
