import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxt extends ahbc implements ahbd
{
    public static final anxt a;
    private static volatile ahdd h;
    public int b;
    public aotp c;
    public ajut d;
    public aiqj e;
    public anxu f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)anxt.class, (ahbh)(a = new anxt()));
    }
    
    private anxt() {
        this.j = 2;
        this.g = ahab.b;
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
                final ahdd h;
                if ((h = anxt.h) == null) {
                    synchronized (anxt.class) {
                        if (anxt.h == null) {
                            anxt.h = (ahdd)new ahba((ahbh)anxt.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anxt.a;
            }
            case 4: {
                return new ahbb((ahbc)anxt.a);
            }
            case 3: {
                return new anxt();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxt.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0004\u0005\u1409\u0005\u0006\u1009\u0003", new Object[] { "b", "c", "d", "e", "g", "i", "f" });
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
