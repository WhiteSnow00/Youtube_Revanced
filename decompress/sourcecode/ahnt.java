import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnt extends agzi implements ahax
{
    public static final ahnt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahnt.class, a = new ahnt());
    }
    
    private ahnt() {
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
                if ((b = ahnt.b) == null) {
                    synchronized (ahnt.class) {
                        if (ahnt.b == null) {
                            ahnt.b = (ahbe)new agzb((agzi)ahnt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnt.a;
            }
            case 4: {
                return new agza((agzi)ahnt.a);
            }
            case 3: {
                return new ahnt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnt.a, "\u0001\u0000", null);
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
