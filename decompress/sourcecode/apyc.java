import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyc extends agzi implements ahax
{
    public static final apyc a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public int d;
    public apyb e;
    
    static {
        final apyc a2 = new apyc();
        agzi.registerDefaultInstance(apyc.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)apxu.a, a2, (MessageLite)a2, null, 409459387, ahcm.k, apyc.class);
    }
    
    private apyc() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apyc.f) == null) {
                    synchronized (apyc.class) {
                        if (apyc.f == null) {
                            apyc.f = (ahbe)new agzb((agzi)apyc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apyc.a;
            }
            case 4: {
                return new agza((agzi)apyc.a);
            }
            case 3: {
                return new apyc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001", new Object[] { "c", "d", "e" });
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
