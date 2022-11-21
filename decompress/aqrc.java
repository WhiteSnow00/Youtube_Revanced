import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrc extends ahcz implements aheo
{
    public static final aqrc a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(aqrc.class, a = new aqrc());
    }
    
    private aqrc() {
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
                if ((e = aqrc.e) == null) {
                    synchronized (aqrc.class) {
                        if (aqrc.e == null) {
                            aqrc.e = (ahev)new ahcs((ahcz)aqrc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqrc.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrc.a);
            }
            case 3: {
                return new aqrc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrc.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d" });
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
