import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obl extends agzi implements ahax
{
    public static final obl a;
    private static volatile ahbe c;
    public int b;
    
    static {
        agzi.registerDefaultInstance((Class)obl.class, (agzi)(a = new obl()));
    }
    
    private obl() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = obl.c) == null) {
                    synchronized (obl.class) {
                        if (obl.c == null) {
                            obl.c = (ahbe)new agzb((agzi)obl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return obl.a;
            }
            case 4: {
                return new agza((agzi)obl.a);
            }
            case 3: {
                return new obl();
            }
            case 2: {
                return newMessageInfo((MessageLite)obl.a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\f", new Object[] { "b" });
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
