import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeuw extends ahcz implements aheo
{
    public static final aeuw a;
    private static volatile ahev k;
    public int b;
    public String c;
    public int d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public int i;
    public boolean j;
    
    static {
        ahcz.registerDefaultInstance(aeuw.class, a = new aeuw());
    }
    
    private aeuw() {
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
                final ahev k;
                if ((k = aeuw.k) == null) {
                    synchronized (aeuw.class) {
                        if (aeuw.k == null) {
                            aeuw.k = (ahev)new ahcs((ahcz)aeuw.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aeuw.a;
            }
            case 4: {
                return new ahcr((ahcz)aeuw.a);
            }
            case 3: {
                return new aeuw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aeuw.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1002\u0003\u0005\u1002\u0005\u0006\u1007\b\b\u100c\t\t\u1007\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", aemb.c, "j" });
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
