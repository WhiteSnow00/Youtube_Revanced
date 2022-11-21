import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidv extends ahcz implements aheo
{
    public static final aidv a;
    private static volatile ahev f;
    public aidu b;
    public aidu c;
    public aidu d;
    public aidu e;
    private int g;
    
    static {
        ahcz.registerDefaultInstance(aidv.class, a = new aidv());
    }
    
    private aidv() {
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
                if ((f = aidv.f) == null) {
                    synchronized (aidv.class) {
                        if (aidv.f == null) {
                            aidv.f = (ahev)new ahcs((ahcz)aidv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aidv.a;
            }
            case 4: {
                return new ahcr((ahcz)aidv.a);
            }
            case 3: {
                return new aidv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidv.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
