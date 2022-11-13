import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloh extends ahbh implements ahcw
{
    public static final aloh a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aloh.class, (ahbh)(a = new aloh()));
    }
    
    private aloh() {
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
                if ((e = aloh.e) == null) {
                    synchronized (aloh.class) {
                        if (aloh.e == null) {
                            aloh.e = (ahdd)new ahba((ahbh)aloh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aloh.a;
            }
            case 4: {
                return new ahaz((ahbh)aloh.a);
            }
            case 3: {
                return new aloh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aloh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
