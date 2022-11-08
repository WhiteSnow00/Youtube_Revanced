import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijp extends agzi implements ahax
{
    public static final aijp a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aijp.class, a = new aijp());
    }
    
    private aijp() {
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
                if ((b = aijp.b) == null) {
                    synchronized (aijp.class) {
                        if (aijp.b == null) {
                            aijp.b = (ahbe)new agzb((agzi)aijp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aijp.a;
            }
            case 4: {
                return new agza((agzi)aijp.a);
            }
            case 3: {
                return new aijp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijp.a, "\u0001\u0000", null);
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
