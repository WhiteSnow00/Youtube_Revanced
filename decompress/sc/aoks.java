import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoks extends ahbh implements ahcw
{
    public static final aoks a;
    private static volatile ahdd d;
    public ahbx b;
    public ahbp c;
    
    static {
        ahbh.registerDefaultInstance((Class)aoks.class, (ahbh)(a = new aoks()));
    }
    
    private aoks() {
        this.b = emptyProtobufList();
        this.c = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aoks.d) == null) {
                    synchronized (aoks.class) {
                        if (aoks.d == null) {
                            aoks.d = (ahdd)new ahba((ahbh)aoks.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoks.a;
            }
            case 4: {
                return new ahaz((ahbh)aoks.a);
            }
            case 3: {
                return new aoks();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoks.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u0016", new Object[] { "b", aokr.class, "c" });
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
