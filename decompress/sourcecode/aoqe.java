import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqe extends agzi implements ahax
{
    public static final aoqe a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(aoqe.class, a = new aoqe());
    }
    
    private aoqe() {
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
                if ((f = aoqe.f) == null) {
                    synchronized (aoqe.class) {
                        if (aoqe.f == null) {
                            aoqe.f = (ahbe)new agzb((agzi)aoqe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoqe.a;
            }
            case 4: {
                return new agza((agzi)aoqe.a);
            }
            case 3: {
                return new aoqe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqe.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "b", "c", aoqb.a(), "d", aoqb.a(), "e", aoqb.a() });
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
