import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmt extends ahbh implements ahcw
{
    public static final akmt a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)akmt.class, (ahbh)(a = new akmt()));
    }
    
    private akmt() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akmt.d) == null) {
                    synchronized (akmt.class) {
                        if (akmt.d == null) {
                            akmt.d = (ahdd)new ahba((ahbh)akmt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmt.a;
            }
            case 4: {
                return new ahaz((ahbh)akmt.a);
            }
            case 3: {
                return new akmt();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
