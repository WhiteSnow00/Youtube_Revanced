import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agav extends agzi implements ahax
{
    public static final agav a;
    private static volatile ahbe e;
    public int b;
    public agaw c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agav.class, a = new agav());
    }
    
    private agav() {
        this.d = agyc.b;
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
                if ((e = agav.e) == null) {
                    synchronized (agav.class) {
                        if (agav.e == null) {
                            agav.e = (ahbe)new agzb((agzi)agav.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agav.a;
            }
            case 4: {
                return new agza((agzi)agav.a);
            }
            case 3: {
                return new agav();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agav.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "b", "c", "d" });
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
