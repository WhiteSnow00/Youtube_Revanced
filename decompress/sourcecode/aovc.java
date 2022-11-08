import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovc extends agzi implements ahax
{
    public static final aovc a;
    private static volatile ahbe e;
    public int b;
    public float c;
    public float d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(aovc.class, a = new aovc());
    }
    
    private aovc() {
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
                if ((e = aovc.e) == null) {
                    synchronized (aovc.class) {
                        if (aovc.e == null) {
                            aovc.e = (ahbe)new agzb((agzi)aovc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aovc.a;
            }
            case 4: {
                return new agza((agzi)aovc.a);
            }
            case 3: {
                return new aovc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "f", "b", "c", "d" });
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
