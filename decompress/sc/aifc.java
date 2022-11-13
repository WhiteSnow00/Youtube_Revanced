import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifc extends ahbh implements ahcw
{
    public static final aifc a;
    private static volatile ahdd b;
    private int c;
    private ahhu d;
    private anuv e;
    private anuv f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aifc.class, (ahbh)(a = new aifc()));
    }
    
    private aifc() {
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
                if ((b = aifc.b) == null) {
                    synchronized (aifc.class) {
                        if (aifc.b == null) {
                            aifc.b = (ahdd)new ahba((ahbh)aifc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifc.a;
            }
            case 4: {
                return new ahaz((ahbh)aifc.a);
            }
            case 3: {
                return new aifc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0002\u0002\u1409\u0003\u0003\u1409\u0000", new Object[] { "c", "e", "f", "d" });
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
