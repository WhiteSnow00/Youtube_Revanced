import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqss extends ahcz implements aheo
{
    public static final aqss a;
    private static volatile ahev e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aqss.class, a = new aqss());
    }
    
    private aqss() {
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
                final ahev e;
                if ((e = aqss.e) == null) {
                    synchronized (aqss.class) {
                        if (aqss.e == null) {
                            aqss.e = (ahev)new ahcs((ahcz)aqss.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqss.a;
            }
            case 4: {
                return new ahcr((ahcz)aqss.a);
            }
            case 3: {
                return new aqss();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqss.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
