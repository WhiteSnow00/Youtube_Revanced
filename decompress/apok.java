import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apok extends ahcz implements aheo
{
    public static final apok a;
    private static volatile ahev n;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private int o;
    private int p;
    
    static {
        ahcz.registerDefaultInstance(apok.class, a = new apok());
    }
    
    private apok() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev n;
                if ((n = apok.n) == null) {
                    synchronized (apok.class) {
                        if (apok.n == null) {
                            apok.n = (ahev)new ahcs((ahcz)apok.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return apok.a;
            }
            case 4: {
                return new ahcr((ahcz)apok.a);
            }
            case 3: {
                return new apok();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apok.a, "\u0001\f\u0000\u0002\u0005.\f\u0000\u0000\u0000\u0005\u1007\u0004\t\u1007\b\n\u1007\t\u0012\u1007\u0011\u001c\u1007\u001b\u001d\u100c\u001c\u001f\u1007\u001e \u1007\u001f$\u1007#'\u1007&)\u1007(.\u1007-", new Object[] { "o", "p", "b", "c", "d", "e", "f", "g", apnc.f, "h", "i", "j", "k", "l", "m" });
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
