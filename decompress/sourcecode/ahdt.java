import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdt extends agzi implements ahax
{
    public static final ahdt a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public ahdr d;
    
    static {
        final ahdt a2 = new ahdt();
        agzi.registerDefaultInstance(ahdt.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqsw.a, a2, (MessageLite)a2, null, 392045369, ahcm.k, ahdt.class);
    }
    
    private ahdt() {
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
                if ((e = ahdt.e) == null) {
                    synchronized (ahdt.class) {
                        if (ahdt.e == null) {
                            ahdt.e = (ahbe)new agzb((agzi)ahdt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahdt.a;
            }
            case 4: {
                return new agza((agzi)ahdt.a);
            }
            case 3: {
                return new ahdt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahdt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
