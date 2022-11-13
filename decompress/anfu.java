import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfu extends ahbh implements ahcw
{
    public static final anfu a;
    private static volatile ahdd g;
    public int b;
    public aiqj c;
    public anuv d;
    public anuv e;
    public ahab f;
    private ajut h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anfu.class, (ahbh)(a = new anfu()));
    }
    
    private anfu() {
        this.j = 2;
        this.f = ahab.b;
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
                final ahdd g;
                if ((g = anfu.g) == null) {
                    synchronized (anfu.class) {
                        if (anfu.g == null) {
                            anfu.g = (ahdd)new ahba((ahbh)anfu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anfu.a;
            }
            case 4: {
                return new ahaz((ahbh)anfu.a);
            }
            case 3: {
                return new anfu();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfu.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0004\u0004\u100a\u0005\u0005\u1409\u0002\u0006\u1409\u0003", new Object[] { "b", "c", "h", "i", "f", "d", "e" });
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
