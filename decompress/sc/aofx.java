import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aofx extends ahbh implements ahcw
{
    public static final aofx a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public anwn d;
    
    static {
        final aofx a2 = new aofx();
        ahbh.registerDefaultInstance((Class)aofx.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqnu.a, (Object)a2, (MessageLite)a2, (ahbm)null, 9, ahek.k, (Class)aofx.class);
    }
    
    private aofx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aofx.e) == null) {
                    synchronized (aofx.class) {
                        if (aofx.e == null) {
                            aofx.e = (ahdd)new ahba((ahbh)aofx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aofx.a;
            }
            case 4: {
                return new ahaz((ahbh)aofx.a);
            }
            case 3: {
                return new aofx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aofx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
