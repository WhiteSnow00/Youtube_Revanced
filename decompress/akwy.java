import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwy extends ahcz implements aheo
{
    public static final akwy a;
    private static volatile ahev c;
    public aknj b;
    private int d;
    private ahjl e;
    private amup f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akwy.class, a = new akwy());
    }
    
    private akwy() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = akwy.c) == null) {
                    synchronized (akwy.class) {
                        if (akwy.c == null) {
                            akwy.c = (ahev)new ahcs((ahcz)akwy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akwy.a;
            }
            case 4: {
                return new ahcr((ahcz)akwy.a);
            }
            case 3: {
                return new akwy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akwy.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0005\u0006\u1409\u0003", new Object[] { "d", "b", "f", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
