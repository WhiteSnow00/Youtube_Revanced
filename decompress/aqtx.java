import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtx extends ahcz implements aheo
{
    public static final aqtx a;
    private static volatile ahev f;
    public int b;
    public ahcf c;
    public boolean d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(aqtx.class, a = new aqtx());
    }
    
    private aqtx() {
        this.e = true;
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
                if ((f = aqtx.f) == null) {
                    synchronized (aqtx.class) {
                        if (aqtx.f == null) {
                            aqtx.f = (ahev)new ahcs((ahcz)aqtx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqtx.a;
            }
            case 4: {
                return new ahcr((ahcz)aqtx.a);
            }
            case 3: {
                return new aqtx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqtx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
