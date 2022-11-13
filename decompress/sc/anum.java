import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anum extends ahbh implements ahcw
{
    public static final anum a;
    private static volatile ahdd c;
    public anun b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)anum.class, (ahbh)(a = new anum()));
    }
    
    private anum() {
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
                if ((c = anum.c) == null) {
                    synchronized (anum.class) {
                        if (anum.c == null) {
                            anum.c = (ahdd)new ahba((ahbh)anum.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anum.a;
            }
            case 4: {
                return new ahaz((ahbh)anum.a);
            }
            case 3: {
                return new anum();
            }
            case 2: {
                return newMessageInfo((MessageLite)anum.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
