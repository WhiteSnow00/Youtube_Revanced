import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahme extends agzi implements ahax
{
    public static final ahme a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance((Class)ahme.class, (agzi)(a = new ahme()));
    }
    
    private ahme() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahme.e) == null) {
                    synchronized (ahme.class) {
                        if (ahme.e == null) {
                            ahme.e = (ahbe)new agzb((agzi)ahme.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahme.a;
            }
            case 4: {
                return new agza((agzi)ahme.a);
            }
            case 3: {
                return new ahme();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahme.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "b", "c", ahho.o, "d" });
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
