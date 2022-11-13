import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqct extends ahbh implements ahcw
{
    public static final aqct a;
    public static final ahbf b;
    private static volatile ahdd d;
    public ahbx c;
    
    static {
        final aqct a2 = new aqct();
        ahbh.registerDefaultInstance((Class)aqct.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqcs.a, (Object)a2, (MessageLite)a2, (ahbm)null, 1, ahek.k, (Class)aqct.class);
    }
    
    private aqct() {
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
                if ((d = aqct.d) == null) {
                    synchronized (aqct.class) {
                        if (aqct.d == null) {
                            aqct.d = (ahdd)new ahba((ahbh)aqct.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqct.a;
            }
            case 4: {
                return new ahaz((ahbh)aqct.a);
            }
            case 3: {
                return new aqct();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqct.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "c", aqcu.class });
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
