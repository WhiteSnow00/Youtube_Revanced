import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtz extends ahcz implements aheo
{
    public static final aqtz a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(aqtz.class, a = new aqtz());
    }
    
    private aqtz() {
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
                if ((e = aqtz.e) == null) {
                    synchronized (aqtz.class) {
                        if (aqtz.e == null) {
                            aqtz.e = (ahev)new ahcs((ahcz)aqtz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqtz.a;
            }
            case 4: {
                return new ahcr((ahcz)aqtz.a);
            }
            case 3: {
                return new aqtz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqtz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
