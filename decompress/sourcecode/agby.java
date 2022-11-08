import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agby extends agzi implements ahax
{
    public static final agby a;
    private static volatile ahbe j;
    public int b;
    public agbz c;
    public agyc d;
    public agyc e;
    public agyc f;
    public agyc g;
    public agyc h;
    public agyc i;
    
    static {
        agzi.registerDefaultInstance(agby.class, a = new agby());
    }
    
    private agby() {
        this.d = agyc.b;
        final agyc b = agyc.b;
        this.e = b;
        this.f = b;
        this.g = b;
        this.h = b;
        this.i = b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = agby.j) == null) {
                    synchronized (agby.class) {
                        if (agby.j == null) {
                            agby.j = (ahbe)new agzb((agzi)agby.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agby.a;
            }
            case 4: {
                return new agza((agzi)agby.a);
            }
            case 3: {
                return new agby();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agby.a, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
