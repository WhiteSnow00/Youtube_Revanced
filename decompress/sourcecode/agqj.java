import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqj extends agzi implements ahax
{
    public static final agqj a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(agqj.class, a = new agqj());
    }
    
    private agqj() {
        this.b = 0;
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
                if ((d = agqj.d) == null) {
                    synchronized (agqj.class) {
                        if (agqj.d == null) {
                            agqj.d = (ahbe)new agzb((agzi)agqj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agqj.a;
            }
            case 4: {
                return new agza((agzi)agqj.a);
            }
            case 3: {
                return new agqj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqj.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "c", "b", agql.class });
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
