import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbi extends ahcz implements aheo
{
    public static final aqbi a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    
    static {
        final aqbi a2 = new aqbi();
        ahcz.registerDefaultInstance(aqbi.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)amwo.b, a2, (MessageLite)a2, null, 407110990, ahgc.k, aqbi.class);
    }
    
    private aqbi() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aqbi.g) == null) {
                    synchronized (aqbi.class) {
                        if (aqbi.g == null) {
                            aqbi.g = (ahev)new ahcs((ahcz)aqbi.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqbi.a;
            }
            case 4: {
                return new ahcr((ahcz)aqbi.a);
            }
            case 3: {
                return new aqbi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqbi.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "c", "d", aidb.o, "e", "f" });
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
