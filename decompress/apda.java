import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apda extends ahcz implements aheo
{
    public static final apda a;
    private static volatile ahev k;
    public int b;
    public int c;
    public Object d;
    public ajws e;
    public ahdp f;
    public aiet g;
    public aiet h;
    public int i;
    public ahbt j;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(apda.class, a = new apda());
    }
    
    private apda() {
        this.c = 0;
        this.m = 2;
        this.f = ahcz.emptyProtobufList();
        this.j = ahbt.b;
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
                final ahev k;
                if ((k = apda.k) == null) {
                    synchronized (apda.class) {
                        if (apda.k == null) {
                            apda.k = (ahev)new ahcs((ahcz)apda.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return apda.a;
            }
            case 4: {
                return new ahcr((short[])null, (float[][])null);
            }
            case 3: {
                return new apda();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apda.a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u103b\u0000\u0006\u1409\u0006\u0007\u100a\u0007\b\u103f\u0000\t\u100c\u0005", new Object[] { "d", "c", "b", "e", "f", ajws.class, "g", "h", "l", "j", aouq.a(), "i", aouq.a() });
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
