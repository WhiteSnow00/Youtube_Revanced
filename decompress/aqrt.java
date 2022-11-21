import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrt extends ahcz implements aheo
{
    public static final aqrt a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public boolean d;
    
    static {
        final aqrt a2 = new aqrt();
        ahcz.registerDefaultInstance(aqrt.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)TransactionContextOuterClass$TransactionContext.getDefaultInstance(), a2, (MessageLite)a2, null, 1000, ahgc.k, aqrt.class);
    }
    
    private aqrt() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqrt.e) == null) {
                    synchronized (aqrt.class) {
                        if (aqrt.e == null) {
                            aqrt.e = (ahev)new ahcs((ahcz)aqrt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqrt.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrt.a);
            }
            case 3: {
                return new aqrt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
