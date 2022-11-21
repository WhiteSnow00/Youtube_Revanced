import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardz extends ahcz implements aheo
{
    public static final ardz a;
    private static volatile ahev n;
    public int b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public String i;
    public String j;
    public long k;
    public long l;
    public long m;
    
    static {
        ahcz.registerDefaultInstance(ardz.class, a = new ardz());
    }
    
    private ardz() {
        this.i = "";
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
                final ahev n;
                if ((n = ardz.n) == null) {
                    synchronized (ardz.class) {
                        if (ardz.n == null) {
                            ardz.n = (ahev)new ahcs((ahcz)ardz.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ardz.a;
            }
            case 4: {
                return new ahcr((ahcz)ardz.a);
            }
            case 3: {
                return new ardz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardz.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1008\u0006\b\u1008\u0007\t\u1002\b\n\u1002\t\u000b\u1002\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
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
