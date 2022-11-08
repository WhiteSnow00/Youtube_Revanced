import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoql extends agzi implements ahax
{
    public static final aoql a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public aqdy d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(aoql.class, a = new aoql());
    }
    
    private aoql() {
        this.c = "";
        this.e = "";
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
                if ((f = aoql.f) == null) {
                    synchronized (aoql.class) {
                        if (aoql.f == null) {
                            aoql.f = (ahbe)new agzb((agzi)aoql.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoql.a;
            }
            case 4: {
                return new agza((agzi)aoql.a);
            }
            case 3: {
                return new aoql();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoql.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0001\u0002\u1008\u0002\u0003\u1008\u0000", new Object[] { "b", "d", "e", "c" });
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
