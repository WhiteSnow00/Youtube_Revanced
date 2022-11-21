import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoig extends ahcz implements aheo
{
    public static final aoig a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public anyt d;
    
    static {
        final aoig a2 = new aoig();
        ahcz.registerDefaultInstance(aoig.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqqn.a, a2, (MessageLite)a2, null, 9, ahgc.k, aoig.class);
    }
    
    private aoig() {
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
                if ((e = aoig.e) == null) {
                    synchronized (aoig.class) {
                        if (aoig.e == null) {
                            aoig.e = (ahev)new ahcs((ahcz)aoig.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoig.a;
            }
            case 4: {
                return new ahcr((ahcz)aoig.a);
            }
            case 3: {
                return new aoig();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoig.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
