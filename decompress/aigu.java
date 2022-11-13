import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigu extends ahbh implements ahcw
{
    public static final aigu a;
    private static volatile ahdd b;
    private int c;
    private aigt d;
    private aigt e;
    private aigt f;
    private aigt g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aigu.class, (ahbh)(a = new aigu()));
    }
    
    private aigu() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aigu.b) == null) {
                    synchronized (aigu.class) {
                        if (aigu.b == null) {
                            aigu.b = (ahdd)new ahba((ahbh)aigu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aigu.a;
            }
            case 4: {
                return new ahaz((ahbh)aigu.a);
            }
            case 3: {
                return new aigu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigu.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
