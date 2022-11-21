import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammz extends ahcz implements aheo
{
    public static final ammz a;
    private static volatile ahev e;
    public String b;
    public long c;
    public int d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(ammz.class, a = new ammz());
    }
    
    private ammz() {
        this.b = "";
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
                if ((e = ammz.e) == null) {
                    synchronized (ammz.class) {
                        if (ammz.e == null) {
                            ammz.e = (ahev)new ahcs((ahcz)ammz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ammz.a;
            }
            case 4: {
                return new ahcr((ahcz)ammz.a);
            }
            case 3: {
                return new ammz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
