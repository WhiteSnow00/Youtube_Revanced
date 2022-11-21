import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajje extends ahcz implements aheo
{
    public static final ajje a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public int i;
    
    static {
        final ajje a2 = new ajje();
        ahcz.registerDefaultInstance(ajje.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 224, ahgc.k, ajje.class);
    }
    
    private ajje() {
        this.d = "";
        this.e = "";
        this.g = "";
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
                final ahev j;
                if ((j = ajje.j) == null) {
                    synchronized (ajje.class) {
                        if (ajje.j == null) {
                            ajje.j = (ahev)new ahcs((ahcz)ajje.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajje.a;
            }
            case 4: {
                return new ahcr((ahcz)ajje.a);
            }
            case 3: {
                return new ajje();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajje.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1004\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
