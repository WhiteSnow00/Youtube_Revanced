import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akey extends ahcz implements aheo
{
    public static final akey a;
    private static volatile ahev n;
    public int b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public long i;
    public int j;
    public int k;
    public String l;
    public String m;
    
    static {
        ahcz.registerDefaultInstance(akey.class, a = new akey());
    }
    
    private akey() {
        this.c = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.l = "";
        this.m = "";
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
                if ((n = akey.n) == null) {
                    synchronized (akey.class) {
                        if (akey.n == null) {
                            akey.n = (ahev)new ahcs((ahcz)akey.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return akey.a;
            }
            case 4: {
                return new ahcr((ahcz)akey.a);
            }
            case 3: {
                return new akey();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akey.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1002\u0006\b\u100c\u0007\t\u1008\t\n\u1008\n\u000b\u100c\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", aoyh.a(), "l", "m", "k", anej.a() });
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
