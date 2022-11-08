import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aill extends agzi implements ahax
{
    public static final aill a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aill.class, a = new aill());
    }
    
    private aill() {
        emptyIntList();
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
                if ((b = aill.b) == null) {
                    synchronized (aill.class) {
                        if (aill.b == null) {
                            aill.b = (ahbe)new agzb((agzi)aill.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aill.a;
            }
            case 4: {
                return new agza((agzi)aill.a);
            }
            case 3: {
                return new aill();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aill.a, "\u0001\u0000", null);
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
