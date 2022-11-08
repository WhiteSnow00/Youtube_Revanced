import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxr extends agzi implements ahax
{
    public static final aqxr a;
    private static volatile ahbe e;
    public int b;
    public aqvj c;
    public aqxq d;
    
    static {
        agzi.registerDefaultInstance(aqxr.class, a = new aqxr());
    }
    
    private aqxr() {
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
                if ((e = aqxr.e) == null) {
                    synchronized (aqxr.class) {
                        if (aqxr.e == null) {
                            aqxr.e = (ahbe)new agzb((agzi)aqxr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqxr.a;
            }
            case 4: {
                return new agza((agzi)aqxr.a);
            }
            case 3: {
                return new aqxr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxr.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
