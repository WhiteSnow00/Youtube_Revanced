import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlr extends ahcz implements aheo
{
    public static final amlr a;
    private static volatile ahev t;
    public int b;
    public long c;
    public boolean d;
    public ajsf e;
    public ansz f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    private int u;
    private int v;
    
    static {
        ahcz.registerDefaultInstance(amlr.class, a = new amlr());
    }
    
    private amlr() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev t;
                if ((t = amlr.t) == null) {
                    synchronized (amlr.class) {
                        if (amlr.t == null) {
                            amlr.t = (ahev)new ahcs((ahcz)amlr.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return amlr.a;
            }
            case 4: {
                return new ahcr((ahcz)amlr.a);
            }
            case 3: {
                return new amlr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlr.a, "\u0001\u0011\u0000\u0003\u0011S\u0011\u0000\u0000\u0000\u0011\u1002\u000f\u0012\u1007\u0010&\u1009 1\u1009*3\u1007+4\u1007,7\u1007/:\u10073;\u10044<\u10045B\u10078D\u1007:E\u1004;H\u10079I\u1007>J\u1007?S\u1007H", new Object[] { "u", "b", "v", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o", "p", "n", "q", "r", "s" });
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
