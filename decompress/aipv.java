import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipv extends ahcz implements aheo
{
    public static final aipv a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(aipv.class, a = new aipv());
    }
    
    private aipv() {
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
                if ((c = aipv.c) == null) {
                    synchronized (aipv.class) {
                        if (aipv.c == null) {
                            aipv.c = (ahev)new ahcs((ahcz)aipv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aipv.a;
            }
            case 4: {
                return new ahcr((ahcz)aipv.a);
            }
            case 3: {
                return new aipv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipv.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aipp.class });
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
