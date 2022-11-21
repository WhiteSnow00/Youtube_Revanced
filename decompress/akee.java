import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akee extends ahcz implements aheo
{
    public static final akee a;
    private static volatile ahev f;
    public int b;
    public int c;
    public Object d;
    public akej e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akee.class, a = new akee());
    }
    
    private akee() {
        this.c = 0;
        this.g = 2;
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
                if ((f = akee.f) == null) {
                    synchronized (akee.class) {
                        if (akee.f == null) {
                            akee.f = (ahev)new ahcs((ahcz)akee.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akee.a;
            }
            case 4: {
                return new ahcr((ahcz)akee.a);
            }
            case 3: {
                return new akee();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akee.a, "\u0001\u0003\u0001\u0001\ue1c8\u3570\uf152\u62c4\u0003\u0000\u0000\u0003\ue1c8\u3570\u1409\u0000\uf707\u395a\u143c\u0000\uf152\u62c4\u143c\u0000", new Object[] { "d", "c", "b", "e", anyh.class, aole.class });
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
