import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkd extends ahcz implements aheo
{
    public static final ajkd a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public aqif d;
    public String e;
    public aiot f;
    public ajkc g;
    private byte i;
    
    static {
        final ajkd a2 = new ajkd();
        ahcz.registerDefaultInstance(ajkd.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 314573701, ahgc.k, ajkd.class);
    }
    
    private ajkd() {
        this.i = 2;
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = ajkd.h) == null) {
                    synchronized (ajkd.class) {
                        if (ajkd.h == null) {
                            ajkd.h = (ahev)new ahcs((ahcz)ajkd.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajkd.a;
            }
            case 4: {
                return new ahcr((ahcz)ajkd.a);
            }
            case 3: {
                return new ajkd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajkd.a, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0001\u0002\u1008\u0002\u0006\u1009\u0006\u0007\u1409\u0001\b\u1009\u0007", new Object[] { "c", "e", "f", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
