import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alew extends ahcz implements aheo
{
    public static final alew a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public ahdp d;
    public ahdp e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alew.class, a = new alew());
    }
    
    private alew() {
        this.g = 2;
        this.d = ahcz.emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alew.f) == null) {
                    synchronized (alew.class) {
                        if (alew.f == null) {
                            alew.f = (ahev)new ahcs((ahcz)alew.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alew.a;
            }
            case 4: {
                return new ahcr((int[][])null, (float[])null);
            }
            case 3: {
                return new alew();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alew.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001\u1409\u0000\u0002\u001b\u0004\u001a", new Object[] { "b", "c", "d", apkj.class, "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
