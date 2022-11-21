import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsv extends ahcz implements aheo
{
    public static final apsv a;
    private static volatile ahev f;
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    private int g;
    
    static {
        ahcz.registerDefaultInstance(apsv.class, a = new apsv());
    }
    
    private apsv() {
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
                if ((f = apsv.f) == null) {
                    synchronized (apsv.class) {
                        if (apsv.f == null) {
                            apsv.f = (ahev)new ahcs((ahcz)apsv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apsv.a;
            }
            case 4: {
                return new ahcr((ahcz)apsv.a);
            }
            case 3: {
                return new apsv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsv.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0005\u1007\u0002\u0007\u1004\u0004", new Object[] { "g", "b", "c", "d", "e" });
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
