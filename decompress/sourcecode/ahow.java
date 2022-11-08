import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahow extends agzi implements ahax
{
    public static final ahow a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(ahow.class, a = new ahow());
    }
    
    private ahow() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahow.d) == null) {
                    synchronized (ahow.class) {
                        if (ahow.d == null) {
                            ahow.d = (ahbe)new agzb((agzi)ahow.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahow.a;
            }
            case 4: {
                return new agza((agzi)ahow.a);
            }
            case 3: {
                return new ahow();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahow.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
