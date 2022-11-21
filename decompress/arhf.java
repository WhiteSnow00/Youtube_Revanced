import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhf extends ahcz implements aheo
{
    public static final arhf a;
    private static volatile ahev j;
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;
    
    static {
        ahcz.registerDefaultInstance(arhf.class, a = new arhf());
    }
    
    private arhf() {
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
                final ahev j;
                if ((j = arhf.j) == null) {
                    synchronized (arhf.class) {
                        if (arhf.j == null) {
                            arhf.j = (ahev)new ahcs((ahcz)arhf.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return arhf.a;
            }
            case 4: {
                return new ahcr((ahcz)arhf.a);
            }
            case 3: {
                return new arhf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arhf.a, "\u0001\u0007\u0000\u0001\u0003\t\u0007\u0000\u0000\u0000\u0003\u100c\u0000\u0004\u1008\u0001\u0005\u100c\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1002\u0007\t\u1004\b", new Object[] { "b", "c", arhd.a(), "d", "e", arhc.a(), "f", "g", "h", "i" });
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
