import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class areb extends ahcz implements aheo
{
    public static final areb a;
    private static volatile ahev k;
    public int b;
    public String c;
    public ahdp d;
    public String e;
    public String f;
    public float g;
    public ahdp h;
    public float i;
    public String j;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(areb.class, a = new areb());
    }
    
    private areb() {
        this.l = 2;
        this.c = "";
        this.d = ahcz.emptyProtobufList();
        this.e = "";
        this.f = "";
        this.h = ahcz.emptyProtobufList();
        this.j = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = areb.k) == null) {
                    synchronized (areb.class) {
                        if (areb.k == null) {
                            areb.k = (ahev)new ahcs((ahcz)areb.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return areb.a;
            }
            case 4: {
                return new ahcr((char[][])null, (int[])null);
            }
            case 3: {
                return new areb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)areb.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0001\u0001\u1008\u0000\u0002\u041b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1001\u0003\u0006\u001b\u0007\u1001\u0004\b\u1008\u0005", new Object[] { "b", "c", "d", ardx.class, "e", "f", "g", "h", arek.class, "i", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
