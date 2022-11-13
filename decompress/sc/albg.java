import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albg extends ahbh implements ahcw
{
    public static final albg a;
    private static volatile ahdd d;
    public ahbx b;
    public ahbx c;
    
    static {
        ahbh.registerDefaultInstance((Class)albg.class, (ahbh)(a = new albg()));
    }
    
    private albg() {
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = albg.d) == null) {
                    synchronized (albg.class) {
                        if (albg.d == null) {
                            albg.d = (ahdd)new ahba((ahbh)albg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albg.a;
            }
            case 4: {
                return new ahaz((short[][][])null, (boolean[][])null);
            }
            case 3: {
                return new albg();
            }
            case 2: {
                return newMessageInfo((MessageLite)albg.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[] { "b", albf.class, "c", albf.class });
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
