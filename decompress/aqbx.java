import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbx extends ahcz implements aheo
{
    public static final aqbx a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(aqbx.class, a = new aqbx());
    }
    
    private aqbx() {
        this.c = "";
        this.d = "";
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
                final ahev f;
                if ((f = aqbx.f) == null) {
                    synchronized (aqbx.class) {
                        if (aqbx.f == null) {
                            aqbx.f = (ahev)new ahcs((ahcz)aqbx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqbx.a;
            }
            case 4: {
                return new ahcr((ahcz)aqbx.a);
            }
            case 3: {
                return new aqbx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqbx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
