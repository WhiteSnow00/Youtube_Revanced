import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alez extends ahcz implements aheo
{
    public static final alez a;
    private static volatile ahev m;
    public int b;
    public aknh c;
    public apns d;
    public alxj e;
    public ahdp f;
    public int g;
    public int h;
    public boolean i;
    public apjk j;
    public boolean k;
    public aley l;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(alez.class, a = new alez());
    }
    
    private alez() {
        this.n = 2;
        this.f = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = alez.m) == null) {
                    synchronized (alez.class) {
                        if (alez.m == null) {
                            alez.m = (ahev)new ahcs((ahcz)alez.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return alez.a;
            }
            case 4: {
                return new ahcr((int[])null, (short[][])null);
            }
            case 3: {
                return new alez();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alez.a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0003\u0004\u041b\u0005\u100c\u0004\u0006\u100c\u0005\t\u1007\u0006\n\u1009\u0007\u000b\u1007\b\f\u1009\t", new Object[] { "b", "c", "d", "e", "f", almt.class, "g", ankj.m, "h", akyi.o, "i", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
