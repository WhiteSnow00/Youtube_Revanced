import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akud extends ahbh implements ahcw
{
    public static final akud a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)akud.class, (ahbh)(a = new akud()));
    }
    
    private akud() {
        this.c = "";
        final ahab b = ahab.b;
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
                if ((e = akud.e) == null) {
                    synchronized (akud.class) {
                        if (akud.e == null) {
                            akud.e = (ahdd)new ahba((ahbh)akud.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akud.a;
            }
            case 4: {
                return new ahaz((ahbh)akud.a);
            }
            case 3: {
                return new akud();
            }
            case 2: {
                return newMessageInfo((MessageLite)akud.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0004\u1008\u0002", new Object[] { "b", "c", "d" });
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
