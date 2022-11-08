import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afof extends agzi implements ahax
{
    public static final afof a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public afoe d;
    
    static {
        final afof a2 = new afof();
        agzi.registerDefaultInstance(afof.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)afoh.a, a2, (MessageLite)a2, null, 571, ahcm.k, afof.class);
    }
    
    private afof() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = afof.e) == null) {
                    synchronized (afof.class) {
                        if (afof.e == null) {
                            afof.e = (ahbe)new agzb((agzi)afof.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afof.a;
            }
            case 4: {
                return new agza((agzi)afof.a);
            }
            case 3: {
                return new afof();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afof.a, "\u0001\u0000", null);
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
