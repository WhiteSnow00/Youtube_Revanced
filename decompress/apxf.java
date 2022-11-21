import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxf extends ahcz implements aheo
{
    public static final apxf a;
    private static volatile ahev c;
    public boolean b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(apxf.class, a = new apxf());
    }
    
    private apxf() {
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
                if ((c = apxf.c) == null) {
                    synchronized (apxf.class) {
                        if (apxf.c == null) {
                            apxf.c = (ahev)new ahcs((ahcz)apxf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apxf.a;
            }
            case 4: {
                return new ahcr((ahcz)apxf.a);
            }
            case 3: {
                return new apxf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
