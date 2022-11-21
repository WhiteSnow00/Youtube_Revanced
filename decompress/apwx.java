import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwx extends ahcz implements aheo
{
    public static final apwx a;
    private static volatile ahev l;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    
    static {
        ahcz.registerDefaultInstance(apwx.class, a = new apwx());
    }
    
    private apwx() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.h = "";
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
                if ((l = apwx.l) == null) {
                    synchronized (apwx.class) {
                        if (apwx.l == null) {
                            apwx.l = (ahev)new ahcs((ahcz)apwx.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apwx.a;
            }
            case 4: {
                return new ahcr((ahcz)apwx.a);
            }
            case 3: {
                return new apwx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwx.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1007\u0006\u0006\u1008\u0005\u0007\u1007\u0004\b\u1007\u0007\t\u1007\b", new Object[] { "b", "c", "d", "e", "f", "i", "h", "g", "j", "k" });
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
