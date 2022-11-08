import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afod extends agzi implements ahax
{
    public static final afod a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final afod a2 = new afod();
        agzi.registerDefaultInstance(afod.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)afns.a, a2, (MessageLite)a2, null, 118, ahcm.k, afod.class);
    }
    
    private afod() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = afod.c) == null) {
                    synchronized (afod.class) {
                        if (afod.c == null) {
                            afod.c = (ahbe)new agzb((agzi)afod.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return afod.a;
            }
            case 4: {
                return new agza((agzi)afod.a);
            }
            case 3: {
                return new afod();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afod.a, "\u0001\u0000", null);
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
