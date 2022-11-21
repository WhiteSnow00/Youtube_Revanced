import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajku extends ahcz implements aheo
{
    public static final ajku a;
    public static final ahcx b;
    private static volatile ahev k;
    public int c;
    public int d;
    public Object e;
    public aqif f;
    public String g;
    public String h;
    public String i;
    public String j;
    private byte l;
    
    static {
        final ajku a2 = new ajku();
        ahcz.registerDefaultInstance(ajku.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 378762193, ahgc.k, ajku.class);
    }
    
    private ajku() {
        this.d = 0;
        this.l = 2;
        this.g = "";
        this.h = "";
        this.i = "";
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
                if ((k = ajku.k) == null) {
                    synchronized (ajku.class) {
                        if (ajku.k == null) {
                            ajku.k = (ahev)new ahcs((ahcz)ajku.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ajku.a;
            }
            case 4: {
                return new ahcr((ahcz)ajku.a);
            }
            case 3: {
                return new ajku();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajku.a, "\u0001\u0007\u0001\u0001\u0002\t\u0007\u0000\u0000\u0002\u0002\u1409\u0001\u0003\u1008\u0003\u0004\u103b\u0000\u0005\u1008\u0006\u0006\u1008\u0007\b\u1008\b\t\u143c\u0000", new Object[] { "e", "d", "c", "f", "g", "h", "i", "j", aqgs.class });
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
