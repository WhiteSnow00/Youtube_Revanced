import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obo extends agzi implements ahax
{
    public static final obo a;
    private static volatile ahbe c;
    public boolean b;
    
    static {
        agzi.registerDefaultInstance((Class)obo.class, (agzi)(a = new obo()));
    }
    
    private obo() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = obo.c) == null) {
                    synchronized (obo.class) {
                        if (obo.c == null) {
                            obo.c = (ahbe)new agzb((agzi)obo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return obo.a;
            }
            case 4: {
                return new agza((agzi)obo.a);
            }
            case 3: {
                return new obo();
            }
            case 2: {
                return newMessageInfo((MessageLite)obo.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[] { "b" });
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
