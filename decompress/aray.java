import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aray extends ahcz implements aheo
{
    public static final aray a;
    private static volatile ahev l;
    public int b;
    public aras c;
    public String d;
    public String e;
    public String f;
    public arax g;
    public int h;
    public String i;
    public String j;
    public String k;
    
    static {
        ahcz.registerDefaultInstance(aray.class, a = new aray());
    }
    
    private aray() {
        this.d = "";
        this.e = "";
        this.f = "";
        this.i = "";
        this.j = "";
        this.k = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = aray.l) == null) {
                    synchronized (aray.class) {
                        if (aray.l == null) {
                            aray.l = (ahev)new ahcs((ahcz)aray.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aray.a;
            }
            case 4: {
                return new ahcr((ahcz)aray.a);
            }
            case 3: {
                return new aray();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aray.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1008\u0003\u0006\u1009\u0004\u0007\u100c\u0005\b\u1008\u0006\t\u1008\u0007\u000b\u1008\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", araz.a(), "i", "j", "k" });
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
