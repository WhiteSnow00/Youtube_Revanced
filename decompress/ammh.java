import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammh extends ahcz implements aheo
{
    public static final ammh a;
    private static volatile ahev n;
    public int b;
    public ajws c;
    public ammf d;
    public amml e;
    public aisc f;
    public ahdp g;
    public aisc h;
    public String i;
    public aisc j;
    public anxb k;
    public boolean l;
    public anxb m;
    private ammf o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(ammh.class, a = new ammh());
    }
    
    private ammh() {
        this.p = 2;
        this.g = ahcz.emptyProtobufList();
        this.i = "";
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
                final ahev n;
                if ((n = ammh.n) == null) {
                    synchronized (ammh.class) {
                        if (ammh.n == null) {
                            ammh.n = (ahev)new ahcs((ahcz)ammh.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ammh.a;
            }
            case 4: {
                return new ahcr((ahcz)ammh.a);
            }
            case 3: {
                return new ammh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammh.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005\b\u1008\u0006\t\u1409\u0007\n\u1409\b\u000b\u1007\t\f\u1409\n", new Object[] { "b", "c", "d", "o", "e", "f", "g", anxb.class, "h", "i", "j", "k", "l", "m" });
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
