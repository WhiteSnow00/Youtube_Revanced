import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahle extends ahcz implements aheo
{
    public static final ahle a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(ahle.class, a = new ahle());
    }
    
    private ahle() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ahle.f) == null) {
                    synchronized (ahle.class) {
                        if (ahle.f == null) {
                            ahle.f = (ahev)new ahcs((ahcz)ahle.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahle.a;
            }
            case 4: {
                return new ahcr((ahcz)ahle.a);
            }
            case 3: {
                return new ahle();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahle.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "b", "c", ahld.b, "d", ahld.c, "e", ahld.a });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
