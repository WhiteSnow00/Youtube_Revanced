import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agce extends agzi implements ahax
{
    public static final agce a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(agce.class, a = new agce());
    }
    
    private agce() {
        this.c = agyc.b;
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
                if ((d = agce.d) == null) {
                    synchronized (agce.class) {
                        if (agce.d == null) {
                            agce.d = (ahbe)new agzb((agzi)agce.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agce.a;
            }
            case 4: {
                return new agza((agzi)agce.a);
            }
            case 3: {
                return new agce();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agce.a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "b", "c" });
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
