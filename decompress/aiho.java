import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiho extends ahbh implements ahcw
{
    public static final aiho a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)aiho.class, (ahbh)(a = new aiho()));
    }
    
    private aiho() {
        this.d = 2;
        this.b = emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aiho.c) == null) {
                    synchronized (aiho.class) {
                        if (aiho.c == null) {
                            aiho.c = (ahdd)new ahba((ahbh)aiho.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aiho.a;
            }
            case 4: {
                return new ahaz((ahbh)aiho.a);
            }
            case 3: {
                return new aiho();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiho.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aihp.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}