import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjq extends ahcz implements aheo
{
    public static final ajjq a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public aqif d;
    public String e;
    public int f;
    public int g;
    public String h;
    public int i;
    private byte k;
    
    static {
        final ajjq a2 = new ajjq();
        ahcz.registerDefaultInstance(ajjq.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 362363524, ahgc.k, ajjq.class);
    }
    
    private ajjq() {
        this.k = 2;
        this.e = "";
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
                if ((j = ajjq.j) == null) {
                    synchronized (ajjq.class) {
                        if (ajjq.j == null) {
                            ajjq.j = (ahev)new ahcs((ahcz)ajjq.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajjq.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjq.a);
            }
            case 3: {
                return new ajjq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjq.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002\u1409\u0001\u0003\u1008\u0003\u0004\u100c\u0004\u0005\u1004\u0005\u0007\u1008\u0006\b\u100c\u0007", new Object[] { "c", "d", "e", "f", ajjo.a(), "g", "h", "i", ajgj.p });
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
