import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpc extends ahbh implements ahcw
{
    public static final akpc a;
    private static volatile ahdd c;
    public anas b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akpc.class, (ahbh)(a = new akpc()));
    }
    
    private akpc() {
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
                if ((c = akpc.c) == null) {
                    synchronized (akpc.class) {
                        if (akpc.c == null) {
                            akpc.c = (ahdd)new ahba((ahbh)akpc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpc.a;
            }
            case 4: {
                return new ahaz((ahbh)akpc.a);
            }
            case 3: {
                return new akpc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpc.a, "\u0001\u0001\u0000\u0001\ue287\u3f82\ue287\u3f82\u0001\u0000\u0000\u0001\ue287\u3f82\u1409\u0000", new Object[] { "d", "b" });
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
