import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpc extends agzi implements ahax
{
    public static final ahpc a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public boolean d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance(ahpc.class, a = new ahpc());
    }
    
    private ahpc() {
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
                final ahbe f;
                if ((f = ahpc.f) == null) {
                    synchronized (ahpc.class) {
                        if (ahpc.f == null) {
                            ahpc.f = (ahbe)new agzb((agzi)ahpc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahpc.a;
            }
            case 4: {
                return new agza((agzi)ahpc.a);
            }
            case 3: {
                return new ahpc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
