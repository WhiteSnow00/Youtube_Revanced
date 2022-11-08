import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwh extends agzi implements ahax
{
    public static final atwh a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public atwi d;
    
    static {
        agzi.registerDefaultInstance(atwh.class, a = new atwh());
    }
    
    private atwh() {
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
                if ((e = atwh.e) == null) {
                    synchronized (atwh.class) {
                        if (atwh.e == null) {
                            atwh.e = (ahbe)new agzb((agzi)atwh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atwh.a;
            }
            case 4: {
                return new agza((agzi)atwh.a);
            }
            case 3: {
                return new atwh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
