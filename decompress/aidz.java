import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidz extends ahcz implements aheo
{
    public static final aidz a;
    private static volatile ahev f;
    public int b;
    public anxb c;
    public anxb d;
    public anxb e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aidz.class, a = new aidz());
    }
    
    private aidz() {
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
                if ((f = aidz.f) == null) {
                    synchronized (aidz.class) {
                        if (aidz.f == null) {
                            aidz.f = (ahev)new ahcs((ahcz)aidz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aidz.a;
            }
            case 4: {
                return new ahcr((ahcz)aidz.a);
            }
            case 3: {
                return new aidz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidz.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
