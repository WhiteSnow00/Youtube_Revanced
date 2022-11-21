import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipn extends ahcz implements aheo
{
    public static final aipn a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(aipn.class, a = new aipn());
    }
    
    private aipn() {
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aipn.d) == null) {
                    synchronized (aipn.class) {
                        if (aipn.d == null) {
                            aipn.d = (ahev)new ahcs((ahcz)aipn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aipn.a;
            }
            case 4: {
                return new ahcr((ahcz)aipn.a);
            }
            case 3: {
                return new aipn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipn.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u100a\u0000", new Object[] { "b", "c" });
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
