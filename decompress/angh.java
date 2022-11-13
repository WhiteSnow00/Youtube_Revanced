import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angh extends ahbh implements ahcw
{
    public static final angh a;
    private static volatile ahdd d;
    public int b;
    public angg c;
    private ango e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)angh.class, (ahbh)(a = new angh()));
    }
    
    private angh() {
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
                if ((d = angh.d) == null) {
                    synchronized (angh.class) {
                        if (angh.d == null) {
                            angh.d = (ahdd)new ahba((ahbh)angh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return angh.a;
            }
            case 4: {
                return new ahaz((ahbh)angh.a);
            }
            case 3: {
                return new angh();
            }
            case 2: {
                return newMessageInfo((MessageLite)angh.a, "\u0001\u0002\u0000\u0001\uedd3\u2bf1\uf9f7\u3d6f\u0002\u0000\u0000\u0002\uedd3\u2bf1\u1409\u0000\uf9f7\u3d6f\u1409\u0001", new Object[] { "b", "c", "e" });
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
