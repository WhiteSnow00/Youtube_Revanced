import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimh extends agzi implements ahax
{
    public static final aimh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aimh.class, a = new aimh());
    }
    
    private aimh() {
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
                if ((b = aimh.b) == null) {
                    synchronized (aimh.class) {
                        if (aimh.b == null) {
                            aimh.b = (ahbe)new agzb((agzi)aimh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aimh.a;
            }
            case 4: {
                return new agza((agzi)aimh.a);
            }
            case 3: {
                return new aimh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimh.a, "\u0001\u0000", null);
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
