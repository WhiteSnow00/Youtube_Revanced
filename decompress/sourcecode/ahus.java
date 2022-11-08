import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahus extends agzi implements ahax
{
    public static final ahus a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahus.class, a = new ahus());
    }
    
    private ahus() {
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
                final ahbe e;
                if ((e = ahus.e) == null) {
                    synchronized (ahus.class) {
                        if (ahus.e == null) {
                            ahus.e = (ahbe)new agzb((agzi)ahus.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahus.a;
            }
            case 4: {
                return new agza((agzi)ahus.a);
            }
            case 3: {
                return new ahus();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahus.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u100c\u0002", new Object[] { "b", "c", "d", ajrv.t });
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
