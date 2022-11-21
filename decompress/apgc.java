import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgc extends ahcz implements aheo
{
    public static final apgc a;
    private static volatile ahev c;
    public long b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apgc.class, a = new apgc());
    }
    
    private apgc() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = apgc.c) == null) {
                    synchronized (apgc.class) {
                        if (apgc.c == null) {
                            apgc.c = (ahev)new ahcs((ahcz)apgc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apgc.a;
            }
            case 4: {
                return new ahcr((ahcz)apgc.a);
            }
            case 3: {
                return new apgc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
