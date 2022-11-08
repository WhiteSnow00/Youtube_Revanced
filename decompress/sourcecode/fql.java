import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fql extends agzi implements ahax
{
    public static final fql a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance((Class)fql.class, (agzi)(a = new fql()));
    }
    
    private fql() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = fql.f) == null) {
                    synchronized (fql.class) {
                        if (fql.f == null) {
                            fql.f = (ahbe)new agzb((agzi)fql.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return fql.a;
            }
            case 4: {
                return new agza((agzi)fql.a);
            }
            case 3: {
                return new fql();
            }
            case 2: {
                return newMessageInfo((MessageLite)fql.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
