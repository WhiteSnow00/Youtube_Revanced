import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyc extends ahbh implements ahcw
{
    public static final ajyc a;
    public static final ahbf b;
    private static volatile ahdd d;
    public String c;
    private int e;
    
    static {
        final ajyc a2 = new ajyc();
        ahbh.registerDefaultInstance((Class)ajyc.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 304505358, ahek.k, (Class)ajyc.class);
    }
    
    private ajyc() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajyc.d) == null) {
                    synchronized (ajyc.class) {
                        if (ajyc.d == null) {
                            ajyc.d = (ahdd)new ahba((ahbh)ajyc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajyc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajyc.a);
            }
            case 3: {
                return new ajyc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajyc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
