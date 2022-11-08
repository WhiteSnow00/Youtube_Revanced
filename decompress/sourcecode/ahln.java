import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahln extends agzi implements ahax
{
    public static final ahln a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public ahjb d;
    
    static {
        agzi.registerDefaultInstance((Class)ahln.class, (agzi)(a = new ahln()));
    }
    
    private ahln() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahln.e) == null) {
                    synchronized (ahln.class) {
                        if (ahln.e == null) {
                            ahln.e = (ahbe)new agzb((agzi)ahln.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahln.a;
            }
            case 4: {
                return new agza((agzi)ahln.a);
            }
            case 3: {
                return new ahln();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahln.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0004\u1009\u0003", new Object[] { "b", "c", ahho.i, "d" });
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
