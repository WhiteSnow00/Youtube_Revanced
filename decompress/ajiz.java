import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajiz extends ahcz implements aheo
{
    public static final ajiz a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public String d;
    private byte f;
    
    static {
        final ajiz a2 = new ajiz();
        ahcz.registerDefaultInstance(ajiz.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 378918909, ahgc.k, ajiz.class);
    }
    
    private ajiz() {
        this.f = 2;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ajiz.e) == null) {
                    synchronized (ajiz.class) {
                        if (ajiz.e == null) {
                            ajiz.e = (ahev)new ahcs((ahcz)ajiz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajiz.a;
            }
            case 4: {
                return new ahcr((ahcz)ajiz.a);
            }
            case 3: {
                return new ajiz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajiz.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1008\u0002", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
