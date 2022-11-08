import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbp extends agzi implements ahax
{
    public static final agbp a;
    private static volatile ahbe d;
    public int b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance(agbp.class, a = new agbp());
    }
    
    private agbp() {
        this.c = agzi.emptyProtobufList();
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
                if ((d = agbp.d) == null) {
                    synchronized (agbp.class) {
                        if (agbp.d == null) {
                            agbp.d = (ahbe)new agzb((agzi)agbp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agbp.a;
            }
            case 4: {
                return new agza((agzi)agbp.a);
            }
            case 3: {
                return new agbp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbp.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] { "b", "c", agbo.class });
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
