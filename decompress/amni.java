import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amni extends ahcz implements aheo
{
    public static final amni a;
    private static volatile ahev h;
    public int b;
    public ajws c;
    public anxb d;
    public anxb e;
    public ahdp f;
    public ahbt g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(amni.class, a = new amni());
    }
    
    private amni() {
        this.j = 2;
        this.f = ahcz.emptyProtobufList();
        this.g = ahbt.b;
        emptyProtobufList();
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
                final ahev h;
                if ((h = amni.h) == null) {
                    synchronized (amni.class) {
                        if (amni.h == null) {
                            amni.h = (ahev)new ahcs((ahcz)amni.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amni.a;
            }
            case 4: {
                return new ahcr((ahcz)amni.a);
            }
            case 3: {
                return new amni();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amni.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0005\u0001\u1409\u0003\u0002\u100a\u0004\u0003\u1409\u0000\u0005\u1409\u0001\u0006\u1409\u0002\u0007\u041b", new Object[] { "b", "i", "g", "c", "d", "e", "f", anxb.class });
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
