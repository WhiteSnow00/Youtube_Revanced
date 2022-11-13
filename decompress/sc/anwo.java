import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwo extends ahbh implements ahcw
{
    public static final anwo a;
    private static volatile ahdd d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anwo.class, (ahbh)(a = new anwo()));
    }
    
    private anwo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anwo.d) == null) {
                    synchronized (anwo.class) {
                        if (anwo.d == null) {
                            anwo.d = (ahdd)new ahba((ahbh)anwo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anwo.a;
            }
            case 4: {
                return new ahaz((ahbh)anwo.a);
            }
            case 3: {
                return new anwo();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwo.a, "\u0001\u0002\u0000\u0001\uf2f1\ud444\uf77c\ud44e\u0002\u0000\u0000\u0000\uf2f1\ud444\u1007\u0000\uf77c\ud44e\u1007\u0002", new Object[] { "e", "b", "c" });
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
