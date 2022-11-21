import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajiq extends ahcz implements aheo
{
    public static final ajiq a;
    public static final ahcx b;
    private static volatile ahev o;
    public int c;
    public String d;
    public int e;
    public float f;
    public float g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public amwh l;
    public long m;
    public amwg n;
    
    static {
        final ajiq a2 = new ajiq();
        ahcz.registerDefaultInstance(ajiq.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 141, ahgc.k, ajiq.class);
    }
    
    private ajiq() {
        this.d = "";
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = ajiq.o) == null) {
                    synchronized (ajiq.class) {
                        if (ajiq.o == null) {
                            ajiq.o = (ahev)new ahcs((ahcz)ajiq.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajiq.a;
            }
            case 4: {
                return new ahcr((ahcz)ajiq.a);
            }
            case 3: {
                return new ajiq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajiq.a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1001\u0002\u0004\u1008\u0004\u0005\u1001\u0003\u0006\u1007\u0005\u0007\u1007\u0006\t\u1007\u0007\n\u1009\b\u000b\u1002\t\f\u1009\n", new Object[] { "c", "d", "e", apoq.a(), "f", "h", "g", "i", "j", "k", "l", "m", "n" });
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
