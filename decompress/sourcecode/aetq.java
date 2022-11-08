import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetq extends agzi implements ahax
{
    public static final aetq a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(aetq.class, a = new aetq());
    }
    
    private aetq() {
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
                if ((d = aetq.d) == null) {
                    synchronized (aetq.class) {
                        if (aetq.d == null) {
                            aetq.d = (ahbe)new agzb((agzi)aetq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aetq.a;
            }
            case 4: {
                return new agza((agzi)aetq.a);
            }
            case 3: {
                return new aetq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetq.a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001=\u0000\u0002<\u0000\u0003=\u0000\u0004<\u0000", new Object[] { "c", "b", aetm.class, aetp.class });
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
