import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anja extends agzi implements ahax
{
    public static final anja a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(anja.class, a = new anja());
    }
    
    private anja() {
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
                if ((b = anja.b) == null) {
                    synchronized (anja.class) {
                        if (anja.b == null) {
                            anja.b = (ahbe)new agzb((agzi)anja.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anja.a;
            }
            case 4: {
                return new agza((agzi)anja.a);
            }
            case 3: {
                return new anja();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anja.a, "\u0001\u0000", null);
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