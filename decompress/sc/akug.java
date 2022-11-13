import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akug extends ahbh implements ahcw
{
    public static final akug a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)akug.class, (ahbh)(a = new akug()));
    }
    
    private akug() {
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
                if ((e = akug.e) == null) {
                    synchronized (akug.class) {
                        if (akug.e == null) {
                            akug.e = (ahdd)new ahba((ahbh)akug.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akug.a;
            }
            case 4: {
                return new ahaz((ahbh)akug.a);
            }
            case 3: {
                return new akug();
            }
            case 2: {
                return newMessageInfo((MessageLite)akug.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
