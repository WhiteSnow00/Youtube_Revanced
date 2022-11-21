import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwi extends ahcz implements aheo
{
    public static final apwi a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(apwi.class, a = new apwi());
    }
    
    private apwi() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apwi.e) == null) {
                    synchronized (apwi.class) {
                        if (apwi.e == null) {
                            apwi.e = (ahev)new ahcs((ahcz)apwi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apwi.a;
            }
            case 4: {
                return new ahcr((ahcz)apwi.a);
            }
            case 3: {
                return new apwi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
