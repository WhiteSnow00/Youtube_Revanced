import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqc extends agzi implements ahax
{
    public static final lqc a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public agzq d;
    public int e;
    public agzq f;
    
    static {
        agzi.registerDefaultInstance(lqc.class, a = new lqc());
    }
    
    private lqc() {
        this.c = "";
        this.d = agzi.emptyIntList();
        this.f = agzi.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = lqc.g) == null) {
                    synchronized (lqc.class) {
                        if (lqc.g == null) {
                            lqc.g = (ahbe)new agzb((agzi)lqc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return lqc.a;
            }
            case 4: {
                return new agza((agzi)lqc.a);
            }
            case 3: {
                return new lqc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lqc.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u0016\u0003\u1004\u0001\u0004\u0016", new Object[] { "b", "c", "d", "e", "f" });
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
