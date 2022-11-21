import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajme extends ahcz implements aheo
{
    public static final ajme a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public ajws e;
    public boolean f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(ajme.class, a = new ajme());
    }
    
    private ajme() {
        this.c = 0;
        this.h = 2;
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
                if ((g = ajme.g) == null) {
                    synchronized (ajme.class) {
                        if (ajme.g == null) {
                            ajme.g = (ahev)new ahcs((ahcz)ajme.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajme.a;
            }
            case 4: {
                return new ahcr((ahcz)ajme.a);
            }
            case 3: {
                return new ajme();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajme.a, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1007\u0002\u0005\u143c\u0000\u0006\u143c\u0000", new Object[] { "d", "c", "b", "e", "f", aisc.class, ajae.class });
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
