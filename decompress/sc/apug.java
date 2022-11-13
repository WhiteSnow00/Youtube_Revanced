import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apug extends ahbh implements ahcw
{
    public static final apug a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public int d;
    public boolean e;
    public int f;
    
    static {
        ahbh.registerDefaultInstance((Class)apug.class, (ahbh)(a = new apug()));
    }
    
    private apug() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = apug.g) == null) {
                    synchronized (apug.class) {
                        if (apug.g == null) {
                            apug.g = (ahdd)new ahba((ahbh)apug.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apug.a;
            }
            case 4: {
                return new ahaz((ahbh)apug.a);
            }
            case 3: {
                return new apug();
            }
            case 2: {
                return newMessageInfo((MessageLite)apug.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1007\u0002\u0004\u1004\u0003", new Object[] { "b", "c", "d", apuh.e, "e", "f" });
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
