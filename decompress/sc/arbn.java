import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbn extends ahbh implements ahcw
{
    public static final arbn a;
    private static volatile ahdd g;
    public int b;
    public ahfp c;
    public String d;
    public String e;
    public arbm f;
    
    static {
        ahbh.registerDefaultInstance((Class)arbn.class, (ahbh)(a = new arbn()));
    }
    
    private arbn() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = arbn.g) == null) {
                    synchronized (arbn.class) {
                        if (arbn.g == null) {
                            arbn.g = (ahdd)new ahba((ahbh)arbn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arbn.a;
            }
            case 4: {
                return new ahaz((ahbh)arbn.a);
            }
            case 3: {
                return new arbn();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbn.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
