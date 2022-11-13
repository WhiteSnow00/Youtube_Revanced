import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifo extends ahbh implements ahcw
{
    public static final aifo a;
    private static volatile ahdd b;
    private int c;
    private aifn d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifo.class, (ahbh)(a = new aifo()));
    }
    
    private aifo() {
        this.e = 2;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aifo.b) == null) {
                    synchronized (aifo.class) {
                        if (aifo.b == null) {
                            aifo.b = (ahdd)new ahba((ahbh)aifo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifo.a;
            }
            case 4: {
                return new ahaz((ahbh)aifo.a);
            }
            case 3: {
                return new aifo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifo.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
