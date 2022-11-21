import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjt extends ahcz implements aheo
{
    public static final ajjt a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public aqif i;
    private byte k;
    
    static {
        final ajjt a2 = new ajjt();
        ahcz.registerDefaultInstance(ajjt.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 355044355, ahgc.k, ajjt.class);
    }
    
    private ajjt() {
        this.k = 2;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
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
                if ((j = ajjt.j) == null) {
                    synchronized (ajjt.class) {
                        if (ajjt.j == null) {
                            ajjt.j = (ahev)new ahcs((ahcz)ajjt.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajjt.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjt.a);
            }
            case 3: {
                return new ajjt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjt.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
