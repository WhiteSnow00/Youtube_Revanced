import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowc extends ahbh implements ahcw
{
    public static final aowc a;
    private static volatile ahdd d;
    public anuv b;
    public aowb c;
    private int e;
    private anuv f;
    private anuv g;
    private anuv h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aowc.class, (ahbh)(a = new aowc()));
    }
    
    private aowc() {
        this.j = 2;
        final ahab b = ahab.b;
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
                if ((d = aowc.d) == null) {
                    synchronized (aowc.class) {
                        if (aowc.d == null) {
                            aowc.d = (ahdd)new ahba((ahbh)aowc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aowc.a;
            }
            case 4: {
                return new ahaz((ahbh)aowc.a);
            }
            case 3: {
                return new aowc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aowc.a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\n\u1409\u0005\u000b\u1009\u0006", new Object[] { "e", "f", "g", "h", "i", "b", "c" });
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
