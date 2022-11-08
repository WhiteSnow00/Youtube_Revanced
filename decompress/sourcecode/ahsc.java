import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsc extends agzi implements ahax
{
    public static final ahsc a;
    private static volatile ahbe d;
    public int b;
    public String c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahsc.class, a = new ahsc());
    }
    
    private ahsc() {
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
                if ((d = ahsc.d) == null) {
                    synchronized (ahsc.class) {
                        if (ahsc.d == null) {
                            ahsc.d = (ahbe)new agzb((agzi)ahsc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahsc.a;
            }
            case 4: {
                return new agza((agzi)ahsc.a);
            }
            case 3: {
                return new ahsc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
