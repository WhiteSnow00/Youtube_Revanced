import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeuc extends agzi implements ahax
{
    public static final aeuc a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aeuc.class, a = new aeuc());
    }
    
    private aeuc() {
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
                if ((b = aeuc.b) == null) {
                    synchronized (aeuc.class) {
                        if (aeuc.b == null) {
                            aeuc.b = (ahbe)new agzb((agzi)aeuc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aeuc.a;
            }
            case 4: {
                return new agza((agzi)aeuc.a);
            }
            case 3: {
                return new aeuc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeuc.a, "\u0000\u0000", null);
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
