import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahno extends agzi implements ahax
{
    public static final ahno a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahno.class, a = new ahno());
    }
    
    private ahno() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahno.e) == null) {
                    synchronized (ahno.class) {
                        if (ahno.e == null) {
                            ahno.e = (ahbe)new agzb((agzi)ahno.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahno.a;
            }
            case 4: {
                return new agza((agzi)ahno.a);
            }
            case 3: {
                return new ahno();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahno.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", ahho.q, "d", ahho.p });
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
