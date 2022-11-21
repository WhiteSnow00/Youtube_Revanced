import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzd extends ahcz implements aheo
{
    public static final alzd a;
    private static volatile ahev e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(alzd.class, a = new alzd());
    }
    
    private alzd() {
        this.c = "";
        final ahbt b = ahbt.b;
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
                if ((e = alzd.e) == null) {
                    synchronized (alzd.class) {
                        if (alzd.e == null) {
                            alzd.e = (ahev)new ahcs((ahcz)alzd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alzd.a;
            }
            case 4: {
                return new ahcr((ahcz)alzd.a);
            }
            case 3: {
                return new alzd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzd.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1004\u0002", new Object[] { "b", "c", "d" });
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
