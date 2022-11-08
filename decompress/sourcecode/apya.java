import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apya extends agzi implements ahax
{
    public static final apya a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public long d;
    
    static {
        final apya a2 = new apya();
        agzi.registerDefaultInstance(apya.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)apxu.a, a2, (MessageLite)a2, null, 409515602, ahcm.k, apya.class);
    }
    
    private apya() {
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
                if ((e = apya.e) == null) {
                    synchronized (apya.class) {
                        if (apya.e == null) {
                            apya.e = (ahbe)new agzb((agzi)apya.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apya.a;
            }
            case 4: {
                return new agza((agzi)apya.a);
            }
            case 3: {
                return new apya();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apya.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1003\u0000", new Object[] { "c", "d" });
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
