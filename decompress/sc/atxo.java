import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxo extends ahbh implements ahcw
{
    public static final atxo a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public atxn d;
    
    static {
        final atxo a2 = new atxo();
        ahbh.registerDefaultInstance((Class)atxo.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)atxm.a, (Object)a2, (MessageLite)a2, (ahbm)null, 6, ahek.k, (Class)atxo.class);
    }
    
    private atxo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = atxo.e) == null) {
                    synchronized (atxo.class) {
                        if (atxo.e == null) {
                            atxo.e = (ahdd)new ahba((ahbh)atxo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atxo.a;
            }
            case 4: {
                return new ahaz((ahbh)atxo.a);
            }
            case 3: {
                return new atxo();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
