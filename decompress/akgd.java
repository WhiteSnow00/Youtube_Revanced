import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgd extends ahcz implements aheo
{
    public static final akgd a;
    private static volatile ahev i;
    public int b;
    public String c;
    public long d;
    public ahdb e;
    public boolean f;
    public float g;
    public int h;
    
    static {
        ahcz.registerDefaultInstance(akgd.class, a = new akgd());
    }
    
    private akgd() {
        this.c = "";
        this.e = ahcz.emptyBooleanList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = akgd.i) == null) {
                    synchronized (akgd.class) {
                        if (akgd.i == null) {
                            akgd.i = (ahev)new ahcs((ahcz)akgd.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akgd.a;
            }
            case 4: {
                return new ahcr((ahcz)akgd.a);
            }
            case 3: {
                return new akgd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akgd.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u0019\u0004\u1007\u0002\u0005\u1001\u0003\u0006\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "g", "h", aosh.a() });
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
