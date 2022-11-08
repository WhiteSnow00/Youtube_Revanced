import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocc extends agzi implements ahax
{
    public static final aocc a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(aocc.class, a = new aocc());
    }
    
    private aocc() {
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
                if ((d = aocc.d) == null) {
                    synchronized (aocc.class) {
                        if (aocc.d == null) {
                            aocc.d = (ahbe)new agzb((agzi)aocc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aocc.a;
            }
            case 4: {
                return new agza((agzi)aocc.a);
            }
            case 3: {
                return new aocc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocc.a, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u103c\u0000\u0003\u103c\u0000", new Object[] { "c", "b", aocb.class, aoca.class });
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
