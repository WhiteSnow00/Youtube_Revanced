import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfe extends ahbh implements ahcw
{
    public static final aqfe a;
    public static final ahbf b;
    private static volatile ahdd e;
    public ahbx c;
    public int d;
    private int f;
    
    static {
        final aqfe a2 = new aqfe();
        ahbh.registerDefaultInstance((Class)aqfe.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfc.a, (Object)a2, (MessageLite)a2, (ahbm)null, 188490103, ahek.k, (Class)aqfe.class);
    }
    
    private aqfe() {
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqfe.e) == null) {
                    synchronized (aqfe.class) {
                        if (aqfe.e == null) {
                            aqfe.e = (ahdd)new ahba((ahbh)aqfe.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqfe.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfe.a);
            }
            case 3: {
                return new aqfe();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfe.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1004\u0000", new Object[] { "f", "c", aqff.class, "d" });
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
