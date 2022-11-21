import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsn extends ahcz implements aheo
{
    public static final aqsn a;
    private static volatile ahev l;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public long h;
    public aqsr i;
    public String j;
    public String k;
    
    static {
        ahcz.registerDefaultInstance(aqsn.class, a = new aqsn());
    }
    
    private aqsn() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
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
                if ((l = aqsn.l) == null) {
                    synchronized (aqsn.class) {
                        if (aqsn.l == null) {
                            aqsn.l = (ahev)new ahcs((ahcz)aqsn.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aqsn.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsn.a);
            }
            case 3: {
                return new aqsn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsn.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u100c\u0004\u0006\u1003\u0005\u0007\u1009\u0006\b\u1008\u0007\t\u1008\b", new Object[] { "b", "c", "d", "e", "f", "g", aqnr.k, "h", "i", "j", "k" });
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
