import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieo extends ahbh implements ahcw
{
    public static final aieo a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aieo.class, (ahbh)(a = new aieo()));
    }
    
    private aieo() {
        this.g = 2;
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
                if ((b = aieo.b) == null) {
                    synchronized (aieo.class) {
                        if (aieo.b == null) {
                            aieo.b = (ahdd)new ahba((ahbh)aieo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aieo.a;
            }
            case 4: {
                return new ahaz((ahbh)aieo.a);
            }
            case 3: {
                return new aieo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aieo.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
