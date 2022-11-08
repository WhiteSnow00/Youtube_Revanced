import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gre extends agzi implements ahax
{
    public static final gre a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance((Class)gre.class, (agzi)(a = new gre()));
    }
    
    private gre() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = gre.d) == null) {
                    synchronized (gre.class) {
                        if (gre.d == null) {
                            gre.d = (ahbe)new agzb((agzi)gre.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return gre.a;
            }
            case 4: {
                return new agza((agzi)gre.a);
            }
            case 3: {
                return new gre();
            }
            case 2: {
                return newMessageInfo((MessageLite)gre.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", ehk.j });
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
