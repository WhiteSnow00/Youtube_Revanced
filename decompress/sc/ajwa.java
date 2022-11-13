import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwa extends ahbh implements ahcw
{
    public static final ajwa a;
    private static volatile ahdd d;
    public anuv b;
    public ahab c;
    private int e;
    private anuv f;
    private anuv g;
    private ahhu h;
    private aiqj i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajwa.class, (ahbh)(a = new ajwa()));
    }
    
    private ajwa() {
        this.j = 2;
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajwa.d) == null) {
                    synchronized (ajwa.class) {
                        if (ajwa.d == null) {
                            ajwa.d = (ahdd)new ahba((ahbh)ajwa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajwa.a;
            }
            case 4: {
                return new ahaz((ahbh)ajwa.a);
            }
            case 3: {
                return new ajwa();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwa.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0005", new Object[] { "e", "b", "f", "g", "h", "c", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
