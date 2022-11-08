import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwq extends agzi implements ahax
{
    public static final ajwq a;
    private static volatile ahbe e;
    public float b;
    public float c;
    public float d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(ajwq.class, a = new ajwq());
    }
    
    private ajwq() {
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
                if ((e = ajwq.e) == null) {
                    synchronized (ajwq.class) {
                        if (ajwq.e == null) {
                            ajwq.e = (ahbe)new agzb((agzi)ajwq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajwq.a;
            }
            case 4: {
                return new agza((agzi)ajwq.a);
            }
            case 3: {
                return new ajwq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "f", "b", "c", "d" });
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
