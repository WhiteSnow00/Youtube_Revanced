import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohy extends ahbh implements ahcw
{
    public static final aohy a;
    private static volatile ahdd h;
    public int b;
    public boolean c;
    public ajut d;
    public aoia e;
    public aohz f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aohy.class, (ahbh)(a = new aohy()));
    }
    
    private aohy() {
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
                if ((h = aohy.h) == null) {
                    synchronized (aohy.class) {
                        if (aohy.h == null) {
                            aohy.h = (ahdd)new ahba((ahbh)aohy.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aohy.a;
            }
            case 4: {
                return new ahaz((ahbh)aohy.a);
            }
            case 3: {
                return new aohy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohy.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001\u1007\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005", new Object[] { "b", "c", "d", "e", "f", "i", "g" });
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