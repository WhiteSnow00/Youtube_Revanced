import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ails extends agzi implements ahax
{
    public static final ails a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ails.class, a = new ails());
    }
    
    private ails() {
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
                if ((b = ails.b) == null) {
                    synchronized (ails.class) {
                        if (ails.b == null) {
                            ails.b = (ahbe)new agzb((agzi)ails.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ails.a;
            }
            case 4: {
                return new agza((agzi)ails.a);
            }
            case 3: {
                return new ails();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ails.a, "\u0001\u0000", null);
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
