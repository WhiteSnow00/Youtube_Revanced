import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahir extends agzi implements ahax
{
    public static final ahir a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)ahir.class, (agzi)(a = new ahir()));
    }
    
    private ahir() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahir.c) == null) {
                    synchronized (ahir.class) {
                        if (ahir.c == null) {
                            ahir.c = (ahbe)new agzb((agzi)ahir.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahir.a;
            }
            case 4: {
                return new agza((agzi)ahir.a);
            }
            case 3: {
                return new ahir();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahir.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
