import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqst extends ahcz implements aheo
{
    public static final aqst a;
    private static volatile ahev g;
    public int b;
    public String c;
    public long d;
    public boolean e;
    public boolean f;
    
    static {
        ahcz.registerDefaultInstance(aqst.class, a = new aqst());
    }
    
    private aqst() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aqst.g) == null) {
                    synchronized (aqst.class) {
                        if (aqst.g == null) {
                            aqst.g = (ahev)new ahcs((ahcz)aqst.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqst.a;
            }
            case 4: {
                return new ahcr((ahcz)aqst.a);
            }
            case 3: {
                return new aqst();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqst.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
