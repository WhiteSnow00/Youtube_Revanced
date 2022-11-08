import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnn extends agzi implements ahax
{
    private static final ahnn a;
    private static volatile ahbe b;
    private String c;
    
    static {
        agzi.registerDefaultInstance(ahnn.class, a = new ahnn());
    }
    
    private ahnn() {
        this.c = "";
    }
    
    public static /* synthetic */ ahnn a() {
        return ahnn.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ahnn.b) == null) {
                    synchronized (ahnn.class) {
                        if (ahnn.b == null) {
                            ahnn.b = (ahbe)new agzb((agzi)ahnn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnn.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new ahnn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnn.a, "\u0001\u0000", null);
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
