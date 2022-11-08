import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apye extends agzi implements ahax
{
    public static final apye a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public boolean d;
    public boolean e;
    public long f;
    
    static {
        final apye a2 = new apye();
        agzi.registerDefaultInstance(apye.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)apxu.a, a2, (MessageLite)a2, null, 410667140, ahcm.k, apye.class);
    }
    
    private apye() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = apye.g) == null) {
                    synchronized (apye.class) {
                        if (apye.g == null) {
                            apye.g = (ahbe)new agzb((agzi)apye.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apye.a;
            }
            case 4: {
                return new agza((agzi)apye.a);
            }
            case 3: {
                return new apye();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apye.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1003\u0002", new Object[] { "c", "d", "e", "f" });
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
