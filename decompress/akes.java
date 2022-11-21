import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akes extends ahcz implements aheo
{
    public static final akes a;
    private static volatile ahev i;
    public int b;
    public int c;
    public Object d;
    public int e;
    public long f;
    public String g;
    public String h;
    
    static {
        ahcz.registerDefaultInstance(akes.class, a = new akes());
    }
    
    private akes() {
        this.c = 0;
        this.g = "";
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
                final ahev i;
                if ((i = akes.i) == null) {
                    synchronized (akes.class) {
                        if (akes.i == null) {
                            akes.i = (ahev)new ahcs((ahcz)akes.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akes.a;
            }
            case 4: {
                return new ahcr((ahcz)akes.a);
            }
            case 3: {
                return new akes();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akes.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "d", "c", "b", aker.class, "e", akan.s, "f", "g", "h" });
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
