import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoth extends agzi implements ahax
{
    public static final aoth a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aoth.class, a = new aoth());
    }
    
    private aoth() {
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
                if ((b = aoth.b) == null) {
                    synchronized (aoth.class) {
                        if (aoth.b == null) {
                            aoth.b = (ahbe)new agzb((agzi)aoth.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoth.a;
            }
            case 4: {
                return new agza((agzi)aoth.a);
            }
            case 3: {
                return new aoth();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoth.a, "\u0001\u0000", null);
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
