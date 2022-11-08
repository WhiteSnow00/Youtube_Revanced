import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvy extends agzi implements ahax
{
    public static final aqvy a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aqvy.class, a = new aqvy());
    }
    
    private aqvy() {
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
                if ((b = aqvy.b) == null) {
                    synchronized (aqvy.class) {
                        if (aqvy.b == null) {
                            aqvy.b = (ahbe)new agzb((agzi)aqvy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqvy.a;
            }
            case 4: {
                return new agza((agzi)aqvy.a);
            }
            case 3: {
                return new aqvy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvy.a, "\u0001\u0000", null);
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
