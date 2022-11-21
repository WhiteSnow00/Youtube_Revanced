import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxw extends ahcz implements aheo
{
    public static final apxw a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(apxw.class, a = new apxw());
    }
    
    private apxw() {
        this.b = ahcz.emptyProtobufList();
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
                if ((c = apxw.c) == null) {
                    synchronized (apxw.class) {
                        if (apxw.c == null) {
                            apxw.c = (ahev)new ahcs((ahcz)apxw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apxw.a;
            }
            case 4: {
                return new ahcr((ahcz)apxw.a);
            }
            case 3: {
                return new apxw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxw.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", apxu.class });
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
