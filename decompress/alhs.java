import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhs extends ahcz implements aheo
{
    public static final alhs a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public ahkc d;
    public aisc e;
    private ajws g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alhs.class, a = new alhs());
    }
    
    private alhs() {
        this.h = 2;
        this.c = ahcz.emptyProtobufList();
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
                final ahev f;
                if ((f = alhs.f) == null) {
                    synchronized (alhs.class) {
                        if (alhs.f == null) {
                            alhs.f = (ahev)new ahcs((ahcz)alhs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alhs.a;
            }
            case 4: {
                return new ahcr((ahcz)alhs.a);
            }
            case 3: {
                return new alhs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhs.a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0003\u0002\u1409\u0001\u0004\u041b\u0005\u1009\u0003\u0006\u1409\u0004", new Object[] { "b", "g", "c", alhr.class, "d", "e" });
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
