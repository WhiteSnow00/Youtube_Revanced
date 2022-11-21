import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlx extends ahcz implements aheo
{
    public static final ajlx a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public String d;
    public ahdp e;
    public long f;
    public long g;
    public String h;
    public ajlw i;
    
    static {
        final ajlx a2 = new ajlx();
        ahcz.registerDefaultInstance(ajlx.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 146, ahgc.k, ajlx.class);
    }
    
    private ajlx() {
        this.d = "";
        this.e = ahcz.emptyProtobufList();
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
                if ((j = ajlx.j) == null) {
                    synchronized (ajlx.class) {
                        if (ajlx.j == null) {
                            ajlx.j = (ahev)new ahcs((ahcz)ajlx.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajlx.a;
            }
            case 4: {
                return new ahcr((char[][])null, (float[])null);
            }
            case 3: {
                return new ajlx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlx.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1008\u0003\u0006\u1009\u0004", new Object[] { "c", "d", "e", ajly.class, "f", "g", "h", "i" });
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
