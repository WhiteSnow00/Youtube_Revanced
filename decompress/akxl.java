import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxl extends ahcz implements aheo
{
    public static final akxl a;
    private static volatile ahev i;
    public int b;
    public aknh c;
    public ahdp d;
    public long e;
    public long f;
    public int g;
    public float h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(akxl.class, a = new akxl());
    }
    
    private akxl() {
        this.j = 2;
        this.d = ahcz.emptyProtobufList();
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
                if ((i = akxl.i) == null) {
                    synchronized (akxl.class) {
                        if (akxl.i == null) {
                            akxl.i = (ahev)new ahcs((ahcz)akxl.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akxl.a;
            }
            case 4: {
                return new ahcr((short[][][])null, (char[])null);
            }
            case 3: {
                return new akxl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxl.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0003\u1003\u0001\u0004\u1003\u0002\u0005\u100b\u0003\u0006\u1001\u0004", new Object[] { "b", "c", "d", akxj.class, "e", "f", "g", "h" });
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
