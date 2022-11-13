import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfl extends ahbh implements ahcw
{
    public static final ajfl a;
    private static volatile ahdd j;
    public int b;
    public aotp c;
    public ajut d;
    public ajut e;
    public ajfk f;
    public anuv g;
    public anuv h;
    public ahab i;
    private ahhu k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfl.class, (ahbh)(a = new ajfl()));
    }
    
    private ajfl() {
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
                if ((j = ajfl.j) == null) {
                    synchronized (ajfl.class) {
                        if (ajfl.j == null) {
                            ajfl.j = (ahdd)new ahba((ahbh)ajfl.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajfl.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfl.a);
            }
            case 3: {
                return new ajfl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfl.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0007\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0004\u0004\u1409\u0006\u0005\u100a\u0007\b\u1409\u0003\t\u1409\u0005\n\u1409\u0000", new Object[] { "b", "d", "e", "g", "k", "i", "f", "h", "c" });
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
