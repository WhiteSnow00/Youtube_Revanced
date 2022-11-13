import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anoa extends ahbh implements ahcw
{
    public static final anoa a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anoa.class, (ahbh)(a = new anoa()));
    }
    
    private anoa() {
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
                final ahdd b;
                if ((b = anoa.b) == null) {
                    synchronized (anoa.class) {
                        if (anoa.b == null) {
                            anoa.b = (ahdd)new ahba((ahbh)anoa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anoa.a;
            }
            case 4: {
                return new ahaz((ahbh)anoa.a);
            }
            case 3: {
                return new anoa();
            }
            case 2: {
                return newMessageInfo((MessageLite)anoa.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0007\b\u1409\u0004\t\u1409\u0005", new Object[] { "c", "d", "e", "f", "i", "g", "h" });
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
