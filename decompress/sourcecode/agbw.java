import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbw extends agzi implements ahax
{
    public static final agbw a;
    private static volatile ahbe e;
    public agbx b;
    public int c;
    public agyc d;
    
    static {
        agzi.registerDefaultInstance(agbw.class, a = new agbw());
    }
    
    private agbw() {
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
                if ((e = agbw.e) == null) {
                    synchronized (agbw.class) {
                        if (agbw.e == null) {
                            agbw.e = (ahbe)new agzb((agzi)agbw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agbw.a;
            }
            case 4: {
                return new agza((agzi)agbw.a);
            }
            case 3: {
                return new agbw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbw.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[] { "b", "c", "d" });
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
