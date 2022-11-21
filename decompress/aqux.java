import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqux extends ahcz implements aheo
{
    public static final aqux a;
    private static volatile ahev e;
    public int b;
    public ahbt c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(aqux.class, a = new aqux());
    }
    
    private aqux() {
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqux.e) == null) {
                    synchronized (aqux.class) {
                        if (aqux.e == null) {
                            aqux.e = (ahev)new ahcs((ahcz)aqux.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqux.a;
            }
            case 4: {
                return new ahcr((ahcz)aqux.a);
            }
            case 3: {
                return new aqux();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqux.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
