import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknn extends ahbh implements ahcw
{
    public static final aknn a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aknn.class, (ahbh)(a = new aknn()));
    }
    
    private aknn() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aknn.e) == null) {
                    synchronized (aknn.class) {
                        if (aknn.e == null) {
                            aknn.e = (ahdd)new ahba((ahbh)aknn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknn.a;
            }
            case 4: {
                return new ahaz((ahbh)aknn.a);
            }
            case 3: {
                return new aknn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
