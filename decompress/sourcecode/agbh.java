import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbh extends agzi implements ahax
{
    public static final agbh a;
    private static volatile ahbe e;
    public int b;
    public agbf c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agbh.class, a = new agbh());
    }
    
    private agbh() {
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
                if ((e = agbh.e) == null) {
                    synchronized (agbh.class) {
                        if (agbh.e == null) {
                            agbh.e = (ahbe)new agzb((agzi)agbh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agbh.a;
            }
            case 4: {
                return new agza((agzi)agbh.a);
            }
            case 3: {
                return new agbh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbh.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "b", "c", "d" });
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
