import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akov extends ahcz implements aheo
{
    public static final akov a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public String d;
    public String e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akov.class, a = new akov());
    }
    
    private akov() {
        this.g = 2;
        this.d = "";
        this.e = "";
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
                final ahev f;
                if ((f = akov.f) == null) {
                    synchronized (akov.class) {
                        if (akov.f == null) {
                            akov.f = (ahev)new ahcs((ahcz)akov.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akov.a;
            }
            case 4: {
                return new ahcr((ahcz)akov.a);
            }
            case 3: {
                return new akov();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akov.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
