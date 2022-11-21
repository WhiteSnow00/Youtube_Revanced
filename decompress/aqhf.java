import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhf extends ahcz implements aheo
{
    public static final aqhf a;
    public static final ahcx b;
    private static volatile ahev j;
    public String c;
    public int d;
    public String e;
    public int f;
    public int g;
    public int h;
    public airb i;
    private int k;
    
    static {
        final aqhf a2 = new aqhf();
        ahcz.registerDefaultInstance(aqhf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 258602976, ahgc.k, aqhf.class);
    }
    
    private aqhf() {
        this.c = "";
        this.e = "";
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
                if ((j = aqhf.j) == null) {
                    synchronized (aqhf.class) {
                        if (aqhf.j == null) {
                            aqhf.j = (ahev)new ahcs((ahcz)aqhf.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqhf.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhf.a);
            }
            case 3: {
                return new aqhf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhf.a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u1008\u0002\u0004\u1009\u0006\n\u100b\u0003\u000b\u100b\u0004\f\u100b\u0005", new Object[] { "k", "c", "d", "e", "i", "f", "g", "h" });
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
