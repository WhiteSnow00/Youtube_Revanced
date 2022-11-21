import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akda extends ahcz implements aheo
{
    public static final akda a;
    private static volatile ahev f;
    public int b;
    public int c;
    public double d;
    public aisc e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akda.class, a = new akda());
    }
    
    private akda() {
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
                if ((f = akda.f) == null) {
                    synchronized (akda.class) {
                        if (akda.f == null) {
                            akda.f = (ahev)new ahcs((ahcz)akda.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akda.a;
            }
            case 4: {
                return new ahcr((ahcz)akda.a);
            }
            case 3: {
                return new akda();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akda.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1004\u0000\u0003\u1000\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e" });
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
