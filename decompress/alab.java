import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alab extends ahcz implements aheo
{
    public static final alab a;
    private static volatile ahev d;
    public aknj b;
    public ahdp c;
    private int e;
    private aisc f;
    private ahjl g;
    private ajxn h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(alab.class, a = new alab());
    }
    
    private alab() {
        this.i = 2;
        this.c = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = alab.d) == null) {
                    synchronized (alab.class) {
                        if (alab.d == null) {
                            alab.d = (ahev)new ahcs((ahcz)alab.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alab.a;
            }
            case 4: {
                return new ahcr((ahcz)alab.a);
            }
            case 3: {
                return new alab();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alab.a, "\u0001\u0005\u0000\u0001\u0001\u0309\u0005\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u041b\u0004\u1409\u0002\u0006\u1409\u0001\u0309\u1409\u0004", new Object[] { "e", "b", "c", alac.class, "g", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
