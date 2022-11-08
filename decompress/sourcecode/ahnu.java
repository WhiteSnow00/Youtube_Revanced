import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnu extends agzi implements ahax
{
    public static final ahnu a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahnu.class, a = new ahnu());
    }
    
    private ahnu() {
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
                if ((b = ahnu.b) == null) {
                    synchronized (ahnu.class) {
                        if (ahnu.b == null) {
                            ahnu.b = (ahbe)new agzb((agzi)ahnu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnu.a;
            }
            case 4: {
                return new agza((agzi)ahnu.a);
            }
            case 3: {
                return new ahnu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnu.a, "\u0001\u0000", null);
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
