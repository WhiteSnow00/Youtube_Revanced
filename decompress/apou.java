import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apou extends ahcz implements aheo
{
    public static final apou a;
    private static volatile ahev l;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public int i;
    public aowb j;
    public int k;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(apou.class, a = new apou());
    }
    
    private apou() {
        this.m = 2;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = apou.l) == null) {
                    synchronized (apou.class) {
                        if (apou.l == null) {
                            apou.l = (ahev)new ahcs((ahcz)apou.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apou.a;
            }
            case 4: {
                return new ahcr((ahcz)apou.a);
            }
            case 3: {
                return new apou();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apou.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1003\u0004\u0006\u1003\u0005\u0007\u1004\u0006\b\u1409\u0007\t\u1004\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
