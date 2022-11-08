import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimk extends agzi implements ahax
{
    public static final aimk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aimk.class, a = new aimk());
    }
    
    private aimk() {
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
                if ((b = aimk.b) == null) {
                    synchronized (aimk.class) {
                        if (aimk.b == null) {
                            aimk.b = (ahbe)new agzb((agzi)aimk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aimk.a;
            }
            case 4: {
                return new agza((agzi)aimk.a);
            }
            case 3: {
                return new aimk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimk.a, "\u0001\u0000", null);
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
