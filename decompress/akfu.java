import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfu extends ahcz implements aheo
{
    public static final akfu a;
    private static volatile ahev f;
    public int b;
    public aisc c;
    public anxb d;
    public anxb e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akfu.class, a = new akfu());
    }
    
    private akfu() {
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
                if ((f = akfu.f) == null) {
                    synchronized (akfu.class) {
                        if (akfu.f == null) {
                            akfu.f = (ahev)new ahcs((ahcz)akfu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akfu.a;
            }
            case 4: {
                return new ahcr((ahcz)akfu.a);
            }
            case 3: {
                return new akfu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
