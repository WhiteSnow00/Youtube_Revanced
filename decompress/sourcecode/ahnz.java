import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnz extends agzi implements ahax
{
    public static final ahnz a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahnz.class, a = new ahnz());
    }
    
    private ahnz() {
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
                if ((b = ahnz.b) == null) {
                    synchronized (ahnz.class) {
                        if (ahnz.b == null) {
                            ahnz.b = (ahbe)new agzb((agzi)ahnz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnz.a;
            }
            case 4: {
                return new agza((agzi)ahnz.a);
            }
            case 3: {
                return new ahnz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnz.a, "\u0001\u0000", null);
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
