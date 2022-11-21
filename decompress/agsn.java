import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsn extends ahcz implements aheo
{
    public static final agsn a;
    private static volatile ahev e;
    public int b;
    public agsi c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(agsn.class, a = new agsn());
    }
    
    private agsn() {
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
                if ((e = agsn.e) == null) {
                    synchronized (agsn.class) {
                        if (agsn.e == null) {
                            agsn.e = (ahev)new ahcs((ahcz)agsn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agsn.a;
            }
            case 4: {
                return new ahcr((ahcz)agsn.a);
            }
            case 3: {
                return new agsn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
