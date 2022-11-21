import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrj extends ahcz implements aheo
{
    public static final agrj a;
    private static volatile ahev c;
    public agrl b;
    
    static {
        ahcz.registerDefaultInstance(agrj.class, a = new agrj());
    }
    
    private agrj() {
        final ahbt b = ahbt.b;
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
                if ((c = agrj.c) == null) {
                    synchronized (agrj.class) {
                        if (agrj.c == null) {
                            agrj.c = (ahev)new ahcs((ahcz)agrj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agrj.a;
            }
            case 4: {
                return new ahcr((ahcz)agrj.a);
            }
            case 3: {
                return new agrj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrj.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "b" });
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
