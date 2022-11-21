import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akya extends ahcz implements aheo
{
    public static final akya a;
    private static volatile ahev f;
    public int b;
    public int c;
    public ahdp d;
    public ahbt e;
    private int g;
    
    static {
        ahcz.registerDefaultInstance(akya.class, a = new akya());
    }
    
    private akya() {
        this.d = ahcz.emptyProtobufList();
        this.e = ahbt.b;
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
                if ((f = akya.f) == null) {
                    synchronized (akya.class) {
                        if (akya.f == null) {
                            akya.f = (ahev)new ahcs((ahcz)akya.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akya.a;
            }
            case 4: {
                return new ahcr((ahcz)akya.a);
            }
            case 3: {
                return new akya();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akya.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1004\u0001\u0003\u001b\u0004\u100a\u0002", new Object[] { "g", "b", aklp.u, "c", "d", akxy.class, "e" });
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
