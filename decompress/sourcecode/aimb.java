import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimb extends agzi implements ahax
{
    public static final aimb a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aimb.class, a = new aimb());
    }
    
    private aimb() {
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
                if ((b = aimb.b) == null) {
                    synchronized (aimb.class) {
                        if (aimb.b == null) {
                            aimb.b = (ahbe)new agzb((agzi)aimb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aimb.a;
            }
            case 4: {
                return new agza((agzi)aimb.a);
            }
            case 3: {
                return new aimb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimb.a, "\u0001\u0000", null);
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
