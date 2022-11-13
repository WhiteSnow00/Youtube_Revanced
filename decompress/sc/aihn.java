import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihn extends ahbh implements ahcw
{
    public static final aihn a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public ajut d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aihn.class, (ahbh)(a = new aihn()));
    }
    
    private aihn() {
        this.g = 2;
        ahbh.emptyProtobufList();
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
                if ((e = aihn.e) == null) {
                    synchronized (aihn.class) {
                        if (aihn.e == null) {
                            aihn.e = (ahdd)new ahba((ahbh)aihn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aihn.a;
            }
            case 4: {
                return new ahaz((ahbh)aihn.a);
            }
            case 3: {
                return new aihn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihn.a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0002\u0002\u100c\u0001\u0004\u1409\u0003\u0006\u1409\u0004", new Object[] { "f", "b", aieh.i, "c", "d" });
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
