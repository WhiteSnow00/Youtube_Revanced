import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlh extends agzi implements ahax
{
    public static final anlh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(anlh.class, a = new anlh());
    }
    
    private anlh() {
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
                if ((b = anlh.b) == null) {
                    synchronized (anlh.class) {
                        if (anlh.b == null) {
                            anlh.b = (ahbe)new agzb((agzi)anlh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anlh.a;
            }
            case 4: {
                return new agza((agzi)anlh.a);
            }
            case 3: {
                return new anlh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlh.a, "\u0000\u0000", null);
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
