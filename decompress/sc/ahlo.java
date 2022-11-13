import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlo extends ahbh implements ahcw
{
    public static final ahlo a;
    private static volatile ahdd j;
    public int b;
    public aotp c;
    public aotp d;
    public ajut e;
    public ajut f;
    public ajut g;
    public aiqj h;
    public ahab i;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlo.class, (ahbh)(a = new ahlo()));
    }
    
    private ahlo() {
        this.l = 2;
        this.i = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = ahlo.j) == null) {
                    synchronized (ahlo.class) {
                        if (ahlo.j == null) {
                            ahlo.j = (ahdd)new ahba((ahbh)ahlo.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahlo.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlo.a);
            }
            case 3: {
                return new ahlo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlo.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u100a\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "k", "i" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
