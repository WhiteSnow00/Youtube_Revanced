import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfi extends ahcz implements aheo
{
    public static final alfi a;
    private static volatile ahev i;
    public int b;
    public int c;
    public Object d;
    public aknh e;
    public String f;
    public String g;
    public boolean h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alfi.class, a = new alfi());
    }
    
    private alfi() {
        this.c = 0;
        this.j = 2;
        this.f = "";
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = alfi.i) == null) {
                    synchronized (alfi.class) {
                        if (alfi.i == null) {
                            alfi.i = (ahev)new ahcs((ahcz)alfi.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alfi.a;
            }
            case 4: {
                return new ahcr((ahcz)alfi.a);
            }
            case 3: {
                return new alfi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfi.a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u103b\u0000\u0003\u1008\u0003\u0005\u1008\u0004\u0006\u1007\u0005\u0007\u103b\u0000", new Object[] { "d", "c", "b", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
