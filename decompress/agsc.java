import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsc extends ahcz implements aheo
{
    public static final agsc a;
    private static volatile ahev l;
    public agsa b;
    public String c;
    public ahdp d;
    public ahdp e;
    public ahdh f;
    public String g;
    public boolean h;
    public int i;
    public String j;
    public agsb k;
    
    static {
        ahcz.registerDefaultInstance(agsc.class, a = new agsc());
    }
    
    private agsc() {
        this.c = "";
        this.d = ahcz.emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyIntList();
        this.g = "";
        final ahbt b = ahbt.b;
        this.j = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = agsc.l) == null) {
                    synchronized (agsc.class) {
                        if (agsc.l == null) {
                            agsc.l = (ahev)new ahcs((ahcz)agsc.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return agsc.a;
            }
            case 4: {
                return new ahcr((ahcz)agsc.a);
            }
            case 3: {
                return new agsc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsc.a, "\u0000\n\u0000\u0000\u0001\u0011\n\u0000\u0003\u0000\u0001\t\u0002\u0208\u0003\u021a\u0004,\u0005\u021a\u0006\u0208\b\u0007\t\f\u0010\u0208\u0011\t", new Object[] { "b", "c", "d", "f", "e", "g", "h", "i", "j", "k" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
