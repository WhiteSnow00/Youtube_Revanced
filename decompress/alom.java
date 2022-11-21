import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alom extends ahcz implements aheo
{
    public static final alom a;
    private static volatile ahev m;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    public alou g;
    public int h;
    public int i;
    public long j;
    public long k;
    public int l;
    
    static {
        ahcz.registerDefaultInstance(alom.class, a = new alom());
    }
    
    private alom() {
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
                final ahev m;
                if ((m = alom.m) == null) {
                    synchronized (alom.class) {
                        if (alom.m == null) {
                            alom.m = (ahev)new ahcs((ahcz)alom.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return alom.a;
            }
            case 4: {
                return new ahcr((ahcz)alom.a);
            }
            case 3: {
                return new alom();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alom.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1009\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1002\u0007\t\u1002\b\n\u100c\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", alfq.r });
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
