import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjj extends ahcz implements aheo
{
    public static final ajjj a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(ajjj.class, a = new ajjj());
    }
    
    private ajjj() {
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
                if ((f = ajjj.f) == null) {
                    synchronized (ajjj.class) {
                        if (ajjj.f == null) {
                            ajjj.f = (ahev)new ahcs((ahcz)ajjj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajjj.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjj.a);
            }
            case 3: {
                return new ajjj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1004\u0002", new Object[] { "b", "c", ajji.a(), "d", ajjo.a(), "e" });
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
