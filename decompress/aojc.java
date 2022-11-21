import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojc extends ahcz implements aheo
{
    public static final aojc a;
    private static volatile ahev m;
    public int b;
    public ajws c;
    public aoji d;
    public ahdp e;
    public ails f;
    public aisc g;
    public ajws h;
    public ajws i;
    public aich j;
    public amiy k;
    public ahbt l;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(aojc.class, a = new aojc());
    }
    
    private aojc() {
        this.o = 2;
        this.e = ahcz.emptyProtobufList();
        this.l = ahbt.b;
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
                final ahev m;
                if ((m = aojc.m) == null) {
                    synchronized (aojc.class) {
                        if (aojc.m == null) {
                            aojc.m = (ahev)new ahcs((ahcz)aojc.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aojc.a;
            }
            case 4: {
                return new ahcr((ahcz)aojc.a);
            }
            case 3: {
                return new aojc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojc.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\b\u1409\u0006\t\u1409\u0007\n\u1409\b\u000b\u100a\t\f\u041b\r\u1409\u0002", new Object[] { "b", "c", "d", "g", "h", "i", "j", "k", "n", "l", "e", aovp.class, "f" });
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
