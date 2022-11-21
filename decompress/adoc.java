import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adoc extends ahcz implements aheo
{
    public static final adoc a;
    private static volatile ahev f;
    public int b;
    public long c;
    public long d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(adoc.class, a = new adoc());
    }
    
    private adoc() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = adoc.f) == null) {
                    synchronized (adoc.class) {
                        if (adoc.f == null) {
                            adoc.f = (ahev)new ahcs((ahcz)adoc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return adoc.a;
            }
            case 4: {
                return new ahcr((ahcz)adoc.a);
            }
            case 3: {
                return new adoc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adoc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
