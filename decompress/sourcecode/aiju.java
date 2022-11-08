import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiju extends agzi implements ahax
{
    public static final aiju a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aiju.class, a = new aiju());
    }
    
    private aiju() {
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
                if ((b = aiju.b) == null) {
                    synchronized (aiju.class) {
                        if (aiju.b == null) {
                            aiju.b = (ahbe)new agzb((agzi)aiju.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiju.a;
            }
            case 4: {
                return new agza((agzi)aiju.a);
            }
            case 3: {
                return new aiju();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiju.a, "\u0001\u0000", null);
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
