import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajid extends ahcz implements aheo
{
    public static final ajid a;
    private static volatile ahev f;
    public int b;
    public boolean c;
    public ajht d;
    public ajhr e;
    
    static {
        ahcz.registerDefaultInstance(ajid.class, a = new ajid());
    }
    
    private ajid() {
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
                if ((f = ajid.f) == null) {
                    synchronized (ajid.class) {
                        if (ajid.f == null) {
                            ajid.f = (ahev)new ahcs((ahcz)ajid.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajid.a;
            }
            case 4: {
                return new ahcr((ahcz)ajid.a);
            }
            case 3: {
                return new ajid();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajid.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
