import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqb extends agzi implements ahax
{
    public static final akqb a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(akqb.class, a = new akqb());
    }
    
    private akqb() {
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
                if ((b = akqb.b) == null) {
                    synchronized (akqb.class) {
                        if (akqb.b == null) {
                            akqb.b = (ahbe)new agzb((agzi)akqb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akqb.a;
            }
            case 4: {
                return new agza((agzi)akqb.a);
            }
            case 3: {
                return new akqb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akqb.a, "\u0001\u0000", null);
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
