import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsg extends ahcz implements aheo
{
    public static final aqsg a;
    private static volatile ahev f;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;
    
    static {
        ahcz.registerDefaultInstance(aqsg.class, a = new aqsg());
    }
    
    private aqsg() {
        this.b = "";
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
                if ((f = aqsg.f) == null) {
                    synchronized (aqsg.class) {
                        if (aqsg.f == null) {
                            aqsg.f = (ahev)new ahcs((ahcz)aqsg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqsg.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsg.a);
            }
            case 3: {
                return new aqsg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsg.a, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0000\u0003\u1008\u0001\u0005\u1007\u0003\u0006\u1007\u0004\u0007\u1007\u0005", new Object[] { "g", "b", "c", "d", "e" });
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
