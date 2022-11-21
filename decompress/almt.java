import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almt extends ahcz implements aheo
{
    public static final almt a;
    private static volatile ahev f;
    public int b;
    public int c;
    public Object d;
    public String e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(almt.class, a = new almt());
    }
    
    private almt() {
        this.c = 0;
        this.g = 2;
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
                if ((f = almt.f) == null) {
                    synchronized (almt.class) {
                        if (almt.f == null) {
                            almt.f = (ahev)new ahcs((ahcz)almt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return almt.a;
            }
            case 4: {
                return new ahcr((ahcz)almt.a);
            }
            case 3: {
                return new almt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almt.a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u103b\u0000\u0003\u143c\u0000\u0004\u1037\u0000\u0005\u103a\u0000\u0006\u1033\u0000", new Object[] { "d", "c", "b", "e", ajws.class });
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
