import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyf extends ahcz implements aheo
{
    public static final akyf a;
    private static volatile ahev g;
    public int b;
    public aknj c;
    public ahdp d;
    public akyg e;
    public int f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akyf.class, a = new akyf());
    }
    
    private akyf() {
        this.h = 2;
        this.d = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = akyf.g) == null) {
                    synchronized (akyf.class) {
                        if (akyf.g == null) {
                            akyf.g = (ahev)new ahcs((ahcz)akyf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akyf.a;
            }
            case 4: {
                return new ahcr((ahcz)akyf.a);
            }
            case 3: {
                return new akyf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyf.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b\u0003\u1009\u0001\u0005\u100b\u0002", new Object[] { "b", "c", "d", akym.class, "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
