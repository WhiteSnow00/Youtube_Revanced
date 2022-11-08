import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrl extends agzi implements ahax
{
    public static final ahrl a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahrl.class, a = new ahrl());
    }
    
    private ahrl() {
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
                if ((d = ahrl.d) == null) {
                    synchronized (ahrl.class) {
                        if (ahrl.d == null) {
                            ahrl.d = (ahbe)new agzb((agzi)ahrl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahrl.a;
            }
            case 4: {
                return new agza((agzi)ahrl.a);
            }
            case 3: {
                return new ahrl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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
