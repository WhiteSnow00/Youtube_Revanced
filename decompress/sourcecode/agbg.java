import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbg extends agzi implements ahax
{
    public static final agbg a;
    private static volatile ahbe e;
    public int b;
    public agbh c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agbg.class, a = new agbg());
    }
    
    private agbg() {
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
                if ((e = agbg.e) == null) {
                    synchronized (agbg.class) {
                        if (agbg.e == null) {
                            agbg.e = (ahbe)new agzb((agzi)agbg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agbg.a;
            }
            case 4: {
                return new agza((agzi)agbg.a);
            }
            case 3: {
                return new agbg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbg.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "b", "c", "d" });
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
