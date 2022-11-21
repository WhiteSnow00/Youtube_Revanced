import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzz extends ahcz implements aheo
{
    public static final alzz a;
    private static volatile ahev n;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public String k;
    public boolean l;
    public boolean m;
    
    static {
        ahcz.registerDefaultInstance(alzz.class, a = new alzz());
    }
    
    private alzz() {
        this.k = "";
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
                if ((n = alzz.n) == null) {
                    synchronized (alzz.class) {
                        if (alzz.n == null) {
                            alzz.n = (ahev)new ahcs((ahcz)alzz.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return alzz.a;
            }
            case 4: {
                return new ahcr((ahcz)alzz.a);
            }
            case 3: {
                return new alzz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzz.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u100c\u0006\b\u100c\u0007\t\u1008\b\n\u1007\t\u000b\u1007\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", anep.c, "j", amaw.b, "k", "l", "m" });
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
