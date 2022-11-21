import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzh extends ahcz implements aheo
{
    public static final akzh a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(akzh.class, a = new akzh());
    }
    
    private akzh() {
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
                if ((f = akzh.f) == null) {
                    synchronized (akzh.class) {
                        if (akzh.f == null) {
                            akzh.f = (ahev)new ahcs((ahcz)akzh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akzh.a;
            }
            case 4: {
                return new ahcr((ahcz)akzh.a);
            }
            case 3: {
                return new akzh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1002\u0002", new Object[] { "b", "c", apqo.a(), "d", apqo.a(), "e" });
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
