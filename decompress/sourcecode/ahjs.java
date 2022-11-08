import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjs extends agzi implements ahax
{
    public static final ahjs a;
    private static volatile ahbe c;
    public ahjr b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)ahjs.class, (agzi)(a = new ahjs()));
    }
    
    private ahjs() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahjs.c) == null) {
                    synchronized (ahjs.class) {
                        if (ahjs.c == null) {
                            ahjs.c = (ahbe)new agzb((agzi)ahjs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahjs.a;
            }
            case 4: {
                return new agza((agzi)ahjs.a);
            }
            case 3: {
                return new ahjs();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
