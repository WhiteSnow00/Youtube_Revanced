import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alns extends ahbh implements ahcw
{
    public static final alns a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)alns.class, (ahbh)(a = new alns()));
    }
    
    private alns() {
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
                if ((c = alns.c) == null) {
                    synchronized (alns.class) {
                        if (alns.c == null) {
                            alns.c = (ahdd)new ahba((ahbh)alns.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alns.a;
            }
            case 4: {
                return new ahaz((ahbh)alns.a);
            }
            case 3: {
                return new alns();
            }
            case 2: {
                return newMessageInfo((MessageLite)alns.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", alnr.class });
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
