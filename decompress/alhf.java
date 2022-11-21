import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhf extends ahcz implements aheo
{
    public static final alhf a;
    private static volatile ahev n;
    public int b;
    public aknh c;
    public String d;
    public ahbt e;
    public String f;
    public String g;
    public String h;
    public akmg i;
    public ahbt j;
    public ahbt k;
    public String l;
    public ainv m;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(alhf.class, a = new alhf());
    }
    
    private alhf() {
        this.o = 2;
        this.d = "";
        this.e = ahbt.b;
        this.f = "";
        this.g = "";
        this.h = "";
        final ahbt b = ahbt.b;
        this.j = b;
        this.k = b;
        this.l = "";
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev n;
                if ((n = alhf.n) == null) {
                    synchronized (alhf.class) {
                        if (alhf.n == null) {
                            alhf.n = (ahev)new ahcs((ahcz)alhf.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return alhf.a;
            }
            case 4: {
                return new ahcr((ahcz)alhf.a);
            }
            case 3: {
                return new alhf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhf.a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0003\u0004\u1008\u0004\u0005\u1409\u0006\u0006\u100a\u0007\u0007\u100a\b\b\u100a\u0002\t\u1008\t\u000b\u1008\u0005\f\u1009\n", new Object[] { "b", "c", "d", "f", "g", "i", "j", "k", "e", "l", "h", "m" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
