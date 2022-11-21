import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkj extends ahcz implements aheo
{
    public static final ajkj a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public aqif d;
    public String e;
    public ajki f;
    public boolean g;
    public boolean h;
    public ajij i;
    private byte k;
    
    static {
        final ajkj a2 = new ajkj();
        ahcz.registerDefaultInstance(ajkj.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 323685881, ahgc.k, ajkj.class);
    }
    
    private ajkj() {
        this.k = 2;
        this.e = "";
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
                if ((j = ajkj.j) == null) {
                    synchronized (ajkj.class) {
                        if (ajkj.j == null) {
                            ajkj.j = (ahev)new ahcs((ahcz)ajkj.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajkj.a;
            }
            case 4: {
                return new ahcr((ahcz)ajkj.a);
            }
            case 3: {
                return new ajkj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajkj.a, "\u0001\u0006\u0000\u0001\u0002\f\u0006\u0000\u0000\u0001\u0002\u1008\u0003\u0007\u1007\b\b\u1007\t\t\u1009\n\n\u1409\u0001\f\u1009\u0007", new Object[] { "c", "e", "g", "h", "i", "d", "f" });
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
