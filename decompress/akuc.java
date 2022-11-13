import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akuc extends ahbh implements ahcw
{
    public static final akuc a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)akuc.class, (ahbh)(a = new akuc()));
    }
    
    private akuc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akuc.e) == null) {
                    synchronized (akuc.class) {
                        if (akuc.e == null) {
                            akuc.e = (ahdd)new ahba((ahbh)akuc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akuc.a;
            }
            case 4: {
                return new ahaz((ahbh)akuc.a);
            }
            case 3: {
                return new akuc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akuc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", aldq.d, "d", aldq.c });
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
