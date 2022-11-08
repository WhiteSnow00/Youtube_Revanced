import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlk extends agzi implements ahax
{
    public static final anlk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(anlk.class, a = new anlk());
    }
    
    private anlk() {
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
                if ((b = anlk.b) == null) {
                    synchronized (anlk.class) {
                        if (anlk.b == null) {
                            anlk.b = (ahbe)new agzb((agzi)anlk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anlk.a;
            }
            case 4: {
                return new agza((agzi)anlk.a);
            }
            case 3: {
                return new anlk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlk.a, "\u0000\u0000", null);
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
