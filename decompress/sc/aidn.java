import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidn extends ahbh implements ahcw
{
    public static final aidn a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public Object d;
    public ahab e;
    public long f;
    
    static {
        ahbh.registerDefaultInstance((Class)aidn.class, (ahbh)(a = new aidn()));
    }
    
    private aidn() {
        this.c = 0;
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aidn.g) == null) {
                    synchronized (aidn.class) {
                        if (aidn.g == null) {
                            aidn.g = (ahdd)new ahba((ahbh)aidn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aidn.a;
            }
            case 4: {
                return new ahaz((ahbh)aidn.a);
            }
            case 3: {
                return new aidn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidn.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1003\u0001\u0003\u103b\u0000\u0004\u103c\u0000\u0005\u103b\u0000", new Object[] { "d", "c", "b", "e", "f", alsj.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
