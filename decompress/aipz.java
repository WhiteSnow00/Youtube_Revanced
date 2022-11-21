import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipz extends ahcz implements aheo
{
    public static final aipz a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aipz.class, a = new aipz());
    }
    
    private aipz() {
        this.b = 0;
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
                if ((d = aipz.d) == null) {
                    synchronized (aipz.class) {
                        if (aipz.d == null) {
                            aipz.d = (ahev)new ahcs((ahcz)aipz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aipz.a;
            }
            case 4: {
                return new ahcr((ahcz)aipz.a);
            }
            case 3: {
                return new aipz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipz.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000", new Object[] { "c", "b", aiqa.class, aiqe.class, aiqd.class });
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
