import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqji extends ahcz implements aheo
{
    public static final aqji a;
    private static volatile ahev f;
    public int b;
    public aqjk c;
    public int d;
    public int e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aqji.class, a = new aqji());
    }
    
    private aqji() {
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
                if ((f = aqji.f) == null) {
                    synchronized (aqji.class) {
                        if (aqji.f == null) {
                            aqji.f = (ahev)new ahcs((ahcz)aqji.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqji.a;
            }
            case 4: {
                return new ahcr((ahcz)aqji.a);
            }
            case 3: {
                return new aqji();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqji.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
