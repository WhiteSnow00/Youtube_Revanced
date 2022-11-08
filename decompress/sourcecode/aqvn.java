import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvn extends agzi implements ahax
{
    private static final aqvn a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aqvn.class, a = new aqvn());
    }
    
    private aqvn() {
    }
    
    public static /* synthetic */ aqvn a() {
        return aqvn.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqvn.b) == null) {
                    synchronized (aqvn.class) {
                        if (aqvn.b == null) {
                            aqvn.b = (ahbe)new agzb((agzi)aqvn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqvn.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aqvn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvn.a, "\u0001\u0000", null);
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
