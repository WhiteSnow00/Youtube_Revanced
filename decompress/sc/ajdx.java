import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdx extends ahbh implements ahcw
{
    public static final ajdx a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdx.class, (ahbh)(a = new ajdx()));
    }
    
    private ajdx() {
        this.g = 2;
        emptyProtobufList();
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
                final ahdd b;
                if ((b = ajdx.b) == null) {
                    synchronized (ajdx.class) {
                        if (ajdx.b == null) {
                            ajdx.b = (ahdd)new ahba((ahbh)ajdx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajdx.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdx.a);
            }
            case 3: {
                return new ajdx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdx.a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003\u1409\u0003\u0005\u1409\u0000\u0006\u1409\u0001", new Object[] { "c", "f", "d", "e" });
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
