import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcc extends agzi implements ahax
{
    public static final ajcc a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(ajcc.class, a = new ajcc());
    }
    
    private ajcc() {
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
                if ((e = ajcc.e) == null) {
                    synchronized (ajcc.class) {
                        if (ajcc.e == null) {
                            ajcc.e = (ahbe)new agzb((agzi)ajcc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajcc.a;
            }
            case 4: {
                return new agza((agzi)ajcc.a);
            }
            case 3: {
                return new ajcc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
