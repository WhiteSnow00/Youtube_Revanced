import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkg extends ahcz implements aheo
{
    public static final amkg a;
    private static volatile ahev m;
    public int b;
    public int c;
    public aowb d;
    public ahdp e;
    public ahdp f;
    public ajws g;
    public ajws h;
    public ajws i;
    public akfj j;
    public aisc k;
    public ahbt l;
    private anxb n;
    private ahjl o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(amkg.class, a = new amkg());
    }
    
    private amkg() {
        this.p = 2;
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        this.l = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = amkg.m) == null) {
                    synchronized (amkg.class) {
                        if (amkg.m == null) {
                            amkg.m = (ahev)new ahcs((ahcz)amkg.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return amkg.a;
            }
            case 4: {
                return new ahcr((ahcz)amkg.a);
            }
            case 3: {
                return new amkg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkg.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\n\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007\b\u1409\b\t\u100a\t\n\u041b\u000b\u041b\f\u1409\u0006", new Object[] { "b", "c", amgw.p, "d", "g", "h", "i", "j", "k", "o", "l", "e", aovp.class, "f", aibx.class, "n" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
