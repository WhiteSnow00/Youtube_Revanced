import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgs extends ahcz implements aheo
{
    public static final aqgs a;
    private static volatile ahev j;
    public int b;
    public String c;
    public int d;
    public ahdp e;
    public ahdp f;
    public ahdp g;
    public ahdp h;
    public aqgv i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aqgs.class, a = new aqgs());
    }
    
    private aqgs() {
        this.k = 2;
        this.c = "";
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        this.g = ahcz.emptyProtobufList();
        this.h = ahcz.emptyProtobufList();
    }
    
    public final void a() {
        final ahdp f = this.f;
        if (!f.c()) {
            this.f = ahcz.mutableCopy(f);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aqgs.j) == null) {
                    synchronized (aqgs.class) {
                        if (aqgs.j == null) {
                            aqgs.j = (ahev)new ahcs((ahcz)aqgs.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqgs.a;
            }
            case 4: {
                return new ahcr((char[])null, (boolean[][])null);
            }
            case 3: {
                return new aqgs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqgs.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0004\u0004\u0001\u1008\u0000\u0003\u100c\u0002\u0005\u041b\u0006\u041b\b\u041b\n\u041b\u000b\u1009\u0006", new Object[] { "b", "c", "d", aqdx.i, "e", aqgt.class, "f", aqgy.class, "g", aqgr.class, "h", aqgu.class, "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
