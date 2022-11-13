import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloi extends ahbh implements ahcw
{
    public static final aloi a;
    private static volatile ahdd h;
    public int b;
    public ajut c;
    public ajut d;
    public akdi e;
    public anuv f;
    public anuv g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aloi.class, (ahbh)(a = new aloi()));
    }
    
    private aloi() {
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
                final ahdd h;
                if ((h = aloi.h) == null) {
                    synchronized (aloi.class) {
                        if (aloi.h == null) {
                            aloi.h = (ahdd)new ahba((ahbh)aloi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aloi.a;
            }
            case 4: {
                return new ahaz((ahbh)aloi.a);
            }
            case 3: {
                return new aloi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aloi.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "i" });
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
