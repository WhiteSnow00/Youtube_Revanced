import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahql extends agzi implements ahax
{
    public static final ahql a;
    private static volatile ahbe d;
    public int b;
    public String c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ahql.class, a = new ahql());
    }
    
    private ahql() {
        this.c = "";
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
                if ((d = ahql.d) == null) {
                    synchronized (ahql.class) {
                        if (ahql.d == null) {
                            ahql.d = (ahbe)new agzb((agzi)ahql.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahql.a;
            }
            case 4: {
                return new agza((agzi)ahql.a);
            }
            case 3: {
                return new ahql();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahql.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
