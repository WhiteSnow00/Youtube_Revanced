import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angi extends ahbh implements ahcw
{
    public static final angi a;
    private static volatile ahdd d;
    public int b;
    public angr c;
    private apch e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)angi.class, (ahbh)(a = new angi()));
    }
    
    private angi() {
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
                if ((d = angi.d) == null) {
                    synchronized (angi.class) {
                        if (angi.d == null) {
                            angi.d = (ahdd)new ahba((ahbh)angi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return angi.a;
            }
            case 4: {
                return new ahaz((ahbh)angi.a);
            }
            case 3: {
                return new angi();
            }
            case 2: {
                return newMessageInfo((MessageLite)angi.a, "\u0001\u0002\u0000\u0001\uebb2\u1b41\uf5a0\u6ffc\u0002\u0000\u0000\u0002\uebb2\u1b41\u1409\u0000\uf5a0\u6ffc\u1409\u0001", new Object[] { "b", "c", "e" });
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
