import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambq extends ahcz implements aheo
{
    public static final ambq a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public String d;
    public String e;
    public String f;
    
    static {
        final ambq a2 = new ambq();
        ahcz.registerDefaultInstance(ambq.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 368, ahgc.k, ambq.class);
    }
    
    private ambq() {
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = ambq.g) == null) {
                    synchronized (ambq.class) {
                        if (ambq.g == null) {
                            ambq.g = (ahev)new ahcs((ahcz)ambq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ambq.a;
            }
            case 4: {
                return new ahcr((ahcz)ambq.a);
            }
            case 3: {
                return new ambq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ambq.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "c", "d", "e", "f" });
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
