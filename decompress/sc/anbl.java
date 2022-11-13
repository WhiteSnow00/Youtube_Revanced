import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anbl extends ahbh implements ahcw
{
    public static final anbl a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public ahbp d;
    public int e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)anbl.class, (ahbh)(a = new anbl()));
    }
    
    private anbl() {
        this.d = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = anbl.g) == null) {
                    synchronized (anbl.class) {
                        if (anbl.g == null) {
                            anbl.g = (ahdd)new ahba((ahbh)anbl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anbl.a;
            }
            case 4: {
                return new ahaz((int[])null, (char[])null);
            }
            case 3: {
                return new anbl();
            }
            case 2: {
                return newMessageInfo((MessageLite)anbl.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0016\u0003\u1004\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d", "e", "f" });
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
