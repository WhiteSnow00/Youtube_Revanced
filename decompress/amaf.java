import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class amaf extends ahcz implements aheo
{
    public static final amaf a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(amaf.class, a = new amaf());
    }
    
    private amaf() {
        this.c = "";
        final ahbt b = ahbt.b;
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
                if ((e = amaf.e) == null) {
                    synchronized (amaf.class) {
                        if (amaf.e == null) {
                            amaf.e = (ahev)new ahcs((ahcz)amaf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amaf.a;
            }
            case 4: {
                return new ahcr((ahcz)amaf.a);
            }
            case 3: {
                return new amaf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amaf.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0002", new Object[] { "b", "c", "d" });
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
