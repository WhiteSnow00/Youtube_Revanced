import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxg extends agzi implements ahax
{
    public static final ahxg a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahxg.class, a = new ahxg());
    }
    
    private ahxg() {
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
                if ((e = ahxg.e) == null) {
                    synchronized (ahxg.class) {
                        if (ahxg.e == null) {
                            ahxg.e = (ahbe)new agzb((agzi)ahxg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahxg.a;
            }
            case 4: {
                return new agza((agzi)ahxg.a);
            }
            case 3: {
                return new ahxg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxg.a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0005\u100c\u0001", new Object[] { "b", "c", ahse.q, "d", ahse.r });
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
