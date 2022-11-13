import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpe extends ahbh implements ahcw
{
    public static final akpe a;
    private static volatile ahdd c;
    public amiy b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akpe.class, (ahbh)(a = new akpe()));
    }
    
    private akpe() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = akpe.c) == null) {
                    synchronized (akpe.class) {
                        if (akpe.c == null) {
                            akpe.c = (ahdd)new ahba((ahbh)akpe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpe.a;
            }
            case 4: {
                return new ahaz((ahbh)akpe.a);
            }
            case 3: {
                return new akpe();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpe.a, "\u0001\u0001\u0000\u0001\uf5b8\u3aab\uf5b8\u3aab\u0001\u0000\u0000\u0001\uf5b8\u3aab\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
