import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetp extends agzi implements ahax
{
    public static final aetp a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aetp.class, a = new aetp());
    }
    
    private aetp() {
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
                if ((b = aetp.b) == null) {
                    synchronized (aetp.class) {
                        if (aetp.b == null) {
                            aetp.b = (ahbe)new agzb((agzi)aetp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aetp.a;
            }
            case 4: {
                return new agza((agzi)aetp.a);
            }
            case 3: {
                return new aetp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetp.a, "\u0000\u0000", null);
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
