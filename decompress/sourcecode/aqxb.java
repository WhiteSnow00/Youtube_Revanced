import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxb extends agzi implements ahax
{
    private static final aqxb a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aqxb.class, a = new aqxb());
    }
    
    private aqxb() {
    }
    
    public static /* synthetic */ aqxb a() {
        return aqxb.a;
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
                if ((b = aqxb.b) == null) {
                    synchronized (aqxb.class) {
                        if (aqxb.b == null) {
                            aqxb.b = (ahbe)new agzb((agzi)aqxb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqxb.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aqxb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxb.a, "\u0001\u0000", null);
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
