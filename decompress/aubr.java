import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubr extends ahcz implements aheo
{
    public static final aubr a;
    private static volatile ahev o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ahdp j;
    public int k;
    public int l;
    public int m;
    public aubu n;
    
    static {
        ahcz.registerDefaultInstance(aubr.class, a = new aubr());
    }
    
    private aubr() {
        this.j = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = aubr.o) == null) {
                    synchronized (aubr.class) {
                        if (aubr.o == null) {
                            aubr.o = (ahev)new ahcs((ahcz)aubr.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aubr.a;
            }
            case 4: {
                return new ahcr((byte[][])null, (float[][])null);
            }
            case 3: {
                return new aubr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubr.a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0003\u0004\u1004\u0006\u0005\u001b\u0006\u1004\b\u0007\u1004\u0002\b\u1004\u0004\t\u1004\u0005\u000b\u1004\t\f\u1004\n\r\u1009\u000b", new Object[] { "b", "c", "d", "f", "i", "j", aubq.class, "k", "e", "g", "h", "l", "m", "n" });
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
