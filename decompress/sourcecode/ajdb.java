import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdb extends agzi implements ahax
{
    public static final ajdb a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ajdb.class, a = new ajdb());
    }
    
    private ajdb() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ajdb.c) == null) {
                    synchronized (ajdb.class) {
                        if (ajdb.c == null) {
                            ajdb.c = (ahbe)new agzb((agzi)ajdb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajdb.a;
            }
            case 4: {
                return new agza((agzi)ajdb.a);
            }
            case 3: {
                return new ajdb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
