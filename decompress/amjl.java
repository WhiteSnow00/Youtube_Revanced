import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjl extends ahcz implements aheo
{
    public static final amjl a;
    private static volatile ahev j;
    public int b;
    public int c;
    public Object d;
    public ajws e;
    public amjo f;
    public amjm g;
    public aiet h;
    public ahbt i;
    private aiet k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(amjl.class, a = new amjl());
    }
    
    private amjl() {
        this.c = 0;
        this.m = 2;
        this.i = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = amjl.j) == null) {
                    synchronized (amjl.class) {
                        if (amjl.j == null) {
                            amjl.j = (ahev)new ahcs((ahcz)amjl.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amjl.a;
            }
            case 4: {
                return new ahcr((ahcz)amjl.a);
            }
            case 3: {
                return new amjl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjl.a, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u103c\u0000\u0003\u1409\b\u0004\u100a\t\u0005\u1409\u0006\u0006\u1409\u0001\u0007\u143c\u0000\b\u1009\u0005\t\u1409\u0007\u000b\u143c\u0000", new Object[] { "d", "c", "b", "e", amjr.class, "l", "i", "h", "f", amjq.class, "g", "k", amjk.class });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
