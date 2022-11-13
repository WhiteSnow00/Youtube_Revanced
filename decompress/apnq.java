import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnq extends ahbh implements ahcw
{
    public static final apnq a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public String d;
    public String e;
    public long f;
    
    static {
        final apnq a2 = new apnq();
        ahbh.registerDefaultInstance((Class)apnq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 76, ahek.k, (Class)apnq.class);
    }
    
    private apnq() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = apnq.g) == null) {
                    synchronized (apnq.class) {
                        if (apnq.g == null) {
                            apnq.g = (ahdd)new ahba((ahbh)apnq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apnq.a;
            }
            case 4: {
                return new ahaz((ahbh)apnq.a);
            }
            case 3: {
                return new apnq();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002", new Object[] { "c", "d", "e", "f" });
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
