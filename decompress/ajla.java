import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajla extends ahcz implements aheo
{
    public static final ajla a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public String d;
    public boolean e;
    
    static {
        final ajla a2 = new ajla();
        ahcz.registerDefaultInstance(ajla.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 244, ahgc.k, ajla.class);
    }
    
    private ajla() {
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
                final ahev f;
                if ((f = ajla.f) == null) {
                    synchronized (ajla.class) {
                        if (ajla.f == null) {
                            ajla.f = (ahev)new ahcs((ahcz)ajla.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajla.a;
            }
            case 4: {
                return new ahcr((ahcz)ajla.a);
            }
            case 3: {
                return new ajla();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajla.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "c", "d", "e" });
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
