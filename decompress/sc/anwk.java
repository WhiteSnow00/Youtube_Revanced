import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwk extends ahbh implements ahcw
{
    public static final anwk a;
    private static volatile ahdd e;
    public anwl b;
    public ahvk c;
    public int d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)anwk.class, (ahbh)(a = new anwk()));
    }
    
    private anwk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anwk.e) == null) {
                    synchronized (anwk.class) {
                        if (anwk.e == null) {
                            anwk.e = (ahdd)new ahba((ahbh)anwk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anwk.a;
            }
            case 4: {
                return new ahaz((ahbh)anwk.a);
            }
            case 3: {
                return new anwk();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwk.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1009\u0000\u0003\u1009\u0001\u0004\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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