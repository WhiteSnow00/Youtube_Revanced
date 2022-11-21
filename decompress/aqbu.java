import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aqbu extends ahcz implements aheo
{
    public static final aqbu a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public String d;
    public String e;
    public String f;
    
    static {
        final aqbu a2 = new aqbu();
        ahcz.registerDefaultInstance(aqbu.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 153, ahgc.k, aqbu.class);
    }
    
    private aqbu() {
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
                if ((g = aqbu.g) == null) {
                    synchronized (aqbu.class) {
                        if (aqbu.g == null) {
                            aqbu.g = (ahev)new ahcs((ahcz)aqbu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqbu.a;
            }
            case 4: {
                return new ahcr((ahcz)aqbu.a);
            }
            case 3: {
                return new aqbu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqbu.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "c", "d", "e", "f" });
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
