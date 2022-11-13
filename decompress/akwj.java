import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwj extends ahbh implements ahcw
{
    public static final akwj a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    
    static {
        ahbh.registerDefaultInstance((Class)akwj.class, (ahbh)(a = new akwj()));
    }
    
    private akwj() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = akwj.g) == null) {
                    synchronized (akwj.class) {
                        if (akwj.g == null) {
                            akwj.g = (ahdd)new ahba((ahbh)akwj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akwj.a;
            }
            case 4: {
                return new ahaz((ahbh)akwj.a);
            }
            case 3: {
                return new akwj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwj.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u100b\u0003\u0004\u100b\u0002", new Object[] { "b", "c", akwi.a, "d", "f", "e" });
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
