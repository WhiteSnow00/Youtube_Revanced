import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozy extends ahbh implements ahcw
{
    public static final aozy a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public aibz d;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aozy.class, (ahbh)(a = new aozy()));
    }
    
    private aozy() {
        this.g = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aozy.e) == null) {
                    synchronized (aozy.class) {
                        if (aozy.e == null) {
                            aozy.e = (ahdd)new ahba((ahbh)aozy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aozy.a;
            }
            case 4: {
                return new ahaz((ahbh)aozy.a);
            }
            case 3: {
                return new aozy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
