import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbo extends ahbh implements ahcw
{
    public static final arbo a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public arbj d;
    
    static {
        ahbh.registerDefaultInstance((Class)arbo.class, (ahbh)(a = new arbo()));
    }
    
    private arbo() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = arbo.e) == null) {
                    synchronized (arbo.class) {
                        if (arbo.e == null) {
                            arbo.e = (ahdd)new ahba((ahbh)arbo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arbo.a;
            }
            case 4: {
                return new ahaz((ahbh)arbo.a);
            }
            case 3: {
                return new arbo();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
