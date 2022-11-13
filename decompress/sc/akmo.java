import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmo extends ahbh implements ahcw
{
    public static final akmo a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)akmo.class, (ahbh)(a = new akmo()));
    }
    
    private akmo() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akmo.d) == null) {
                    synchronized (akmo.class) {
                        if (akmo.d == null) {
                            akmo.d = (ahdd)new ahba((ahbh)akmo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmo.a;
            }
            case 4: {
                return new ahaz((ahbh)akmo.a);
            }
            case 3: {
                return new akmo();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmo.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", akmn.class, akmm.class });
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
