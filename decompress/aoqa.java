import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqa extends ahcz implements aheo
{
    public static final aoqa a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public int d;
    public Object e;
    public String f;
    public int g;
    public boolean h;
    public boolean i;
    private byte k;
    
    static {
        final aoqa a2 = new aoqa();
        ahcz.registerDefaultInstance(aoqa.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 256, ahgc.k, aoqa.class);
    }
    
    private aoqa() {
        this.d = 0;
        this.k = 2;
        this.f = "";
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
                if ((j = aoqa.j) == null) {
                    synchronized (aoqa.class) {
                        if (aoqa.j == null) {
                            aoqa.j = (ahev)new ahcs((ahcz)aoqa.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aoqa.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqa.a);
            }
            case 3: {
                return new aoqa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqa.a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u103b\u0000\u0003\u143c\u0000\u0004\u100c\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "e", "d", "c", "f", ajqh.class, "g", aoqb.a(), "h", "i" });
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
