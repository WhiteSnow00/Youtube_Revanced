import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpw extends ahcz implements aheo
{
    public static final aqpw a;
    private static volatile ahev h;
    public int b;
    public ahdc c;
    public ahdc d;
    public aqpy e;
    public aqqb f;
    public aqqd g;
    
    static {
        ahcz.registerDefaultInstance(aqpw.class, a = new aqpw());
    }
    
    private aqpw() {
        this.c = ahcz.emptyDoubleList();
        this.d = ahcz.emptyDoubleList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aqpw.h) == null) {
                    synchronized (aqpw.class) {
                        if (aqpw.h == null) {
                            aqpw.h = (ahev)new ahcs((ahcz)aqpw.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqpw.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpw.a);
            }
            case 3: {
                return new aqpw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpw.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001\u0012\u0002\u0012\u0004\u1009\u0000\u0005\u1009\u0001\u0006\u1009\u0002", new Object[] { "b", "c", "d", "e", "f", "g" });
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
