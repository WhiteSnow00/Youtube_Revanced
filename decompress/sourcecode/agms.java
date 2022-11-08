import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agms extends agzi implements ahax
{
    public static final agms a;
    private static volatile ahbe f;
    public int b;
    public long c;
    public agzt d;
    public agzy e;
    
    static {
        agzi.registerDefaultInstance(agms.class, a = new agms());
    }
    
    private agms() {
        agzi.emptyProtobufList();
        this.d = agzi.emptyLongList();
        this.e = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = agms.f) == null) {
                    synchronized (agms.class) {
                        if (agms.f == null) {
                            agms.f = (ahbe)new agzb((agzi)agms.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agms.a;
            }
            case 4: {
                return new agza((agzi)agms.a);
            }
            case 3: {
                return new agms();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agms.a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005\u1005\u0001\u0006\u0017", new Object[] { "b", "e", agmr.class, "c", "d" });
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
