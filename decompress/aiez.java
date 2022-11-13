import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiez extends ahbh implements ahcw
{
    public static final aiez a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)aiez.class, (ahbh)(a = new aiez()));
    }
    
    private aiez() {
        this.d = 2;
        this.b = emptyProtobufList();
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
                if ((c = aiez.c) == null) {
                    synchronized (aiez.class) {
                        if (aiez.c == null) {
                            aiez.c = (ahdd)new ahba((ahbh)aiez.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aiez.a;
            }
            case 4: {
                return new ahaz((ahbh)aiez.a);
            }
            case 3: {
                return new aiez();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiez.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aifa.class });
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
