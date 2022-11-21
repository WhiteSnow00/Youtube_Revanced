import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqaq extends ahcz implements aheo
{
    public static final aqaq a;
    private static volatile ahev k;
    public int b;
    public aqap c;
    public ahdp d;
    public ajws e;
    public anxb f;
    public anxb g;
    public ahdp h;
    public ahdp i;
    public ahbt j;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(aqaq.class, a = new aqaq());
    }
    
    private aqaq() {
        this.m = 2;
        this.d = ahcz.emptyProtobufList();
        this.h = ahcz.emptyProtobufList();
        this.i = ahcz.emptyProtobufList();
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
                if ((k = aqaq.k) == null) {
                    synchronized (aqaq.class) {
                        if (aqaq.k == null) {
                            aqaq.k = (ahev)new ahcs((ahcz)aqaq.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aqaq.a;
            }
            case 4: {
                return new ahcr((ahcz)aqaq.a);
            }
            case 3: {
                return new aqaq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqaq.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\b\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u041b\u0007\u041b\b\u1409\u0004\t\u100a\u0005", new Object[] { "b", "c", "d", aqao.class, "e", "f", "g", "h", aisc.class, "i", aisc.class, "l", "j" });
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
