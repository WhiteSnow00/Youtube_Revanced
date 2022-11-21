import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alor extends ahcz implements aheo
{
    public static final alor a;
    private static volatile ahev k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    
    static {
        ahcz.registerDefaultInstance(alor.class, a = new alor());
    }
    
    private alor() {
        this.j = "";
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
                if ((k = alor.k) == null) {
                    synchronized (alor.class) {
                        if (alor.k == null) {
                            alor.k = (ahev)new ahcs((ahcz)alor.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return alor.a;
            }
            case 4: {
                return new ahcr((ahcz)alor.a);
            }
            case 3: {
                return new alor();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alor.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u100c\u0002\u0004\u100b\u0003\u0005\u100b\u0004\u0006\u100b\u0005\u0007\u100b\u0006\b\u1008\u0007", new Object[] { "b", "c", "d", "e", alfq.q, "f", "g", "h", "i", "j" });
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
