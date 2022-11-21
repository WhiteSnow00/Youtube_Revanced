import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airr extends ahcz implements aheo
{
    public static final airr a;
    private static volatile ahev j;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    
    static {
        ahcz.registerDefaultInstance(airr.class, a = new airr());
    }
    
    private airr() {
        this.c = 1;
        this.d = 1;
        this.e = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = airr.j) == null) {
                    synchronized (airr.class) {
                        if (airr.j == null) {
                            airr.j = (ahev)new ahcs((ahcz)airr.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return airr.a;
            }
            case 4: {
                return new ahcr((ahcz)airr.a);
            }
            case 3: {
                return new airr();
            }
            case 2: {
                final ahdf n = aine.n;
                final ahdf o3 = aine.o;
                return ahcz.newMessageInfo((MessageLite)airr.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1007\u0003\u0004\u1007\u0004\u0005\u100b\u0005\u0006\u100b\u0006\b\u100c\u0002", new Object[] { "b", "c", n, "d", o3, "f", "g", "h", "i", "e", o3 });
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
