import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdb extends ahbh implements ahcw
{
    public static final akdb a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public String d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)akdb.class, (ahbh)(a = new akdb()));
    }
    
    private akdb() {
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
                final ahdd f;
                if ((f = akdb.f) == null) {
                    synchronized (akdb.class) {
                        if (akdb.f == null) {
                            akdb.f = (ahdd)new ahba((ahbh)akdb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akdb.a;
            }
            case 4: {
                return new ahaz((ahbh)akdb.a);
            }
            case 3: {
                return new akdb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
