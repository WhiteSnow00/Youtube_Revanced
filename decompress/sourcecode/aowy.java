import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowy extends agzi implements ahax
{
    public static final aowy a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aowy.class, a = new aowy());
    }
    
    private aowy() {
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
                if ((b = aowy.b) == null) {
                    synchronized (aowy.class) {
                        if (aowy.b == null) {
                            aowy.b = (ahbe)new agzb((agzi)aowy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowy.a;
            }
            case 4: {
                return new agza((agzi)aowy.a);
            }
            case 3: {
                return new aowy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowy.a, "\u0001\u0000", null);
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
