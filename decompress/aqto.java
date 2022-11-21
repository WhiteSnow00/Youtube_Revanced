import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqto extends ahcz implements aheo
{
    public static final aqto a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public ahbt e;
    
    static {
        ahcz.registerDefaultInstance(aqto.class, a = new aqto());
    }
    
    private aqto() {
        this.c = "";
        this.d = "";
        this.e = ahbt.b;
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
                if ((f = aqto.f) == null) {
                    synchronized (aqto.class) {
                        if (aqto.f == null) {
                            aqto.f = (ahev)new ahcs((ahcz)aqto.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqto.a;
            }
            case 4: {
                return new ahcr((ahcz)aqto.a);
            }
            case 3: {
                return new aqto();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqto.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100a\u0002", new Object[] { "b", "c", "d", "e" });
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
