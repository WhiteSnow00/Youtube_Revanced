import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoio extends ahbh implements ahcw
{
    public static final aoio a;
    private static volatile ahdd h;
    public int b;
    public ajut c;
    public ajut d;
    public apnh e;
    public int f;
    public anuv g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aoio.class, (ahbh)(a = new aoio()));
    }
    
    private aoio() {
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
                if ((h = aoio.h) == null) {
                    synchronized (aoio.class) {
                        if (aoio.h == null) {
                            aoio.h = (ahdd)new ahba((ahbh)aoio.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoio.a;
            }
            case 4: {
                return new ahaz((ahbh)aoio.a);
            }
            case 3: {
                return new aoio();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoio.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0006\u1409\u0006\u0007\u100c\u0003", new Object[] { "b", "c", "d", "e", "i", "g", "f", aoet.m });
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
